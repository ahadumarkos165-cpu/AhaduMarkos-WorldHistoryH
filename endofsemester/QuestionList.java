import java.util.Arrays;
import java.util.List;

/**
 * A list of all questions and their answers.
 * 
 * @author Ahadu Markos
*/

public class QuestionList {
    List <Question> questionList;

    public QuestionList(List<Question> qList) {
        this.questionList = qList;
    }

    public Question getQuestion(int questionNumber) {
        return questionList.get(questionNumber);
    }

    public Integer size() {
        return questionList.size();
    }
}