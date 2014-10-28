
package com.eniac.ui.ctrl;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.*;
import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class BasePaneMainCtrl {

    /**
     * 字段:tabs
     * 
     */
    @FXML
    private TabPane tabs;
    /**
     * 字段:txt_searchkey
     * 
     */
    @FXML
    private TextField txt_searchkey;
    /**
     * 字段:lbl_loginaccount
     * 
     */
    @FXML
    private Label lbl_loginaccount;
    /**
     * 字段:pane_top
     * 
     */
    @FXML
    private HBox pane_top;
    /**
     * 字段:cbo_loginsysset
     * 
     */
    @FXML
    private ComboBox cbo_loginsysset;
    /**
     * 字段:cbo_loginaccountmenu
     * 
     */
    @FXML
    private ComboBox cbo_loginaccountmenu;
    /**
     * 字段:lbl_loginorg
     * 
     */
    @FXML
    private Label lbl_loginorg;
    /**
     * 字段:cbo_loginhelper
     * 
     */
    @FXML
    private ComboBox cbo_loginhelper;
    /**
     * 字段:pane_content_scroll
     * 
     */
    @FXML
    private ScrollPane pane_content_scroll;
    /**
     * 字段:pane_navchildmenu_contents
     * 
     */
    @FXML
    private FlowPane pane_navchildmenu_contents;
    /**
     * 字段:lbl_loginorg1
     * 
     */
    @FXML
    private Label lbl_loginorg1;
    /**
     * 字段:pane_navchildmenu
     * 
     */
    @FXML
    private VBox pane_navchildmenu;
    /**
     * 字段:pane_bottom
     * 
     */
    @FXML
    private HBox pane_bottom;
    /**
     * 字段:pane_right
     * 
     */
    @FXML
    private VBox pane_right;
    /**
     * 字段:lbl_logindate
     * 
     */
    @FXML
    private Label lbl_logindate;

    /**
     * 获取tabs
     * 
     */
    public TabPane getTabs() {
        return this.tabs;
    }

    /**
     * 设置tabs
     * 
     */
    public void setTabs(TabPane tabs) {
        this.tabs = tabs;
    }

    /**
     * 获取txt_searchkey
     * 
     */
    public TextField getTxt_searchkey() {
        return this.txt_searchkey;
    }

    /**
     * 设置txt_searchkey
     * 
     */
    public void setTxt_searchkey(TextField txt_searchkey) {
        this.txt_searchkey = txt_searchkey;
    }

    /**
     * 获取lbl_loginaccount
     * 
     */
    public Label getLbl_loginaccount() {
        return this.lbl_loginaccount;
    }

    /**
     * 设置lbl_loginaccount
     * 
     */
    public void setLbl_loginaccount(Label lbl_loginaccount) {
        this.lbl_loginaccount = lbl_loginaccount;
    }

    /**
     * 获取pane_top
     * 
     */
    public HBox getPane_top() {
        return this.pane_top;
    }

    /**
     * 设置pane_top
     * 
     */
    public void setPane_top(HBox pane_top) {
        this.pane_top = pane_top;
    }

    /**
     * 获取cbo_loginsysset
     * 
     */
    public ComboBox getCbo_loginsysset() {
        return this.cbo_loginsysset;
    }

    /**
     * 设置cbo_loginsysset
     * 
     */
    public void setCbo_loginsysset(ComboBox cbo_loginsysset) {
        this.cbo_loginsysset = cbo_loginsysset;
    }

    /**
     * 获取cbo_loginaccountmenu
     * 
     */
    public ComboBox getCbo_loginaccountmenu() {
        return this.cbo_loginaccountmenu;
    }

    /**
     * 设置cbo_loginaccountmenu
     * 
     */
    public void setCbo_loginaccountmenu(ComboBox cbo_loginaccountmenu) {
        this.cbo_loginaccountmenu = cbo_loginaccountmenu;
    }

    /**
     * 获取lbl_loginorg
     * 
     */
    public Label getLbl_loginorg() {
        return this.lbl_loginorg;
    }

    /**
     * 设置lbl_loginorg
     * 
     */
    public void setLbl_loginorg(Label lbl_loginorg) {
        this.lbl_loginorg = lbl_loginorg;
    }

    /**
     * 获取cbo_loginhelper
     * 
     */
    public ComboBox getCbo_loginhelper() {
        return this.cbo_loginhelper;
    }

    /**
     * 设置cbo_loginhelper
     * 
     */
    public void setCbo_loginhelper(ComboBox cbo_loginhelper) {
        this.cbo_loginhelper = cbo_loginhelper;
    }

    /**
     * 获取pane_content_scroll
     * 
     */
    public ScrollPane getPane_content_scroll() {
        return this.pane_content_scroll;
    }

    /**
     * 设置pane_content_scroll
     * 
     */
    public void setPane_content_scroll(ScrollPane pane_content_scroll) {
        this.pane_content_scroll = pane_content_scroll;
    }

    /**
     * 获取pane_navchildmenu_contents
     * 
     */
    public FlowPane getPane_navchildmenu_contents() {
        return this.pane_navchildmenu_contents;
    }

    /**
     * 设置pane_navchildmenu_contents
     * 
     */
    public void setPane_navchildmenu_contents(FlowPane pane_navchildmenu_contents) {
        this.pane_navchildmenu_contents = pane_navchildmenu_contents;
    }

    /**
     * 获取lbl_loginorg1
     * 
     */
    public Label getLbl_loginorg1() {
        return this.lbl_loginorg1;
    }

    /**
     * 设置lbl_loginorg1
     * 
     */
    public void setLbl_loginorg1(Label lbl_loginorg1) {
        this.lbl_loginorg1 = lbl_loginorg1;
    }

    /**
     * 获取pane_navchildmenu
     * 
     */
    public VBox getPane_navchildmenu() {
        return this.pane_navchildmenu;
    }

    /**
     * 设置pane_navchildmenu
     * 
     */
    public void setPane_navchildmenu(VBox pane_navchildmenu) {
        this.pane_navchildmenu = pane_navchildmenu;
    }

    /**
     * 获取pane_bottom
     * 
     */
    public HBox getPane_bottom() {
        return this.pane_bottom;
    }

    /**
     * 设置pane_bottom
     * 
     */
    public void setPane_bottom(HBox pane_bottom) {
        this.pane_bottom = pane_bottom;
    }

    /**
     * 获取pane_right
     * 
     */
    public VBox getPane_right() {
        return this.pane_right;
    }

    /**
     * 设置pane_right
     * 
     */
    public void setPane_right(VBox pane_right) {
        this.pane_right = pane_right;
    }

    /**
     * 获取lbl_logindate
     * 
     */
    public Label getLbl_logindate() {
        return this.lbl_logindate;
    }

    /**
     * 设置lbl_logindate
     * 
     */
    public void setLbl_logindate(Label lbl_logindate) {
        this.lbl_logindate = lbl_logindate;
    }

    /**
     * FXML控制类方法
     * 
     */
    @FXML
    public void ondragabc(Event event) {
    }

}
