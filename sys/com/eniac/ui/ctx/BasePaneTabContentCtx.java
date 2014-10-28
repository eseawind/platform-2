
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneTabContentCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneTabContentCtx
 * 
 */
public class BasePaneTabContentCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneTabContentCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneTabContentCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneTabContentCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneTabContentCtx();
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
    public void setCtrl(BasePaneTabContentCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneTabContentCtrl getCtrl() {
        return ((BasePaneTabContentCtrl) super.getCtrl());
    }

}
