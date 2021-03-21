import java.util.Scanner;
import java.util.Arrays;//helper dari java untuk array
public class Looping {
	public static void main(String[] args) {
		Scanner batas= new Scanner(System.in);
		
		//deklarasi dan inisialisasi batas array
		int batasan;
		System.out.print("masukkan batas ");
		batasan=batas.nextInt();
		
		//deklarasi array
		int[] arr=new int[batasan];
		
		//input data ke array dengan properti array
		for(int x=0;x<arr.length;x++) {
			System.out.println("Masukkan nilai ke-"+x+" :");
			arr [x]=batas.nextInt();
		}
		batas.close();
		//output
		for(int y=0;y<arr.length;y++) {
			System.out.println(arr [y]+" ");
		}
		//helper untuk memanggil isi dari array tersebut secara keseluruhan
		System.out.println(Arrays.toString(arr));
	}
}
