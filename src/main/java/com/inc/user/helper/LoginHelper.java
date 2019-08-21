/**
 * 
 */
package com.inc.user.helper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.XMLUnit;
import org.xml.sax.SAXException;

import com.inc.user.model.CodeCoverage;

/**
 * @author apoongavanam
 *
 */
public class LoginHelper {

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public boolean isGreater(int num1, int num2){
		
		
		System.out.println(num2);
		System.out.println(num1+num2);
		// number of lines
        return num1 > num2;
    }

	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	private void testEnvironment(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println(num2);
		System.out.println(num1+num2);
		System.out.println(num2);
		System.out.println(num1+num2);
	}

	public List<CodeCoverage> xmlParseResult() throws FileNotFoundException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		  // reading two xml file to compare in Java program
        FileInputStream fis1 = new FileInputStream("D:/CareerProject/report/coverage.xml");
        FileInputStream fis2 = new FileInputStream("D:/CareerProject/incHRM/target/site/cobertura/coverage.xml");
     
        // using BufferedReader for improved performance
        BufferedReader  source = new BufferedReader(new InputStreamReader(fis1));
        BufferedReader  target = new BufferedReader(new InputStreamReader(fis2));
     
        //configuring XMLUnit to ignore white spaces
        XMLUnit.setIgnoreWhitespace(true);
     
        //comparing two XML using XMLUnit in Java
        List<Difference> differences = compareXML(source, target);
     
        //showing differences found in two xml files
        List<CodeCoverage> coverageReport = printDifferences(differences);
   
		return coverageReport;
	}



	private List compareXML(Reader source, Reader target) throws SAXException, IOException{

		//creating Diff instance to compare two XML files
		Diff xmlDiff = new Diff(source, target);

		//for getting detailed differences between two xml files
		DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);

		return detailXmlDiff.getAllDifferences();
	}

	
	private List<CodeCoverage> printDifferences(List<Difference> differences){
		List<CodeCoverage> arrayRst = new ArrayList<CodeCoverage>();
		int totalDifferences = differences.size();
		System.out.println("===============================");
		System.out.println("Total differences : " + totalDifferences);
		System.out.println("================================");
		
		for(Difference difference : differences){
			CodeCoverage codeCov = new CodeCoverage();
			codeCov.setType(difference.getControlNodeDetail().getXpathLocation());
			codeCov.setDefaultValue(difference.getControlNodeDetail().getValue());
			codeCov.setActualValue(difference.getTestNodeDetail().getValue());
			codeCov.setDescription(difference.toString());
			arrayRst.add(codeCov);
		System.out.println(difference);
		}
		return arrayRst;
	}
	
}
