package questions;

import java.util.Scanner;

public class NoOfInst {
    static int count = 0;
    {
        count++;
    }
}
class Outputn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NoOfInst[] obj = new NoOfInst[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new NoOfInst();
        }
        System.out.println(NoOfInst.count);
    }

}
