package Mostrar;

import java.util.Scanner;
import Mostrar.clases.Animal;
import Mostrar.clases.Avion;
import Mostrar.clases.CuentaAhorro;
import Mostrar.clases.Cuentaa;
import Mostrar.clases.Empleado;
import Mostrar.clases.Estudiante;
import Mostrar.clases.Figura;
import Mostrar.clases.Guitarra;
import Mostrar.clases.Instrumento;
import Mostrar.clases.Motocicleta;
import Mostrar.clases.Perro;
import Mostrar.clases.Persona;
import Mostrar.clases.Producto;
import Mostrar.clases.ProductoDigital;
import Mostrar.clases.Rectangulo;
import Mostrar.clases.Trabajador;
import Mostrar.clases.TrabajadorPorHora;
import Mostrar.clases.Transporte;
import Mostrar.clases.Vehiculo;
import Mostrar.clases.Vendedor;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Animal y perro");
		System.out.println("2.Figura y rectangulo");
		System.out.println("3.Empleado y vendedor");
		System.out.println("4.Cuenta y CuentaAhorro");
		System.out.println("5.Transporte y Avion");
		System.out.println("6.Persona y Estudiante");
		System.out.println("7.Vehiculo y Motocicleta");
		System.out.println("8.Producto y ProductoDigital");
		System.out.println("9.Instrumento y Guitarra");
		System.out.println("10.Trabajador y TrabajadorPorHora");
		
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
		case 4:
			ejercicio4();
			break;
		case 5:
			ejercicio5();
			break;
		case 6:
			ejercicio6();
			break;
		case 7:
			ejercicio7();
			break;
		case 8:
			ejercicio8();
			break;
		case 9:
			ejercicio9();
			break;
		case 10:
			ejercicio10();
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
	
	public static void ejercicio4() {
		
		Cuentaa micuenta = new CuentaAhorro(1400);
	
	System.out.println(micuenta.depositar(0));
	}
	
	public static void ejercicio5() {
		
		Transporte transporte = new Avion();
		
		transporte.moverse();
	}
	
	public static void ejercicio6() {
		
		Persona persona = new Estudiante("Antony", "0905-25-11238", "Ingenieria en sistemas de informacion y ciencias de la computacion");
		persona.presentarse();
	}
	
	public static void ejercicio7() {
		
		Vehiculo vehiculo = new Motocicleta();
		vehiculo.encender();
	}
	
	public static void ejercicio8() {
		
		Producto producto = new ProductoDigital("Don JUlio Real", 2500);
		producto.mostrarDescripccion();
	}
	
	public static void ejercicio9() {
		Instrumento instrumento = new Guitarra();
		instrumento.tocar();
	}
	
	public static void ejercicio10() {
		Trabajador trabajador = new TrabajadorPorHora(5);
		System.out.println(trabajador.calcularPago());
	}
	}
	//en este trabajo se aplicaron los conceptos de herencia, sobreeescritura de 
    //metodos y polimorfismo mediante la creacion de distintas clases relacionadas entre si.
    //primero defiia la clase padre con sus atributos y metodos luego creaba las clases hijas que heredaban
    // esos atributos y sobreescribia los metodos.
    //Esto me permitia comprender como reutilzar codigo y como especializar funciones que sirven en ambas.


