package es.studium.Ejemplos;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Ejemplo01_PrimerSwing_v3
{
	// Constantes y componentes (objetos)
	Container panel;
	JButton miBoton;
	// Constructor
	public Ejemplo01_PrimerSwing_v3()
	{
		JFrame ventanaJ = new JFrame("Ejemplo 1");
		miBoton = new JButton("Aceptar");
		panel = ventanaJ.getContentPane();
		panel.add(miBoton);
		ventanaJ.setSize(200,100);
		ventanaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaJ.setVisible(true);
	}
	public static void main(String args[])
	{
		new Ejemplo01_PrimerSwing_v3();
	}
}