package com.hebehan.api;

import com.alibaba.fastjson.JSON;
import com.hebehan.bean.User;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Hebe Han
 * Date: 2019-01-15
 */
@Slf4j
@Controller
public class PageController implements ErrorController {

    @GetMapping(value = "/login")
    public String login(ModelMap map){
        return "userForm";
    }

    @PostMapping(value = "/tologin")
    @ResponseBody
    public String tologin(User user){
        log.info(JSON.toJSONString(user));
        return "userForm";
    }

//    @GetMapping(value="error")
    public String error(HttpServletResponse response){
        log.info("status={}",response.getStatus());
        return response.getStatus()+"";
    }

    @GetMapping(value="/404")
    public ModelAndView error404(HttpServletResponse response,ModelMap map){
        log.info("status={}",response.getStatus());
//        map.addAttribute("code",response.getStatus());
//        map.addAttribute("msg","你要的页面飞走了~");
        ModelAndView mav = new ModelAndView("/error/404");
        mav.addObject("code",response.getStatus());
        mav.addObject("msg","你要的页面飞走了~ from mav");
//        return "/error/404";
        return mav;
    }

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request,HttpServletResponse response,ModelMap map) {
        //do something like logging
        map.addAttribute("code",response.getStatus());
        map.addAttribute("msg","你要的页面飞走了~");
        return "/error/404";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
