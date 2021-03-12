package CCC2018;
import java.util.*;

public class TelemarketerOrNot {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int num3 = kb.nextInt();
        int num4 = kb.nextInt();

        if((num1 == 8 || num1 == 9) && (num4 == 8 || num4 == 9) && (num2 == num3))
        {
            System.out.println("ignore");
        }
        else{
            System.out.println("answer");
        }
    }
}
