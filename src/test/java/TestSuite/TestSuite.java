package TestSuite;
import Demo.TestDemo_Fixed;
import TestPasswordValidator.TestPasswordValidator;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@SelectClasses({TestDemo_Fixed.class, TestPasswordValidator.class})
@Suite
public class TestSuite {
}
