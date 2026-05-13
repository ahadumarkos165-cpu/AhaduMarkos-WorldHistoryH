import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.random.*;

public class EndOfSemester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        System.out.println("World History H\nSemester 2 Practice Exam\nReady to start? Y/H (for help)/N");
        String start = scanner.nextLine();
        if (start.equalsIgnoreCase("N")) { // if no
            System.exit(0);
        }
        else if (start.equalsIgnoreCase("H")
        || start.equalsIgnoreCase("help")) {
            System.out.println("For multiple choice questions, only type the letter");
        } else {
            Integer correctCount = 0; // counts how many answers were correctly given
            Integer randomNumber; // which question will be taken from QuestionList.questionList?
            List<Integer> nList = new ArrayList<Integer>(15); // list of question indices; used since .remove() doesn't work on 
            nList.addAll(Arrays.asList(0,1,2,3,4,5));

            for (Integer totalCount = 1; totalCount <= QuestionList.questionList.size(); totalCount++) {
                randomNumber = nList.remove(randomGenerator.nextInt(nList.size()));
                System.out.println("question will be given soon...");
                if (QuestionList.getQuestion(randomNumber).askQuestion(totalCount)) {
                    correctCount++;
                }
                System.out.printf("%1$d correct out of %2$d\n", correctCount, totalCount);
                System.out.println("question has been asked");
            }
        }
        scanner.close();
    } 
}