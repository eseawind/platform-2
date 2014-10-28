
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import java.lang.*;
import javafx.scene.control.*;

public class BasePaneTabTableCtrl {

    /**
     * 字段:tab
     * 
     */
    @FXML
    private Tab tab;
    /**
     * 字段:tabpane
     * 
     */
    @FXML
    private TabPane tabpane;

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
     * 获取tabpane
     * 
     */
    public TabPane getTabpane() {
        return this.tabpane;
    }

    /**
     * 设置tabpane
     * 
     */
    public void setTabpane(TabPane tabpane) {
        this.tabpane = tabpane;
    }

}
