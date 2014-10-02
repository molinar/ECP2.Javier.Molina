package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void before() {
        user = new User(1, "Javier", "Molina");
    }

    @Test
    public void testUser() {
        assertEquals(1, user.getNumber());
        assertEquals("Javier", user.getName());
        assertEquals("Molina", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Javier Molina", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J.", user.initials());
    }

}
