
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneNavChildMenuGroupFunsCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneNavChildMenuGroupFunsCtx
 * 
 */
public class BasePaneNavChildMenuGroupFunsCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneNavChildMenuGroupFunsCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneNavChildMenuGroupFunsCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneNavChildMenuGroupFunsCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneNavChildMenuGroupFunsCtx();
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
