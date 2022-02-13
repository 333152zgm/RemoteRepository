package com.zgm.controller;

/**
 * ClassName:MyController
 * package:com.zgm.controller
 * Description:
 *
 * @Date:2022/1/17 0017 12:06
 * @Author:zgm3331529718@qq.com
 */

import com.zgm.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Controller:创建控制器对象（也叫处理器对象），该对象是放在SpringMVC容器中
 */
@Controller
public class MyController {

    @RequestMapping(value = "/receiveproperty.do")
    public ModelAndView doSome(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/receiveparam.do")
    public ModelAndView receiveParam(@RequestParam(value = "rname",required = false) String name,
                                     @RequestParam(value = "rage",required = false) Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("rname",name);
        mv.addObject("rage",age);
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/receiveobject.do")
    public ModelAndView receiveObject(Student student){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",student.getName());
        mv.addObject("myage",student.getAge());
        mv.setViewName("show");
        return mv;
    }
}
















