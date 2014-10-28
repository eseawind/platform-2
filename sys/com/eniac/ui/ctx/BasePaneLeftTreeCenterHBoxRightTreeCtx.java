
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneLeftTreeCenterHBoxRightTreeCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneLeftTreeCenterHBoxRightTreeCtx
 * 
 */
public class BasePaneLeftTreeCenterHBoxRightTreeCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneLeftTreeCenterHBoxRightTreeCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneLeftTreeCenterHBoxRightTreeCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneLeftTreeCenterHBoxRightTreeCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneLeftTreeCenterHBoxRightTreeCtx();
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
    public void setCtrl(BasePaneLeftTreeCenterHBoxRightTreeCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneLeftTreeCenterHBoxRightTreeCtrl getCtrl() {
        return ((BasePaneLeftTreeCenterHBoxRightTreeCtrl) super.getCtrl());
    }

}
