package questions;

import java.util.Scanner;

public class FindElem {
    int[] arr;

    public FindElem(int[] arr) {
        this.arr = arr;
    }

    public boolean search(int s){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) return true;
        }
        return false;
    }
}
class Nums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number you want to search for:");
        int find = sc.nextInt();

        FindElem obj = new FindElem(arr);
        if (obj.search(find)) System.out.println("found");
        else System.out.println("not found");
    }
}
