package CCC2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ModernArt {
    public static void main(String[] args) throws Exception {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(kb.readLine());
        int n = Integer.parseInt(kb.readLine());
        int k = Integer.parseInt(kb.readLine());
        char[] choice = new char[k];
        int[] numRowCol = new int[k];
        String input = "";
        int count = 0;

        for (int i = 0; i < k; i++) {
            input = kb.readLine();
            String[] inputs = input.split(" ");
            choice[i] = inputs[0].charAt(0);
            numRowCol[i] = Integer.parseInt(inputs[1]) - 1;
        }

        boolean[][] canvas = new boolean[m][n];

        for(boolean[] row: canvas)
            Arrays.fill(row, false);

        for (int i = 0; i < k; i++)
        {
            if(choice[i] == 'R')
            {
                for (int j = 0; j < n; j++)
                    canvas[numRowCol[i]][j] = !(canvas[numRowCol[i]][j]);
            }
            else
            {
                for(int j = 0; j < m; j++)
                    canvas[j][numRowCol[i]] = !(canvas[j][numRowCol[i]]);
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(canvas[i][j] == true)
                    count++;
            }
        }
        System.out.println(count);
    }
}
