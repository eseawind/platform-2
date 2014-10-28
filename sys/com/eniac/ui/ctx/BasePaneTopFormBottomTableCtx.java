
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneTopFormBottomTableCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneTopFormBottomTableCtx
 * 
 */
public class BasePaneTopFormBottomTableCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneTopFormBottomTableCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneTopFormBottomTableCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneTopFormBottomTableCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneTopFormBottomTableCtx();
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
    public void setCtrl(BasePaneTopFormBottomTableCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneTopFormBottomTableCtrl getCtrl() {
        return ((BasePaneTopFormBottomTableCtrl) super.getCtrl());
    }

}
