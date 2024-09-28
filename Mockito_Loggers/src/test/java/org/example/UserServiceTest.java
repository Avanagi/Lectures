package org.example;

import org.example.model.DocumentDto;
import org.example.model.UserDto;
import org.example.service.DocumentService;
import org.example.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    public static Map<Long, DocumentDto> documents = new HashMap<>();
    private static List<UserDto> userDtoList = new ArrayList<>();

    @Mock
    private DocumentService documentService;

    @InjectMocks
    private UserService userService;

    @BeforeAll
    static void init() {
        Map<Long, DocumentDto> documents = new HashMap<>();

        userDtoList = new ArrayList<>();
        UserDto userDto = new UserDto("John", (HashMap<Long, DocumentDto>) documents);
        userDtoList.add(userDto);
    }


    @Test
    void createUser_Test() {
        when(documentService.getAllDocuments()).thenReturn(documents);

        var actual = userService.createUserList();

        assertEquals(userDtoList, actual);
    }

}
