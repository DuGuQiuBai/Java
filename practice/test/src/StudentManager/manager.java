package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class manager {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        // Scanner sc = new Scanner(System.in);
        while (true) {
            PrintTable();
            switch (sc.nextLine()) {
                case "1":
                    AddStudent(array);
                    break;
                case "2":
                    DeleteStudent(array);
                    ;
                    break;
                case "3":
                    ChangeInfo(array);
                    break;
                case "4":
                    CheckAll(array);
                    break;
                case "5":
                    System.out.println("Thanks for Using");
                    sc.close();
                    return;
                default:
                    System.out.println("Please choose the right one");
                    break;
            }
        }

    }

    // 打印表头
    public static void PrintTable() {
        System.out.println("------Welcome to the StudentManager System------");
        System.out.println("1 Add Students");
        System.out.println("2 Delete Students");
        System.out.println("3 Change Info");
        System.out.println("4 Check All");
        System.out.println("5 Quit");
        System.out.println("Please input your choice: ");
    }

    // 添加学生
    public static void AddStudent(ArrayList<Student> array) {
        String sid;

        //判断学号是否存在
        while (true) {
            System.out.print("Please input id:");
            sid = sc.nextLine();
            if (CheckID(array, sid)) {
                System.out.println("ID already exists, please input agian!");
            } else {
                break;
            }
        }
        
        System.out.print("Please input name:");
        String name = sc.nextLine();
        System.out.print("Please input age:");
        String age = sc.nextLine();
        System.out.print("Please input address:");
        String address = sc.nextLine();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 添加学生到集合里
        array.add(s);
        System.out.println("Add Succeed!");
    }

    // 删除学生
    public static void DeleteStudent(ArrayList<Student> array) {
        System.out.print("Please input student's id:");
        String sid = sc.nextLine();

        int index = -1;
        // 判断学号是否存在
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("ID doesn't exist! PLease input again.");
        } else {
            array.remove(index);
            System.out.println("Delete Succeed!");
        }
    }

    // 修改学生信息
    public static void ChangeInfo(ArrayList<Student> array) {
        System.out.print("PLease input student's ID:");
        String sid = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("ID doesn't exist! Please input agian.");
            return;
        }

        System.out.print("Please input name:");
        String name = sc.nextLine();
        System.out.print("Please input age:");
        String age = sc.nextLine();
        System.out.print("Please input address:");
        String addr = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(addr);

        for (int i = 0; i < array.size(); i++) {
            Student change = array.get(i);
            if (change.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }
        System.out.println("Change succeed!");
    }

    // 查看学生
    public static void CheckAll(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("No data, please input students' info!");
            return;
        }

        // 表头信息
        System.out.println("id\t\tname\tage\taddress");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    // 查看学号是否相同
    public static boolean CheckID(ArrayList<Student> array, String ID) {
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(ID)) {
                return true;
            }
        }
        return false;
    }

}