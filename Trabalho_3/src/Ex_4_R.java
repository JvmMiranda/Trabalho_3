import java.util.*;
public class Ex_4_R {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int v;
		int base = 1, aux = 1;
		int d = 0;
		System.out.println("Informe um valor em binário");
		v = tec.nextInt();
		
		System.out.print(converter(v, base, aux, d));

	}
	public static int converter(int v, int base, int aux, int d) {
		if(aux == 10) {
			return d;
		}else{
			if(v % 10 == 1) {
				d += base;
				return converter(v / 10 , base * 2, aux + 1, d);
			}else {
				return converter(v / 10 , base * 2, aux + 1, d);
			}
		}
	}
}