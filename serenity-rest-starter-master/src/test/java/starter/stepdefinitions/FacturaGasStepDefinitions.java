package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.status.ApplicationStatus;

import starter.templates.FieldValues;
import starter.templates.MergeFrom;
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

@SuppressWarnings("deprecation")
public class FacturaGasStepDefinitions {

	@Given("Cargamos Archivo  GET {int}:")
	public void cargamos_Archivo_GET(Integer int1) throws IOException {
		// Write code here that turns the phrase above into concrete actions

		Integer global = null;
		System.out.println("LLEGA: ");
		System.out.println(global);

		/**
		 * Leer el .CSV y construir el Map
		 */
		String[] parts = null;
//			String[] parts0 = null;
		String[] partsn = null;
		// private int global;

		int count;
		int count1;
		int parametroFeature = 1;

//			String line0 = Files.readAllLines(Paths.get("C:\\DATA_WebService\\M1.csv")).get(0);
//			parts = line0.split("\\;");
//			parts0 = parts;
//			System.out.println(Arrays.asList(parts));

//			Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		String lineN = Files.readAllLines(Paths.get("C:\\Users\\UserQV\\Desktop\\Popular\\Gas.csv")).get(global);
		parts = lineN.split("\\;");
		partsn = parts;
		System.out.println(Arrays.asList(partsn));

//			for (int k = 0; k < partsn.length; k++) {

//				System.out.println(parts0[k]);

		String Params = partsn[0];
		System.out.println(Params);

//				linkedHashMap.put(parts0[k], partsn[k]);

//			}

		// M12Casos theApplication;
		// assertThat(theApplication.currentStatus(Params)).isEqualTo(RUNNING);

//			Iterator<String> it = linkedHashMap.keySet().iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				System.out.println(" " + key + " -> Valor: " + linkedHashMap.get(key));
//			}

	}

	@When("Seleccionamos Facturas")
	public void seleccionamos_Facturas() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
//	    
//		// Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		//theApplication.readStatusMessage(Params);
//		
//	
//	}

	@Then("Codigo:")
	public void codigo(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new cucumber.api.PendingException();
	}

}
