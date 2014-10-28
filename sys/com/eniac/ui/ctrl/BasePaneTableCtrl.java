
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import java.lang.*;
import javafx.scene.control.*;

public class BasePaneTableCtrl {

    /**
     * 字段:scrollpane
     * 
     */
    @FXML
    private ScrollPane scrollpane;
    /**
     * 字段:tableview
     * 
     */
    @FXML
    private TableView tableview;

    /**
     * 获取scrollpane
     * 
     */
    public ScrollPane getScrollpane() {
        return this.scrollpane;
    }

    /**
     * 设置scrollpane
     * 
     */
    public void setScrollpane(ScrollPane scrollpane) {
        this.scrollpane = scrollpane;
    }

    /**
     * 获取tableview
     * 
     */
    public TableView getTableview() {
        return this.tableview;
    }

    /**
     * 设置tableview
     * 
     */
    public void setTableview(TableView tableview) {
        this.tableview = tableview;
    }

}
