
/*
** A starter file for implementing CSYE 6200 Assignment 1
** Filename: Teller_Keypad.java
** Name: Deepak Suryakant Padhi 
** NEU ID: 001822204
*/

import java.util.Scanner;

public class Teller_Keypad {
	public static void main(String args[]) throws java.io.IOException{
		Scanner var = new Scanner (System.in);
		String[] temp=new String[3];
		int n;
		
		double Balance = 15000, withdraw;
		int twenty,tenth,five;
		int twenty_rem,tenth_rem;
		//String string1="",string2="",str1="",str2="",update_str="";
		
		while (true) {
			System.out.println("\nWelcome to Teller Machine \nSelect a operation to perform: ");
			System.out.println("1. To check Balance ");
			System.out.println("2. To withdraw ");
			System.out.println("3. To check history ");
			System.out.println("4. Quit ");
			n=var.nextInt();
			
			switch(n) {
			
			case 1: 
				temp[2]=temp[1]; //array is created to store the lastest value 
				temp[1]=temp[0];
				temp[0]="Balance was checked";
				//string1 = ("Balance was checked\n");
				System.out.println("\nBalance is " + Balance +"\n"); // To display Balance
				break;
			
			case 2:
				temp[2]=temp[1];
				temp[1]=temp[0];
				temp[0]= "The amount was withdrawn";
				
				//string2 = ("withdraw process\n");
				//str1 = string2.concat(string1);
				
				System.out.println("\nEnter the amount to withdraw in denomination of $20/ $10/ $5"); // To Display the form of currency available
				
				withdraw=var.nextDouble(); //To get withdrawal amount from user
				
				if(withdraw %5 !=0 || withdraw == 0) { // To Check the correct amount
					System.out.println("\nWrong value. Denomination available is $20, $15 and $5\n");
				}
				
				else if (withdraw<=Balance) // Withdraw amount is less than Balance
				 {
					twenty = (int) (withdraw / 20);
					twenty_rem = (int) (withdraw % 20);
					tenth = (int) (twenty_rem / 10);
					tenth_rem = (int) (twenty_rem % 10);
					five = (int) (tenth_rem / 5);
					
					System.out.println("\nTwenty = "+twenty+"*20\n"+"Tenth = "+tenth+"*10\n"+"Five = "+five+"*5\n");
					Balance=Balance-withdraw;
				}
				
				else System.out.println("\nInsufficient Balance\n"); // Withdraw amount is greater than Balance
				break;
			
			/*TRIED WITH STRING CONCATENATION
			 * case 3:
				str2=("Running history command\n"); //to concatenate the previous commands
				if(str1=="") {
				update_str=str2.concat(string1);
				}
				else {
				update_str=str2.concat(str1);
				}
				System.out.println("\nCommands previously executed are: \n"+update_str);
				break;
				*/
				
			case 3:
				System.out.println("Commands previously executed are: \n");
				System.out.println("1."+temp[0]+"\n2."+temp[1]+"\n3."+temp[2]);
				break;

			case 4:
				System.out.println("\nThanks for using the Machine. Have a Great Day!!");
				break;

			default:
				System.out.println("\nWrong operation selected. Please try again\n");

				
			}
			if(n==4) break;
		}
		
	}

}