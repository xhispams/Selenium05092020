package ClasesyObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		//Asignando alores a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
//		calcular rango
		rango = minivan.capacidad *minivan.kmh;
		
		System.out.println("La minivan puede llevar "+ minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
	}

}
