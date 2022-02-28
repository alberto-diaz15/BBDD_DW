package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
<<<<<<< HEAD
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class dashboard {

	private JFrame frame;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFiltrar = new JLabel("Filtrar por:");
		lblFiltrar.setBounds(579, 37, 69, 14);
		frame.getContentPane().add(lblFiltrar);
		
		JLabel lblContinente = new JLabel("Continente:");
		lblContinente.setBounds(579, 70, 65, 14);
		frame.getContentPane().add(lblContinente);
		
		JLabel lblIngresos = new JLabel("Reproducciones:");
		lblIngresos.setBounds(579, 170, 93, 14);
		frame.getContentPane().add(lblIngresos);
		
		JSlider slider = new JSlider();
		slider.setBounds(579, 187, 200, 26);
		frame.getContentPane().add(slider);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 37, 549, 413);
		frame.getContentPane().add(panel);
		
		JRadioButton rdAsia = new JRadioButton("Asia");
		rdAsia.setBounds(579, 109, 45, 23);
		frame.getContentPane().add(rdAsia);
		
		JRadioButton rdEuropa = new JRadioButton("Europa");
		rdEuropa.setBounds(579, 86, 59, 23);
		frame.getContentPane().add(rdEuropa);
		
		JRadioButton rdAmericaC = new JRadioButton("Am\u00E9rica Central");
		rdAmericaC.setBounds(669, 109, 101, 23);
		frame.getContentPane().add(rdAmericaC);
		
		JRadioButton rdAmericaN = new JRadioButton("Am\u00E9rica del Norte");
		rdAmericaN.setBounds(669, 86, 111, 23);
		frame.getContentPane().add(rdAmericaN);
		
		JRadioButton rdOceania = new JRadioButton("Ocean\u00EDa");
		rdOceania.setBounds(579, 132, 65, 23);
		frame.getContentPane().add(rdOceania);
		
		JRadioButton rdAmericaS = new JRadioButton("Am\u00E9rica del Sur");
		rdAmericaS.setBounds(669, 132, 99, 23);
		frame.getContentPane().add(rdAmericaS);
		
		JLabel lblGenero = new JLabel("G\u00E9nero musical:");
		lblGenero.setBounds(579, 224, 93, 14);
		frame.getContentPane().add(lblGenero);
		
		JRadioButton rdEDM = new JRadioButton("EDM");
		rdEDM.setBounds(579, 241, 81, 23);
		frame.getContentPane().add(rdEDM);
		
		JRadioButton rdPop = new JRadioButton("Pop");
		rdPop.setBounds(579, 267, 81, 23);
		frame.getContentPane().add(rdPop);
		
		JRadioButton rdReggaeton = new JRadioButton("Reggaeton");
		rdReggaeton.setBounds(669, 241, 109, 23);
		frame.getContentPane().add(rdReggaeton);
		
		JRadioButton rdHiphop = new JRadioButton("Hip-Hop");
		rdHiphop.setBounds(579, 293, 81, 23);
		frame.getContentPane().add(rdHiphop);
		
		JRadioButton rdLatPop = new JRadioButton("Latin Pop");
		rdLatPop.setBounds(669, 267, 109, 23);
		frame.getContentPane().add(rdLatPop);
		
		JRadioButton rdLatTrap = new JRadioButton("Latin Trap");
		rdLatTrap.setBounds(669, 293, 109, 23);
		frame.getContentPane().add(rdLatTrap);
		
		JRadioButton rdRock = new JRadioButton("Rock");
		rdRock.setBounds(579, 319, 81, 23);
		frame.getContentPane().add(rdRock);
		
		JLabel lblArtista = new JLabel("G\u00E9nero del artista");
		lblArtista.setBounds(579, 356, 109, 14);
		frame.getContentPane().add(lblArtista);
		
		JRadioButton rdHombre = new JRadioButton("Hombre");
		rdHombre.setBounds(579, 373, 81, 23);
		frame.getContentPane().add(rdHombre);
		
		JRadioButton rdMujer = new JRadioButton("Mujer");
		rdMujer.setBounds(669, 373, 109, 23);
		frame.getContentPane().add(rdMujer);
		
		JRadioButton rdMixto = new JRadioButton("Mixto");
		rdMixto.setBounds(579, 399, 69, 23);
		frame.getContentPane().add(rdMixto);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
=======
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
	private JRadioButton rdRock;
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
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFiltrar = new JLabel("Filtrar por");
		lblFiltrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFiltrar.setBounds(579, 37, 69, 14);
		frame.getContentPane().add(lblFiltrar);
		
		JLabel lblContinente = new JLabel("Continente:");
		lblContinente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContinente.setBounds(589, 58, 65, 14);
		frame.getContentPane().add(lblContinente);
		
		JLabel lblIngresos = new JLabel("Ingresos ($):");
		lblIngresos.setBounds(589, 150, 93, 14);
		frame.getContentPane().add(lblIngresos);
		
		rdAsia = new JRadioButton("Asia");
		rdAsia.setBounds(589, 97, 45, 23);
		frame.getContentPane().add(rdAsia);
		
		rdEuropa = new JRadioButton("Europa");
		rdEuropa.setBounds(589, 74, 59, 23);
		frame.getContentPane().add(rdEuropa);
		
		rdAmericaC = new JRadioButton("Am\u00E9rica Central");
		rdAmericaC.setBounds(679, 97, 101, 23);
		frame.getContentPane().add(rdAmericaC);
		
		rdAmericaN = new JRadioButton("Am\u00E9rica del Norte");
		rdAmericaN.setBounds(679, 74, 111, 23);
		frame.getContentPane().add(rdAmericaN);
		
		rdOceania = new JRadioButton("Ocean\u00EDa");
		rdOceania.setBounds(589, 120, 65, 23);
		frame.getContentPane().add(rdOceania);
		
		rdAmericaS = new JRadioButton("Am\u00E9rica del Sur");
		rdAmericaS.setBounds(679, 120, 99, 23);
		frame.getContentPane().add(rdAmericaS);
		
		JLabel lblGenero = new JLabel("G\u00E9nero musical:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGenero.setBounds(589, 212, 93, 14);
		frame.getContentPane().add(lblGenero);
		
		rdEDM = new JRadioButton("EDM");
		rdEDM.setBounds(589, 229, 81, 23);
		frame.getContentPane().add(rdEDM);
		
		rdPop = new JRadioButton("Pop");
		rdPop.setBounds(589, 255, 81, 23);
		frame.getContentPane().add(rdPop);
		
		rdReggaeton = new JRadioButton("Reggaeton");
		rdReggaeton.setBounds(679, 229, 109, 23);
		frame.getContentPane().add(rdReggaeton);
		
		rdHiphop = new JRadioButton("Hip-Hop");
		rdHiphop.setBounds(589, 281, 81, 23);
		frame.getContentPane().add(rdHiphop);
		
		rdLatPop = new JRadioButton("Latin Pop");
		rdLatPop.setBounds(679, 255, 109, 23);
		frame.getContentPane().add(rdLatPop);
		
		rdLatTrap = new JRadioButton("Latin Trap");
		rdLatTrap.setBounds(679, 281, 109, 23);
		frame.getContentPane().add(rdLatTrap);
		
		rdRock = new JRadioButton("Rock");
		rdRock.setBounds(589, 307, 81, 23);
		frame.getContentPane().add(rdRock);
		
		JLabel lblArtista = new JLabel("Género del artista:");
		lblArtista.setBounds(589, 344, 109, 14);
		frame.getContentPane().add(lblArtista);
		
		rdHombre = new JRadioButton("Hombre");
		rdHombre.setBounds(589, 361, 81, 23);
		frame.getContentPane().add(rdHombre);
		
		rdMujer = new JRadioButton("Mujer");
		rdMujer.setBounds(679, 361, 109, 23);
		frame.getContentPane().add(rdMujer);
		
		rdBanda = new JRadioButton("Banda");
		rdBanda.setBounds(589, 387, 69, 23);
		frame.getContentPane().add(rdBanda);
		
		textFieldIngresosMin = new JTextField();
		textFieldIngresosMin.setText("0");
		textFieldIngresosMin.setBounds(599, 175, 86, 20);
		frame.getContentPane().add(textFieldIngresosMin);
		textFieldIngresosMin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(689, 175, 21, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldIngresosMax = new JTextField();
		textFieldIngresosMax.setText("15000000");
		textFieldIngresosMax.setColumns(10);
		textFieldIngresosMax.setBounds(702, 175, 86, 20);
		frame.getContentPane().add(textFieldIngresosMax);
		
		btnAplicarFiltros = new JButton("Aplicar filtros");
		btnAplicarFiltros.addActionListener(new BtnAplicarFiltrosActionListener());
		btnAplicarFiltros.setBounds(589, 420, 109, 23);
		frame.getContentPane().add(btnAplicarFiltros);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 28, 537, 415);
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
					| rdRock.isSelected() | rdLatPop.isSelected() | rdLatTrap.isSelected()) {
				if (rdEDM.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Electronic/Dance"))
					generoMusicalAux = true;
				if (rdPop.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Pop"))
					generoMusicalAux = true;
				if (rdHiphop.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Hip Hop/Rap"))
					generoMusicalAux = true;
				if (rdReggaeton.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Reggaeton"))
					generoMusicalAux = true;
				if (rdRock.isSelected() & !generoMusicalAux & cancionAux.getGeneroMusical().equals("Rock"))
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
>>>>>>> branch 'main' of https://github.com/alberto-diaz15/BBDD_DW
	}
}
