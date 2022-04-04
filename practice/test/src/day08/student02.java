package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class student02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<student01> arr = new ArrayList<>();
        // student01 s1 = new student01("tiger", "21");
        // student01 s2 = new student01("monkey", "22");
        // student01 s3 = new student01("cat", "22");

        // arr.add(s1);
        // arr.add(s2);
        // arr.add(s3);
        addstudent(arr);
        addstudent(arr);

        for (int i = 0; i < arr.size(); i++) {
            student01 s = arr.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }

    public static void addstudent(ArrayList<student01> arr) {
        student01 s = new student01();
        //Scanner sc = new Scanner(System.in);

        System.out.print("please input student's name:");
        String name = sc.nextLine();

        System.out.print("Please input student's age:");
        String age = sc.nextLine();

        s.setName(name);
        s.setAge(age);

        arr.add(s);
    }
}