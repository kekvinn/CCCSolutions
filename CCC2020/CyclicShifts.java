package CCC2020;
import java.util.*;

public class CyclicShifts {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String t = kb.nextLine();
        String s = kb.nextLine();
        String shifted = s;
        boolean cyclic = false;

        for(int i = 0; i < s.length(); i++)
        {
            shifted =  s.substring(i) + s.substring(0, i);

            for(int j = 0; j <= (t.length() - s.length()); j++)
            {
                if(t.substring(j, j+s.length()).equals(shifted))
                    cyclic = true;
            }
        }

        if(cyclic == true)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
