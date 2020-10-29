package es.studium.Ejemplos;

import javax.swing.JFrame;
public class Ejemplo04_DibujoSwing extends JFrame
{
	private static final long serialVersionUID = 1L;
	public Ejemplo04_DibujoSwing()
	{
		setTitle("Ejemplo de dibujo");
		add(new Ejemplo04_MiPanel());
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejemplo04_DibujoSwing();
	}
}
