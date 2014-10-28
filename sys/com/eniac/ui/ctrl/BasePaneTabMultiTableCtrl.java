
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import java.lang.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class BasePaneTabMultiTableCtrl {

    /**
     * 字段:tabtableview
     * 
     */
    @FXML
    private TableView tabtableview;
    /**
     * 字段:tab
     * 
     */
    @FXML
    private Tab tab;
    /**
     * 字段:bottomtabpane
     * 
     */
    @FXML
    private TabPane bottomtabpane;
    /**
     * 字段:topformflowpane
     * 
     */
    @FXML
    private FlowPane topformflowpane;

    /**
     * 获取tabtableview
     * 
     */
    public TableView getTabtableview() {
        return this.tabtableview;
    }

    /**
     * 设置tabtableview
     * 
     */
    public void setTabtableview(TableView tabtableview) {
        this.tabtableview = tabtableview;
    }

    /**
     * 获取tab
     * 
     */
    public Tab getTab() {
        return this.tab;
    }

    /**
     * 设置tab
     * 
     */
    public void setTab(Tab tab) {
        this.tab = tab;
    }

    /**
     * 获取bottomtabpane
     * 
     */
    public TabPane getBottomtabpane() {
        return this.bottomtabpane;
    }

    /**
     * 设置bottomtabpane
     * 
     */
    public void setBottomtabpane(TabPane bottomtabpane) {
        this.bottomtabpane = bottomtabpane;
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
