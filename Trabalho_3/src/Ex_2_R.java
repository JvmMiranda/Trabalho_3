import java.util.*;
public class Ex_2_R {

	public static void main(String[] args) {
		
		int[] y = new int[10];
		int aux = 0, s = 0;
		preencher(y);
		System.out.println(soma(aux, y, s));
	}
	public static void preencher(int[] y) {
		Random gen = new Random();
		for(int i = 0; i < y.length; i++) {
			y[i] = gen.nextInt(2);
			System.out.print(y[i]+" ");
		}
		System.out.println();
	}
	public static int soma(int aux, int[] y, int s) {
		if( aux == 10) {
			return s;
		}else {
			s += y[aux];
			return soma(aux + 1, y, s);
		}
	}
}
