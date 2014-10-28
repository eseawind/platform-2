
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import javafx.geometry.*;
import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class BasePaneTabContentCtrl {

    /**
     * 字段:bottompane
     * 
     */
    @FXML
    private AnchorPane bottompane;
    /**
     * 字段:toppane
     * 
     */
    @FXML
    private AnchorPane toppane;
    /**
     * 字段:tophbox
     * 
     */
    @FXML
    private HBox tophbox;

    /**
     * 获取bottompane
     * 
     */
    public AnchorPane getBottompane() {
        return this.bottompane;
    }

    /**
     * 设置bottompane
     * 
     */
    public void setBottompane(AnchorPane bottompane) {
        this.bottompane = bottompane;
    }

    /**
     * 获取toppane
     * 
     */
    public AnchorPane getToppane() {
        return this.toppane;
    }

    /**
     * 设置toppane
     * 
     */
    public void setToppane(AnchorPane toppane) {
        this.toppane = toppane;
    }

    /**
     * 获取tophbox
     * 
     */
    public HBox getTophbox() {
        return this.tophbox;
    }

    /**
     * 设置tophbox
     * 
     */
    public void setTophbox(HBox tophbox) {
        this.tophbox = tophbox;
    }

}
