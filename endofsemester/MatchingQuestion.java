import java.util.List;

public class MatchingQuestion extends Question {
    String question;
    String question1;
    String question2;
    String question3;
    String question4;
    String wrong3;
    List<String> answerList;
    String answer;

    public MatchingQuestion(String Q, String As, String A) {
        super(Q, A);
        this.question = Q;
        this.answer = A;
    }

    public Boolean askQuestion(int testNumber) {
        System.out.println(question);
        String checkAnswer = System.console().readLine();
        if (checkAnswer.equalsIgnoreCase(answer)
        ||  checkAnswer.equalsIgnoreCase(Character.toString(answer.charAt(0)))) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect.");
            return false;
        }
    }
}
