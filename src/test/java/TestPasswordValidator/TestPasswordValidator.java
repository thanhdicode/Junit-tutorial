package TestPasswordValidator;

import Demo.PasswordValidator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
    //@FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class TestPasswordValidator {
        @Test
        public void testIsPasswordStrong() throws Exception{
            PasswordValidator pv = new PasswordValidator();
            boolean isStrong = pv.isPasswordStrong("12345678");
            assertTrue(isStrong);
        }
        @Test
        public void testIsPasswordNotStrong() throws Exception{
            PasswordValidator pv = new PasswordValidator();
            boolean isStrong = pv.isPasswordStrong("1234");
            assertFalse(isStrong);
        }
        @Test
        public void testIsPasswordTooLong() throws Exception{
            PasswordValidator pv = new PasswordValidator();
            assertThrows(Exception.class, ()-> pv.isPasswordStrong("123456vhvjhjhfhj"));
        }
    }


