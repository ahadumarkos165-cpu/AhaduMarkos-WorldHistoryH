import java.util.Scanner;

public class EndOfSemester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("World History H\nSemester 2 Practice Exam\nReady to start? Y/H (for help)/N");
        String start = scanner.nextLine();
        if (start.equalsIgnoreCase("N")) { // if no
            System.exit(0);
        }
        else if (start.equalsIgnoreCase("H")
        || start.equalsIgnoreCase("help")) {
            System.out.println("For multiple choice questions, only type the letter");
        }
        else {
            System.out.println("question will be given soon...");
            QuestionList.getQuestion(1).askQuestion(1);
            System.out.println("question has been asked");
        }
        scanner.close();
    } 
}