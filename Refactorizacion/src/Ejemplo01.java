
public class Ejemplo01 {
	public static void main (String[]arvs) {
		int [] n= {1,0,3,8,5,6,7};
		listarNumeros(n);
		n = ordenarNumeros(n);
		listarNumeros(n);	
	}
	public static void listarNumeros(int[]n) {
		System.out.println("\nNúmeros\n----------");
		for  (int i =0; i<n.length;i++) {
			System.out.println(n[i]);

		}
	}
	public static int [] ordenarNumeros(int []n) {
		for (int i=1; i<=n.length;i++) {
			for (int j=0; j<n.length-i;j++) {
				if(n[j]>n[j+1]) {
					int aux = n[j];
					n[j]=n[j+1];
					n[j+1]=aux;
				}
			}
		}
		return n;
	}
}
