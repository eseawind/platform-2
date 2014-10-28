
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneNavChildMenuGroupCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneNavChildMenuGroupCtx
 * 
 */
public class BasePaneNavChildMenuGroupCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneNavChildMenuGroupCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneNavChildMenuGroupCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneNavChildMenuGroupCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneNavChildMenuGroupCtx();
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
    public void setCtrl(BasePaneNavChildMenuGroupCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneNavChildMenuGroupCtrl getCtrl() {
        return ((BasePaneNavChildMenuGroupCtrl) super.getCtrl());
    }

}
