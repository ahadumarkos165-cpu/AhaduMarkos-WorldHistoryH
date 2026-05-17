import java.util.Arrays;
import java.util.List;

/**
 * A list of all questions and their answers.
 * 
 * @author Ahadu Markos
*/

public class QuestionList {
    
    public static Question getQuestion(int questionNumber) {
        return questionList.get(questionNumber);
    }

    // Multiple Choice - UNIT 5: WARFARE
    public static MultChoiceQuestion multQuestion1 = new MultChoiceQuestion (
        "Where does the term 'fascism' come from?",
        "C. The fasces, a bundle of rods with an axe. Italian fascists took it as their symbol since one rod would break easily, but many rods together were very difficult to break.",

        "A. Named for the founder of the Nazi Party, Otto Fascis, who was assassinated by SS troops on the orders of Adolf Hitler during the Night of the Long Knives.",
        "B. Mussolini named his National Fascist Party after a Roman senator, Marcus Honorius Fascus. Early fascists like Mussolini considered Fascus to be a role model for what fascism should look like.",
        "D. The river Fasces (phas-kes), which runs through the original Fascist Party headquarters in Rome."
    );

    public static MultChoiceQuestion multQuestion2 = new MultChoiceQuestion (
        "Who was the dictator that introduced fascism to Europe?",
        "B. Benito Mussolini",

        "A. Francisco Franco",
        "C. Adolf Hitler",
        "D. Joseph Stalin"
    );

    public static MultChoiceQuestion multQuestion3 = new MultChoiceQuestion (
        "How did Hitler take power?",
        "D. Following the Reichstag Fire, the Nazis passed the Reichstag Fire Decree, which suspended civil liberties, and the Enabling Act, which gave Hitler's government the ability to make laws without the approval of Parliament.",

        "A. In 1923, the Nazi's paramilitary wing, the Sturmabteilung (meaning 'Storm Division') overthrew the government in Munich, taking control of the entire country seven months later. This event would be known as the Beer Hall Putsch.",
        "B. Hitler made a deal with KPD leaders, who thought that they could control him.",
        "C. They formed a political alliance with the Social Democrats to counter the rising threat of communism."
    );

    public static MultChoiceQuestion multQuestion4 = new MultChoiceQuestion (
        "What were the Nuremberg Laws?",
        "B. Antisemitic and racist laws used to segregate Jews and other 'non-Aryans' from German society.",

        "A. Laws that gave Hitler absolute power over Germany by abolishing checks on his power.",
        "C. Laws that banned all political parties except the Nazi Party.",
        "D. Short title for 'Laws to Remedy the Distress of People and Reich'."
    );

    public static MultChoiceQuestion multQuestion5 = new MultChoiceQuestion (
        "How did Nazi propaganda depict German Jews?",
        "A. Nazi propaganda cast Jews as hidden masterminds controlling capitalist and communist states, a plague on German society, and enemies of the army and State.",
        
        "B. Jews were described as enemies of Communism, and a threat to the KPD.",
        "C. They were depicted as a superior race, and as such needed to be eliminated to preserve 'Aryan' culture.",
        "D. The Nazis warned that the Jews controlled the German government through the NSDAP and needed to be contained to prevent their spread."
    );

    public static TrueFalseQuestion trueFalseQuestion1 = new TrueFalseQuestion (
        "Technology and navigation techniques introduced by Muslim trade made it possible for European explorers to travel far from Europe and return.",
        true
    );

    public static TrueFalseQuestion trueFalseQuestion2 = new TrueFalseQuestion (
        "European monarchs ruled over their colonies directly.",
        false
    );
    
    public static TrueFalseQuestion trueFalseQuestion3 = new TrueFalseQuestion (
        "Warfare was the most significant factor in the collapse of Indigenous civilizations.",
        false
    );

    public static TrueFalseQuestion trueFalseQuestion4 = new TrueFalseQuestion (
        "Slavery in the New World was similar to Old World slavery in scale and human cost.",
        false
    );

    public static TrueFalseQuestion trueFalseQuestion5 = new TrueFalseQuestion (
        "The effects of New World slavery are not felt today, as its consequences were mostly mitigated by the 20th century.",
        false
    );

    public static MatchingQuestion matchingQuestion = new MatchingQuestion (
        null,
        null,
        null);

    static List <Question> questionList = Arrays.asList(
        multQuestion1, multQuestion2, multQuestion3, multQuestion4, multQuestion5,
        trueFalseQuestion1, trueFalseQuestion2, trueFalseQuestion3, trueFalseQuestion4, trueFalseQuestion5
    );
}