import de.helwich.junit.JasmineTestRunner;
import org.junit.runner.RunWith;
import de.helwich.junit.JasmineTest;

@RunWith(JasmineTestRunner.class)
@JasmineTest(
        srcDir =  "/src/main/resources",
        src =  { "square" },
        testDir =  "/src/test/resources",
        test = {"spec/square_spec"},
        browser = false
)
public class JasmineSquareTest {
}
