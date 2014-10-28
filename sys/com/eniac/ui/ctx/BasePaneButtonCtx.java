
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneButtonCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneButtonCtx
 * 
 */
public class BasePaneButtonCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneButtonCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneButtonCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneButtonCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneButtonCtx();
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
    public void setCtrl(BasePaneButtonCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneButtonCtrl getCtrl() {
        return ((BasePaneButtonCtrl) super.getCtrl());
    }

}
