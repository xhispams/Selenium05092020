package arrays;

public class arreglounidimensional {

	public static void main(String[] args) {
//		Distintos tipos de declaración de arreglos
		int intArray[];
		int[] intArray2;
		
		String[] arr;
		
//		inicializando elementos del arreglo
		arr = new String[5];
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
//		accediendo a la información que contiene las posiciones del arreglo
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en la posición " +i + " es : " +arr[i]);
		}

//		Otra forma de declarar el array es esta
		String[] sArray = new String[] {"rojo", "azul", "verde", "amarillo", "plomo" };
			for(int i = 0; i < sArray.length; i++) {
				System.out.println("Elemento en la posición "+ i +" es : " +sArray[i]);
	}
//			Ejemplo con enteros
		int[] intArray1 = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i = 0; i < intArray1.length; i++) {
			System.out.println("Elemento en la posición "+ i +" es : " +intArray1[i]);
}
		

	}

}
