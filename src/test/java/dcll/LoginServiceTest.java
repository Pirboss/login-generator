package dcll;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pierre on 15/04/16.
 */
public class LoginServiceTest {

    private LoginService l;
    @Before
    public void setUp() throws Exception {
        String[] logs = {"a", "b", "c"};
        l = new LoginService(logs);
    }

    @Test
    public void testLoginExists() throws Exception {
        assertEquals("test login exists", true, l.loginExists("a"));
    }

    @Test
    public void testAddLogin() throws Exception {
        l.addLogin("d");
        assertEquals("test add login", true, l.loginExists("d"));
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        assertTrue("test find all logins sw", l.findAllLoginsStartingWith("a").contains("a"));
    }

    @Test
    public void testFindAllLogins() throws Exception {
        assertTrue("test find all logins", l.findAllLogins().contains("a")&&l.findAllLogins().contains("b")&&l.findAllLogins().contains("c"));
    }
}