package Lecture5;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class ExLinkedList {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> list = new LinkedList<Integer>();
        File file = new File(".//src//Mas.txt");
        file.createNewFile();
        Scanner scan = new Scanner(file);
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                list.add(scan.nextInt());
                scan.hasNext();
            }
        }
        list.add(-1, 4);
        System.out.println(list);
        System.out.println(list.peek());
        long lTime = System.currentTimeMillis() - startTime;
        System.out.println(lTime);
    }
}
