
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneLeftTreeRightTableCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneLeftTreeRightTableCtx
 * 
 */
public class BasePaneLeftTreeRightTableCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneLeftTreeRightTableCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneLeftTreeRightTableCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneLeftTreeRightTableCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneLeftTreeRightTableCtx();
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
    public void setCtrl(BasePaneLeftTreeRightTableCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneLeftTreeRightTableCtrl getCtrl() {
        return ((BasePaneLeftTreeRightTableCtrl) super.getCtrl());
    }

}
