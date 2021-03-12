package CCC2019;
import java.util.Scanner;

public class WinningScore {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int a3 = kb.nextInt();
        int a2 = kb.nextInt();
        int a1 = kb.nextInt();

        int b3 = kb.nextInt();
        int b2 = kb.nextInt();
        int b1 = kb.nextInt();

        int aTotal = (a3 * 3) + (a2 * 2) + a1;
        int bTotal = (b3 * 3)  + (b2 * 2) + b1;

        if(aTotal > bTotal)
            System.out.println("A");
        else if(bTotal > aTotal)
            System.out.println("B");
        else
            System.out.println("T");

        kb.close();
    }
}
