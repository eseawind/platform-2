
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import javafx.geometry.*;
import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class AutoFormItemDatePickerCtrl {

    /**
     * 字段:label
     * 
     */
    @FXML
    private Label label;
    /**
     * 字段:datepicker
     * 
     */
    @FXML
    private DatePicker datepicker;

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
     * 获取datepicker
     * 
     */
    public DatePicker getDatepicker() {
        return this.datepicker;
    }

    /**
     * 设置datepicker
     * 
     */
    public void setDatepicker(DatePicker datepicker) {
        this.datepicker = datepicker;
    }

}
