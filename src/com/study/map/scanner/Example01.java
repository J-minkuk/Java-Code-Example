package com.study.map.scanner;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) throws IOException {
        String filePath = "d:/a.txt";
        Scanner scanner = new Scanner(Paths.get(filePath));
        scanner.useDelimiter("[^a-zA-Z]+");

        Map<String, Integer> map = new HashMap<String, Integer>();

        while (scanner.hasNext("[a-zA-Z]+")) {
            String s = scanner.next();
            if(map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet())
            System.out.printf("(%s, %d) ", entry.getKey(), entry.getValue());

        scanner.close();
    }
}