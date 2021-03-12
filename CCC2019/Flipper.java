package CCC2019;
import java.util.Scanner;

public class Flipper {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String trans = kb.nextLine();

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;

        int temp1;
        int temp2;
        int temp3;

        for(int i = 0; i < trans.length(); i++)
        {
            if(trans.charAt(i) == 'H')
            {
                temp1 = num1;
                num1 = num3;
                temp2 = num2;
                num2 = num4;
                num3 = temp1;
                num4 = temp2;
            }
            else if(trans.charAt(i) == 'V')
            {
                temp1 = num1;
                num1 = num2;
                num2 = temp1;
                temp3 = num3;
                num3 = num4;
                num4 = temp3;
            }
        }
        System.out.println(num1 + " " + num2);
        System.out.println(num3 + " " + num4);
    }
}
