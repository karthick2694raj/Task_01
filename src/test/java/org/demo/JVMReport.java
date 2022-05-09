package org.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJvmReport(String name) {
		File f=new File("C:\\Users\\rajka\\eclipse-workspace\\CucumberSample\\Report\\JVM Report");
		Configuration c=new Configuration(f, "PriyoShop");
		c.addClassifications("OS", "Windows 11");
		
		List<String> l=new ArrayList<String>();
		l.add(name);
		
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
	}

}
