
package com.eniac.ui.ctx;

import com.eniac.ui.ctrl.BasePaneTableCtrl;
import com.eniac.ui.mgr.BaseCtx;


/**
 * 类BasePaneTableCtx
 * 
 */
public class BasePaneTableCtx
    extends BaseCtx
{

    public static com.eniac.ui.ctx.BasePaneTableCtx currInstance;

    /**
     * 私有构造函数
     * 
     */
    private BasePaneTableCtx() {
        this.initialize();
    }

    /**
     * 获取新对象
     * 
     */
    public static com.eniac.ui.ctx.BasePaneTableCtx newInstance() {
        currInstance = new com.eniac.ui.ctx.BasePaneTableCtx();
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
    public void setCtrl(BasePaneTableCtrl ctrl) {
        super.setCtrl(ctrl);
    }

    /**
     * 设置控制器方法
     * 
     */
    public BasePaneTableCtrl getCtrl() {
        return ((BasePaneTableCtrl) super.getCtrl());
    }

}
