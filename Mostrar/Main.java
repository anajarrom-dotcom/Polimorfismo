package Mostrar;

import java.util.Scanner;
import Mostrar.clases.Animal;
import Mostrar.clases.Empleado;
import Mostrar.clases.Figura;
import Mostrar.clases.Perro;
import Mostrar.clases.Rectangulo;
import Mostrar.clases.Vendedor;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Animal y perro");
		System.out.println("2.Figura y rectangulo");
		System.out.println("3.Empleado y vendedor");
		System.out.println("");
	
		int opcion = sc.nextInt();
		switch( opcion) {
		case  1:
			ejercicio1();
			break;
		case 2:
			ejercico2();
			break;
		case 3:
			ejercicio3();
			break;
		}
		}
	public static void ejercicio1() {
		
		Animal animal = new Perro();
		animal.hacerSonido();
	}
	
	public static void ejercico2() {
		Figura figura = new Rectangulo(15, 20);
		System.out.println("El area es: " + figura.area());
	}
	
	public static void ejercicio3() {
		Empleado empleado = new Vendedor("Lucas", 4500);
		
		System.out.println(empleado.resumen());
	}
	}
	


