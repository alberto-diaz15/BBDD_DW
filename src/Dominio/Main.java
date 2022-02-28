package Dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner Teclado = new Scanner(System.in);
	public static void main(String[] args) {
		List<Pais> paises = GestorCanciones.leerPaises();
		List<Pais> paisesAux = null;
		boolean salir = false;
		String continente = null;
		String generoMusical = null;
		while (!salir) {
			System.out.println("\nSeleccione la opcion que desea:\n1.Mostrar todas las canciones\n2.Seleccionar por continentes\n3.Seleccionar por genero musical\n4.Salir");
			int opcion = Teclado.nextInt();
			switch (opcion) {
			case 1:
				paisesAux = paises;
				break;
			case 2:
				System.out.println("\nSeleccione el continente por el que quiere filtrar las canciones:\n1.Europe\n2.North America\n3.Central America\n4.South America\n5.Africa\n6.Oceania\n7.Asia");
				opcion = Teclado.nextInt();
				switch (opcion) {
				case 1:
					continente = "Europe";
					break;
				case 2:
					continente = "North America";
					break;
				case 3:
					continente = "Central America";
					break;
				case 4:
					continente = "South America";
					break;
				case 5:
					continente = "Africa";
					break;
				case 6:
					continente = "Oceania";
					break;
				case 7:
					continente = "Asia";
					break;
				}
				paisesAux = seleccionarPorContinente(continente, paises);
				break;
			case 3:
				System.out.println("Seleccione el genero musical por el que quiere filtrar las canciones:\n1.Hip Hop/Rap\n2.Pop\n3.Electronic/Dance\n4.Reggaeton\n5.Latin Trap\n6.Latin Pop\n7.Rock");
				opcion = Teclado.nextInt();
				switch (opcion) {
				case 1:
					generoMusical = "Hip Hop/Rap";
					break;
				case 2:
					generoMusical = "Pop";
					break;
				case 3:
					generoMusical = "Electronic/Dance";
					break;
				case 4:
					generoMusical = "Reggaeton";
					break;
				case 5:
					generoMusical = "Latin Trap";
					break;
				case 6:
					generoMusical = "Latin Pop";
					break;
				case 7:
					generoMusical = "Rock";
					break;
				}
				paisesAux = seleccionarPorGeneroMusical(generoMusical, paises);
				break;
			case 4:
				paisesAux.clear();
				System.out.println("Saliendo...");
				salir = true;
				break;
			}
			Iterator<Pais> iterador = paisesAux.iterator();
			int i = 0;
			while (iterador.hasNext()) {
				i++;
				System.out.println(i + ". " + iterador.next().toString());
			}
		}
	}
	
	public static List<Pais> seleccionarPorContinente(String continente, List<Pais> paises) {
		List<Pais> listaPaisesAux = new ArrayList<Pais>();
		Iterator<Pais> iterador = paises.iterator();
		while (iterador.hasNext()) {
			Pais paisAux = iterador.next();
			if(paisAux.getContinente().equals(continente))
				listaPaisesAux.add(paisAux);
		}
		return listaPaisesAux;
	}
	
	public static List<Pais> seleccionarPorGeneroMusical(String generoMusical, List<Pais> paises) {
		List<Pais> listaPaisesAux = new ArrayList<Pais>();
		Iterator<Pais> iterador = paises.iterator();
		while (iterador.hasNext()) {
			Pais paisAux = iterador.next();
			if(paisAux.getGeneroMusical().equals(generoMusical))
				listaPaisesAux.add(paisAux);
		}
		return listaPaisesAux;
	}
}