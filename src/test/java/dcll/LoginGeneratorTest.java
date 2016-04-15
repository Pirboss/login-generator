package dcll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pierre on 15/04/16.
 */
public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator lg;
    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        lg = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {

        assertEquals("test paul durand", lg.generateLoginForNomAndPrenom("Durand", "Paul"), "PDUR");

        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        lg = new LoginGenerator(loginService);
        assertEquals("test jean rolling", lg.generateLoginForNomAndPrenom("Rolling", "Jean"), "JROL1");


        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        lg = new LoginGenerator(loginService);
        assertEquals("test paul dùrand", lg.generateLoginForNomAndPrenom("Dùrand", "Paul"), "PDUR");

    }
}