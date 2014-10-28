
package com.eniac.ui.ctrl;

import javafx.event.Event;
import javafx.fxml.FXML;
import java.lang.*;
import javafx.scene.control.*;

public class BasePaneButtonCtrl {

    /**
     * 字段:button
     * 
     */
    @FXML
    private Button button;

    /**
     * 获取button
     * 
     */
    public Button getButton() {
        return this.button;
    }

    /**
     * 设置button
     * 
     */
    public void setButton(Button button) {
        this.button = button;
    }

    /**
     * FXML控制类方法
     * 
     */
    @FXML
    public void onAction(Event event) {
    }

}
