package TDD.User;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void shouldCreateUserInstance() {

        String testUsername = "Vahid";
        String testPassword = "okej123";

        User user = new User(testUsername, testPassword);


    }

    @Test
    void shouldReturnCorrectUserName() {

        String expectedUserName = "erfarenTetser";
        String testPassword = "superhemligt";

        User user = new User(expectedUserName, testPassword);

        String actualUsername = user.getUserName();

        assertEquals(expectedUserName, actualUsername);

    }

    @Test
    void shouldReturnCorrectPassword() {

        String testUserName = "testAnvändare";
        String expectedPassword = "securePassword123";

        User user = new User(testUserName, expectedPassword);

        String actualPassword = user.getPassword();

        assertEquals(expectedPassword, actualPassword,
                "Lösenordet som returneras måste matcha lösenordet som skickades in i konstruktorn.");
    }

    @Test
    void shouldUpdateUserName() {

        String initialUser = "gammaltNamn";
        String newUser = "nyttNamn"; // Det vi ska ändra till och förväntar oss
        String testPassword = "securePassword";

        User user = new User(initialUser, testPassword);

        assertEquals(initialUser, user.getUserName(), "Initiala namnet ska vara korrekt.");

        user.setUserName(newUser);

        String actualNewName = user.getUserName();

        assertEquals(newUser, actualNewName,
                "Efter setUserName ska namnet vara det nya värdet.");

    }



@Test
void shouldNotUpdateUserNameIfShorterThanFourChars() {

    String validInitialUser = "GiltigtNamn";
    String invalidNewUser = "abc";
    String testPassword = "securePassword";

}

}