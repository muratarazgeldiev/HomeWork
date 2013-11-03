package ProjectEulera.HomeWork11;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class HomeWork11 {

    public static void main(String[] args) throws  IOException {
        int[][] mas = new int[20][20];
        int maxLR = 0;
        int maxUD = 0;
        int res = 0;
        File file = new File(".//src//Mas.txt");
        file.createNewFile();
        Scanner scan = new Scanner(file);
        for (int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                mas[i][j] = scan.nextInt();
                scan.hasNext();
            }
        }
        for(int i = 0; i < 20; i++){
            for(int j = 0; j <= 16; j++){
                res = mas[i][j]*mas[i][j + 1]*mas[i][j + 2]*mas[i][j + 3];
                if(res > maxLR){maxLR = res;}
                res = mas[j][i]*mas[j + 1][i]*mas[j + 2][i]*mas[j + 3][i];
                if(res > maxLR){maxLR = res;}
            }
        }
        for(int i = 0; i <= 16; i++){
            for (int j = 0; j <= 16; j++){
                res = mas[i][j]*mas[i + 1][j + 1]*mas[i + 2][j + 2]*mas[i + 3][j + 3];
                if(res > maxUD){maxUD = res;}
            }
        }
        for(int i = 3; i <= 16; i++){
            for (int j = 0; j <= 16; j++){
                res = mas[i][j]*mas[i - 1][j + 1]*mas[i - 2][j + 2]*mas[i - 3][j + 3];
                if(res > maxUD){maxUD = res;}
            }
        }
        if (maxLR > maxUD){
            System.out.println(maxLR);
        } else {
            System.out.println(maxUD);
        }

    }

}