
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.AutoFormItemDatePickerCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类AutoFormItemDatePickerCtx
 * 
 */
public class AutoFormItemDatePickerCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.AutoFormItemDatePickerCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private AutoFormItemDatePickerCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.AutoFormItemDatePickerCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.AutoFormItemDatePickerCtx();
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
    public void setCtrl(AutoFormItemDatePickerCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public AutoFormItemDatePickerCtrl getCtrl() {
        return ((AutoFormItemDatePickerCtrl) super.getCtrl());
    }

}
