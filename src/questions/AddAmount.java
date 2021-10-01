package questions;

import java.util.Scanner;

public class AddAmount {
    static int amount = 50;

    public AddAmount(int n) {
        amount += n;
    }
    public AddAmount(){
        super();
    }
}
class Op{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AddAmount obj = new AddAmount(n);
        System.out.println(obj.amount);
    }
}

