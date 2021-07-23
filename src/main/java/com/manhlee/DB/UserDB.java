package com.manhlee.DB;

import com.manhlee.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    public List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"annv@gmail.com","An", "Nguyen Van"));
        userList.add(new User(2,"duct@yahoo.com","Duc", "Tran"));
        userList.add(new User(3,"hangle@outlook.com","Hang", "Le Ngoc"));
        return userList;
    }
}
