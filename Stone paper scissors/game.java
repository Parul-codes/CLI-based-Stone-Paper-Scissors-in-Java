import java.util.*;

public class game {
    public static int botChoice() {
        int bot[] = {1,2,3};
        Random r = new Random();
        int randomIndex = r.nextInt(bot.length);
        int randomNumber = bot[randomIndex];
        return randomNumber;
    }
    public static void main(String[] args) {
        int Choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choose 1 for Rock");
            System.out.println("Choose 2 for Scissors");
            System.out.println("Choose 3 for Paper");
            System.out.println("Choose 4 for exiting the game");
            System.out.print("Enter your choice : ");
            Choice = sc.nextInt();
            botChoice();
            //userChoice();
            if(Choice == botChoice()) {
                System.out.println("Game Draw.");
            } else if(Choice == 1 && botChoice() == 2) {
                System.out.println("Yayyy. Your Rock beat the bot's Scissors");
            } else if(Choice == 1 && botChoice() == 3) {
                System.out.println("Sheesh. Bot's Paper beat your Rock");
            } else if(Choice == 2 && botChoice() == 1) {
                System.out.println("Sheesh. Bot's Rock beat your Scissors");
            } else if(Choice == 2 && botChoice() == 3) {
                System.out.println("Yayyy. Your Scissors beat the bot's Paper");
            } else if(Choice == 3 && botChoice() == 1) {
                System.out.println("Yayyy. Your Paper beat the bot's Rock");
            } else if(Choice == 3 && botChoice() == 2) {
                System.out.println("Sheesh. Bot's Scissors beat your Paper");
            } else {
                System.out.println("Exiting the game....");
            }
        } while(Choice != 4);
        sc.close();
    }
}