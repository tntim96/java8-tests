import de.helwich.junit.JasmineTestRunner;
import org.junit.runner.RunWith;
import de.helwich.junit.JasmineTest;

@RunWith(JasmineTestRunner.class)
@JasmineTest(
        srcDir =  "/src/main/resources",
        src =  { "square", "complicated" },
        testDir =  "/src/test/resources",
        test = {"spec/square_spec", "spec/complicated_spec"},
        coverage = true,
        browser = false
)
public class JasmineCoverageTest {
}
