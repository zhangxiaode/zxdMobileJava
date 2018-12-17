//package com.zxd.zxdMobile.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestMethod;
////import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.zxd.zxdMobile.bean.User;
//import com.zxd.zxdMobile.service.UserService;
//
//@RestController
//@RequestMapping("/")
//public class UserController {
//
//    @Autowired
//    private UserService service;
//
//    @RequestMapping("/getData")
//    public String getData(){
//
////        List<User> list = service.getAllUser();
//        return "list";
//    }
//
////    @RequestMapping("/getAll")
////    public List<AppMessage> getAllMessage(){
////
////        List<AppMessage> list = service.getAllMessage();
////        int num = list.size();
////        if(null!=list && num>3){
////            for (int i = 0; i < num-3; i++) {
////                list.remove(0);
////            }
////        }
////        return list;
////    }
////
////    @RequestMapping("/getByID")
////    public List<AppMessage> getMessageById(@RequestParam("id") String id){
////        List<AppMessage> list = service.getMessageById(id);
////        int num = list.size();
////        if(null!=list && num>5){
////            for (int i = 0; i < num-5; i++) {
////                list.remove(0);
////            }
////        }
////        return list;
////    }
////
////    @RequestMapping(value = "/add",method = RequestMethod.POST)
////    public int addMessage(@RequestBody AppMessage appMessage){
////        return service.addMessage(appMessage);
////    }
////
////    @RequestMapping(value="/delMessageById",method=RequestMethod.POST)
////    public int delMessageById(@RequestParam("id") String id){
////        return service.delMessage(id);
////    }
//}



package com.zxd.zxdMobile.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zxd.zxdMobile.bean.User;
import com.zxd.zxdMobile.service.UserService;

@RestController
@ComponentScan({"com.zxd.zxdMobile.service"})
@MapperScan("com.zxd.zxdMobile.mapper")
@RequestMapping("/apis")
public class UserController {

    @Resource
    private UserService userService;

//    @RequestMapping("/say")
//    public String say(){
//        return "springboot-a"+userService;
//    }

    @RequestMapping("/findUser")
    public String findUser(){
        User user =  userService.findUser(1);
        System.out.println(11111);
        System.out.println(user);
        ModelAndView mav = new ModelAndView();
        mav.addObject("user","sadf");
        return "HelloWord"+"fasdf--"+user.getNickname()+"--"+user.getPhone();
//        return "123";
    }


//    @RequestMapping("/ajax")
//    public String find1(){
//        return "[''message':'123dfx']";
//    }

//    public static void main(String[] args){
//        SpringApplication.run(UserController.class,args);
//    }
}