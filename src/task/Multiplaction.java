package task;

import java.util.Scanner;

public class Multiplaction {

	public static void main(String[] args) {
		int myTable;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the table you want ");
		myTable=myScanner.nextInt();
		myScanner.close();
		for(int i=1;i<=10;i++)
		{
			
			System.out.printf("%d *%d = %d",myTable,i,myTable*i).println();
		}
	}

}
