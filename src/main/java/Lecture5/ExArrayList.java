package Lecture5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExArrayList {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        List<Integer> list = new ArrayList<Integer>();
        File file = new File(".//src//Mas.txt");
        file.createNewFile();
        Scanner scan = new Scanner(file);
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                list.add(scan.nextInt());
                scan.hasNext();
            }
        }
        System.out.println(list);
        long timeSpend = System.currentTimeMillis() - startTime;
        System.out.println(timeSpend);
    }
}
