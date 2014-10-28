
package com.eniac.ui.ctrl;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.*;
import javafx.scene.control.*;

import java.lang.*;

import com.eniac.ui.ctx.BasePaneMainCtx;
import com.eniac.ui.mgr.ContextManager;

import javafx.scene.layout.*;

public class BasePaneLoginCtrl {

    /**
     * 字段:cbo_sys
     * 
     */
    @FXML
    private ComboBox cbo_sys;
    /**
     * 字段:txt_password
     * 
     */
    @FXML
    private PasswordField txt_password;
    /**
     * 字段:loginbg
     * 
     */
    @FXML
    private FlowPane loginbg;
    /**
     * 字段:btn_login
     * 
     */
    @FXML
    private Button btn_login;
    /**
     * 字段:txt_account
     * 
     */
    @FXML
    private TextField txt_account;

    /**
     * 获取cbo_sys
     * 
     */
    public ComboBox getCbo_sys() {
        return this.cbo_sys;
    }

    /**
     * 设置cbo_sys
     * 
     */
    public void setCbo_sys(ComboBox cbo_sys) {
        this.cbo_sys = cbo_sys;
    }

    /**
     * 获取txt_password
     * 
     */
    public PasswordField getTxt_password() {
        return this.txt_password;
    }

    /**
     * 设置txt_password
     * 
     */
    public void setTxt_password(PasswordField txt_password) {
        this.txt_password = txt_password;
    }

    /**
     * 获取loginbg
     * 
     */
    public FlowPane getLoginbg() {
        return this.loginbg;
    }

    /**
     * 设置loginbg
     * 
     */
    public void setLoginbg(FlowPane loginbg) {
        this.loginbg = loginbg;
    }

    /**
     * 获取btn_login
     * 
     */
    public Button getBtn_login() {
        return this.btn_login;
    }

    /**
     * 设置btn_login
     * 
     */
    public void setBtn_login(Button btn_login) {
        this.btn_login = btn_login;
    }

    /**
     * 获取txt_account
     * 
     */
    public TextField getTxt_account() {
        return this.txt_account;
    }

    /**
     * 设置txt_account
     * 
     */
    public void setTxt_account(TextField txt_account) {
        this.txt_account = txt_account;
    }

    /**
     * FXML控制类方法
     * 
     */
    @FXML
    public void onLogin(Event event) {
    	BasePaneMainCtx mainCtx = BasePaneMainCtx.newInstance();
    	ContextManager.getInstance().resetShow(mainCtx.getRoot(), mainCtx.getCtrl());
    }
}
