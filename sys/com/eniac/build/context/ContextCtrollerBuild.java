package com.eniac.build.context;
/**
 * FXML上下文及控制类代码生成处理类
 * @author yinfx
 * 2014年9月7日  下午1:54:06
 * version 1.0
 */
public class ContextCtrollerBuild {
	public static void main(String[] args) throws Exception {
		// 生成所有ctrl代码
		ControllerlUtil.getInstance().processFXMLs(ControllerlUtil.class.getResource("/").getPath());
		// 生成所有context代码
		ContextUtil.getInstance().processCtxes(ContextUtil.class.getResource("/").getPath());
	}
}