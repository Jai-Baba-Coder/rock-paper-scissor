import java.util.Scanner;
import java.util.Random;
public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("enter your choice:\n1: for scissors\n2: for rock\n3: for paper");
        System.out.print(">>");
        int userData = scan.nextInt();
        int rand = random.nextInt(1,4);
        
        if (userData == 1 && rand == 1) {
            System.out.println("computer chose scissors, DRAW!!");
        }
        else if (userData == 2 && rand == 1) {
            System.out.println("computer chose scissors, WIN!!");
        }
        else if (userData == 3 && rand == 1) {
            System.out.println("computer chose scissors, LOSE!!");
        }

        if (userData == 1 && rand == 2) {
            System.out.println("computer chose rock, LOSE!!");
        }
        else if (userData == 2 && rand == 2) {
            System.out.println("computer chose rock, DRAW!!");
        }
        else if (userData == 3 && rand == 2) {
            System.out.println("computer chose rock, WIN!!");
        }

        if (userData == 1 && rand == 3) {
            System.out.println("computer chose paper, WIN!!");
        }
        else if (userData == 2 && rand == 3) {
            System.out.println("computer chose paper, LOSE!!");
        }
        else if (userData == 3 && rand == 3) {
            System.out.println("computer chose paper, DRAW!!");
        }
        else if (userData >= 4 || userData <= 0) {
            System.out.println("invalid Choice, run again!!");
        }
        scan.close();
    }
}
