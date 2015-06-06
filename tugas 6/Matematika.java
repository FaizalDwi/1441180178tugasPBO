import java.util.Scanner;
public class Matematika  {
	public static void main(String[] args) {
            for (int i = 1; 1<9999;){
            Scanner masukan = new Scanner(System.in);
            System.out.println("||MATEMATIKA||");
            System.out.println("\n");
            System.out.println("Menu");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.println("\n");
            System.out.print("Pilihan : ");
            int menu = masukan.nextInt();
            switch (menu){
                case 1 :
                Scanner angka1 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                int a1 = angka1.nextInt();
                Scanner angka2 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                int b1 = angka2.nextInt();
                int c1;
                c1 = a1+b1;
                System.out.print("Hasil dari "+a1);
                System.out.print(" + "+b1);
                System.out.print(" = "+c1);
                System.out.println("");
                System.out.println("\n");  
                break;

                case 2 :
                Scanner angka3 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                int a2 = angka3.nextInt();
                Scanner angka4 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                int b2 = angka4.nextInt();
                int c2;
                c2 = a2-b2;
                System.out.print("Hasil dari "+a2);
                System.out.print(" - "+b2);
                System.out.print(" = "+c2);
                System.out.println("");
                System.out.println("\n");
                break;

                case 3 :
                Scanner angka5 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                int a3 = angka5.nextInt();
                Scanner angka6 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                int b3 = angka6.nextInt();
                int c3;
                c3 = a3*b3;
                System.out.print("Hasil dari "+a3);
                System.out.print(" x "+b3);
                System.out.print(" = "+c3);
                System.out.println("");
                System.out.println("\n");
                break;

                case 4 :
                Scanner angka7 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                float a4 = angka7.nextFloat();
                Scanner angka8 = new Scanner(System.in);
                System.out.print("Masukkan nilai : ");
                float b4 = angka8.nextFloat();
                float c4;
                c4 = a4/b4;
                System.out.print("Hasil dari "+a4);
                System.out.print(" / "+b4);
                System.out.print(" = "+c4);
                System.out.println("");
                System.out.println("\n");
                break;

                case 5 :
                System.exit(5);
                break;
            }
        }

	}
	
}