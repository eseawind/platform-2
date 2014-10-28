package com.eniac.test;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;


public class TableViewUI{
	private static TableViewUI instance;
	private TableViewUI(){	}
	public static TableViewUI getInstance(){
		return instance == null ? instance = new TableViewUI() : instance;
	}
	public TableView table = new TableView();
	private final ObservableList<ProductVO> data = FXCollections.observableArrayList(
			new ProductVO("Jacob", "Smith", "jacob.smith@example.com"), 
			new ProductVO("Isabella", "Johnson", "isabella.johnson@example.com"), 
			new ProductVO("Ethan", "Williams", "ethan.williams@example.com"), 
			new ProductVO("Emma", "Jones", "emma.jones@example.com"), 
			new ProductVO("Michael", "Brown", "michael.brown@example.com"));
	public VBox start(){
		//初始化单元格工厂
		Callback<TableColumn, TableCell> cellFactory = new Callback<TableColumn, TableCell>() {
			@Override
			public TableCell call(TableColumn param) {
				return new EditingCell();
			}
		};
		//添加Label
		Label title = new Label("商品列表");
		title.setFont(new Font("Arial",20));
		//添加表格
		TableColumn codecol = new TableColumn("编码");
		codecol.setCellValueFactory(new PropertyValueFactory<ProductVO, String>("code"));
		codecol.setSortable(false);
		codecol.setSortType(TableColumn.SortType.DESCENDING);
		//设置提交时监听事件
		codecol.setOnEditCommit(new EventHandler<CellEditEvent<ProductVO, String>>() {
			@Override
			public void handle(CellEditEvent<ProductVO, String> event) {
				((ProductVO)event.getTableView().getItems().get(event.getTablePosition().getRow())).setCode(event.getNewValue());
			}
		});
		TableColumn namecol = new TableColumn("名称");
		namecol.setCellValueFactory(new PropertyValueFactory<ProductVO, String>("name"));
		//设置提交时监听事件
		namecol.setOnEditCommit(new EventHandler<CellEditEvent<ProductVO, String>>() {
			@Override
			public void handle(CellEditEvent<ProductVO, String> event) {
				((ProductVO)event.getTableView().getItems().get(event.getTablePosition().getRow())).setName(event.getNewValue());
			}
		});
		TableColumn amountcol = new TableColumn("数量");
		
		amountcol.setMinWidth(200);
		amountcol.setCellValueFactory(new PropertyValueFactory<ProductVO, String>("amount"));
		amountcol.setCellValueFactory(new PropertyValueFactory<ProductVO, String>("name"));
		//设置提交时监听事件
		amountcol.setOnEditCommit(new EventHandler<CellEditEvent<ProductVO, String>>() {
			@Override
			public void handle(CellEditEvent<ProductVO, String> event) {
				((ProductVO)event.getTableView().getItems().get(event.getTablePosition().getRow())).setAmount(event.getNewValue());
			}
		});
		codecol.setCellFactory(cellFactory);
		namecol.setCellFactory(cellFactory);
		amountcol.setCellFactory(cellFactory);
		
		table.setItems(data);
		table.getColumns().addAll(codecol,namecol,amountcol);
		
		//添加新商品
		HBox hbox = new HBox();
		final TextField addcode = new TextField();
		addcode.setPromptText("商品编码");
		addcode.setMaxWidth(codecol.getPrefWidth());
		final TextField addname = new TextField();
		addname.setPromptText("商品名称");
		addname.setMaxWidth(namecol.getPrefWidth());
		final TextField addamount = new TextField();
		addamount.setPromptText("商品数量");
		addamount.setMaxWidth(amountcol.getPrefWidth());

		Button addbtn = new Button("添加");
		addbtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				data.add(new ProductVO(addcode.getText(), addname.getText(), addamount.getText()));
				addcode.setText("");
				addname.setText("");
				addamount.setText("");
			}
		});

		final Button editbtn = new Button("解锁");
		editbtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(table.isEditable()){
					table.setEditable(false);
					editbtn.setText("解锁");
				}else{
					table.setEditable(true);
					editbtn.setText("锁定");
				}
			}
		});
		final Button deletebtn = new Button("删除");
		deletebtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Object selectedItem = table.getSelectionModel().getSelectedItem();
				data.remove(selectedItem);
			}
		});
		hbox.getChildren().addAll(addcode,addname,addamount,addbtn,editbtn,deletebtn);
		hbox.setSpacing(3);
		
		
		
		final VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.getChildren().addAll(title, hbox, table);

		vbox.setPadding(new Insets(10));
		
		return vbox;
	}
}
