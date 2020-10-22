package es.fempa.dam.programacionjava;

import java.util.Scanner;

public class EjercicioFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//	
//	System.out.println("Elige un número: ");
//	int numero = Integer.parseInt(sc.nextLine());
//	System.out.println("Hacer factorial de "+ numero);
//	for(
//	
//		int factorial=1;
//        int num;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce un número: ");
//        num = sc.nextInt();
//        for (int i = num; i > 0; i--) {
//            factorial = factorial * i;
//        }
//        System.out.println("El factorial de " + num + " es: " + factorial);
//    }
//}

	int num;
	int acumulador = 1;
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduce un número: ");
	num = sc.nextInt();
	for(int i = 1; i <= num; i++){
	acumulador = acumulador * i;
		}
	System.out.println("El factorial de " + num + " es: " + acumulador);
	}
}


