package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import Dominio.Cancion;
import Dominio.GestorCanciones;
import javax.swing.JScrollPane;

public class dashboard {

	private JFrame frame;
	private JTextField textFieldIngresosMin;
	private JTextField textFieldIngresosMax;
	private JRadioButton rdEuropa;
	private JRadioButton rdAmericaN;
	private JRadioButton rdAsia;
	private JRadioButton rdAmericaC;
	private JRadioButton rdOceania;
	private JRadioButton rdAmericaS;
	private JRadioButton rdEDM;
	private JRadioButton rdPop;
	private JRadioButton rdHiphop;
	private JRadioButton rdLatTrap;
	private JRadioButton rdLatPop;
	private JRadioButton rdReggaeton;
	private JRadioButton rdHombre;
	private JRadioButton rdMujer;
	private JRadioButton rdBanda;
	private JButton btnAplicarFiltros;
	private List<Cancion> canciones = new ArrayList<Cancion>();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard window = new dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		canciones = GestorCanciones.leerCanciones();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1025, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFiltrar = new JLabel("Filtrar por");
		lblFiltrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFiltrar.setBounds(755, 37, 69, 14);
		frame.getContentPane().add(lblFiltrar);
		
		JLabel lblContinente = new JLabel("Continente:");
		lblContinente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContinente.setBounds(765, 58, 93, 14);
		frame.getContentPane().add(lblContinente);
		
		JLabel lblIngresos = new JLabel("Ingresos ($):");
		lblIngresos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngresos.setBounds(765, 155, 93, 14);
		frame.getContentPane().add(lblIngresos);
		
		rdAsia = new JRadioButton("Asia");
		rdAsia.setBounds(765, 97, 81, 23);
		frame.getContentPane().add(rdAsia);
		
		rdEuropa = new JRadioButton("Europa");
		rdEuropa.setBounds(765, 74, 81, 23);
		frame.getContentPane().add(rdEuropa);
		
		rdAmericaC = new JRadioButton("Centroam\u00E9rica");
		rdAmericaC.setBounds(855, 97, 111, 23);
		frame.getContentPane().add(rdAmericaC);
		
		rdAmericaN = new JRadioButton("Norteam\u00E9rica");
		rdAmericaN.setBounds(855, 74, 111, 23);
		frame.getContentPane().add(rdAmericaN);
		
		rdOceania = new JRadioButton("Ocean\u00EDa");
		rdOceania.setBounds(765, 120, 81, 23);
		frame.getContentPane().add(rdOceania);
		
		rdAmericaS = new JRadioButton("Sudam\u00E9rica");
		rdAmericaS.setBounds(855, 120, 99, 23);
		frame.getContentPane().add(rdAmericaS);
		
		JLabel lblGenero = new JLabel("G\u00E9nero musical:");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGenero.setBounds(765, 212, 93, 14);
		frame.getContentPane().add(lblGenero);
		
		rdEDM = new JRadioButton("EDM");
		rdEDM.setBounds(765, 229, 81, 23);
		frame.getContentPane().add(rdEDM);
		
		rdPop = new JRadioButton("Pop");
		rdPop.setBounds(765, 255, 81, 23);
		frame.getContentPane().add(rdPop);
		
		rdReggaeton = new JRadioButton("Reggaeton");
		rdReggaeton.setBounds(855, 229, 109, 23);
		frame.getContentPane().add(rdReggaeton);
		
		rdHiphop = new JRadioButton("Hip-Hop");
		rdHiphop.setBounds(765, 281, 81, 23);
		frame.getContentPane().add(rdHiphop);
		
		rdLatPop = new JRadioButton("Latin Pop");
		rdLatPop.setBounds(855, 255, 109, 23);
		frame.getContentPane().add(rdLatPop);
		
		rdLatTrap = new JRadioButton("Latin Trap");
		rdLatTrap.setBounds(855, 281, 109, 23);
		frame.getContentPane().add(rdLatTrap);
		
		JLabel lblArtista = new JLabel("G\u00E9nero del artista:");
		lblArtista.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArtista.setBounds(765, 323, 131, 14);
		frame.getContentPane().add(lblArtista);
		
		rdHombre = new JRadioButton("Hombre");
		rdHombre.setBounds(765, 340, 81, 23);
		frame.getContentPane().add(rdHombre);
		
		rdMujer = new JRadioButton("Mujer");
		rdMujer.setBounds(855, 340, 109, 23);
		frame.getContentPane().add(rdMujer);
		
		rdBanda = new JRadioButton("Banda");
		rdBanda.setBounds(765, 366, 69, 23);
		frame.getContentPane().add(rdBanda);
		
		textFieldIngresosMin = new JTextField();
		textFieldIngresosMin.setText("0");
		textFieldIngresosMin.setBounds(775, 175, 86, 20);
		frame.getContentPane().add(textFieldIngresosMin);
		textFieldIngresosMin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(865, 175, 21, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldIngresosMax = new JTextField();
		textFieldIngresosMax.setText("15000000");
		textFieldIngresosMax.setColumns(10);
		textFieldIngresosMax.setBounds(878, 175, 86, 20);
		frame.getContentPane().add(textFieldIngresosMax);
		
		btnAplicarFiltros = new JButton("Aplicar filtros");
		btnAplicarFiltros.addActionListener(new BtnAplicarFiltrosActionListener());
		btnAplicarFiltros.setBounds(765, 403, 117, 29);
		frame.getContentPane().add(btnAplicarFiltros);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 28, 707, 415);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
                GestorCanciones.devolverCancionesTabla(canciones),
                new String[] {
                    "Titulo", "Artista", "Genero", "Pais", "Reproducciones", "Ingresos"
                }
            ) {
                boolean[] columnEditables = new boolean[] {
                    false, false, false, false, false, false, false, false, false
                };
                public boolean isCellEditable(int row, int column) {
                    return columnEditables[column];
                }
            });
	}
	private class BtnAplicarFiltrosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			List<Cancion> cancionesAux = filtrarCanciones();
			table.setModel(new DefaultTableModel(
					GestorCanciones.devolverCancionesTabla(cancionesAux),
					new String[] {
							"Titulo", "Artista", "Genero", "Pais", "Reproducciones", "Ingresos"}));
		}
	}
	
	public List<Cancion> filtrarCanciones() {
		List<Cancion> listaCancionesAux = new ArrayList<Cancion>();
		Iterator<Cancion> iterador = canciones.iterator();
		boolean continenteAux, generoMusicalAux, generoArtistaAux;
		int gananciasMin, gananciasMax;
		while (iterador.hasNext()) {
			continenteAux = false;
			generoMusicalAux = false;
			generoArtistaAux = false;
			Cancion cancionAux = iterador.next();
			if (rdEuropa.isSelected() | rdAmericaN.isSelected() | rdAsia.isSelected() | rdAmericaS.isSelected()
					| rdAmericaC.isSelected() | rdOceania.isSelected()) {
				if (rdEuropa.isSelected() & !continenteAux & cancionAux.getContinente().equals("Europe"))
					continenteAux = true;
				if (rdAsia.isSelected() & !continenteAux & cancionAux.getContinente().equals("Asia"))
					continenteAux = true;
				if (rdAmericaN.isSelected() & !continenteAux & cancionAux.getContinente().equals("North America"))
					continenteAux = true;
				if (rdAmericaS.isSelected() & !continenteAux & cancionAux.getContinente().equals("South America"))
					continenteAux = true;
				if (rdAmericaC.isSelected() & !continenteAux & cancionAux.getContinente().equals("Central America"))
					continenteAux = true;
				if (rdOceania.isSelected() & !continenteAux & cancionAux.getContinente().equals("Oceania"))
					continenteAux = true;
				if (!continenteAux)
					continue;
			}
			
			if (rdEDM.isSelected() | rdPop.isSelected() | rdHiphop.isSelected() | rdReggaeton.isSelected()
					 | rdLatPop.isSelected() | rdLatTrap.isSelected()) {
				if (rdEDM.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Electronic/Dance"))
					generoMusicalAux = true;
				if (rdPop.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Pop"))
					generoMusicalAux = true;
				if (rdHiphop.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Hip Hop/Rap"))
					generoMusicalAux = true;
				if (rdReggaeton.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Reggaeton"))
					generoMusicalAux = true;
				if (rdLatPop.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Latin Pop"))
					generoMusicalAux = true;
				if (rdLatTrap.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Latin Trap"))
					generoMusicalAux = true;
				if (!generoMusicalAux)
					continue;
			}
			
			if (rdMujer.isSelected() | rdHombre.isSelected() | rdBanda.isSelected()) {
				if (rdMujer.isSelected() & !generoArtistaAux & cancionAux.getGeneroArtista().equals("Female"))
					generoArtistaAux = true;
				if (rdHombre.isSelected() & !generoArtistaAux & cancionAux.getGeneroArtista().equals("Male"))
					generoArtistaAux = true;
				if (rdBanda.isSelected() & !generoArtistaAux & cancionAux.getGeneroArtista().equals("Band"))
					generoArtistaAux = true;
				if (!generoArtistaAux)
					continue;
			}
			
			
			if (textFieldIngresosMin.getText().isEmpty())
				textFieldIngresosMin.setText("0");
			if (textFieldIngresosMax.getText().isEmpty())
				textFieldIngresosMax.setText("15000000");
			if (isNumeric(textFieldIngresosMin.getText().toString())
					& isNumeric(textFieldIngresosMax.getText().toString())) {
				gananciasMin = Integer.parseInt(textFieldIngresosMin.getText().toString());
				gananciasMax = Integer.parseInt(textFieldIngresosMax.getText().toString());
				if(gananciasMin > gananciasMax) {
					int gananciasAux = 0;
					gananciasAux = gananciasMin;
					gananciasMin = gananciasMax;
					gananciasMax = gananciasAux;
				}
				textFieldIngresosMin.setText(String.valueOf(gananciasMin));
				textFieldIngresosMax.setText(String.valueOf(gananciasMax));
				if (Integer.parseInt(cancionAux.getGanancia()) >= gananciasMin
						& Integer.parseInt(cancionAux.getGanancia()) <= gananciasMax)
					listaCancionesAux.add(cancionAux);;
			} else {
				JOptionPane.showMessageDialog(null, "Debe introducir valor numerico en el apartado de ingresos.");
				break;
			}
		}
		return listaCancionesAux;
	}
	
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
