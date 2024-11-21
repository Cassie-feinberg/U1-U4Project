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
     public void compareWord(){
         for (int j = 0; j < 5; j++){
             for (int k = 0; k < 5; k++){
                 if (user.substring(j, j + 1).equals(correct.substring(j, j + 1))){
                     System.out.println(user.substring(j, j + 1) + "is correct");
                 }
                 else if (user.substring(j, j + 1).equals(correct.substring(k, k + 1))){
                     System.out.println(user.substring(j, j + 1) + "is in the word but not in the correct spot");
                 }
                 else{
                     System.out.println(user.substring(j, j + 1) + "is not in the word");
                 }
             }
         }
     }
}
