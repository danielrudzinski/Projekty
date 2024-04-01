
import java.util.Random;
import java.util.Scanner;
public class guessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int result=0;
        int attempts=0;



        System.out.println("Hello, guess the number!");
        while (true) {

            if(!scanner.hasNextInt()){
                System.out.println("You have to write a number!");
                break;
            }
            int x = scanner.nextInt();
            if(attempts>10){
                System.out.println("YOU LOST, YOU HAVE TO MANY ATTEMPTS");
                System.out.println("The number was"+" "+randomNumber);
                break;
            }


            if (x < randomNumber) {
                System.out.println("Guess the number again, your number is too small");}
                if (x > randomNumber) {
                    System.out.println("Your number is too big, Guess it again!");
                }
                if (x == randomNumber) {
                    System.out.println("Congratulations you guess the number!");
                    System.out.println("You win with "+ " "+ result + " " +"attempts");
                    break;

                }

             result=result+1;
                attempts=attempts+1;
            }
        }
    }
