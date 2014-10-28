package com.eniac.ui.ctx.view;

import javafx.scene.layout.FlowPane;

import com.eniac.ui.ctx.BasePaneMainCtx;
import com.eniac.ui.ctx.base.BaseUI;
import com.eniac.ui.ctx.handler.AutoFormHandler;
import com.eniac.ui.ctx.handler.BasePaneTableHandler;

/**
 * 节点处理类
 * 
 * @author yinfx 2014年10月15日 下午5:44:24 version 1.0
 */
public class NavnodeUI extends BaseUI {
	private static NavnodeUI instance;

	public static NavnodeUI getInstance() {
		return instance == null ? instance = new NavnodeUI() : instance;
	}

	@Override
	public void initUI() {
		FlowPane parent = BasePaneMainCtx.currInstance.getCtrl().getPane_navchildmenu_contents();
		// 添加到界面
		parent.getChildren().addAll(BasePaneMainCtx.currInstance.addNavMenuGroup("外部用户管理区"), 
				BasePaneMainCtx.currInstance.addNavMenuGroupFun("用户注册", new AutoFormHandler()), 
				BasePaneMainCtx.currInstance.addNavMenuGroupFun("用户登录", new BasePaneTableHandler()), 
				BasePaneMainCtx.currInstance.addNavMenuGroup("交易管理"));
	}
}
