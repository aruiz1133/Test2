package starter.status;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.WebServiceEndPoints;

import static starter.WebServiceEndPoints.STATUS;

public class ApplicationStatus {

    public AppStatus currentStatus() {
    	WebServiceEndPoints var = STATUS;
        int statusCode = RestAssured.get(STATUS.getUrl()).statusCode();
//        System.out.println(statusCode);
//        System.out.println(SerenityRest.get(STATUS.getUrl()));
        return (statusCode == 200) ? AppStatus.RUNNING : AppStatus.DOWN;
        
    }

    @Step("Get current status message")
    public void readStatusMessage() {
        SerenityRest.get(STATUS.getUrl());
    }
}
