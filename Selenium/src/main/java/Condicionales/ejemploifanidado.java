package Condicionales;

public class ejemploifanidado {

	public static void main(String[] args) {
		int temperatura = 2;
		if(temperatura > 15) {
			if(temperatura > 25) {
				System.out.print("A la playa");
			}else {
				System.out.println("A la montaña");
			}
		}else {
			System.out.println("A descansar");
		}

	}

}
