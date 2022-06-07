import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,muzuk,kimya,biy;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();
        System.out.println("Muzuk Notunuzu Giriniz:");
        muzuk = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();
        System.out.println("Biyoloji Notunuzu Giriniz:");
        biy = input.nextInt();

        double sonuc = (mat + fizik + muzuk + kimya + biy)/5;

        if (sonuc<60){
            System.out.println("Sinifta Kaldiniz");
        } else {
            System.out.println("Sinifi Gectiniz");
        }
    }
}
