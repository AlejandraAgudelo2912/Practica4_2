
public class Ejemplo02 {
	public static void main (String[]arvs) {
		int [] n= {1,0,3,8,5,6,7};
		listarNumeros(n);
		n = ordenarNumeros(n,true);
		listarNumeros(n);	
		n = ordenarNumeros(n, false);
		listarNumeros(n);
	}
	public static void listarNumeros(int[]n) {
		System.out.println("\n\nNúmeros\n----------");
		for  (int i =0; i<n.length;i++) {
			System.out.print(n[i]+" ");

		}
	}
	public static int [] ordenarNumeros(int []n, boolean ascendente) {
		for (int i=1; i<=n.length;i++) {
			for (int j=0; j<n.length-i;j++) {
				if(ascendente && n[j]>n[j+1]|| !ascendente && n[j]<n[j+1]) {
					int aux = n[j];
					n[j]=n[j+1];
					n[j+1]=aux;
				}
			}
		}
		return n;
	}
	
}

