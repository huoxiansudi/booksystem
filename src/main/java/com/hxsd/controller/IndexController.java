package com.hxsd.controller;

import com.hxsd.util.BrowserUtil;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by jinhs on 2019/7/27.
 */
@Controller
public class IndexController {

    @Autowired
    private ServletContext servletContext;

    /**
     *# 请求首页
     */
    @RequestMapping("/")
    public String  index_1(HttpServletResponse res, HttpServletRequest req) throws Exception {
        return "redirect:/login";
    }

    /**
     *   #请求首页  /index
     */
    @RequestMapping("/index")
    public String index(HttpServletResponse  res,HttpServletRequest req) throws Exception {
        return "redirect:/login";
    }

    /**
     *    /login
     *    #后台 用户电脑登陆
     */
    @RequestMapping("/login")
    public ModelAndView login(HttpServletResponse  res, HttpServletRequest req) throws Exception {
        ModelAndView mav = new ModelAndView();
        String UserAgent = req.getHeader("User-Agent");
        //判断AppleWebKit 和  Firefox
        if(BrowserUtil.checkUserAgent(UserAgent)){
            mav.setViewName("pc/login/login");
        }else{
            mav.setViewName("common/s_mode");
        }
        return mav;
    }

    /**
     * # 后台主页
     */
    @RequestMapping("/admin/main")
    public ModelAndView admin_main(HttpServletResponse  res,HttpServletRequest req,HttpSession session) throws Exception {
        ModelAndView mav = new ModelAndView();
        String UserAgent = req.getHeader("User-Agent");
        //判断AppleWebKit 和  Firefox
        if(BrowserUtil.checkUserAgent(UserAgent)){
            mav.setViewName("admin/main");
        }else{
            mav.setViewName("common/s_mode");
        }

            return mav;
        }
}
