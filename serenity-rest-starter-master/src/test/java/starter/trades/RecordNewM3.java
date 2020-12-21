package starter.trades;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.WebServiceEndPoints;

public class RecordNewM3 {

    @Step("cuerpo body {int}:")
    public void withDetails(String trade) {
        SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .body(trade)
                .when()
                .post(WebServiceEndPoints.M3.getUrl());
    }
}
