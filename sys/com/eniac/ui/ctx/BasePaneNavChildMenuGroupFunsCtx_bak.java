
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneNavChildMenuGroupFunsCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneNavChildMenuGroupFunsCtx_bak
 * 
 */
public class BasePaneNavChildMenuGroupFunsCtx_bak
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneNavChildMenuGroupFunsCtx_bak currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneNavChildMenuGroupFunsCtx_bak() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneNavChildMenuGroupFunsCtx_bak newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneNavChildMenuGroupFunsCtx_bak();
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
    public void setCtrl(BasePaneNavChildMenuGroupFunsCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneNavChildMenuGroupFunsCtrl getCtrl() {
        return ((BasePaneNavChildMenuGroupFunsCtrl) super.getCtrl());
    }

}
