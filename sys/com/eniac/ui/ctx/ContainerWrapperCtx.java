
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.ContainerWrapperCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类ContainerWrapperCtx
 * 
 */
public class ContainerWrapperCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.ContainerWrapperCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private ContainerWrapperCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.ContainerWrapperCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.ContainerWrapperCtx();
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
    public void setCtrl(ContainerWrapperCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public ContainerWrapperCtrl getCtrl() {
        return ((ContainerWrapperCtrl) super.getCtrl());
    }

}
