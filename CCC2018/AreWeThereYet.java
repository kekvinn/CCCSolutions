package CCC2018;
import java.util.*;

public class AreWeThereYet {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[] distances = new int[4];
        int[] cities = new int[5];

        for(int i = 0; i < 4; i++)
        {
            distances[i] = kb.nextInt();
        }

        cities[0] = 0;
        for (int i = 1; i < 5; i++)
        {
            cities[i] = cities[i-1] + distances[i-1];
        }


        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                int r = cities[j] - cities[i];
                if(r < 0)
                    r *= -1;
                System.out.print(r);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
