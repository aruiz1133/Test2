package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.status.ApplicationStatus;
import starter.status.M12Casos;
import starter.status.M1CoberturaClientes;
import starter.status.M11SolicitudPertenencia;
import starter.templates.FieldValues;
import starter.templates.MergeFrom;
import starter.trades.M12Response;
import starter.trades.M1Response;
import starter.trades.M11Response;
import starter.trades.RecordNewM10;
import starter.trades.TradeResponse;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static starter.status.AppStatus.RUNNING;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static starter.WebServiceEndPoints.M1;


@SuppressWarnings("deprecation")
public class M12ConsultaCasosStepDefinitions {
	
	
	
	
    @Steps
    M12Casos theApplication;
    String trade;
    String Params;
    
    @Steps
    M12Response theTradeDetails;
    
    
    	
    @Given("Sube archivo Get {int}:")
    public void Sube_archivo_Get(Integer int1)throws IOException {
		
		 
		    Integer global = null;
			global = int1;
			System.out.println("LLEGA: ");
			System.out.println(global);

			/**
			 * Leer el .CSV y construir el Map
			 */
			String[] parts = null;
//			String[] parts0 = null;
			String[] partsn = null;
			
//			int count;
//			int count1;
//			int parametroFeature = 1;

//			String line0 = Files.readAllLines(Paths.get("C:\\DATA_WebService\\M1.csv")).get(0);
//			parts = line0.split("\\;");
//			parts0 = parts;
//			System.out.println(Arrays.asList(parts));

//			Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

			String lineN = Files.readAllLines(Paths.get("C:\\DATA_WebService\\M12.csv")).get(global);
			parts = lineN.split("\\;");
			partsn = parts;
			System.out.println(Arrays.asList(partsn));

//			for (int k = 0; k < partsn.length; k++) {

//				System.out.println(parts0[k]);
			
				Params = partsn[0];
				System.out.println(Params);

//				linkedHashMap.put(parts0[k], partsn[k]);
				
				 
		 
//			}
			
			assertThat(theApplication.currentStatus(Params)).isEqualTo(RUNNING);
			

//			Iterator<String> it = linkedHashMap.keySet().iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				System.out.println(" " + key + " -> Valor: " + linkedHashMap.get(key));
//			}
			 
	}

    @When("Separamos campo a campo")
    public void Separamos_campo_a_campo() {
	    
		// Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		theApplication.readStatusMessage(Params);
		
	
	}

    @Then("llega Campos:")
    public void llega_Campos(io.cucumber.datatable.DataTable dataTable) {
//	@Then("La respuesta debe ser {int}:")
//	public void la_respuesta_debe_ser(List<Map<String, String>> tradeDetails) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		
    	restAssuredThat(response -> response.statusCode(200));

//        Map<String, String> expectedResponse = tradeDetails.get(0);
//        Map<String, String> actualResponse = theTradeDetails.returned();
//        assertThat(actualResponse).containsAllEntriesOf(expectedResponse);
	}




}

	
	
	
	