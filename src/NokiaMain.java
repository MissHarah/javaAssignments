import java.security.SecureRandom;
import java.util.Scanner;

public class NokiaMain {
    public static void main(String[] args) {
        Nokia nokia3310 = new Nokia();
        System.out.println(Nokia.displayMenu());
       Nokia.decideUserinput();
        nokia3310.yesOrNoToContinue();



        StringBuilder generatedTicketNumber = new StringBuilder ("flightNumber");
        SecureRandom random = new SecureRandom();
        for(int i =0; i <9; i++){
            generatedTicketNumber.append(random.nextInt(9));
        }
        System.out.println(generatedTicketNumber);
    }
}