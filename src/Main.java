import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //take input from user S,P,R
        for (int a=0; a<10; a++) {
            Scanner inputobj = new Scanner(System.in);
            System.out.println("Please enter S,P or R");
            char userMove = inputobj.next().charAt(0);
            System.out.println("User gave this input " + userMove);

            //make computer to make there move
            char[] arr = {'S', 'P', 'R'};
            Random rand = new Random();
            int number = rand.nextInt(3);
            char computerMove = arr[number];
            System.out.println("Computer move :" + computerMove);

            //computer =user>draw!!
            if (userMove == computerMove) {
                System.out.println("Draw");
            } else if (userMove == 'S' && computerMove == 'R') {
                System.out.println("Computer Wins");
            } else if (userMove == 'R' && computerMove == 'P') {
                System.out.println("Computer Wins");
            } else {
                System.out.println("User Wins");
            }

        }

    }
}
