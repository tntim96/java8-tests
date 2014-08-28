import org.junit.Before;
import org.junit.Test;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.io.FileReader;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class LoadJSTest {
    private ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    private Invocable invocable = (Invocable) engine;

    @Test
    public void shouldEvaluateJS() throws Exception {
        engine.eval("function sq(x) {return x * x;}");
        assertThat(invocable.invokeFunction("sq", 4), equalTo(16.0));
    }

    @Test
    public void shouldLoadJS() throws Exception {
        engine.eval(new FileReader("src/main/resources/square.js"));
        assertThat(invocable.invokeFunction("sq", 4), equalTo(16.0));
    }

    @Test
    public void shouldLoadJasmine() throws Exception {
        engine.eval("var window = {};");//Replace with nashorn-boot.js?
        engine.eval(new FileReader("src/test/javascript/lib/jasmine-2.0.3/jasmine.js"));
        //engine.eval(new FileReader("src/test/javascript/lib/jasmine-2.0.3/jasmine-html.js"));
        //engine.eval(new FileReader("src/test/javascript/lib/jasmine-2.0.3/boot.js"));
        engine.eval(new FileReader("src/main/resources/square.js"));
        assertThat(invocable.invokeFunction("sq", 4), equalTo(16.0));
    }
}
