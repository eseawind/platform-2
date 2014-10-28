package com.eniac.ui.ctx.handler;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeItem;

import com.eniac.ui.ctx.BasePaneButtonCtx;
import com.eniac.ui.ctx.BasePaneLeftTreeRightTableCtx;
import com.eniac.ui.ctx.BasePaneMainCtx;
import com.eniac.ui.ctx.BasePaneTabContentCtx;

/**
 * 元数据建模处理类
 * @author yinfx
 * 2014年10月16日  下午7:50:07
 * version 1.0
 */
public class MetadataModelingHandler implements EventHandler<Event>  {
	/**
	 * 根结构
	 */
	private BasePaneTabContentCtx tabctx;
	/**
	 * 左树右表的默认结构
	 */
	private BasePaneLeftTreeRightTableCtx ctx;
	/**
	 * 根节点
	 */
	private TreeItem<String> rootItem;
	@Override
	public void handle(Event event) {
		if (event != null) {
			BasePaneMainCtx.currInstance.setButtonbgColor(event.getSource().toString(), BasePaneMainCtx.currInstance.funButtonsMap, "white", "#FCEADB");
		} else {
			//打开tab
			Tab parentTab = BasePaneMainCtx.currInstance.genTab();
			//载入FXML基本界面
			tabctx = BasePaneTabContentCtx.newInstance();
			//添加顶部操作按钮
			addButton("新增");
			addButton("修改");
			addButton("删除");
			//添加FXML基本[左树右表]界面
			ctx = BasePaneLeftTreeRightTableCtx.newInstance();
			rootItem = new TreeItem<String>("所有项目");
			ctx.getCtrl().getLefttreeview().setRoot(rootItem);
			for (int i = 0; i < 10; i++) {
				TreeItem<String> child = new TreeItem<String>("二级子节点");
				ctx.getCtrl().getLefttreeview().getRoot().getChildren().add(child);
				if (i % 2 == 0) {
					TreeItem<String> child2 = new TreeItem<String>("三级子节点");
					child.getChildren().add(child2);
				}
			}
			//设置树的展开
			ctx.getCtrl().getLefttreeview().getRoot().setExpanded(true);
			addtoTab(parentTab, tabctx, ctx);
		}
	}
	/**
	 * 添加按钮
	 * @param text
	 * @return
	 */
	private Button addButton(String text) {
		Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
		btn.setText(text);
		tabctx.getCtrl().getTophbox().getChildren().add(btn);
		return btn;
	}
	/**
	 * 添加表格到标签中
	 * @param parentTab 父级标签容器
	 * @param tabctx 
	 * @param ctx
	 */
	private void addtoTab(Tab parentTab, BasePaneTabContentCtx tabctx, BasePaneLeftTreeRightTableCtx ctx) {
		tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
		tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
		tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
		tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
		tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
		parentTab.setContent(tabctx.getRoot());
	}

}
