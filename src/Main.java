import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Random rand = new Random();
        int diceValue = rand.nextInt(1, 7);
        int diceValue2 = rand.nextInt(6) + 1;*/
        System.out.println("Dice random value 1: " + generateDice());
        System.out.println("Dice random value 2: " + generateDice());
        System.out.println("The value of dice more dice2 is: " + (generateDice() + generateDice()));
        //-------------------
        int dice1 = generateDice();
        int dice2 = generateDice();
        // do {
        String confirm;
        int result = suma(dice1, dice2);
        if ((result) == 7) {
            System.out.println("You are the winner");
        } else {
            System.out.println("You are the loser");
            System.out.println("Do you want to throw the dice 2");
            Scanner scan = new Scanner(System.in);
            confirm = scan.nextLine();
            if (confirm.equals("Yes")) {
                dice2 = generateDice();
                result = suma(dice1, dice2);
                if (result == 7) {
                    System.out.println("You are the winner: " + result);
                } else {
                    System.out.println("You are the loser: " + result);
                }
            } else {
                System.out.println("exiting program...");
            }
        }
        /*}
        while(confirm);*/
    }

    private static int generateDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    private static int suma(int dice1, int dice2) {
        int result = dice2 + dice1;
        return result;
    }
}
