package CCC2017;
import java.util.*;

public class HighTideLowTide {
    public static void main(String[] args) {
        try {
            Scanner kb = new Scanner(System.in);

            int n = kb.nextInt();
            int[] m = new int[n];

            for (int i = 0; i < n; i++)
                m[i] = kb.nextInt();

            Arrays.sort(m);

            int[] low = new int[(m.length + 1) / 2];
            int[] high = new int[m.length - low.length];

            for (int i = 0; i < m.length; i++) {
                if (i < low.length)
                    low[i] = m[i];
                else
                    high[i - low.length] = m[i];
            }

            for (int i = 0; i < low.length; i++)
                low[i] *= -1;

            Arrays.sort(low);

            for (int i = 0; i < low.length; i++)
                low[i] *= -1;

            for (int i = 0; i < Math.max(low.length, high.length); i++) {
                System.out.print(low[i] + " ");
                System.out.print(high[i] + " ");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.print("");
        }

    }
}
