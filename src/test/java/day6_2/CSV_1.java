package day6_2;


import java.util.*;
import java.io.FileReader;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSV_1 {
  @Test
public void f() throws Exception{
	  CSVReader cs=new CSVReader(new FileReader("C:\\Users\\Shivani\\Desktop\\TSL -1\\apche\\data2.CSV"));
	  

	  List<String[]> ls = cs.readAll();
	  
	  for(int i = 0; i < ls.size();i++)
	  {
		  String[] row=ls.get(i);
		  System.out.print(row[0]+" "); 
		  System.out.println(row[1]);
		  
	  }
  }
}
