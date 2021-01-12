package com.Interview.mix.Algoritma.Algoritma12345;
import java.util.Random;
import java.util.Scanner;

public class Algorithyms {

	public static void bir() {

		String password = "yavuz";

		Scanner scanner = new Scanner(System.in);
		String wordpass = scanner.next();

		if (wordpass == password) {
			System.out.println("Giriş Başarılı");
		} else {
			System.out.println("Giriş Reddedildi");
		}

	}

	public static void iki() {

		System.out.println("İşlemler;");
		System.out.println("1-Toplama");
		System.out.println("2-Cıkarma");
		System.out.println("3-Carpma");
		System.out.println("4-Bolme");

		Scanner girdi = new Scanner(System.in);
		System.out.println("Lütfen yapmak istediğiniz işlem numarasını giriniz: ");

		int sonuc = 0;
		int islem = girdi.nextInt();
		System.out.println("Lütfen ilk sayiyi giriniz: ");
		int sayi1 = girdi.nextInt();
		System.out.println("Lütfen ikinci sayiyi giriniz: ");
		int sayi2 = girdi.nextInt();
		System.out.println();

		switch (islem) {

		case 1:
			sonuc = sayi1 + sayi2;
			System.out.println("Sonuç : " + sonuc);
			break;

		case 2:
			sonuc = sayi1 - sayi2;
			System.out.println("Sonuç : " + sonuc);
			break;

		case 3:
			sonuc = sayi1 * sayi2;
			System.out.println("Sonuç : " + sonuc);
			break;

		case 4:
			sonuc = sayi1 / sayi2;
			System.out.println("Sonuç : " + sonuc);
			break;
		}

	}

	public static void uc(int n) {

		Random random =new Random();
        double toplam = 0; 
        

        for (int i = 0; i < n; i++){
            int sayi = random.nextInt(n); 
            System.out.println(sayi);

            toplam += sayi; 
        }

        System.out.println("Ortalama: " + (toplam/n));

	}

	public static void dort(int n) {

		int i, j;

		for (i = 0; i < n; i++) {

			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void bes(int n) {   
		
		Scanner girdi = new Scanner(System.in).useDelimiter("\n");
		int[] randomsayi = new int[n];
		int[] cift = new int[n];
		int[] tek = new int[n];
		int k = 0, l = 0;

		for (int i= 0; i< randomsayi.length; i++) {
			randomsayi[i] = (int) (Math.random() * n);
		}
		for (int i = 0; i < n; i++) {
		    if (randomsayi[i] % 2 == 0) {
		    	cift[k] = randomsayi[i];
		        k++;
		    } else {
		    	tek[l] = randomsayi[i];
		        l++;
		    }
		}System.out.print("Çift: ");
		for (int i = 0; i< cift.length; i++) {
		    System.out.print(cift[i] + " ");

		}System.out.println("");
		System.out.print("Tek: ");
		for (int i= 0; i < tek.length; i++) {
		    System.out.print(tek[i] + " ");
		    }
	}
	
		
		
	

	public static void main(String[] args) {

		
		bir(); 
		iki();
		uc(100);  
		dort(10); 
		bes(100); 
		

	}

}
