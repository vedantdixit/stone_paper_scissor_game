import java.util.Random;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 For: Stone, 1 For: Paper, 2 For: Scissor");
        int a = sc.nextInt();

        // generating integer
        int nxt = ran.nextInt(3);

        if (a==0 && nxt==1){
            System.out.println("You Lose"+ "System choice was: " + nxt + "And Your choice was: " + a);
        }
        if (a==1 && nxt==0){
            System.out.println("You win"+ "System choice was: " + nxt + "And Your choice was: " + a);
        }
        if (a==0 && nxt==2){
            System.out.println("You win"+ "System choice was: " + nxt + "And Your choice was: " + a);
        }

        if (a==2 && nxt==0){
            System.out.println("You Lose"+ "System choice was: " + nxt + "And Your choice was: " + a);
        }
        if (a==1 && nxt==2){
            System.out.println("You Lose"+ "System choice was: " + nxt + "And Your choice was: " + a);
        }
        if (a==2 && nxt==1){
            System.out.println("You win"+ "System choice was: " + nxt + "And Your choice was: " + a);
        }


        else{
            System.out.println("foul " + "System choice was: " + nxt + "And Your choice was: " + a);
        }

    }
}
