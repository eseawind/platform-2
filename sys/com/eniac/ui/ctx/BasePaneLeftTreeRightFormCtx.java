
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneLeftTreeRightFormCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneLeftTreeRightFormCtx
 * 
 */
public class BasePaneLeftTreeRightFormCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneLeftTreeRightFormCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneLeftTreeRightFormCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneLeftTreeRightFormCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneLeftTreeRightFormCtx();
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
    public void setCtrl(BasePaneLeftTreeRightFormCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneLeftTreeRightFormCtrl getCtrl() {
        return ((BasePaneLeftTreeRightFormCtrl) super.getCtrl());
    }

}
