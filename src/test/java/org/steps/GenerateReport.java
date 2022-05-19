package org.steps;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
	
	
	public static void generate(String json) {
		File f = new File("C:\\Users\\sabas\\eclipse-workspace\\CucumberMarch\\target\\final.html");
		Configuration c = new Configuration(f, "Final Report");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Client", "Facebook");
		c.addClassifications("Automation Tool Version", "3.141.59");
		c.addClassifications("Sprint", "2.0");
		
		List<String> li = new ArrayList();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
			
	}

}
