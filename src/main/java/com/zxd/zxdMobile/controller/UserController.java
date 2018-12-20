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

import com.zxd.zxdMobile.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
@ComponentScan({"com.zxd.zxdMobile.service"})
@MapperScan("com.zxd.zxdMobile.mapper")
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/say")
//    public String say(){
//        return "springboot-a"+userService;
//    }

    @RequestMapping("/findUser")
    public String findUser(){
//        User user = userService.findUser(1);
        System.out.println(userService.findUser(1));
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("user","sadf");
        return "123";
//        return user;
    }

    @RequestMapping("/addUser")
    public String addUser(){
        return "123";
    }

    @RequestMapping("/updateUser")
    public String updateUser(){
        return "123";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(){
        return "123";
    }


//    @RequestMapping("/ajax")
//    public String find1(){
//        return "[''message':'123dfx']";
//    }

//    public static void main(String[] args){
////        SpringApplication.run(UserController.class,args);
//        System.out.println(args);
//    }
}