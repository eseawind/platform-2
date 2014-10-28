package com.eniac.vo.base;

import java.util.HashMap;
import java.util.Map;
/**
 * VO基类
 * @author yinfx
 * 2014年8月19日  下午4:23:23
 */
public class BaseVO {
	/**
	 * 属性集合Map
	 */
	private Map<Object,Object> data = new HashMap<Object,Object>();
	/**
	 * 设置属性
	 * @param key 属性的key
	 * @param value 属性的值
	 */
	public void set(Object key,Object value){
		if(key == null || value == null) return;
		data.put(key, value);
	}
	/**
	 * 读取属性
	 * @param key 属性的key
	 * @return 属性的值
	 */
	public Object get(Object key){
		if(key == null) return null;
		return data.get(key);
	}
}
