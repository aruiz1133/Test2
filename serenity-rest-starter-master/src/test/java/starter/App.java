

package starter;

import java.io.File;
import java.io.IOException;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import net.thucydides.core.reports.html.HtmlAggregateStoryReporter;




public class App {

	public static void main(String[] args) {
		runTestCase(CucumberTestSuite.class);
	}
	
	
	
	private static void runTestCase(Class<CucumberTestSuite> testCases) {
	//La clase runClasses soporta las etiquetas de cucumber cuando se cree el ejecutable
	Result result = JUnitCore.runClasses(testCases);
	for (Failure failure : result.getFailures()) {
	System.out.println(failure.toString());
	}
	//Genera el Reporte agregado de serenity
	new JUnitCore().run();
	File sourceDirectory = new File("target/site/serenity/");
	HtmlAggregateStoryReporter reporter = new HtmlAggregateStoryReporter(null);
	reporter.setOutputDirectory(sourceDirectory);
	try {
	reporter.generateReportsForTestResultsFrom(sourceDirectory);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	System.exit(0);
	}
	}

