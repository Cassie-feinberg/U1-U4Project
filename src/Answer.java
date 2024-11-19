import java.util.Random;

public class Answer {

    private String correct_answer = "";

    public Answer(){
        Random random = new Random();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            // Generate a random lowercase letter (between 'a' and 'z')
            char randomChar = (char) ('a' + random.nextInt(26));
            word.append(randomChar);
        }
        correct_answer = word.toString();
    }

    public void printAnswer(){
        System.out.println("The correct word is : " + correct_answer);
    }
}
