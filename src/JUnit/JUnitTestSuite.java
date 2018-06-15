package JUnit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        //Provide all the tet that you wanted to run
        JUnitTest.class,
        JUnitTestBeforeAfterClass.class
})
public class JUnitTestSuite {
}
