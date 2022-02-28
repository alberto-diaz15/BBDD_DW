package Dominio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GestorCanciones {
	public static List<Pais> leerPaises() throws JSONException {
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
		List<Pais> paises = new ArrayList<Pais>();
		for (int i = 0; i < obj.getInt("numCanciones"); i++) {
			JSONObject pAux = obj.getJSONObject("canciones").getJSONObject(String.valueOf(i));
			Pais paisAux = new Pais(pAux.getInt("id"), pAux.getString("Country"), pAux.getString("Song"), pAux.getString("Artist"),
					pAux.getString("Genre"), pAux.getString("Continent"),
					pAux.getString("Total Spotify Streams Worldwide"), pAux.getString("Estimated earnings worldwide"));
			paises.add(paisAux);
		}
		return paises;
	}
}
