package TersUcgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--){
            for (int s = 1; s <= n-i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
