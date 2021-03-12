package CCC2017;
import java.util.*;

public class SumGame {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        kb.nextLine();
        int[] swifts = new int[n];
        int[] sems = new int[n];

        for (int i = 0; i < n; i++)
            swifts[i] = kb.nextInt();

        for (int i = 0; i < n; i++)
            sems[i] = kb.nextInt();

        int k = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++)
        {
            sum1 += swifts[i];
            sum2 += sems[i];
            if(sum1 == sum2)
                k = i + 1;
        }

        System.out.print(k);
    }
}
