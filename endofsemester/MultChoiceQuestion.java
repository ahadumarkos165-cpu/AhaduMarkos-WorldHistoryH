import java.util.Arrays;
import java.util.List;

public class MultChoiceQuestion extends Question {
    String question;
    String answer;
    String wrong1;
    String wrong2;
    String wrong3;
    List <String> answerList;

    public MultChoiceQuestion(String Q, String A, String W1, String W2, String W3) {
        super(Q, A);
        this.question = Q;
        this.answer = A;

        this.wrong1 = W1;
        this.wrong2 = W2;
        this.wrong3 = W3;
        this.answerList = Arrays.asList(answer, wrong1, wrong2, wrong3);
    }

    public Boolean askQuestion(int testNumber) { 
        // testNumber is the number that the question appears as when program runs
        // questionNumber (in QuestionList) is the number that the question is stored in
        
        System.out.printf("Question %d: %s\n", testNumber, question);
        List<String> sortedList = answerList.stream().sorted().toList();
        sortedList.forEach(System.out::println); // sorts list, since constructor puts correct answer first

        String checkAnswer = System.console().readLine(); // answer given by user
        if (checkAnswer.equalsIgnoreCase(Character.toString(answer.charAt(0)))) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect. The correct answer was: " + answer);
            return false;
        }
    }
}