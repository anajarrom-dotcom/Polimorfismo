package Mostrar;

import java.util.Scanner;

import Mostrar.clases.Animal;
import Mostrar.clases.Figura;
import Mostrar.clases.Perro;
import Mostrar.clases.Rectangulo;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Animal y perro");
		System.out.println("2.Figura y rectangulo");
		System.out.println("");
		System.out.println("");
	
		int opcion = sc.nextInt();
		switch( opcion) {
		case  1:
			ejercicio1();
			break;
		case 2:
			ejercico2();
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
	}
	


