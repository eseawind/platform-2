
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.AutoFormCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类AutoFormCtx
 * 
 */
public class AutoFormCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.AutoFormCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private AutoFormCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.AutoFormCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.AutoFormCtx();
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
    public void setCtrl(AutoFormCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public AutoFormCtrl getCtrl() {
        return ((AutoFormCtrl) super.getCtrl());
    }

}
