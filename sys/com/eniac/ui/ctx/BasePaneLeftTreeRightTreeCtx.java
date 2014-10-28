
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneLeftTreeRightTreeCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneLeftTreeRightTreeCtx
 * 
 */
public class BasePaneLeftTreeRightTreeCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneLeftTreeRightTreeCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneLeftTreeRightTreeCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneLeftTreeRightTreeCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneLeftTreeRightTreeCtx();
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
    public void setCtrl(BasePaneLeftTreeRightTreeCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneLeftTreeRightTreeCtrl getCtrl() {
        return ((BasePaneLeftTreeRightTreeCtrl) super.getCtrl());
    }

}
