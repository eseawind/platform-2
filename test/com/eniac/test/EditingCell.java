package com.eniac.test;

import javafx.event.EventHandler;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class EditingCell extends TableCell<ProductVO, String>{
	private TextField textfield;
	@Override
	public void startEdit() {
		super.startEdit();
		if(textfield == null){
			createTextField();
		}

		setText("");
		setGraphic(textfield);
		textfield.selectAll();
	}
	private void createTextField() {
		textfield = new TextField(getString());
//		textfield.setMinWidth(this.getWidth() - this.getGraphicTextGap()*2);
		textfield.setMaxHeight(10);
		textfield.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.ENTER){
					commitEdit(textfield.getText());
				}else if (event.getCode() == KeyCode.ESCAPE) {
					cancelEdit();
				}
			}
			
		});
	}
	@Override
	public void cancelEdit() {
		super.cancelEdit();
		setText(getItem());
		setGraphic(null);
	}
	@Override
	protected void updateItem(String item, boolean empty) {
		super.updateItem(item, empty);
		
		if(empty){
			setText(null);
			setGraphic(null);
		}else {
			if(isEditing()){
				if(textfield != null){
					textfield.setText(getString());
				}
				setText(null);
				setGraphic(textfield);
			}else{
				setText(getString());
				setGraphic(null);
			}
		}
	}
	private String getString() {
		return getItem() == null ? "" : getItem().toString();
	}
}
