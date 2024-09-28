package org.example.service;

import org.example.model.DocumentDto;
import org.example.model.UserDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserService {


    public static List<UserDto> users = new ArrayList<>();

    private final DocumentService documentService;

    public UserService(DocumentService documentService) {
        this.documentService = documentService;
    }

    public void createUser() {
        Map<Long, DocumentDto> documents = documentService.getAllDocuments();
        UserDto user = new UserDto("John", (HashMap<Long, DocumentDto>) documents);
        users.add(user);
    }

    public List<UserDto> createUserList() {
        createUser();
        return users;
    }

    public List<UserDto> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "documentService=" + documentService +
                '}';
    }
}
