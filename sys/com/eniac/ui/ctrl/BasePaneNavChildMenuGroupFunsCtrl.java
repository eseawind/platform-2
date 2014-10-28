
package com.eniac.ui.ctrl;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.*;

import java.lang.*;

import com.eniac.ui.ctx.BasePaneMainCtx;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class BasePaneNavChildMenuGroupFunsCtrl {

    /**
     * 字段:btn_fun
     * 
     */
    @FXML
    private Button btn_fun;

    /**
     * 获取btn_fun
     * 
     */
    public Button getBtn_fun() {
        return this.btn_fun;
    }

    /**
     * 设置btn_fun
     * 
     */
    public void setBtn_fun(Button btn_fun) {
        this.btn_fun = btn_fun;
    }

    /**
     * FXML控制类方法
     * 
     */
    @FXML
    public void onmouseclick(Event event) {
    	if(event instanceof MouseEvent){
    		MouseEvent evt = (MouseEvent)event;
    		if(evt != null){
    			if(evt.getClickCount() == 2){
//    		    	System.out.println("进入双击...");
    				EventHandler<ActionEvent> onAction = getBtn_fun().getOnAction();
    				onAction.handle(null);
    			}
    		}
    	}
    }
}
