
package com.eniac.ui.ctrl;

import javafx.fxml.FXML;
import java.lang.*;
import javafx.scene.control.*;

public class BasePanePaginationCtrl {

    /**
     * 字段:pagination
     * 
     */
    @FXML
    private Pagination pagination;

    /**
     * 获取pagination
     * 
     */
    public Pagination getPagination() {
        return this.pagination;
    }

    /**
     * 设置pagination
     * 
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
