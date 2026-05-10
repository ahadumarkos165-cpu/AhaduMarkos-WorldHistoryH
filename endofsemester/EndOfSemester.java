import java.util.Scanner;

public class EndOfSemester {
    public static void main(String[] args) {
        QuestionList questionlist = new QuestionList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("World History H\nSemester 2 Practice Exam\nReady to start? Y/N");
        if (!scanner.nextLine().equalsIgnoreCase("Y")) {
            System.exit(0);
        }
        questionlist.getQuestion().askQuestion(1);
        scanner.close();
    }
}