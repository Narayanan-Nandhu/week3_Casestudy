package com29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Solution {

	
	


	public static void main(String... args)
	{
		
		String filename="src/Inputfile_M.txt";
		List<Policy> list= read_file(filename);
		no_of_policies(list);
		
		
		try{
		if_exception_occurs(list);
		}
		catch(MyException M)
		{
			System.out.println(M);
		}
		
		
		
		
	} 
	public static void if_exception_occurs(List<Policy> dummylist) throws MyException
	{
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate n = LocalDate.now();
		
		for(Policy d:dummylist)
		{
			String dateString=d.getDate_of_expiry();
			LocalDate localDate = LocalDate.parse(dateString, dateTimeFormatter);
			
			if(localDate.compareTo(n)<0)
			{
	        
	            throw new MyException("The Policy "+d.getKey()+" is Expired") ;
			}
	        
			
		}
		
	}
	
	public static void no_of_policies(List<Policy> dummylist){

		
		List<String> k=new ArrayList<>();
		
		int Sum=0;
		
		
		String temp;
		for (Policy a: dummylist)
		{
			temp=a.getKey();
			temp=temp.replaceAll("\\d","");
			
			if(k.contains(temp)==false)
			{
				k.add(temp);
				
			}	//System.out.println(a.getKey()+" "+a.getCost_of_policy());
		}
		
		for(String a:k)
		{
			Sum=0;
			for(Policy b:dummylist)
			{			
				if(b.getKey().contains(a))
				{
					
					Sum=Sum+(Integer.parseInt(b.getCost_of_policy()));
				}
			}
			System.out.println(a+" "+Sum);	
		}
	}
	
	public static List<Policy> read_file(String f)
	{List<Policy> a =new ArrayList<>();
		try
		{
			
			
			BufferedReader br = new BufferedReader (new FileReader(f));
			
			String line;
			line=br.readLine();
			while(line!=null)
			{
				String[] attr = line.split(" ");
				Policy obj = new Policy(attr[0],attr[1],attr[2],attr[3],attr[4],attr[5]);
				a.add(obj);
				line=br.readLine();
				
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	
		return a;
	}
}
