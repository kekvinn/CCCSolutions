package CCC2019;
import java.util.Scanner;

public class TimeToDecompress {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numLines = kb.nextInt();

        int[] nums = new int[numLines];
        String[] messages = new String[numLines];
        String message = "";

        for (int i = 0; i < numLines; i++) {
            nums[i] = kb.nextInt();
            messages[i] = kb.nextLine().trim();
        }

        for (int j = 0; j < numLines; j++)
        {
            for(int k = 0; k < nums[j]; k++) {
                System.out.print(messages[j]);
            }
            System.out.print("\n");
        }
    }

}
