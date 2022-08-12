import java.util.Scanner;

public class SecretNum {
    public static void main(String[] args) {

//        Create a simple number guessing game, that takes in some user input matches it to a 'secret' number.
//        -- it returns a string, so find out how to convert.
//                The program should indicate if an incorrect guess is too high or too low. It should, of course,
//                let the user know if they have guessed the number correctly.

        int secretNum = 6;
        System.out.println("guess the secret number!");
        Scanner reader = new Scanner(System.in);
        int guessNum = reader.nextInt();
//        alternatively:
//        String guess = reader.nextLine();
//        int guessNum = Integer.parseInt(guess);

        if (guessNum==secretNum){
            System.out.println("correct!");
        }
        else if (guessNum<secretNum) {
            System.out.println("your guess is too low");
        }
        else {
            System.out.println("your guess is too high");
        }
    }
}