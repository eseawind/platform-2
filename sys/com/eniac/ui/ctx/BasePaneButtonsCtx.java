
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneButtonsCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneButtonsCtx
 * 
 */
public class BasePaneButtonsCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneButtonsCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneButtonsCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneButtonsCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneButtonsCtx();
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
    public void setCtrl(BasePaneButtonsCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneButtonsCtrl getCtrl() {
        return ((BasePaneButtonsCtrl) super.getCtrl());
    }

}
