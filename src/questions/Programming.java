package questions;

import java.util.Scanner;

public class Programming {
    public void display(String...args){
        if (args == null || args.length == 0){
            System.out.println("I love programming!");
        }
        else System.out.println("I love "+args[0]);
    }
}
class Outpt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Programming().display("java");
        new Programming().display();
        new Programming().display("python");
    }
}
