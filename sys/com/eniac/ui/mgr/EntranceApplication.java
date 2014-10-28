package com.eniac.ui.mgr;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.eniac.ui.ctx.BasePaneLoginCtx;

/**
 * 程序入口
 * @author yinfx
 * 2014年9月3日  下午9:03:59
 * version 1.0
 */
public class EntranceApplication extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(BasePaneLoginCtx.newInstance().getRoot()));
		primaryStage.setMaximized(true);
		ContextManager.getInstance(primaryStage);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
