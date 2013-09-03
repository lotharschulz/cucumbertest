package info.lotharschulz.cucumber.test;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/test-html-report", "json-pretty:target/test-json-report.json"})
public class RunCukesTest {
}
