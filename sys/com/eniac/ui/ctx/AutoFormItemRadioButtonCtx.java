
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.AutoFormItemRadioButtonCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类AutoFormItemRadioButtonCtx
 * 
 */
public class AutoFormItemRadioButtonCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.AutoFormItemRadioButtonCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private AutoFormItemRadioButtonCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.AutoFormItemRadioButtonCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.AutoFormItemRadioButtonCtx();
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
    public void setCtrl(AutoFormItemRadioButtonCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public AutoFormItemRadioButtonCtrl getCtrl() {
        return ((AutoFormItemRadioButtonCtrl) super.getCtrl());
    }

}
