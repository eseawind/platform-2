
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.AutoFormPaneCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类AutoFormPaneCtx
 * 
 */
public class AutoFormPaneCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.AutoFormPaneCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private AutoFormPaneCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.AutoFormPaneCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.AutoFormPaneCtx();
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
    public void setCtrl(AutoFormPaneCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public AutoFormPaneCtrl getCtrl() {
        return ((AutoFormPaneCtrl) super.getCtrl());
    }

}
