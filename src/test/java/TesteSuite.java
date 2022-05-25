import calculadora.TestCalculadora;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestCalculadora.class})
public class TesteSuite {

    public static Test suite() {
        return new JUnit4TestAdapter(TesteSuite.class);
    }
}
