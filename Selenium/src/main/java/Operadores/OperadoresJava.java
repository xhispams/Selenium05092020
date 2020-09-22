package Operadores;

public class OperadoresJava {

	public static void main(String[] args) {
//    	operadores 
    	int x = 7;
    	int z = 8;
    	int a = 8;
    	int b = 8;
    	
    	if(x == z && a == b) {
    		System.out.println("los valores son iguales");
    	}else {
    		System.out.println("los valores son diferentes");
    		
    		String mensaje = "claro";
    		
    		if(mensaje.contains("claro") && a == b) {
        		System.out.println("es verdadero");
        	}else {
        		System.out.println("falso");
    	
            	//Operadores Aritmeticas
            	int xy = 1;
            	int yz = 2;
            	int resultado;
            	
            	resultado = xy + yz ;
            	System.out.println(resultado);
            	
            	
            	//Operadores Unitarios
            	int valor11= 3;
            	System.out.println("valor1 es igual a : " +  valor11);
            	int incrementar = ++valor11;
            	
            	System.out.println("incrementar es igual a : " + incrementar);
            	
            	
            	int valor111= 3;
            	System.out.println("valor1 es igual a : " +  valor111);
            	++valor111;
            	
            	System.out.println("incrementar es igual a : " + valor111 );
            	
//            	Operadores relacionales y condicionales
            	int xx = 7;
            	int zz = 7;
            	
            	if(xx != zz) {
            		System.out.println("los valores son iguales");
            	}else {
            		System.out.println("los valores son diferentes");
            	
            	}

        	}
    	}
	}
}


