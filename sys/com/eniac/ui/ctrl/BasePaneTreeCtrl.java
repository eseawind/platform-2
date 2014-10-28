
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import java.lang.*;
import javafx.scene.control.*;

public class BasePaneTreeCtrl {

    /**
     * 字段:treeview
     * 
     */
    @FXML
    private TreeView treeview;

    /**
     * 获取treeview
     * 
     */
    public TreeView getTreeview() {
        return this.treeview;
    }

    /**
     * 设置treeview
     * 
     */
    public void setTreeview(TreeView treeview) {
        this.treeview = treeview;
    }

}
