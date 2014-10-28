
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import javafx.geometry.*;
import javafx.scene.control.*;
import java.lang.*;
import javafx.scene.layout.*;

public class AutoFormItemTextFieldCtrl {

    /**
     * 字段:textfield
     * 
     */
    @FXML
    private TextField textfield;
    /**
     * 字段:label
     * 
     */
    @FXML
    private Label label;

    /**
     * 获取textfield
     * 
     */
    public TextField getTextfield() {
        return this.textfield;
    }

    /**
     * 设置textfield
     * 
     */
    public void setTextfield(TextField textfield) {
        this.textfield = textfield;
    }

    /**
     * 获取label
     * 
     */
    public Label getLabel() {
        return this.label;
    }

    /**
     * 设置label
     * 
     */
    public void setLabel(Label label) {
        this.label = label;
    }

}
