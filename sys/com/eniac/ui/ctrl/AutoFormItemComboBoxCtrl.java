
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import javafx.geometry.*;
import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class AutoFormItemComboBoxCtrl {

    /**
     * 字段:label
     * 
     */
    @FXML
    private Label label;
    /**
     * 字段:combobox
     * 
     */
    @FXML
    private ComboBox combobox;

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

    /**
     * 获取combobox
     * 
     */
    public ComboBox getCombobox() {
        return this.combobox;
    }

    /**
     * 设置combobox
     * 
     */
    public void setCombobox(ComboBox combobox) {
        this.combobox = combobox;
    }

}
