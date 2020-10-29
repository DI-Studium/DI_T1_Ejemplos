package es.studium.Ejemplos;
import javax.swing.JFrame;
public class Ejemplo01_PrimerSwing_v2
{
	// Constructor
	public Ejemplo01_PrimerSwing_v2()
	{
		JFrame ventanaJ = new JFrame("Ejemplo 1 v2");
		ventanaJ.setSize(200,100);
		ventanaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaJ.setVisible(true);
	}
	public static void main(String args[])
	{
		new Ejemplo01_PrimerSwing_v2();
	}
}