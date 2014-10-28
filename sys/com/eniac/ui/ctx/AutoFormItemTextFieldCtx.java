
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.AutoFormItemTextFieldCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类AutoFormItemTextFieldCtx
 * 
 */
public class AutoFormItemTextFieldCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.AutoFormItemTextFieldCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private AutoFormItemTextFieldCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.AutoFormItemTextFieldCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.AutoFormItemTextFieldCtx();
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
    public void setCtrl(AutoFormItemTextFieldCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public AutoFormItemTextFieldCtrl getCtrl() {
        return ((AutoFormItemTextFieldCtrl) super.getCtrl());
    }

}
