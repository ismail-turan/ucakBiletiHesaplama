import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi giriniz");
        double mesafe=scanner.nextDouble();
        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas=scanner.nextInt();
        System.out.println("1:Tek yön \n2:Gidiş-Dönüş");
        byte yön=scanner.nextByte();
        double normalFiyat=mesafe*(0.10);
        double toplamUcret=0;
        if (yas<12 && yas>0 && mesafe>0){
            toplamUcret=toplamUcret+normalFiyat*(0.50);
        }
        if (yas>=12 && yas<24 && mesafe>0){
            toplamUcret=toplamUcret+normalFiyat*(0.10);
        }
        if (yas>=65 && mesafe>0){
            toplamUcret=toplamUcret+normalFiyat*(0.30);
        }
        if (yas>0 && yön==2 && mesafe>0){
            toplamUcret+=normalFiyat*(.20);
        }
        if (yas>=24 && yas<65 && mesafe>0){
            toplamUcret+=normalFiyat;
        }
        if (toplamUcret==0) {
            System.out.println("yalış girdi");
        }

    }

}