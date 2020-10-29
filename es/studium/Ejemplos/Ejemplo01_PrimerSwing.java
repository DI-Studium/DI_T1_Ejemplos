package es.studium.Ejemplos;
import javax.swing.JFrame;
public class Ejemplo01_PrimerSwing extends JFrame
{
	private static final long serialVersionUID = 1L;
	// Constructor
	public Ejemplo01_PrimerSwing()
	{
		setTitle("Ejemplo 1");
		setSize(200,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Ejemplo01_PrimerSwing();
	}

}
