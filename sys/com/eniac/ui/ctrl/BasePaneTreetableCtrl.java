
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import java.lang.*;
import javafx.scene.control.*;

public class BasePaneTreetableCtrl {

    /**
     * 字段:treetableview
     * 
     */
    @FXML
    private TreeTableView treetableview;

    /**
     * 获取treetableview
     * 
     */
    public TreeTableView getTreetableview() {
        return this.treetableview;
    }

    /**
     * 设置treetableview
     * 
     */
    public void setTreetableview(TreeTableView treetableview) {
        this.treetableview = treetableview;
    }

}
