
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.AutoFormItemCheckBoxCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类AutoFormItemCheckBoxCtx
 * 
 */
public class AutoFormItemCheckBoxCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.AutoFormItemCheckBoxCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private AutoFormItemCheckBoxCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.AutoFormItemCheckBoxCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.AutoFormItemCheckBoxCtx();
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
    public void setCtrl(AutoFormItemCheckBoxCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public AutoFormItemCheckBoxCtrl getCtrl() {
        return ((AutoFormItemCheckBoxCtrl) super.getCtrl());
    }

}
