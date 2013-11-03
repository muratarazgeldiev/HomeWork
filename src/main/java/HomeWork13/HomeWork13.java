package HomeWork13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(".//src//Number.txt"));
        BigInteger[] num = new BigInteger[100];
        BigInteger sum = BigInteger.valueOf(0);
        String r = new String();
        String val = "";
        String vall = "";
        for(int i = 0; i < 100; i++){
            r = reader.readLine();
            num[i] = new BigInteger(r);
            sum = sum.add(num[i]);
        }
        vall = String.valueOf(sum);
        for(int j = 0; j < 10; j++){
            val += vall.charAt(j);
        }
        System.out.println(val);
    }
}
