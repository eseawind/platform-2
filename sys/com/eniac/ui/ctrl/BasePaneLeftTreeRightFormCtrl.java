
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import javafx.geometry.*;
import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class BasePaneLeftTreeRightFormCtrl {

    /**
     * 字段:rightformflowpane
     * 
     */
    @FXML
    private FlowPane rightformflowpane;
    /**
     * 字段:lefttreeview
     * 
     */
    @FXML
    private TreeView lefttreeview;

    /**
     * 获取rightformflowpane
     * 
     */
    public FlowPane getRightformflowpane() {
        return this.rightformflowpane;
    }

    /**
     * 设置rightformflowpane
     * 
     */
    public void setRightformflowpane(FlowPane rightformflowpane) {
        this.rightformflowpane = rightformflowpane;
    }

    /**
     * 获取lefttreeview
     * 
     */
    public TreeView getLefttreeview() {
        return this.lefttreeview;
    }

    /**
     * 设置lefttreeview
     * 
     */
    public void setLefttreeview(TreeView lefttreeview) {
        this.lefttreeview = lefttreeview;
    }

}
