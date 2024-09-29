package org.example.service;

import org.example.model.UserDto;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<UserDto> users = new ArrayList<>();

    public void addUsers() {
        UserDto userDto1 = new UserDto("Roman", 20, 1L);
        UserDto userDto2 = new UserDto("Vadim", 25, 2L);

        users.add(userDto1);
        users.add(userDto2);
    }

    public List<UserDto> getUsers() {
        addUsers();
        return users;
    }

}
