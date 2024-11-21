import java.util.Random;

public class Answer {

    private String correct_answer = "";

    public Answer(){
        Random random = new Random();
        String word = "";

        for (int i = 0; i < 5; i++) {
            // Generate a random lowercase letter (between 'a' and 'z')
            char randomChar = (char) ('a' + random.nextInt(26));
            word += randomChar;
        }
        correct_answer = word;
    }

    public void printAnswer(){
        System.out.println("The correct word is : " + correct_answer);
    }
}
