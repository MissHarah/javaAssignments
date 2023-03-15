//import jdk.jfr.EventSettings;

import java.util.Scanner;

public class Nokia {
    static Scanner scanner = new Scanner(System.in);
    public String userchoice;
       public static String displayMenu() {

return """
                                        
                        Welcome!!!
                        Enter 1 -> for phonebook
                        2 -> for messages
                        3-> for calls register
                        4-> for settings
                        5->Games
                        6->Extras
                        7->Clock
                        8->SimService
                        9->Profile
                         
                                                
                        """;

//create a method call it decide user

           }
public static void decideUserinput(){

               int userInput = scanner.nextInt();
           switch (userInput) {
                   case 1:
                   displayPhoneBook();
                   break;
                   case 2:
                   messageMenu();
                   break;
                   case 3:
                   callRegisterMenu();
                   break;
                   case 4:
                       settings();
                   break;
                   case 5:
                        Games();
                     break;
                    case 6:
                        Extra();
                     break;
                    case 7:
                        Clock();
                     break;
                    case 8:
                       SimService();
                       break;
                       case 9:
                       Profile();
                       break;
                     default:
                   System.out.println("invalid input");
                   break;
           }
}



    public void yesOrNoToContinue(){
        String userChoice;
        do {
            System.out.println("Do you wish to continue? yes/no");
            userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("yes")) System.out.println(Nokia.displayMenu());
            decideUserinput();
        } while (userChoice.equalsIgnoreCase("yes"));
        System.out.println("Exit!");
    }


    public static void Contact(){
        System.out.println("create contact");
        String name = scanner.next();
        System.out.println("save contact");

    }
    public static void createMessage(){
        scanner.nextLine();
        System.out.println("write message");
       String msg= scanner.next();
        System.out.println("message sent");
    }
    public static void displayPhoneBook() {
        System.out.println("""
                1->search
                2->AddName
                3->Edit
                4->speedDilled
                5->voice Tags
                6->service Nos.
                7->Contact
                8->Erase
                9->assign tone
                10->Send b card
                11->Option
                    1->Type of view
                    2->memory Status
                """);

    }

    public static void messageMenu() {
        System.out.println("""
                1->Create message
                2->Inbox
                3->Outbox
                4->Picture messages
                5->Templates
                6->Smileys
                7->Message settings
                   1.Set 1
                     1->Message centre number
                     2->Message sent as
                     3->Message validity
                2.Common
                  1.Delivery reports
                  2.Reply via Same centre
                  3.Character Support
                8->info Service
                9->voice Mailbox Number
                10->Service command Editor
                                
                """);
    }

    public static void callRegisterMenu() {
        System.out.println("""
                1->Dialed calls
                2->Missed calls
                3->Received
                4->Erase recent call lists
                5->Show call duration
                  1.Last call duration
                  2.All call's duration
                  3.Received call's duration
                  4.dialled call's duration 
                  5.Clear timers
                6->Show call cost
                   1.last call
                   2.All call's cost
                   3.clear counters
                7->Call cost settings
                   1.call cost limit
                   2.Shows costs in
                8->Prepaid credit
                """);
    }

    public static void settings() {
        System.out.println("""
                1->call settings
                  1.Automatic redialed
                  2.Speed dialling
                  3.call waiting option
                  4.Own number setting
                  5.Phone line in use
                  6.Automatic answer
                2->Phone settings
                  1.Language
                  2.Cell info display
                  3.Welcome note
                  4.Network selection
                  5.Lights
                  6.Confirm SIM service actions
                3->Security settings
                  1.PIN code request
                  2.Call barring service
                  3.Fixed dialling
                  4.closed user group
                  5.Phone security
                  6.Change access codes
                4->Game Settings
                """);

//                int userSettings = scanner.nextInt();
//                switch (userSettings){
//                    case 4:
//                        System.out.println("""
//                                Type a nameToSearch:
//                                or type 'back' to return to the previous menu
//                                """);
//        String nameToSearch = scanner.nextLine();
                        String back = scanner.nextLine();
    }

//            }


    public static void Games() {
        System.out.println("""
                1->soccer
                2->snakes eat
                3->lanes
                """);
    }

    public static void Extra() {
        System.out.println("""
                 1->calculator
                 2->torchlight
                 3->calender
                 4->
                """);
    }

    public static void Clock() {
        System.out.println("""
                1->Alarm clock
                2->timer
                3->set time
                4->world clock
                """);
    }
    public static void SimService() {
        System.out.println("""
                1->sim1
                2->sim2
                3->switch sim
                """);
    }

    public static void Profile(){
        System.out.println("""
                1->General profile
                2->contact profile
                """);

    }
}



