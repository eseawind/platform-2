package com.eniac.ui.mgr;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import com.eniac.utils.UIFactory;

/**
 * 界面上下文父类对象
 * 
 * @author yinfx 2014年9月4日 下午1:30:28 version 1.0
 */
public abstract class BaseCtx {
	/**
	 * 构造函数
	 */
	protected BaseCtx() {
		try {
			FXMLLoader fxmlLoader = UIFactory.getInstance().getFXMLLoader(this.getClass().getSimpleName(), this.getClass().getSimpleName());
			this.setRoot(fxmlLoader.load());
			this.setCtrl(fxmlLoader.getController());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * FXML界面
	 */
	private Parent root;
	/**
	 * FXML界面控制类
	 */
	private Object ctrl;
	/**
	 * FXML加载器实例
	 */
	private FXMLLoader fxmlLoader;

	public FXMLLoader getFxmlLoader() {
		return fxmlLoader;
	}

	public void setFxmlLoader(FXMLLoader fxmlLoader) {
		this.fxmlLoader = fxmlLoader;
	}

	public Parent getRoot() {
		return root;
	}

	public void setRoot(Parent root) {
		this.root = root;
	}

	public Object getCtrl() {
		return ctrl;
	}

	public void setCtrl(Object ctrl) {
		this.ctrl = ctrl;
	}
	
	public abstract void initialize();
}
