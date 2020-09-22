
public class arreglomultidimensional {

	public static void main(String[] args) {
		// declarar e inicializar
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
//		primera posición es el arreglo y la segunda es la posición
		System.out.println(arr[2][1]);
		System.out.println(arr[0][0]);
		
		// otra forma
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
