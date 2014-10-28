package com.eniac.vo.templet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 模板基类
 * 
 */
@Entity
@Table(name = "eniac_vo_BaseTempletVO")
public class BaseTempletVO {

	/**
	 * db时间戳
	 * 
	 */
	public final static java.lang.String TS = "ts";
	/**
	 * 变量:时间戳
	 * 
	 */
	@Id
	private String ts;
	/**
	 * db删除标识
	 * 
	 */
	public final static java.lang.String DR = "dr";
	/**
	 * 变量:删除标识
	 * 
	 */
	@Column(length = 500, nullable = true, name = "dr")
	private String dr;
	/**
	 * db集团
	 * 
	 */
	public final static java.lang.String PK_GROUP = "pk_group";
	/**
	 * 变量:集团
	 * 
	 */
	@Column(length = 500, nullable = true, name = "pk_group")
	private String pk_group;
	/**
	 * db组织
	 * 
	 */
	public final static java.lang.String PK_ORG = "pk_org";
	/**
	 * 变量:组织
	 * 
	 */
	@Column(length = 500, nullable = true, name = "pk_org")
	private String pk_org;
	/**
	 * db组织版本
	 * 
	 */
	public final static java.lang.String PK_ORG_V = "pk_org_v";
	/**
	 * 变量:组织版本
	 * 
	 */
	@Column(length = 500, nullable = true, name = "pk_org_v")
	private String pk_org_v;
	/**
	 * db主键
	 * 
	 */
	public final static java.lang.String ID = "id";
	/**
	 * 变量:主键
	 * 
	 */
	@Column(length = 500, nullable = true, name = "id")
	private String id;
	/**
	 * db编码
	 * 
	 */
	public final static java.lang.String CODE = "code";
	/**
	 * 变量:编码
	 * 
	 */
	@Column(length = 500, nullable = true, name = "code")
	private String code;
	/**
	 * db名称
	 * 
	 */
	public final static java.lang.String NAME = "name";
	/**
	 * 变量:名称
	 * 
	 */
	@Column(length = 500, nullable = true, name = "name")
	private String name;
	/**
	 * db封存标记
	 * 
	 */
	public final static java.lang.String SEALFLAG = "sealflag";
	/**
	 * 变量:封存标记
	 * 
	 */
	@Column(length = 500, nullable = true, name = "sealflag")
	private String sealflag;
	/**
	 * db封存时间
	 * 
	 */
	public final static java.lang.String SEALDATETIME = "sealdatetime";
	/**
	 * 变量:封存时间
	 * 
	 */
	@Column(length = 500, nullable = true, name = "sealdatetime")
	private String sealdatetime;
	/**
	 * db启用标记
	 * 
	 */
	public final static java.lang.String USEDFLAG = "usedflag";
	/**
	 * 变量:启用标记
	 * 
	 */
	@Column(length = 500, nullable = true, name = "usedflag")
	private String usedflag;
	/**
	 * db内部编码
	 * 
	 */
	public final static java.lang.String MNECODE = "mnecode";
	/**
	 * 变量:内部编码
	 * 
	 */
	@Column(length = 500, nullable = true, name = "mnecode")
	private String mnecode;
	/**
	 * db简称
	 * 
	 */
	public final static java.lang.String SHORTNAME = "shortname";
	/**
	 * 变量:简称
	 * 
	 */
	@Column(length = 500, nullable = true, name = "shortname")
	private String shortname;
	/**
	 * db创建人
	 * 
	 */
	public final static java.lang.String CREATOR = "creator";
	/**
	 * 变量:创建人
	 * 
	 */
	@Column(length = 500, nullable = true, name = "creator")
	private String creator;
	/**
	 * db创建时间
	 * 
	 */
	public final static java.lang.String CREATIONTIME = "creationtime";
	/**
	 * 变量:创建时间
	 * 
	 */
	@Column(length = 500, nullable = true, name = "creationtime")
	private String creationtime;
	/**
	 * db修改人
	 * 
	 */
	public final static java.lang.String MODIFIER = "modifier";
	/**
	 * 变量:修改人
	 * 
	 */
	@Column(length = 500, nullable = true, name = "modifier")
	private String modifier;
	/**
	 * db修改时间
	 * 
	 */
	public final static java.lang.String MODIFIEDTIME = "modifiedtime";
	/**
	 * 变量:修改时间
	 * 
	 */
	@Column(length = 500, nullable = true, name = "modifiedtime")
	private String modifiedtime;
	/**
	 * db备注
	 * 
	 */
	public final static java.lang.String REMARK = "remark";
	/**
	 * 变量:备注
	 * 
	 */
	@Column(length = 500, nullable = true, name = "remark")
	private String remark;
	/**
	 * db自定义项1
	 * 
	 */
	public final static java.lang.String VDEF1 = "vdef1";
	/**
	 * 变量:自定义项1
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef1")
	private String vdef1;
	/**
	 * db自定义项2
	 * 
	 */
	public final static java.lang.String VDEF2 = "vdef2";
	/**
	 * 变量:自定义项2
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef2")
	private String vdef2;
	/**
	 * db自定义项3
	 * 
	 */
	public final static java.lang.String VDEF3 = "vdef3";
	/**
	 * 变量:自定义项3
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef3")
	private String vdef3;
	/**
	 * db自定义项4
	 * 
	 */
	public final static java.lang.String VDEF4 = "vdef4";
	/**
	 * 变量:自定义项4
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef4")
	private String vdef4;
	/**
	 * db自定义项5
	 * 
	 */
	public final static java.lang.String VDEF5 = "vdef5";
	/**
	 * 变量:自定义项5
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef5")
	private String vdef5;
	/**
	 * db自定义项6
	 * 
	 */
	public final static java.lang.String VDEF6 = "vdef6";
	/**
	 * 变量:自定义项6
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef6")
	private String vdef6;
	/**
	 * db自定义项7
	 * 
	 */
	public final static java.lang.String VDEF7 = "vdef7";
	/**
	 * 变量:自定义项7
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef7")
	private String vdef7;
	/**
	 * db自定义项8
	 * 
	 */
	public final static java.lang.String VDEF8 = "vdef8";
	/**
	 * 变量:自定义项8
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef8")
	private String vdef8;
	/**
	 * db自定义项9
	 * 
	 */
	public final static java.lang.String VDEF9 = "vdef9";
	/**
	 * 变量:自定义项9
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef9")
	private String vdef9;
	/**
	 * db自定义项10
	 * 
	 */
	public final static java.lang.String VDEF10 = "vdef10";
	/**
	 * 变量:自定义项10
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef10")
	private String vdef10;
	/**
	 * db自定义项11
	 * 
	 */
	public final static java.lang.String VDEF11 = "vdef11";
	/**
	 * 变量:自定义项11
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef11")
	private String vdef11;
	/**
	 * db自定义项12
	 * 
	 */
	public final static java.lang.String VDEF12 = "vdef12";
	/**
	 * 变量:自定义项12
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef12")
	private String vdef12;
	/**
	 * db自定义项13
	 * 
	 */
	public final static java.lang.String VDEF13 = "vdef13";
	/**
	 * 变量:自定义项13
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef13")
	private String vdef13;
	/**
	 * db自定义项14
	 * 
	 */
	public final static java.lang.String VDEF14 = "vdef14";
	/**
	 * 变量:自定义项14
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef14")
	private String vdef14;
	/**
	 * db自定义项15
	 * 
	 */
	public final static java.lang.String VDEF15 = "vdef15";
	/**
	 * 变量:自定义项15
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef15")
	private String vdef15;
	/**
	 * db自定义项16
	 * 
	 */
	public final static java.lang.String VDEF16 = "vdef16";
	/**
	 * 变量:自定义项16
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef16")
	private String vdef16;
	/**
	 * db自定义项17
	 * 
	 */
	public final static java.lang.String VDEF17 = "vdef17";
	/**
	 * 变量:自定义项17
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef17")
	private String vdef17;
	/**
	 * db自定义项18
	 * 
	 */
	public final static java.lang.String VDEF18 = "vdef18";
	/**
	 * 变量:自定义项18
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef18")
	private String vdef18;
	/**
	 * db自定义项19
	 * 
	 */
	public final static java.lang.String VDEF19 = "vdef19";
	/**
	 * 变量:自定义项19
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef19")
	private String vdef19;
	/**
	 * db自定义项20
	 * 
	 */
	public final static java.lang.String VDEF20 = "vdef20";
	/**
	 * 变量:自定义项20
	 * 
	 */
	@Column(length = 500, nullable = true, name = "vdef20")
	private String vdef20;

	/**
	 * 获取时间戳
	 * 
	 */
	public String getTs() {
		return this.ts;
	}

	/**
	 * 设置时间戳
	 * 
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * 获取删除标识
	 * 
	 */
	public String getDr() {
		return this.dr;
	}

	/**
	 * 设置删除标识
	 * 
	 */
	public void setDr(String dr) {
		this.dr = dr;
	}

	/**
	 * 获取集团
	 * 
	 */
	public String getPk_group() {
		return this.pk_group;
	}

	/**
	 * 设置集团
	 * 
	 */
	public void setPk_group(String pk_group) {
		this.pk_group = pk_group;
	}

	/**
	 * 获取组织
	 * 
	 */
	public String getPk_org() {
		return this.pk_org;
	}

	/**
	 * 设置组织
	 * 
	 */
	public void setPk_org(String pk_org) {
		this.pk_org = pk_org;
	}

	/**
	 * 获取组织版本
	 * 
	 */
	public String getPk_org_v() {
		return this.pk_org_v;
	}

	/**
	 * 设置组织版本
	 * 
	 */
	public void setPk_org_v(String pk_org_v) {
		this.pk_org_v = pk_org_v;
	}

	/**
	 * 获取主键
	 * 
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * 设置主键
	 * 
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取编码
	 * 
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * 设置编码
	 * 
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取名称
	 * 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置名称
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取封存标记
	 * 
	 */
	public String getSealflag() {
		return this.sealflag;
	}

	/**
	 * 设置封存标记
	 * 
	 */
	public void setSealflag(String sealflag) {
		this.sealflag = sealflag;
	}

	/**
	 * 获取封存时间
	 * 
	 */
	public String getSealdatetime() {
		return this.sealdatetime;
	}

	/**
	 * 设置封存时间
	 * 
	 */
	public void setSealdatetime(String sealdatetime) {
		this.sealdatetime = sealdatetime;
	}

	/**
	 * 获取启用标记
	 * 
	 */
	public String getUsedflag() {
		return this.usedflag;
	}

	/**
	 * 设置启用标记
	 * 
	 */
	public void setUsedflag(String usedflag) {
		this.usedflag = usedflag;
	}

	/**
	 * 获取内部编码
	 * 
	 */
	public String getMnecode() {
		return this.mnecode;
	}

	/**
	 * 设置内部编码
	 * 
	 */
	public void setMnecode(String mnecode) {
		this.mnecode = mnecode;
	}

	/**
	 * 获取简称
	 * 
	 */
	public String getShortname() {
		return this.shortname;
	}

	/**
	 * 设置简称
	 * 
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	/**
	 * 获取创建人
	 * 
	 */
	public String getCreator() {
		return this.creator;
	}

	/**
	 * 设置创建人
	 * 
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * 获取创建时间
	 * 
	 */
	public String getCreationtime() {
		return this.creationtime;
	}

	/**
	 * 设置创建时间
	 * 
	 */
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}

	/**
	 * 获取修改人
	 * 
	 */
	public String getModifier() {
		return this.modifier;
	}

	/**
	 * 设置修改人
	 * 
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	/**
	 * 获取修改时间
	 * 
	 */
	public String getModifiedtime() {
		return this.modifiedtime;
	}

	/**
	 * 设置修改时间
	 * 
	 */
	public void setModifiedtime(String modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

	/**
	 * 获取备注
	 * 
	 */
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 设置备注
	 * 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取自定义项1
	 * 
	 */
	public String getVdef1() {
		return this.vdef1;
	}

	/**
	 * 设置自定义项1
	 * 
	 */
	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}

	/**
	 * 获取自定义项2
	 * 
	 */
	public String getVdef2() {
		return this.vdef2;
	}

	/**
	 * 设置自定义项2
	 * 
	 */
	public void setVdef2(String vdef2) {
		this.vdef2 = vdef2;
	}

	/**
	 * 获取自定义项3
	 * 
	 */
	public String getVdef3() {
		return this.vdef3;
	}

	/**
	 * 设置自定义项3
	 * 
	 */
	public void setVdef3(String vdef3) {
		this.vdef3 = vdef3;
	}

	/**
	 * 获取自定义项4
	 * 
	 */
	public String getVdef4() {
		return this.vdef4;
	}

	/**
	 * 设置自定义项4
	 * 
	 */
	public void setVdef4(String vdef4) {
		this.vdef4 = vdef4;
	}

	/**
	 * 获取自定义项5
	 * 
	 */
	public String getVdef5() {
		return this.vdef5;
	}

	/**
	 * 设置自定义项5
	 * 
	 */
	public void setVdef5(String vdef5) {
		this.vdef5 = vdef5;
	}

	/**
	 * 获取自定义项6
	 * 
	 */
	public String getVdef6() {
		return this.vdef6;
	}

	/**
	 * 设置自定义项6
	 * 
	 */
	public void setVdef6(String vdef6) {
		this.vdef6 = vdef6;
	}

	/**
	 * 获取自定义项7
	 * 
	 */
	public String getVdef7() {
		return this.vdef7;
	}

	/**
	 * 设置自定义项7
	 * 
	 */
	public void setVdef7(String vdef7) {
		this.vdef7 = vdef7;
	}

	/**
	 * 获取自定义项8
	 * 
	 */
	public String getVdef8() {
		return this.vdef8;
	}

	/**
	 * 设置自定义项8
	 * 
	 */
	public void setVdef8(String vdef8) {
		this.vdef8 = vdef8;
	}

	/**
	 * 获取自定义项9
	 * 
	 */
	public String getVdef9() {
		return this.vdef9;
	}

	/**
	 * 设置自定义项9
	 * 
	 */
	public void setVdef9(String vdef9) {
		this.vdef9 = vdef9;
	}

	/**
	 * 获取自定义项10
	 * 
	 */
	public String getVdef10() {
		return this.vdef10;
	}

	/**
	 * 设置自定义项10
	 * 
	 */
	public void setVdef10(String vdef10) {
		this.vdef10 = vdef10;
	}

	/**
	 * 获取自定义项11
	 * 
	 */
	public String getVdef11() {
		return this.vdef11;
	}

	/**
	 * 设置自定义项11
	 * 
	 */
	public void setVdef11(String vdef11) {
		this.vdef11 = vdef11;
	}

	/**
	 * 获取自定义项12
	 * 
	 */
	public String getVdef12() {
		return this.vdef12;
	}

	/**
	 * 设置自定义项12
	 * 
	 */
	public void setVdef12(String vdef12) {
		this.vdef12 = vdef12;
	}

	/**
	 * 获取自定义项13
	 * 
	 */
	public String getVdef13() {
		return this.vdef13;
	}

	/**
	 * 设置自定义项13
	 * 
	 */
	public void setVdef13(String vdef13) {
		this.vdef13 = vdef13;
	}

	/**
	 * 获取自定义项14
	 * 
	 */
	public String getVdef14() {
		return this.vdef14;
	}

	/**
	 * 设置自定义项14
	 * 
	 */
	public void setVdef14(String vdef14) {
		this.vdef14 = vdef14;
	}

	/**
	 * 获取自定义项15
	 * 
	 */
	public String getVdef15() {
		return this.vdef15;
	}

	/**
	 * 设置自定义项15
	 * 
	 */
	public void setVdef15(String vdef15) {
		this.vdef15 = vdef15;
	}

	/**
	 * 获取自定义项16
	 * 
	 */
	public String getVdef16() {
		return this.vdef16;
	}

	/**
	 * 设置自定义项16
	 * 
	 */
	public void setVdef16(String vdef16) {
		this.vdef16 = vdef16;
	}

	/**
	 * 获取自定义项17
	 * 
	 */
	public String getVdef17() {
		return this.vdef17;
	}

	/**
	 * 设置自定义项17
	 * 
	 */
	public void setVdef17(String vdef17) {
		this.vdef17 = vdef17;
	}

	/**
	 * 获取自定义项18
	 * 
	 */
	public String getVdef18() {
		return this.vdef18;
	}

	/**
	 * 设置自定义项18
	 * 
	 */
	public void setVdef18(String vdef18) {
		this.vdef18 = vdef18;
	}

	/**
	 * 获取自定义项19
	 * 
	 */
	public String getVdef19() {
		return this.vdef19;
	}

	/**
	 * 设置自定义项19
	 * 
	 */
	public void setVdef19(String vdef19) {
		this.vdef19 = vdef19;
	}

	/**
	 * 获取自定义项20
	 * 
	 */
	public String getVdef20() {
		return this.vdef20;
	}

	/**
	 * 设置自定义项20
	 * 
	 */
	public void setVdef20(String vdef20) {
		this.vdef20 = vdef20;
	}

}
