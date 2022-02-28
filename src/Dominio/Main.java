package Dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner Teclado = new Scanner(System.in);

	public static void main(String[] args) {
		List<Cancion> canciones = GestorCanciones.leerCanciones();
		List<Cancion> cancionesAux = null;
		boolean salir = false;
		String continente = null;
		String generoMusical = null;
		while (!salir) {
			System.out.println(
					"\nSeleccione la opcion que desea:\n1.Mostrar todas las canciones\n2.Seleccionar por continentes\n3.Seleccionar por genero musical\n4.Salir");
			int opcion = Teclado.nextInt();
			switch (opcion) {
			case 1:
				cancionesAux = canciones;
				break;
			case 2:
				System.out.println(
						"\nSeleccione el continente por el que quiere filtrar las canciones:\n1.Europe\n2.North America\n3.Central America\n4.South America\n5.Africa\n6.Oceania\n7.Asia");
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
				cancionesAux = seleccionarPorContinente(continente, canciones);
				break;
			case 3:
				System.out.println(
						"Seleccione el genero musical por el que quiere filtrar las canciones:\n1.Hip Hop/Rap\n2.Pop\n3.Electronic/Dance\n4.Reggaeton\n5.Latin Trap\n6.Latin Pop\n7.Rock");
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
				cancionesAux = seleccionarPorGeneroMusical(generoMusical, canciones);
				break;
			case 4:
				cancionesAux.clear();
				System.out.println("Saliendo...");
				salir = true;
				break;
			}
			Iterator<Cancion> iterador = cancionesAux.iterator();
			int i = 0;
			while (iterador.hasNext()) {
				i++;
				System.out.println(i + ". " + iterador.next().toString());
			}
		}
	}

	public static List<Cancion> seleccionarPorContinente(String continente, List<Cancion> canciones) {
		List<Cancion> listacancionesAux = new ArrayList<Cancion>();
		Iterator<Cancion> iterador = canciones.iterator();
		while (iterador.hasNext()) {
			Cancion cancionAux = iterador.next();
			if (cancionAux.getContinente().equals(continente))
				listacancionesAux.add(cancionAux);
		}
		return listacancionesAux;
	} 

	public static List<Cancion> seleccionarPorGeneroMusical(String generoMusical, List<Cancion> canciones) {
		List<Cancion> listacancionesAux = new ArrayList<Cancion>();
		Iterator<Cancion> iterador = canciones.iterator();
		while (iterador.hasNext()) {
			Cancion cancionAux = iterador.next();
			if (cancionAux.getGeneroMusical().equals(generoMusical))
				listacancionesAux.add(cancionAux);
		}
		return listacancionesAux;
	}
}
