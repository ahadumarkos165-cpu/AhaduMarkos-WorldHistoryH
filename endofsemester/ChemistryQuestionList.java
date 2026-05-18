import java.util.Arrays;
import java.util.List;

public class ChemistryQuestionList extends QuestionList {

    public ChemistryQuestionList(List<Question> qList) {
        super(qList);
    }

    private static MultChoiceQuestion multQuestion1 = new MultChoiceQuestion (
        null,
        null,
        null,
        null,
        null
    );
    public static List<Question> rawCQList = Arrays.asList(multQuestion1);
}
