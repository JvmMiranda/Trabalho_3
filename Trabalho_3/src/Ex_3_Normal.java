import java.util.*;
public class Ex_3_Normal {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int v;
		
		System.out.println("Informe um valor em binário com 8 bits");
		v = tec.nextInt();
		
		converter(v);

	}
	public static void converter(int v) {
		int base = 1, decimal = 0;
		for(int i = 0; i < 8; i++) {
			switch(v % 10) {
				case 1: 
					decimal += base;
					base = base * 2;
				break;
				default:
					base = base * 2;
			}
			v = v / 10;
		}
		System.out.print(decimal+" ");
	}
}
