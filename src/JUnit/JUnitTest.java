package JUnit;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class JUnitTest {

    @BeforeTest
    public  void beforeTest(){
        System.out.println("Running before Test");
    }


    @Test
    public void test_add_positive_numbers(){
        Addition app1 = new Addition();
        assertEquals(10, app1.add(3,7));
        assertEquals(60, app1.add(45, 15));
        assertNotEquals(50, app1.add(45, 4));
        System.out.println("Running addition test for positive numbers");
    }

    @Test
    public void test_add_negative_numbers(){
        Addition app1 = new Addition();
        assertEquals(-10, app1.add(-5,-5));
        assertNotEquals(-600, app1.add(-455, -34));
        System.out.println("Running addition test for negative numbers");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Running after test");
    }
}
