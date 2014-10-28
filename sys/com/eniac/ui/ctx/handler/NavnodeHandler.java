package com.eniac.ui.ctx.handler;

import javafx.event.Event;
import javafx.event.EventHandler;

import com.eniac.ui.ctx.BasePaneMainCtx;
import com.eniac.ui.ctx.view.NavnodeUI;

/**
 * 节点处理类
 * 
 * @author yinfx 2014年10月15日 下午5:44:24 version 1.0
 */
public class NavnodeHandler implements EventHandler<Event> {
	@Override
	public void handle(Event event) {
		if (event != null) {
			BasePaneMainCtx.currInstance.resetMenuArea(BasePaneMainCtx.currInstance.getCtrl().getPane_navchildmenu_contents(), event.getSource().toString(), BasePaneMainCtx.currInstance.navButtonsMap, "#E5F5FA", "white");
			NavnodeUI.getInstance().initUI();
		}
	}
}
