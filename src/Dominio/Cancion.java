package Dominio;

public class Cancion {
	private int id;
	private String nombrePais;
	private String tituloCancion; 
	private String nombreArtista;
	private String generoArtista;
	private String generoMusical;
	private String continente;
	private String streams;
	private String ganancia;

	public Cancion(int id, String nombrePais, String tituloCancion, String nombreArtista, String generoArtista,
			String generoMusical, String continente, String streams, String ganancia) {
		super();
		this.id = id;
		this.nombrePais = nombrePais;
		this.tituloCancion = tituloCancion;
		this.nombreArtista = nombreArtista;
		this.generoArtista = generoArtista;
		this.generoMusical = generoMusical;
		this.continente = continente;
		this.streams = streams;
		this.ganancia = ganancia;
	}

	public String getGeneroArtista() {
		return generoArtista;
	}

	public void setGeneroArtista(String generoArtista) {
		this.generoArtista = generoArtista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public String getTituloCancion() {
		return tituloCancion;
	}

	public void setTituloCancion(String tituloCancion) {
		this.tituloCancion = tituloCancion;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getStreams() {
		return streams;
	}

	public void setStreams(String streams) {
		this.streams = streams;
	}

	public String getGanancia() {
		return ganancia;
	}

	public void setGanancia(String ganancia) {
		this.ganancia = ganancia;
	}

	@Override
	public String toString() {
		return tituloCancion + " - " + nombreArtista + ", " +generoArtista+ ", "+ nombrePais + ", " + continente + ", " + generoMusical
				+ ", " + streams + ", " + ganancia;
	}

}
