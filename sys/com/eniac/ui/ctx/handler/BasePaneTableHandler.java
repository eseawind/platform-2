package com.eniac.ui.ctx.handler;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

import com.eniac.ui.ctx.BasePaneButtonCtx;
import com.eniac.ui.ctx.BasePaneMainCtx;
import com.eniac.ui.ctx.BasePaneTabContentCtx;
import com.eniac.ui.ctx.BasePaneTableCtx;
/**
 * 单表体处理类
 * @author yinfx
 * 2014年10月15日  下午5:58:36
 * version 1.0
 */
public class BasePaneTableHandler implements EventHandler<Event> {
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
			BasePaneTableCtx tableCtx = BasePaneTableCtx.newInstance();
			tabctx.getCtrl().getBottompane().setTopAnchor(tableCtx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setBottomAnchor(tableCtx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setLeftAnchor(tableCtx.getRoot(), 0.0);
			tabctx.getCtrl().getBottompane().setRightAnchor(tableCtx.getRoot(), 0.0);
			
			tabctx.getCtrl().getBottompane().getChildren().add(tableCtx.getRoot());
			parentTab.setContent(tabctx.getRoot());
		}
	}
}
