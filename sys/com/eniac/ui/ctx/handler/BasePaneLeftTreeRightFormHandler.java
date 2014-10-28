package com.eniac.ui.ctx.handler;

import com.eniac.ui.ctx.AutoFormCtx;
import com.eniac.ui.ctx.AutoFormItemTextFieldCtx;
import com.eniac.ui.ctx.BasePaneButtonCtx;
import com.eniac.ui.ctx.BasePaneMainCtx;
import com.eniac.ui.ctx.BasePaneTabContentCtx;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
/**
 * 左树右卡类
 * @author yinfx
 * 2014年10月15日  下午5:58:36
 * version 1.0
 */
public class BasePaneLeftTreeRightFormHandler implements EventHandler<Event> {

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

			AutoFormCtx ctx = AutoFormCtx.newInstance();
			ctx.getCtrl().getFlowpane().getChildren().clear();
			for (int i = 0; i < 30; i++) {
				AutoFormItemTextFieldCtx textFieldCtx = AutoFormItemTextFieldCtx.newInstance();
				textFieldCtx.getCtrl().getLabel().setText("标签" + (i + 1));
				ctx.getCtrl().getFlowpane().getChildren().add(textFieldCtx.getRoot());
			}
			// ctx.getCtrl().getFlowpane().setPrefSize(ctx.getCtrl().getRoot().getWidth(),
			// ctx.getCtrl().getRoot().getHeight());

			tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
			parentTab.setContent(tabctx.getRoot());
		}
	}

}
