package CCC2020;
import java.util.*;

public class Art {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int spots = kb.nextInt();
        kb.nextLine();
        String all = "";

        String[] inputs = new String[spots];

        for(int i = 0; i < spots; i++)
        {
            inputs[i] = kb.nextLine() + ",";
        }

        for(int j = 0; j < inputs.length; j++)
        {
            all += inputs[j];
        }

        String[] parts = all.split(",");
        int[] x = new int[(parts.length)];
        int[] y = new int[(parts.length)];
        for(int k = 0; k < parts.length; k++)
        {
            if(k % 2 == 0)
                x[k] = Integer.parseInt(parts[k]);
            else
                y[k] = Integer.parseInt(parts[k]);
        }
        int smallestx = x[0];
        int biggestx = x[0];

        for(int q = 1; q < x.length; q++)
        {
            if(x[q] > biggestx) {
                biggestx = x[q];
            }
            else if (x[q] < smallestx)
            {
                if(x[q] != 0)
                {
                    smallestx = x[q];
                }
            }
        }
        int smallesty = y[1];
        int biggesty = y[0];

        for(int t = 1; t < y.length; t++)
        {
            if(y[t] > biggesty) {
                biggesty = y[t];
            }
            else if (y[t] < smallesty)
            {
                if(y[t] != 0)
                {
                    smallesty = y[t];
                }
            }
        }
        System.out.println((smallestx - 1) + "," + (smallesty - 1));
        System.out.println((biggestx + 1) + "," + (biggesty + 1));

    }
}