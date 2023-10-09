import java.util.Scanner;

public class Task3
{
      public static void main(String args[])
      {
            int balance=100000,withdraw,deposit; // initialize balance,withdraw, and deposit
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your 4 digit ATM card pin: ");
            int p = sc.nextInt();
            if (p == 2101)
            {
                  while(true)
                  {
                        System.out.println("Welcome to ABC Bank!!");
                        System.out.println("Press 1 for Withdraw");
                        System.out.println("Press 2 for Deposit");
                        System.out.println("Press 3 for Check Balance");
                        System.out.println("Press 4 for EXIT ");
                        System.out.print("Choose the operation you want to perform:");

                        //get choice from user
                        int choice = sc.nextInt();
                        switch(choice)
                        {
                              case 1:
                              System.out.print("Enter money to be Withdrawn:");
                              withdraw = sc.nextInt();   // withdrawl money from the user

                              if(balance>=withdraw)
                              {
                                    balance=balance-withdraw;  //remove the withdrwal amount from total bank balance
                                    System.out.println("Your Transaction is Completed!!");
                                    System.out.println("Please Collect your Money!!");
                              }
                              else 
                              {
                                    System.out.println("You have Insufficient Funds!"); //Error message
                              }
                              System.out.println(" ");
                              break;

                              case 2:
                              System.out.println("Enter money to be deposited:");
                              deposit=sc.nextInt();  //get deposit amount from the user
                              balance=balance+deposit;   //add the deposit amount to the total balance    
                              System.out.println("Your money has been successfully deposited!");
                              System.out.println("");
                              break;

                              case 3:
                              System.out.println("Balance:"+balance);    //total balance
                              System.out.println(" ");
                              break;

                              case 4:
                              System.exit(0);   //exit from the menu
                        }
                  }
            }
      }
}