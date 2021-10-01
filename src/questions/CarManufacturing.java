package questions;

import java.util.Scanner;

public class CarManufacturing {
    String manu;
    int price;

    //parameterized constructor
    CarManufacturing(String manu,int price){
        this.manu = manu;
        this.price = price;
    }

    //unparameterized constructor
    public CarManufacturing() {
        super();
    }

    @Override
    public String toString() {
        return "CarManufacturing{" +
                "manu='" + manu + '\'' +
                ", price=" + price +
                '}';
    }

    //method to sort array of class
    public CarManufacturing[] detailSorting(CarManufacturing[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j].price > arr[j+1].price){
                    CarManufacturing x = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = x;
                }
            }
        }
        return arr;
    }
}
class Checking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of elements::");
        int n = sc.nextInt();
        CarManufacturing[] arr = new CarManufacturing[n];

        //accepting details of cars
        for (int i = 0; i < n; i++) {
            System.out.println("enter the detail of "+(i+1)+" car(manufacture,price)::");
            arr[i] = new CarManufacturing(sc.next(),sc.nextInt());
        }


        CarManufacturing x = new CarManufacturing();
        CarManufacturing[] narr = x.detailSorting(arr);

        //printing the sorted array of class
        for (var t: narr) {
            System.out.println(t);
        }
    }
}
