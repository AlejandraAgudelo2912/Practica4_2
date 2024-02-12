package Ejemplo1;

public class Estatica {
	public static int factorial (int n) {
		if (n<0) {
			return -1;
		}
		int num = 1;
		for (int i =1; i<=n;i++) {
			num = num*i;
		}
		return num;
	}
}
