package CCC2018;
import java.util.*;

public class OccupyParking {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        kb.nextLine();
        String day1 = kb.nextLine();
        String day2 = kb.nextLine();
        int occupied = 0;

        for(int i = 0; i < n; i++)
        {
            if(day1.charAt(i) != '.' && day1.charAt(i) == day2.charAt(i))
                occupied++;
        }

        System.out.println(occupied);
    }
}
