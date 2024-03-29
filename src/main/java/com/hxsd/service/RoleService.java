package com.hxsd.service;

import com.hxsd.entity.Role;

import java.util.List;
import java.util.Map;



public interface RoleService {

	public Integer update(Role role);
	
	/**
	 * @param map
	 * @param page  从0开始 
	 * @param pageSize
	 */
	public List<Role> list(Map<String, Object> map, Integer page, Integer pageSize);
	
	public Long getTotal(Map<String, Object> map);
	

	public Integer updateMenu(Integer roleId, String menuIds);
	
	
}
