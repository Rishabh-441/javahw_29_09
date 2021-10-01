package questions;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
class Display{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] obj = new Student[n];

        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            System.out.print("if u want to just enter the name and age, ***press 1***\nif you want to enter name age and address ***press 2***:");
            int x = sc.nextInt();
            if (x==1) {
                System.out.print("enter name and age:");
                sc.nextLine();
                String name = sc.nextLine();
                int age = sc.nextInt();
                obj[i].setInfo(name,age);
            }
            else{
                System.out.print("enter name age and address:");
                sc.nextLine();
                String name = sc.nextLine();
                int age = sc.nextInt();
                sc.nextLine();
                String address = sc.nextLine();
                obj[i].setInfo(name,age,address);
            }
        }

        for (var c:obj) {
            System.out.println(c);
        }
    }
}
