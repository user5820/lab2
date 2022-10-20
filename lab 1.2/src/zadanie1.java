import java.util.Scanner;
public class zadanie1 {
    static private String xConvert(int x){
        return(x!=0)?(xConvert(x/2)+x%2):"";
    }
    static public void main(String[]args){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("В двоичной системе: "+ xConvert(value));
        sc.nextLine();
    }
}
