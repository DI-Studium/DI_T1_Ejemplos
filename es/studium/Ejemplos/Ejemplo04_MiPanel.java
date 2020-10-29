package es.studium.Ejemplos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Ejemplo04_MiPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//Dibuja el texto, en la posion 40,40 contando desde la parte superior izquierda.
		g.drawString("Interfaz gráfica", 40, 40);
	}
}