
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.AutoFormItemComboBoxCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类AutoFormItemComboBoxCtx
 * 
 */
public class AutoFormItemComboBoxCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.AutoFormItemComboBoxCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private AutoFormItemComboBoxCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.AutoFormItemComboBoxCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.AutoFormItemComboBoxCtx();
        return currInstance;
    }

    /**
     * 界面初始化
     * 
     */
    @Override
    public void initialize() {
    }

    /**
     * 设置控制器方法
     * 
     */
    public void setCtrl(AutoFormItemComboBoxCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public AutoFormItemComboBoxCtrl getCtrl() {
        return ((AutoFormItemComboBoxCtrl) super.getCtrl());
    }

}
