package starter.stepdefinitions;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.DataTable;
import net.thucydides.core.annotations.Steps;
import starter.templates.FieldValues;
import starter.templates.MergeFrom;
import starter.trades.RecordNewM13;
import starter.trades.TradeResponse;


@SuppressWarnings("deprecation")
public class M13StepDefinitions {


    @Steps
    RecordNewM13 recordNewM13;

    @Steps
    TradeResponse theTradeDetails;

	String trade;
//	
//	@Given("Validamos el  archivo {int}:")
//	public void recorrremos_el_archivo(Integer int1) throws IOException {}
	@Given("Leemos  el  archivo {int}:")
	public void validamos_el_archivo(Integer int1) throws IOException {

		
		Integer global = null;
		global = int1;
		System.out.println("LLEGA: ");
		System.out.println(global);

		/**
		 * Leer el .CSV y construir el Map
		 */
		String[] parts = null;
		String[] parts0 = null;
		String[] partsn = null;
		int count;
		int count1;
		int parametroFeature = 1;

		String line0 = Files.readAllLines(Paths.get("C:\\DATA_WebService\\M13.csv")).get(0);
		parts = line0.split("\\;");
		parts0 = parts;
		System.out.println(Arrays.asList(parts));

		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		String lineN = Files.readAllLines(Paths.get("C:\\DATA_WebService\\M13.csv")).get(global);
		parts = lineN.split("\\;");
		partsn = parts;
		System.out.println(Arrays.asList(partsn));

		for (int k = 0; k < parts0.length; k++) {

			System.out.println(parts0[k]);
			System.out.println(partsn[k]);

			linkedHashMap.put(parts0[k], partsn[k]);

		}

		Iterator<String> it = linkedHashMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(" " + key + " -> Valor: " + linkedHashMap.get(key));

		}
		/*
		 * 
		 */
		trade = MergeFrom.template("templates/M13Diagnostico.json")
				.withDefaultValuesFrom(FieldValues.in("templates/standar-M13ActualizacionDiagnostico.properties"))
				.withFieldsFrom(linkedHashMap);
				
		
	}
//	
//	@When("Armamos Campos")
//	public void envio_el_body() {
		@When("Separamos Campos")
		public void armamos_Campos() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		RecordNewM13.withDetails(trade);
	}
//	
//	@Then("Esperamos la respuesta exitosa")
////	@Then("Me retorla la siguiente info")
			@Then("Respuesta")
	    public void esperamos_la_respuesta_exitosa(io.cucumber.datatable.DataTable dataTable) {
//	public void me_retorla_la_siguiente_info(io.cucumber.datatable.DataTable dataTable) {
//				restAssuredThat(response -> response.statusCode(200));
//
//		        Map<String, String> expectedResponse = dataTable .get(0);
//		        Map<String, String> actualResponse = theTradeDetails.returned();
//
//		        assertThat(actualResponse).containsAllEntriesOf(expectedResponse);		
				
				
//
	}



}
