
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import java.lang.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class AutoFormCtrl {

    /**
     * 字段:flowpane
     * 
     */
    @FXML
    private FlowPane flowpane;
    /**
     * 字段:root
     * 
     */
    @FXML
    private ScrollPane root;

    /**
     * 获取flowpane
     * 
     */
    public FlowPane getFlowpane() {
        return this.flowpane;
    }

    /**
     * 设置flowpane
     * 
     */
    public void setFlowpane(FlowPane flowpane) {
        this.flowpane = flowpane;
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

}
