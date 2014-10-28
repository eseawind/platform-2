
package com.eniac.vo.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 登录系统类
 * 
 */
@Entity
@Table(name = "eniac_sysvo_LoginSystem")
public class LoginSystem {

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

}
