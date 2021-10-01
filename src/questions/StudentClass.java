package questions;

import java.util.Scanner;

public class StudentClass {
    private int rollno;
    private String name;
    public int marks;
    public String c_name;
    public static int l_rollno;
    public static String l_name;
    public static int l_marks = -99999999;
    public static String l_c_name;

    public StudentClass(int rollno,String name,int marks,String c_name){
        this.rollno = rollno;
        this.name = name;
        this.c_name = c_name;
        this.marks = marks;
        Result(marks,name,rollno,c_name);
    }

    public void Result(int marks,String name,int rollno,String c_name){
        {
            if (marks > l_marks) {
                l_marks = marks;
                l_rollno = rollno;
                l_name = name;
                l_c_name = c_name;
            }
        }
    }

    static void getResult(){
        System.out.println("name = "+l_name);
        System.out.println("roll no = "+l_rollno);
        System.out.println("marks = "+l_marks);
        System.out.println("c_name = "+l_c_name);
    }

}

class Outputz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of students:");
        int n = sc.nextInt();
        StudentClass[] arr = new StudentClass[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the rollno,marks,name,c_name::");
            int rollno = sc.nextInt();
            int marks = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String c_name = sc.nextLine();
            arr[i] = new StudentClass(rollno,name,marks,c_name);
        }
        System.out.println("\n\nThe student with highest marks is:::");
        StudentClass.getResult();
    }
}