public class Wordle {
     private String user;
     private String correct;

     public Wordle(String userWord, String correctWord){
         user = userWord;
         correct = correctWord;
     }

     public boolean correctGuess(){
         if (user.equals(correct)){
             return true;
         }
         else {
             return false;
         }
     }
}
