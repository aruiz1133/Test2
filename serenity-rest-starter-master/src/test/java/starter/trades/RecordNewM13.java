package starter.trades;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.WebServiceEndPoints;

public class RecordNewM13 {
	
    @Step("Validamos el  archivo  {int}:")
    public static void withDetails(String trade) {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .body(trade)
                .when()
                .put(WebServiceEndPoints.M13.getUrl());
    }

}
