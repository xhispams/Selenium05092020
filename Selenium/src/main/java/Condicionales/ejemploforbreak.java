package Condicionales;

public class ejemploforbreak {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 8) {
				break;
			}
			System.out.println("i : " +i);
		}
		System.out.println("Ciclo for completo");
	}

}
