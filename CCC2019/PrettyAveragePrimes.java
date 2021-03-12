package CCC2019;
import java.util.Scanner;

public class PrettyAveragePrimes {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] inputs = new int[n];

        for(int i = 0; i < n; i++)
        {
            inputs[i] = kb.nextInt();
        }

        for(int j = 0; j < n; j++)
        {
            int timesTwo = inputs[j] * 2;
            for(int k = 2; k < inputs[j]; k++)
            {
                if(!isPrime(k) && !isPrime(timesTwo - k))
                {
                    System.out.println(k + " " + (timesTwo - k));
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int k)
    {
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(k); ++i)
        {
            if(k % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
