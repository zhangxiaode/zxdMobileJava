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

    public void insert(User user) {
        mapper.insert(user);
    }

    public void update(User user) {
        mapper.update(user);
    }

    public User find(int id) {
        return mapper.find(id);
    }

    public void delete(int id){
        mapper.delete(id);
    }

//    public List<User> getMessage(){
//        List<User> list = new ArrayList<User>();
//        list.add(mapper.selectByPrimaryKey("xtt"));
//        //list = mapper.selectAll();
//        return list;
//    }

//    public List<User> getAllUser(){
//        List<User> list = new ArrayList<User>();
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
