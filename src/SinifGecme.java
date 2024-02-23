import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		
		int mat, fizik, kimya, muzik, turkce, mat2=0, fizik2=0, kimya2=0, muzik2=0, turkce2=0;
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Matematik notunuzu giriniz : ");
	    mat = input.nextInt();
	    if (mat>=0 && mat<=100) mat2=mat;
	    
	    System.out.print("Fizik notunuzu giriniz : ");
	    fizik = input.nextInt();
	    if (fizik>=0 && fizik<=100) fizik2=fizik;
	    
	    System.out.print("Kimya notunuzu giriniz : ");
	    kimya = input.nextInt();
	    if (kimya>=0 && kimya<=100) kimya2=kimya;
	    
	    System.out.print("Müzik notunuzu giriniz : ");
	    muzik = input.nextInt();
	    if (muzik>=0 && muzik<=100) muzik2=muzik;
	    
	    System.out.print("Türkçe notunuzu giriniz : ");
	    turkce = input.nextInt();
	    if (turkce>=0 && turkce<=100) turkce2=turkce;
	    
	    double ortalama = (mat2 + fizik2 + kimya2 + muzik2 + turkce2)/5;
	    
	    System.out.println(ortalama);
	    
	    if (ortalama>=55) System.out.println("Ortalamanız : "+ortalama+" Geçtiniz!");
	    else System.out.println ("Ortalamanız : "+ortalama+" Kaldınız!");  

		

	}

}
