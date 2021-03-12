package CCC2019;
import java.util.Scanner;

public class ColdCompress {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        String message = "";

        String[] texts = new String[n];

        for (int i = 0; i < n; i++)
        {
            texts[i] = kb.nextLine() + "`";
        }

        for(int i = 0; i < n; i++)
        {
            char character = texts[i].charAt(0);
            int numTimes = 0;
            for(int j = 0; j < texts[i].length(); j++)
            {
                if(texts[i].charAt(j) == character)
                {
                    numTimes++;
                }
                else
                {
                    message += numTimes + " " + texts[i].charAt(j - 1) + " ";
                    numTimes = 1;
                    character = texts[i].charAt(j);
                }
            }
            System.out.println(message);
            message = "";
        }
    }
}
