package com.eniac.utils;

import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;

/**
 * UI工厂类
 * 
 * @author yinfx 2014年9月3日 下午8:57:17 version 1.0
 */
public class UIFactory {
	/**
	 * 私有构造函数
	 */
	private UIFactory() {
	}

	/**
	 * 单例方法
	 * 
	 * @return 单例对象
	 */
	public static UIFactory getInstance() {
		if (instance == null) {
			instance = new UIFactory();
		}
		return instance;
	}

	/**
	 * 单例对象
	 */
	private static UIFactory instance;
	/**
	 * bundle文件路径
	 */
	public static final String BUNDLE_DIR = "bundle.";
	/**
	 * FXML文件扩展名
	 */
	public static final String FXML_EXTENSION = ".fxml";
	/**
	 * FXML文件路径
	 */
	public static final String FXML_DIR = "/fxml/";

	/**
	 * 获取FXML加载器
	 * 
	 * @return FXML加载器对象
	 * @throws Exception
	 */
	public FXMLLoader getFXMLLoader(String fxmlName, String bundleName) throws Exception {
		return new FXMLLoader(getClass().getResource(FXML_DIR + fxmlName + FXML_EXTENSION), ResourceBundle.getBundle(BUNDLE_DIR + bundleName));
	}
	
	
	public TableView getTableView(){
		
		return null;
	}
}
