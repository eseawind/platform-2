
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneLoginCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneLoginCtx
 * 
 */
public class BasePaneLoginCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneLoginCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneLoginCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneLoginCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneLoginCtx();
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
    public void setCtrl(BasePaneLoginCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneLoginCtrl getCtrl() {
        return ((BasePaneLoginCtrl) super.getCtrl());
    }

}
