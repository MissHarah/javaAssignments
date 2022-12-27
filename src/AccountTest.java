import chapterTwo.Account;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

       //create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

      //create an Account object and assign it to myAccount
      Account myAccount = new Account();

      //display initial value of name (null)
    System.out.printf("Initial name is:%s%n%n" , myAccount.getName());

     //prompt for and read name
   System.out.printf("my name is Neefah:");

   String isNeefah= input.nextLine();
     //read a line of text
  myAccount.setName(isNeefah);
    //  put isNeefah in myAccount

        System.out.println();
   //output a blank line

   // display the name stored in object myAccount
   System.out.printf("Name in Object myAccount is:%n%s%n", myAccount.getName());
    }
    }

