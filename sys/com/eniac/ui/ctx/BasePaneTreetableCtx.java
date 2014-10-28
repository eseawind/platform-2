
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneTreetableCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneTreetableCtx
 * 
 */
public class BasePaneTreetableCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneTreetableCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneTreetableCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneTreetableCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneTreetableCtx();
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
    public void setCtrl(BasePaneTreetableCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneTreetableCtrl getCtrl() {
        return ((BasePaneTreetableCtrl) super.getCtrl());
    }

}
