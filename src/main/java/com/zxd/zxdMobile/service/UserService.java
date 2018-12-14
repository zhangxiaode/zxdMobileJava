package com.zxd.zxdMobile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxd.zxdMobile.bean.User;
import com.zxd.zxdMobile.mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public List<User> getMessage(){
        List<User> list = new ArrayList<User>();
        list.add(mapper.selectByPrimaryKey("xtt"));
        //list = mapper.selectAll();
        return list;
    }

//    public List<AppMessage> getAllMessage(){
//        List<AppMessage> list = new ArrayList<AppMessage>();
//        list = mapper.selectAll();
//        return list;
//    }
//
//    public int addMessage(AppMessage appMessage) {
//        return mapper.insert(appMessage);
//    }
//
//    public List<AppMessage> getMessageById(String id) {
//        return mapper.getMessById(id);
//    }
//
//    public int delMessage(String id) {
//        return mapper.deleteByPrimaryKey(id);
//    }

}