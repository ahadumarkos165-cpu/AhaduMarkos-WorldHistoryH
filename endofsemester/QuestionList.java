// list of all questions and their answers
public class QuestionList {

    public QuestionList() {

    }
    public Question getQuestion() {
        return question1;
    }
    public Question question1 = new multChoiceQuestion(
        "Which factor helped cause World War II in Europe?",
        "C. The rise of Fascism in Europe",
        
        "A. The spread of democracy",
        "B. Militarism and alliance system",
        "D. The League of Nations"
    );
    
}