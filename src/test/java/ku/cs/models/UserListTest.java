package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        // TODO: find one of them
        // TODO: assert that UserList found User
        UserList userList = new UserList();
        userList.addUser("Jane","Hello");
        userList.addUser("Jon","Hi");
        userList.addUser("Jiang","LOL");
        User user = userList.findUserByUsername("Jane");
        String expected = "Jane";
        String actual = user.getUsername();
        assertEquals(expected, actual);
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        // TODO: change password of one user
        // TODO: assert that user can change password
        UserList userList = new UserList();
        userList.addUser("Jane","Hello");
        userList.addUser("Jon","Hi");
        userList.addUser("Jiang","LOL");
        boolean actual = userList.changePassword("Jane","Hello","Hi");
        assertTrue(actual);
        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        // TODO: call login() with correct username and password
        // TODO: assert that User object is found

        UserList userList = new UserList();
        userList.addUser("Jane","Hello");
        userList.addUser("Jon","Hi");
        userList.addUser("Jiang","LOL");
        User actual = userList.login("Jane", "Hello");
        User expected = userList.findUserByUsername("Jane");
        assertEquals(expected, actual);
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Jane", "Hello");
        userList.addUser("Jon", "Hi");
        userList.addUser("Jiang", "LOL");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("JinJo", "Hello");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}