package org.example;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String a = "Chrissy";
        String b = "Christian";
        String c = "Barbara";
        String d = "Carsten";

        List<String> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        System.out.println(students);
        students.add(d);
        System.out.println(students);

        //students[]
        System.out.println(students.get(0));

        //students.length
        System.out.println(students.size());
    }
}