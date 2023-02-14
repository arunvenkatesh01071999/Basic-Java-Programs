package enumarationss;

import java.util.Scanner;

public class ContryDemo
   {

  public static void main(String[] args)
	{
	  Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter Symbol($,U,S ) or country name (india ,usa europe)");

	    String user = myObj.next();
	    myObj.close();
		Country[] myCountry = Country.values();
		
		for(Country values : myCountry)
		{
			if(user.equalsIgnoreCase(values.contry))
			{
				System.out.println(values.symbol);
			}
			else if(user.equalsIgnoreCase(values.symbol))
			{
				System.out.println(values.contry);
			}
			else if(user.equalsIgnoreCase(values.price))
			{
				System.out.println(values.contry);
			}
			
		}
			
		}
	}


