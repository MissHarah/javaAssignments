package ChapterFive;

import java.util.Scanner;

public class SamsungMobile {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("""
                Welcome!!!
                1->Message Calls
                2->Call Register
                3->Settings
                """);
    }
    public void userPreference(){

        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                messageCalls();
                break;
            case 2:
                CallRegister();
                break;
            case 3:
                Settings();
                break;
            default:
                System.out.println("invalid");
                break;

        }

            }
    public void messageCalls(){
        System.out.println("""
                -Inbox
                -Create Message
                -Draft
                """);
    }
    public void CallRegister(){
        System.out.println("""
                -missed Calls
                -Received Calls
                -Dialled Calls
                """);
    }
    public void Settings() {
        System.out.println("""
                -phone Settings
                -call Settings
                -Message Settings
                """);

    }

                //action


    public void NextOption(){
        String userPreference;
        do {
            System.out.println("Do you wish to continue yes/No");
            userPreference = scanner.next();
            if (userPreference.equalsIgnoreCase("yes")) {
                displayMenu();
                userPreference();
            }
        } while (userPreference.equalsIgnoreCase("yes"));

            System.out.println("Good bye!!!");
            }
    }
















