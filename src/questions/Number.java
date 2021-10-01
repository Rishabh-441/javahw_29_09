package questions;

import java.math.BigInteger;

public class Number {
    private int n;

    Number(int a) {
        n = a;
    }

    public int getN() {
        return n;
    }

    public boolean isZero() {
        if (n == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPositive() {
        if (n > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isNegative() {
        if (n < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEven() {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isOdd() {
        if (n % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPrime() {
        int c = 0;
        int n1 = n;
        if (n1 < 0) {
            n1 = -n;
        }
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                c = 1;
                break;
            }
        }
        if (c == 1) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean isArmstrong() {
        int n1 = n;
        int n2 = n;
        int s = 0;
        while (n1 > 0) {
            int x = (n1 % 10);
            s = s + (x * x * x);
            n1 = n1 / 10;
        }
        if (s == n2) {
            return true;
        } else {
            return false;
        }

    }
    public BigInteger getFactorial(){
        int n1 = n;
        BigInteger s = new BigInteger("1");
        while(n1>0){
            s = s.multiply(BigInteger.valueOf(n1));
            n1 = n1-1;
        }
        return s;
    }
    public int getSqr(){
        return n*n;
    }
    public double getSqrt(){
        return Math.sqrt(n);
    }
    public int sumDigits(){
        int n1 = n;
        int s = 0;
        while(n1>0){
            s = s + (n1%10);
            n1 = n1/10;
        }
        return s;
    }
    public String toBinary(){
        return Integer.toBinaryString(n);
    }
    public String toOctal(){
        return Integer.toOctalString(n);
    }
    public String toHexal(){
        return Integer.toHexString(n);
    }


    public static void main(String[] args) {
        Number n1 = new Number(122021);
        System.out.println(n1.isPositive());
        System.out.println(n1.isNegative());
        System.out.println(n1.isZero());
        System.out.println(n1.isEven());
        System.out.println(n1.isOdd());
        System.out.println(n1.isPrime());
        System.out.println(n1.isArmstrong());
        System.out.println(n1.getFactorial());
        System.out.println(n1.getSqr());
        System.out.println(n1.getSqrt());
        System.out.println(n1.sumDigits());
        System.out.println(n1.toBinary());
        System.out.println(n1.toOctal());
        System.out.println(n1.toHexal());
    }
}