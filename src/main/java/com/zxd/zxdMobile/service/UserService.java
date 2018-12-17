package com.zxd.zxdMobile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zxd.zxdMobile.bean.User;
import com.zxd.zxdMobile.mapper.UserMapper;

@Service
public class UserService {

    private UserMapper mapper;

    public void addUser(User user) {
        mapper.insert(user);
    }

    public void updateUser(User user) {
        mapper.update(user);
    }

    public User findUser(int id) {
        return mapper.find(id);
    }

    public void deleteUser(int id){
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
