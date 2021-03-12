package CCC2020;
import java.util.*;

public class Epidemiology {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int p = kb.nextInt();
        int n = kb.nextInt();
        int r = kb.nextInt();

        int infected = n;

        int i = 1;

        while(true)
        {
            infected += Math.pow(r, i)*n;
            i++;
            if(infected > p)
            {
                break;
            }
        }
        System.out.println(i-1);
    }
}