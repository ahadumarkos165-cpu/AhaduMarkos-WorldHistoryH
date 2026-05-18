import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HistoryQuestionList extends QuestionList {
    
    public HistoryQuestionList(List<Question> qList) {
        super(qList);
    }

    private static MultChoiceQuestion multQuestion1 = new MultChoiceQuestion (
        "Where does the term 'fascism' come from?",
        "C. The fasces, a bundle of rods with an axe. Italian fascists took it as their symbol since one rod would break easily, but many rods together were very difficult to break.",

        "A. Named for the founder of the Nazi Party, Otto Fascis, who was assassinated by SS troops on the orders of Adolf Hitler during the Night of the Long Knives.",
        "B. Mussolini named his National Fascist Party after a Roman senator, Marcus Honorius Fascus. Early fascists like Mussolini considered Fascus to be a role model for what fascism should look like.",
        "D. The river Fasces (phas-kes), which runs through the original Fascist Party headquarters in Rome."
    );

    private static MultChoiceQuestion multQuestion2 = new MultChoiceQuestion (
        "Who was the dictator that introduced fascism to Europe?",
        "B. Benito Mussolini",

        "A. Francisco Franco",
        "C. Adolf Hitler",
        "D. Joseph Stalin"
    );

    private static MultChoiceQuestion multQuestion3 = new MultChoiceQuestion (
        "How did Hitler take power?",
        "D. Following the Reichstag Fire, the Nazis passed the Reichstag Fire Decree, which suspended civil liberties, and the Enabling Act, which gave Hitler's government the ability to make laws without the approval of Parliament.",

        "A. In 1923, the Nazi's paramilitary wing, the Sturmabteilung (meaning 'Storm Division') overthrew the government in Munich, taking control of the entire country seven months later. This event would be known as the Beer Hall Putsch.",
        "B. Hitler made a deal with KPD leaders, who thought that they could control him.",
        "C. They formed a political alliance with the Social Democrats to counter the rising threat of communism."
    );

    private static MultChoiceQuestion multQuestion4 = new MultChoiceQuestion (
        "What were the Nuremberg Laws?",
        "B. Antisemitic and racist laws used to segregate Jews and other 'non-Aryans' from German society.",

        "A. Laws that gave Hitler absolute power over Germany by abolishing checks on his power.",
        "C. Laws that banned all political parties except the Nazi Party.",
        "D. Short title for 'Laws to Remedy the Distress of People and Reich'."
    );

    private static MultChoiceQuestion multQuestion5 = new MultChoiceQuestion (
        "How did Nazi propaganda depict German Jews?",
        "A. Nazi propaganda cast Jews as hidden masterminds controlling capitalist and communist states, a plague on German society, and enemies of the army and State.",
        
        "B. Jews were described as enemies of Communism, and a threat to the KPD.",
        "C. They were depicted as a superior race, and as such needed to be eliminated to preserve 'Aryan' culture.",
        "D. The Nazis warned that the Jews controlled the German government through the NSDAP and needed to be contained to prevent their spread."
    );

    private static TrueFalseQuestion trueFalseQuestion1 = new TrueFalseQuestion (
        "Technology and navigation techniques introduced by Muslim trade made it possible for European explorers to travel far from Europe and return.",
        true
    );

    private static TrueFalseQuestion trueFalseQuestion2 = new TrueFalseQuestion (
        "European monarchs ruled over their colonies directly.",
        false
    );
    
    private static TrueFalseQuestion trueFalseQuestion3 = new TrueFalseQuestion (
        "Warfare was the most significant factor in the collapse of Indigenous civilizations.",
        false
    );

    private static TrueFalseQuestion trueFalseQuestion4 = new TrueFalseQuestion (
        "Slavery in the New World was similar to Old World slavery in scale and human cost.",
        false
    );

    private static TrueFalseQuestion trueFalseQuestion5 = new TrueFalseQuestion (
        "The effects of New World slavery are not felt today, as its consequences were mostly mitigated by the 20th century.",
        false
    );

    private static MatchingQuestion matchingQuestion = new MatchingQuestion (
        null,
        null,
        null
    );
    

    /** 
     * Lukas did god, gold, glory better, sorry Sharon
     * @author Sharon Cho
     */
    private static MultChoiceQuestion multSharon1 = new MultChoiceQuestion (
        "What are the three G's of exploration?",
        "C. Gold, God, Glory",
        "A. Gardens, Gum, Gyms",
        "B. Guns, Gunpowder, Gnomes",
        "D. Glizzy, Goblin, Goulache"
    );
    private static MultChoiceQuestion multSharon2 = new MultChoiceQuestion (
        "Which statement best explains why the Taíno were significant at the time of European contact?",
        "A. They were the first Indigenous people Columbus encountered and had established agricultural societies.",
        "B. They were tourists.",
        "C. They had the money to trade with Europeans.",
        "D. They had resources that were considered valuable."
    );

    private static MultChoiceQuestion multSharon3 = new MultChoiceQuestion (
        "Which statement best describes the Columbian Exchange?",
        "B. A two-way exchange of plants, animals, people, diseases, and ideas between the Americas and Afro-Eurasia",
        "A. Colombia exchanged with other countries",
        "C. The exchange of Columbians",
        "The exchange of animals and foods between a city"
    );

    private static MultChoiceQuestion multSharon4 = new MultChoiceQuestion (
        "Which statement best explains a major difference between Old World slavery and New World slavery?",
        "A. Old World slavery was usually limited and not race-based, while New World slavery was racialized, lifelong, and central to plantation economies.",
        "B. Slavery did not exist, so there is no Old or New World Slavery",
        "C. Old World slavery was racialized, lifelong, and central to plantation economies, while New World slavery was usually limited and not race‑based",
        "D. Both Old and New World slavery had no differences from each other."
    );

    private static MultChoiceQuestion multSharon5 = new MultChoiceQuestion (
        "Which statement best describes the working conditions of enslaved people on plantations in the Americas?",
        "D. Enslaved people typically worked long days in the fields, often 10–16 hours, and were organized into gangs supervised by overseers.",
        "A. Enslaved people worked in fields, often 4-5 hours, and had no supervision",
        "B. They had flexible hours, barely worked, and and many sick days off",
        "C. They were good"
    );

    private static TrueFalseQuestion trueFalseSharon1 = new TrueFalseQuestion (
        "The Atlantic Revolution were all impacted by Enlightenment ideas about liberty, equality, and natural rights.", 
        true
    );

    private static TrueFalseQuestion trueFalseSharon2 = new TrueFalseQuestion (
        "'Natural rights' during the Enlightenment referred to government‑granted privileges that could be taken away at any time.",
        false
    );

    private static TrueFalseQuestion trueFalseSharon3 = new TrueFalseQuestion (
        "Toussaint Louverture was a formerly enslaved man who became the leading military and political figure of the Haitian Revolution.",
        true
    );

    private static TrueFalseQuestion trueFalseSharon4 = new TrueFalseQuestion (
        "Nationalism has been one of the most influential forces shaping global politics and borders over the past two centuries.",
        true
    );

    private static TrueFalseQuestion trueFalseSharon5 = new TrueFalseQuestion (
        "As machines replaced manual labor, cities grew because people moved to urban areas for factory jobs.",
        true
    );
    


    private static MultChoiceQuestion multLukas1 = new MultChoiceQuestion (
        "What are 3 reasons why Europeans begin 'exploring' other lands outside Europe?",
        "C. God, Glory, Gold",
        "A. Religion, Money, Colonization",
        "B. Wealth, Fame, Power",
        "D. Empowerment, Prosperity, Infamy"
    );

    private static MultChoiceQuestion multLukas2 = new MultChoiceQuestion (
        "Where did the Triangular Trade system occur?",
        "B. Atlantic Ocean",
        "A. Pacific Ocean",
        "C. Indian Ocean",
        "D. Arctic Ocean"
    );

    private static MultChoiceQuestion multLukas3 = new MultChoiceQuestion (
        "What were the three stages of the Trans-Atlantic Slave Trade?",
        "A. Capture, Middle Passage, Arrival",
        "B. The Coast, The Sea, The Land",
        "C. The March, Transport, Distribution",
        "D. Resistance, Conveyance, Acceptance"
    );

    private static MultChoiceQuestion multLukas4 = new MultChoiceQuestion (
        "How did enslaved people cope with the inhumane conditions?",
        "D. All of the above",
        "A. Religion, Spirituals, and Worship Practices",
        "B. Everyday Acts of Resistance",
        "C. Organized Revolts and Escape"
    );

    private static MultChoiceQuestion multLukas5 = new MultChoiceQuestion (
        "What were the new Banking Services of the Commercial Revolution?",
        "A. Bills of Exchange, Letters of Credit, Joint Stock Companies",
        "B. Credit Cards, Checks, Stocks",
        "C. ATMs, Loans, Checking Accounts",
        "D. Foreign Exchange, Investment Services, High-Yield Savings"
    );

    private static TrueFalseQuestion trueFalseLukas1 = new TrueFalseQuestion (
        "Absolute monarchs in Europe believed their authority to rule was granted by God, a concept known as the divine right of kings.",
        true
    );

    private static TrueFalseQuestion trueFalseLukas2 = new TrueFalseQuestion (
        "A major cause of the Industrial Revolution beginning in Britain was the country's abundant supply of coal and iron.",
        true
    );

    private static TrueFalseQuestion trueFalseLukas3 = new TrueFalseQuestion (
        "The French Revolution was a peaceful transition of power that avoided violence and radical changes to society.",
        false
    );

    private static TrueFalseQuestion trueFalseLukas4 = new TrueFalseQuestion (
        "The Enlightenment idea of government by consent suggests that political leaders should only hold power if they have the approval of the people they govern.",
        true
    );

    private static TrueFalseQuestion trueFalseLukas5 = new TrueFalseQuestion (
        "The factory system improved production efficiency by having skilled artisans perform all steps of a product's creation in small, specialized workshops.",
        false

    );


    /**
     * @author Sharon Cho
     */
    private static List<Question> historySharonCho = new ArrayList<Question>();
    /**
     * @author Lukas Harris
     */
    private static List<Question> historyLukasHarris = new ArrayList<Question>();
    private static List<Question> historyHunterJonston = new ArrayList<Question>();
    /**
     * @author Ahadu Markos
     */
    private static List<Question> historyAhaduMarkos = new ArrayList<Question>();
    public static List<Question> rawHQList = new ArrayList<Question>();

    static {
        historySharonCho.addAll(Arrays.asList(
            /*multSharon1,*/     // lukas did it better sorry
            multSharon2, multSharon3, multSharon4, multSharon5,
            trueFalseSharon1, trueFalseSharon2, trueFalseSharon3, trueFalseSharon4, trueFalseSharon5
        ));

        historyLukasHarris.addAll(Arrays.asList(
            multLukas1, multLukas2, multLukas3, multLukas4, multLukas5,
            trueFalseLukas1, trueFalseLukas2, trueFalseLukas3, trueFalseLukas4, trueFalseLukas5
        ));

        historyAhaduMarkos.addAll(Arrays.asList(
            multQuestion1, multQuestion2, multQuestion3, multQuestion4, multQuestion5,
            trueFalseQuestion1, trueFalseQuestion2, trueFalseQuestion3, trueFalseQuestion4, trueFalseQuestion5
        ));
        rawHQList.addAll(historySharonCho);
        rawHQList.addAll(historyLukasHarris);
        rawHQList.addAll(historyAhaduMarkos);
    }
}
