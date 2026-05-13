public class TrueFalseQuestion extends Question {
    String question;
    String answer;
    Boolean boolAnswer;

    public TrueFalseQuestion(String Q, String A) {
        super(Q,A);
        this.question = Q;
        this.answer = A;
        this.boolAnswer = this.toBoolean();
    }

    public TrueFalseQuestion(String Q, Boolean B) {
        super(Q, B.toString());
        this.question = Q;
        this.answer = B.toString();
        this.boolAnswer = B;
    }

    public Boolean toBoolean() {
        return Boolean.parseBoolean(this.answer);
    }

    public Boolean askQuestion(int testNumber) { 
        // testNumber is the number that the question appears as when program runs
        // questionNumber (in QuestionList) is the number that the question is stored in
        
        System.out.printf("Question %d: %s (T/F)\n", testNumber, question);
        String checkAnswer = System.console().readLine(); // answer given by user
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
