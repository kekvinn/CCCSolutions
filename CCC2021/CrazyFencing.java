package CCC2021;
import java.util.*;

public class CrazyFencing {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        double[] widths = new double[n+1];
        double[] heights = new double[n];
        double sum = 0.0;

        for (int i = 0; i < n + 1; i++)
            widths[i] = kb.nextInt();

        for(int i = 0; i < n; i++)
            heights[i] = kb.nextInt();

        for(int i = 0; i < n; i++)
        {
            sum += heights[i] * ((widths[i] + widths[i+1])/2);
        }

        if ((int) sum == sum)
            System.out.println((int) sum);
        else
            System.out.println(sum);
    }
}
