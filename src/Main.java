import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Answer correct = new Answer();
        Scanner User = new Scanner(System.in);
        int tries = 0;
        boolean win = false;
        while (tries < 5 && !win) {
            tries += 1;
            System.out.println("Round: " + tries);
            System.out.println("5 letters: ");
            String user_word = User.nextLine();
            while (user_word.length() != 5) {
                System.out.println("Please guess 5 letters: ");
                user_word = User.nextLine();
            }
            Wordle round = new Wordle(user_word, correct.answer());
            if (round.correctGuess()){
                win = true;
            }
            else {
                round.compareWord();
            }
        }
        if (win){
            System.out.println("You guessed the word!");
            System.out.println("It took you " + tries + " tries");
        }
        else {
            System.out.println("You did not guess the word :( \nBetter luck next time");
            System.out.print("The correct answer is: ");
            correct.printAnswer();
        }
    }
}