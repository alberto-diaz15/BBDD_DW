package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
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
	}
}
