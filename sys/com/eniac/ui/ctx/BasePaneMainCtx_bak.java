
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneMainCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneMainCtx_bak
 * 
 */
public class BasePaneMainCtx_bak
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneMainCtx_bak currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneMainCtx_bak() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneMainCtx_bak newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneMainCtx_bak();
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
    public void setCtrl(BasePaneMainCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneMainCtrl getCtrl() {
        return ((BasePaneMainCtrl) super.getCtrl());
    }

}
