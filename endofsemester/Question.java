public class Question {
    String question;
    String answer;
    
    public Question(String Q) {
        this.question = Q;
    }

    public Question(String Q, String A) {
        this.question = Q;
        this.answer = A;
    }

    public String toString() {
        return question;
    }

    public Boolean askQuestion(int questionNumber) {
        System.out.printf("%d Question: %s\n", questionNumber, question);
        return false;
    }
}