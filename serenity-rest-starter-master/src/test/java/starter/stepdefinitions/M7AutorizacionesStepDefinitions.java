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
import starter.trades.RecordNewM7;
import starter.trades.TradeResponse;


@SuppressWarnings("deprecation")
public class M7AutorizacionesStepDefinitions {


    @Steps
    RecordNewM7 recordNewM7;
    
   

    @Steps
    TradeResponse theTradeDetails;

	String trade;
	
	@Given("Validamos el  archivo Autorizaciones {int}:")
	public void validamos_el_archivo_Autorizaciones(Integer int1)throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		
		Integer global = null;
//		Map<String, String> indice;
//		indice = tradeDetails.get(0);
//		System.out.println(tradeDetails.get(0));
		
//		Iterator<String> it2 = indice.keySet().iterator();
//		while (it2.hasNext()) {
//			String key = it2.next();
//			System.out.println(" " + key + " -> Valor: " + indice.get(key));
//			global = indice.get(key);
//		}
		
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

		String line0 = Files.readAllLines(Paths.get("C:\\DATA_WebService\\M7.csv")).get(0);
		parts = line0.split("\\;");
		parts0 = parts;
		System.out.println(Arrays.asList(parts));

		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		String lineN = Files.readAllLines(Paths.get("C:\\DATA_WebService\\M7.csv")).get(global);
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
		trade = MergeFrom.template("templates/M7Autorizaciones.json")
				.withDefaultValuesFrom(FieldValues.in("templates/standar-M7Autorizaciones.properties"))
				.withFieldsFrom(linkedHashMap);
		
		
		
	}
	
	@When("Armamos Campos Autorizaciones")
	public void Armamos_Campos_Autorizaciones() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		recordNewM7.withDetails(trade);
	}
	
	@Then("Esperamos la respuesta Autorizaciones")
//	@Then("Me retorla la siguiente info")
	public void Esperamos_la_respuesta_Autorizaciones(io.cucumber.datatable.DataTable dataTable) {
	
	    
		
	}

	
		
	}

		



		
	



