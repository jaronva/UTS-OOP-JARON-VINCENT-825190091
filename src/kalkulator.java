package kalkulator;
import java.util.Scanner;
class kalkulator {
    static float total = 0, a = 1, b = 1;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Angka Pertama : ");
        a = input.nextFloat();
        System.out.print("Masukan Angka Kedua : ");
        b = input.nextFloat();

        while(b!=0 & a!= 0){
            System.out.println("Kalkulator");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.print("Masukan Pilihan Anda : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.println(+ a + "+" + b);
                    System.out.print("Hasil = ");
                    total = a + b;
                }
                case 2 -> {
                    System.out.println(+ a + "-" + b);
                    System.out.print("Hasil = ");
                    total = a - b;
                }
                case 3 -> {
                    System.out.println(+ a + "*" + b);
                    System.out.print("Hasil = ");
                    total = a * b;
                }
                case 4 -> {
                    System.out.println(+ a + "/" + b);
                    System.out.print("Hasil = ");
                    total = a / b;
                }
                default -> {
                    System.out.println("Pilihan Anda Salah");

                }
            }
            System.out.println(total);
        }


    }
}

