import java.util.*;
public class Ex_1_Normal {

	public static void main(String[] args) {
		
		int[] y = new int[10];
		gerar(y);
		somar(y);
	}
	public static void gerar(int[] y) {
		Random gen = new Random();
		for(int i = 0; i < y.length; i++) {
			y[i] = gen.nextInt(2);
			System.out.print(y[i]+" ");
		}
		System.out.println();
	}
	public static void somar(int[] y) {
		int aux = 0;
		for(int i = 0; i < 10; i++) {
			aux += y[i];
		}
		System.out.println(aux);

	}
	
}

