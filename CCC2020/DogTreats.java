package CCC2020;
import java.util.*;

public class DogTreats {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int s = kb.nextInt();
        int m = kb.nextInt();
        int l = kb.nextInt();

        boolean h = (s + 2*m + 3*l) >= 10;

        if(h == true) {
            System.out.println("happy");
        }
        else {
            System.out.println("sad");
        }
    }
}