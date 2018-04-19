package com.study.map.scanner;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

class Data implements Comparable {
    String s;
    int count;

    public Data(String s, int count) {
        this.s = s;
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        Data d = (Data)o;
        return d.count - this.count;
    }
}

public class Example02 {

    public static void main(String[] args) throws IOException {
        String filePath = "d:/a.txt";
        Scanner scanner = new Scanner(Paths.get(filePath));
        scanner.useDelimiter("[^a-zA-Z]+");

        Map<String, Integer> map = new HashMap<String, Integer>();

        while (scanner.hasNext("[a-zA-Z]+")) {
            String s = scanner.next();
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
            else map.put(s, 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet())
            System.out.printf("(%s, %d) ", entry.getKey(), entry.getValue());
        System.out.println();

        List<Data> list = new ArrayList<>();
        for(String s : map.keySet())
            list.add(new Data(s, map.get(s)));
        Collections.sort(list);
        for(Data d : list)
            System.out.printf("(%s, %d) ", d.s, d.count);

        scanner.close();
    }
}