package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Collections.reverseOrder());
        List<City> b = new ArrayList<>();

        b.add(new City(1, "Бишкек", "127 км", 1088900));
        b.add(new City(2, "Бишкек", "127 км", 1088900));
        b.add(new City(3, "Бишкек", "127 км", 1088900));
        b.add(new City(4, "Бишкек", "127 км", 1088900));
        b.add(new City(5, "Бишкек", "127 км", 1088900));
        b.add(new City(6, "Бишкек", "127 км", 1088900));
        b.add(new City(7, "Бишкек", "127 км", 1088900));

        for (int i = b.size(); i > 0; i--) {
            i--;
            if (b.get(i).getCode() % 2 == 1) {
                a.add(b.get(i).getCode());
              System.out.println(b.get(i));
            }
        }

    }
}
