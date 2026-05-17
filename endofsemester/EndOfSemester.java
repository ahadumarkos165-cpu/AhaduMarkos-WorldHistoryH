import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.random.*;

public class EndOfSemester {
    /**
     * Checks if the program should display the title screen; only does so on
     * the program's first loop.
     * <p> Program does not redisplay title screen if main(args) is called again
     * by help menu or abnormal input.
    */
    static Boolean displayTitleScreen = true;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        if (displayTitleScreen == true) {
            clearScreen();
            System.out.println("World History H\nSemester 2 Practice Exam\nReady to start? Y/H (for help)/N");
        }
        String start = scanner.nextLine();
        if (start.equalsIgnoreCase("H")
        || start.equalsIgnoreCase("help")) {
            System.out.println("""
                Capitalization never matters ("a" and "A" are equivalent)
                For multiple choice questions, only type the letter ("A", "B", "C", or "D")
                For true-false questions, type "T" or "F"
            """);
            displayTitleScreen = false;
            main(args);
        } else if (start.equalsIgnoreCase("y")) {
            clearScreen();
            Integer correctCount = 0; // counts how many answers were correctly given
            Double correctPercent = 0.0;
            Integer randomNumber; // which question will be taken from QuestionList.questionList?
            List<Integer> nList = new ArrayList<Integer>(15); // list of question indices; used since .remove() doesn't work on 
            nList.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
            for (Integer totalCount = 1; totalCount <= QuestionList.questionList.size(); totalCount++) {
                randomNumber = nList.remove(randomGenerator.nextInt(nList.size()));
                // System.out.println("question will be given soon...");
                if (QuestionList.getQuestion(randomNumber).askQuestion(totalCount)) {
                    correctCount++;
                    clearScreen();
                } else {
                    System.out.print("Continuing in ");
                    for (Integer sec = 5; sec > 0; sec--) {
                        System.out.printf("%d... ", sec);
                        Thread.sleep(1000);
                    }
                    clearScreen();
                }
                correctPercent = (double) correctCount/totalCount * 100;
                System.out.printf("%1$d correct out of %2$d (%3$.2f%%)\n", correctCount, totalCount, correctPercent);
                // System.out.println("question has been asked");
            }
            if (correctPercent == 100) {
                System.out.println("Great job!");
            }
        } else if (start.equalsIgnoreCase("N")) {
            System.exit(0);
        } else {
            // probably not the most efficient way to exit but who cares
            displayTitleScreen = false;
            main(args);
        }
        scanner.close();
    } 

    /**
     * Clears the screen.
     */
    public static void clearScreen() {  
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }  
}