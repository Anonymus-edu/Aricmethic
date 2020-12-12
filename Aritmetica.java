import java.util.Scanner;

public class Aritmetica {
	
	public static void main(String[] args) {

	//TODO Auto-generated method stub
	
	//variables
	//area en la memoria RAM para guardar valores (volátil)
	
	int a; //
	int b; //
	
	int resultado; //es la suma de a+b
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("HOLA");
	System.out.println("");
	System.out.println("Escribe el primer valor");
	
	a = teclado.nextInt();
	
	System.out.println("Escribe el segundo valor");
	
	b = teclado.nextInt();
			
	// realizar cálculo arimético
	resultado = a + b;
	
	teclado.close();
	
	System.out.println(" El resultado de la suma de " + a + "+" + b +" es igual a " + resultado);
	}
}	