
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneTabTableCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneTabTableCtx
 * 
 */
public class BasePaneTabTableCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneTabTableCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneTabTableCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneTabTableCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneTabTableCtx();
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
    public void setCtrl(BasePaneTabTableCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneTabTableCtrl getCtrl() {
        return ((BasePaneTabTableCtrl) super.getCtrl());
    }

}
