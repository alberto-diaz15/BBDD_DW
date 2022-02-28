package Dominio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GestorCanciones {
	public static List<Cancion> leerCanciones() throws JSONException {
		JSONObject obj;
		try {
			JSONTokener tokener = new JSONTokener(new FileReader(System.getProperty("user.dir") + "\\src\\datos.json"));
			obj = new JSONObject(tokener);
			obj.getJSONObject("canciones");
			obj.getInt("numCanciones");
		} catch (FileNotFoundException e) {
			System.out.println("\nERROR: El archivo datos.json no se ha encontrado.");
			return null;
		} catch (JSONException e) {
			System.out.println("\nERROR: El formato del archivo datos.json no es valido.");
			return null;
		}
		List<Cancion> canciones = new ArrayList<Cancion>();
		for (int i = 0; i < obj.getInt("numCanciones"); i++) {
			JSONObject pAux = obj.getJSONObject("canciones").getJSONObject(String.valueOf(i));
			Cancion paisAux = new Cancion(pAux.getInt("id"), pAux.getString("Country"), pAux.getString("Song"),
					pAux.getString("Artist"), pAux.getString("Artist Gender"), pAux.getString("Genre"),
					pAux.getString("Continent"), pAux.getString("Total Spotify Streams Worldwide"),
					pAux.getString("Estimated earnings worldwide"));
			canciones.add(paisAux);
		}
		return canciones;
	}
}
