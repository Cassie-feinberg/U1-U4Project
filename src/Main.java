import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Answer correct_word = new Answer();
        Scanner User = new Scanner(System.in);
        System.out.println("Guess a 5 letter word: ");
        String user_word = User.nextLine();
        while (user_word.length() != 5){
            System.out.println("Please guess a 5 letter word: ");
            user_word = User.nextLine();
        }
        Wordle round1 = new Wordle(user_word, correct_word.toString());
    }
}