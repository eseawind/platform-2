
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import javafx.geometry.*;
import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class BasePaneTopFormBottomTableCtrl {

    /**
     * 字段:splitpane
     * 
     */
    @FXML
    private SplitPane splitpane;
    /**
     * 字段:bottomtableview
     * 
     */
    @FXML
    private TableView bottomtableview;
    /**
     * 字段:root
     * 
     */
    @FXML
    private ScrollPane root;
    /**
     * 字段:topformflowpane
     * 
     */
    @FXML
    private FlowPane topformflowpane;

    /**
     * 获取splitpane
     * 
     */
    public SplitPane getSplitpane() {
        return this.splitpane;
    }

    /**
     * 设置splitpane
     * 
     */
    public void setSplitpane(SplitPane splitpane) {
        this.splitpane = splitpane;
    }

    /**
     * 获取bottomtableview
     * 
     */
    public TableView getBottomtableview() {
        return this.bottomtableview;
    }

    /**
     * 设置bottomtableview
     * 
     */
    public void setBottomtableview(TableView bottomtableview) {
        this.bottomtableview = bottomtableview;
    }

    /**
     * 获取root
     * 
     */
    public ScrollPane getRoot() {
        return this.root;
    }

    /**
     * 设置root
     * 
     */
    public void setRoot(ScrollPane root) {
        this.root = root;
    }

    /**
     * 获取topformflowpane
     * 
     */
    public FlowPane getTopformflowpane() {
        return this.topformflowpane;
    }

    /**
     * 设置topformflowpane
     * 
     */
    public void setTopformflowpane(FlowPane topformflowpane) {
        this.topformflowpane = topformflowpane;
    }

}
