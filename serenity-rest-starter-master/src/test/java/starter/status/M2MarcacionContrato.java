package starter.status;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.WebServiceEndPoints.M2;

public class M2MarcacionContrato {

    public AppStatus currentStatus(String Params) {
    	
    	System.out.println(M2.getUrl() + "/" + Params);
        int statusCode = RestAssured.get(M2.getUrl() + "/" + Params).statusCode();
        return (statusCode == 200) ? AppStatus.RUNNING : AppStatus.DOWN;
//    	
////    	System.out.println(SerenityRest.get(M1.getUrl()));
//    	System.out.println("IMPRESION");
//    	
//    	return SerenityRest.get(M1.getUrl());
    	
    }

    @Step("Get current status message")
    public void readStatusMessage(String Params) {
        SerenityRest.get(M2.getUrl() + "/" + Params);
    }
}
