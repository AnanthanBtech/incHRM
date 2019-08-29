package com.inc.user.helper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReadHtmlTableData {
   public static void main(String[] args) throws IOException {
	   List<String[]> master = extractHtmlTableData("D:/CareerProject/report/target/site/jacoco/index.html");
	   List<String[]> slave = extractHtmlTableData("D:/CareerProject/report/target/site/jacoco/index.html");
	   List<String[]> finalData = compareAndFinalData(master, slave);
	   writeHtmlFile(finalData);
   }


   public static List<String[]> extractHtmlTableData(String file) {
	   
	   File input = new File(file);
	   List<String[]> content = new ArrayList<>();
      try {
    	  Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
         Elements tableElements = doc.select("table");

         Elements tableHeaderEles = tableElements.select("thead tr th");
         System.out.println("headers");
         for (int i = 0; i < tableHeaderEles.size(); i++) {
            System.out.println(tableHeaderEles.get(i).text());
         }
         System.out.println();

         Elements tableRowElements = tableElements.select(":not(thead) tr");

         for (int i = 0; i < tableRowElements.size(); i++) {
            Element row = tableRowElements.get(i);
            System.out.println("row");
            Elements rowItems = row.select("td");
            String s[] = new String [rowItems.size()];
            for (int j = 0; j < rowItems.size(); j++) {
            	s[j] =rowItems.get(j).text();
               System.out.println(rowItems.get(j).text());
            }
            content.add(s);
            System.out.println();
         }
         
         for(String s[] : content) {
 			for(String ss : s) {
 				System.out.println(ss);
 				System.out.println("\t");
 			}
 			System.out.println("\n");
 		}

      } catch (Exception e) {
         e.printStackTrace();
      }
      return content;  
   }
   
   private static List<String[]> compareAndFinalData(List<String[]> master, List<String[]> slave) {
		// TODO Auto-generated method stub
		return master;
	}
   
   private static void writeHtmlFile(List<String[]> finalData) throws IOException {
		// TODO Auto-generated method stub
	   PrintWriter pw = new PrintWriter(new FileWriter("D:/test.html"));
       pw.println("<TABLE BORDER><TR><TH>Number<TH>Square of Number</TR>");
       for (int i = 1; i <= 20; i++) {
              int square = i * i;
              pw.println("<TR><TD>" + i + "<TD>" + square);
       }
       pw.println("</TABLE>");
       pw.close();	
	}
}