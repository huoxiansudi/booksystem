package com.hxsd.controller.houtai;


import com.hxsd.dao.RoleDao;
import com.hxsd.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;



@Controller
@RequestMapping("/houtai/role")
public class HouTai_Role_Controller {
	

	@Resource
	private RoleDao roleDao;
	
	/**
	 * /houtai/role/manage
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageTitle", "角色管理");
		mav.addObject("title", "角色管理");
		mav.setViewName("/admin/page/role/role_manage");
		return mav;
	}
	
	
	/**
	 * /houtai/role/add
	 */
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("btn_text", "添加");
		mav.addObject("save_url", "/admin/role/add");
		mav.setViewName("/admin/page/role/add_update");
		return mav;
	}
	
	
	/**
	 * /houtai/role/edit?id=1
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value = "id", required = false) Integer id) throws Exception {
		ModelAndView mav = new ModelAndView();
		Role role = roleDao.findId(id);
		mav.addObject("role", role);
		mav.addObject("btn_text", "修改");
		mav.addObject("save_url", "/admin/role/update?id=" + id);
		mav.setViewName("/admin/page/role/add_update");
		return mav;
	}
	
	
	/**
	 * /houtai/role/set_menu?id=1
	 */
	@RequestMapping("/set_menu")
	public ModelAndView set_menu(@RequestParam(value = "id", required = false) Integer id) throws Exception {
		ModelAndView mav = new ModelAndView();
		Role role = roleDao.findId(id);
		mav.addObject("role", role);
		mav.addObject("btn_text", "修改");
		mav.addObject("save_url", "/admin/role/update?id=" + id);
		mav.setViewName("/admin/page/role/set_menu");
		return mav;
	}
	
	
	
}
