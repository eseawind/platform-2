package com.eniac.ui.mgr;

import javafx.scene.Parent;
import javafx.stage.Stage;

import com.eniac.ui.ctx.BasePaneLoginCtx;

/**
 * 窗体管理者
 * 
 * @author yinfx 2014年9月3日 下午1:30:10 version 1.0
 */
public class ContextManager {
	/**
	 * 私有构造函数
	 */
	private ContextManager(Stage stage) {
		this.setStage(stage);
		this.setCurrroot(this.getStage().getScene().getRoot());
		this.setCurrctrl(BasePaneLoginCtx.newInstance().getCtrl());
	}

	public static ContextManager getInstance(Stage stage) {
		if (ContextManager.instance == null) {
			ContextManager.instance = new ContextManager(stage);
		}
		return ContextManager.instance;
	}
	public static ContextManager getInstance() {
		return ContextManager.getInstance(null);
	}
	/**
	 * 单例对象
	 */
	private static ContextManager instance;
	/**
	 * 舞台对象
	 */
	private Stage stage;
	/**
	 * 当前内容
	 */
	private Parent currroot;
	/**
	 * 当前控制类
	 */
	private Object currctrl;

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public Parent getCurrroot() {
		return currroot;
	}

	public void setCurrroot(Parent currroot) {
		this.currroot = currroot;
	}

	public Object getCurrctrl() {
		return currctrl;
	}

	public void setCurrctrl(Object currctrl) {
		this.currctrl = currctrl;
	}

	/**
	 * 开始函数
	 * 
	 * @throws Exception
	 */
	public void reset(Parent root,Object ctrl){
		this.setCurrroot(root);
		this.setCurrctrl(ctrl);
	}
	/**
	 * 重设并显示函数
	 * 
	 * @throws Exception
	 */
	public void resetShow(Parent root,Object ctrl){
		reset(root,ctrl);
		show();
	}
	/**
	 * 显示函数
	 * 
	 * @throws Exception
	 */
	public void show(){
		this.getStage().getScene().setRoot(this.getCurrroot());
	}
}
