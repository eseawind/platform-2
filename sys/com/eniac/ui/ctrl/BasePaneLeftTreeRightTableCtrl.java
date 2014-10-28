
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.lang.*;
import javafx.geometry.*;
import javafx.scene.layout.*;

public class BasePaneLeftTreeRightTableCtrl {

    /**
     * 字段:rightformtableview
     * 
     */
    @FXML
    private TableView rightformtableview;
    /**
     * 字段:lefttreeview
     * 
     */
    @FXML
    private TreeView lefttreeview;

    /**
     * 获取rightformtableview
     * 
     */
    public TableView getRightformtableview() {
        return this.rightformtableview;
    }

    /**
     * 设置rightformtableview
     * 
     */
    public void setRightformtableview(TableView rightformtableview) {
        this.rightformtableview = rightformtableview;
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
