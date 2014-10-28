
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneNavChildMenuCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneNavChildMenuCtx
 * 
 */
public class BasePaneNavChildMenuCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneNavChildMenuCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneNavChildMenuCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneNavChildMenuCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneNavChildMenuCtx();
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
    public void setCtrl(BasePaneNavChildMenuCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneNavChildMenuCtrl getCtrl() {
        return ((BasePaneNavChildMenuCtrl) super.getCtrl());
    }

}
