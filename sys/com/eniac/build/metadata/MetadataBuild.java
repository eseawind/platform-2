package com.eniac.build.metadata;

import java.util.List;
/**
 * 生成代码
 * @author yinfx
 * 2014年9月2日  下午5:11:12
 * version 1.0
 */
public class MetadataBuild {
	public static void main(String[] args) throws Exception {
		List<MetadataVO> buildClassVOs = MetadataUtil.getInstance()
				.getBuildClassVOs("system.xls");
		MetadataUtil.getInstance().genPOJOCode(buildClassVOs);
	}
}
