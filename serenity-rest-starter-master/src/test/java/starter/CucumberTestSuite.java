package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        //features = "classpath:features/postARLSendaMedico/M3.feature"
       // features = "classpath:features/postARLSendaMedico/M10.feature"
        features = "classpath:features"
//        features = "classpath:features/status/check_on_application_status.feature"
       //features = "classpath:features/getARLSendaMedico/M2.feature"
         // features = "classpath:features/postARLSendaMedico/M13.feature"
//        features = "classpath:features/getARLSendaMedico/M5.feature"
       // features = "classpath:features/getARLSendaMedico/M1.feature"
        //features = "classpath:features/getARLSendaMedico/M11.feature"
        //features = "classpath:features/getARLSendaMedico/M12.feature"
        //features = "classpath:features/getARLSendaMedico/M15.feature"
         //features = "classpath:features/postARLSendaMedico/M7.feature"
//        features = "classpath:features/getARLSendaMedico/M14.feature"
)
public class CucumberTestSuite {}
