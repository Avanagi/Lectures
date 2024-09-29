import org.example.model.UserDto;
import org.example.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {

    UserService userService = new UserService();

    static List<UserDto> users = new ArrayList<>();

    @BeforeAll
    static void init() {
        UserDto userDto1 = new UserDto("Roman", 20, 1L);
        UserDto userDto2 = new UserDto("Vadim", 25, 2L);

        users.add(userDto1);
        users.add(userDto2);
    }

    @Test
    void addUserTest() {
        var actual = userService.getUsers();
        var expected = users;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void notNullUserTest() {
        var actual = userService.getUsers();
        Assertions.assertNotNull(actual);
    }

}
