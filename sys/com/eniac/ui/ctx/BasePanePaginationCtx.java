
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePanePaginationCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePanePaginationCtx
 * 
 */
public class BasePanePaginationCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePanePaginationCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePanePaginationCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePanePaginationCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePanePaginationCtx();
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
    public void setCtrl(BasePanePaginationCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePanePaginationCtrl getCtrl() {
        return ((BasePanePaginationCtrl) super.getCtrl());
    }

}
