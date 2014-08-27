import org.junit.Before;
import org.junit.Test;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class LoadJSTest {
    private ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    private Invocable invocable = (Invocable) engine;


    @Before
    public void before() throws ScriptException {
        engine.eval("function sq(x) {return x * x;}");
    }


    @Test
    public void shouldLoadJS() throws ScriptException, NoSuchMethodException {
        assertThat(invocable.invokeFunction("sq", 4), equalTo(16.0));
    }
}
