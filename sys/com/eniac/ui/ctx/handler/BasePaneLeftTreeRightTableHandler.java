package com.eniac.ui.ctx.handler;

import com.eniac.ui.ctx.BasePaneButtonCtx;
import com.eniac.ui.ctx.BasePaneLeftTreeRightTableCtx;
import com.eniac.ui.ctx.BasePaneMainCtx;
import com.eniac.ui.ctx.BasePaneTabContentCtx;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeItem;
/**
 * 左树右表
 * @author yinfx
 * 2014年10月15日  下午6:07:47
 * version 1.0
 */
public class BasePaneLeftTreeRightTableHandler implements EventHandler<Event> {

	@Override
	public void handle(Event event) {
		if (event != null) {
			BasePaneMainCtx.currInstance.setButtonbgColor(event.getSource().toString(), BasePaneMainCtx.currInstance.funButtonsMap, "white", "#FCEADB");
		} else {
			Tab parentTab = BasePaneMainCtx.currInstance.genTab();
			// TODO 载入FXML界面
			BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
			for (int i = 0; i < 5; i++) {
				Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
				btn.setText("测试按钮" + (i + 1));
				tabctx.getCtrl().getTophbox().getChildren().add(btn);
			}

			BasePaneLeftTreeRightTableCtx ctx = BasePaneLeftTreeRightTableCtx.newInstance();
			ctx.getCtrl().getLefttreeview().setRoot(new TreeItem<String>("根节点"));
			for (int i = 0; i < 10; i++) {
				TreeItem<String> child = new TreeItem<String>("二级子节点");
				ctx.getCtrl().getLefttreeview().getRoot().getChildren().add(child);
				if (i % 2 == 0) {
					TreeItem<String> child2 = new TreeItem<String>("三级子节点");
					child.getChildren().add(child2);
				}
			}
			ctx.getCtrl().getLefttreeview().getRoot().setExpanded(true);
			tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
			parentTab.setContent(tabctx.getRoot());
		}
	}

}
