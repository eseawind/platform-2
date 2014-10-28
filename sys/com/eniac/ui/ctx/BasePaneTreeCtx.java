
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneTreeCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneTreeCtx
 * 
 */
public class BasePaneTreeCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneTreeCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneTreeCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneTreeCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneTreeCtx();
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
    public void setCtrl(BasePaneTreeCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneTreeCtrl getCtrl() {
        return ((BasePaneTreeCtrl) super.getCtrl());
    }

}
