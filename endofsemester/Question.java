/** 
 * The superclass for all questions.
 * @implNote Do not create an object of this class; all questions should be instances of subclasses.
*/
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

    /**
     * Subclasses of this method should print the question and receive the response.
     * Always override this method.
     * @param testNumber
     * @return True if the question was answered correctly, false otherwise
     */
    public Boolean askQuestion(int testNumber) {
        System.out.printf("%d Question: %s\n", testNumber, question);
        return null;
    }
}