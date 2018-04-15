/* Assignment 1  CSYE6200 33701 Concepts of Object Oriented Design Sec-01 Automated Teller Machine
  Name: Vrushali Muralidhar Patil
   NUID: 001200648             */



import java.util.Scanner;
public class ATM_Transaction 
{
    public static void main(String args[] )
    { 
    	 int balance = 10000;    //Balance is initialized
    	 String a[][]=new String [10][2];   //2D array defined
    	 int c=3, p;   //Counter is initialized
        Scanner s = new Scanner(System.in);  //input is taken from user
        while(true)
        {              //Menu of the ATM Teller Machine
            System.out.println("Hello! Welcome to Bank of India.");
            System.out.println("Choose 1 for Check Account Balance");
            System.out.println("Choose 2 for Withdraw Cash");
            System.out.println("Choose 3 for Transaction history");
            System.out.println("Choose 4 for Quit");
            System.out.print("Choose the operation which you want to perform:");
            int n = s.nextInt();    //users choice is taken
           
            switch(n)
            
            {               //Current balance is displayed when option 1 is selected
            
                case 1:
                System.out.println("Current balance is : "+balance);
                a[c][0]="Balance";             //Array is updated with the balance
                a[c][1]=Integer.toString(balance);
                c++;
                System.out.println("");
                break;
            
                case 2:          //to withdraw money
                System.out.print("Enter money to be withdrawn:");
                
                n = s.nextInt();
                if(n%5  != 0)          //withdraw cash in denominations of 5,10 and 20 only
                {
                	System.out.println("Please enter in denominations of 5,10 and 20 dollars. ");
                	
                }
                else if (balance >= n)
                	
                
                {
                    balance = balance - n;               //Array is updated with the cash withdrawn
                    a[c][0]="Withdraw";
                    a[c][1]=Integer.toString(n);
                    c++;
                    System.out.println("Please collect your money");
                    int d=n/20;         
                	System.out.println("number of 20 rupees notes: "+d);
                	n=n%20;
                	int f=n/10;
                	System.out.println("number of 10 rupees notes: "+f);
                	n=n%10;
                	int g=n/5;
                	System.out.println("number of 5 rupees notes: "+g);
                	n=n%5;
                  
                }
                else
                {
                    System.out.println("Insufficient Balance");     //displays insufficient balance if wrong amount to be withdrawn is entered
                   
                }
               
                
                
                System.out.println("");
                break;
           
                case 3:
                	System.out.println("Last three commands are as follows:");
                	p=c-3;    //variable declared to record recent 3 transactions
                	
                	for(int i=c-1;i>=p;i--) {    //loop to record recent 3 transactions starting from the most recent one
                		for(int j=0;j<=1;j++) {
                		System.out.print(a[i][j]+" ");
                		
                	}
                		System.out.println("\n");
                	}
                	break;
                case 4: System.out.println("Thank you! Have a great day.");
                	System.exit(0);
                default: System.out.println("Invalid input");      //session ends if option 4 i.e exit option is selected
               // System.exit(0);
            }
        }
        
    }
}

	
	

