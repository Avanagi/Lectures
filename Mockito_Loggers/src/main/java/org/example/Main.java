package org.example;

import org.apache.log4j.Logger;
import org.example.model.UserDto;
import org.example.service.DocumentService;
import org.example.service.UserService;

import java.util.List;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            DocumentService documentService = new DocumentService();
            UserService userService = new UserService(documentService);
            userService.createUser();
            List<UserDto> users = userService.getUsers();
            logger.info("Users found - " + users);
        } catch (Exception e) {
            logger.error("Users not found");
        }
    }

}
