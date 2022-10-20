import java.util.Scanner;
public class zadanie2 {
    static int [] arr;
    static Scanner sc;

    public static void fillOne(int i){
        if(i<arr.length){
            System.out.println("Введите число");
            arr[i]=sc.nextInt();
            fillOne(++i);
        }
    }

    public static void printAll(int i){
        if(i<arr.length){
            System.out.print(arr[i]);
            printAll(++i);
        }
    }

    public static void main(String[] args){
        arr=new int[5];
        sc=new Scanner(System.in);
        fillOne(0);
        printAll(0);
    }
}
