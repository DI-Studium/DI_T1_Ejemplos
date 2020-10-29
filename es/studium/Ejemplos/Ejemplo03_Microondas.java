package es.studium.Ejemplos;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Ejemplo03_Microondas extends JFrame
{
	private static final long serialVersionUID = 1L;
	public Ejemplo03_Microondas()
	{
		setTitle("Horno microondas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		//Declaramos el panel 1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 3));
		for(int i = 1; i <= 9; i++)
		{
			p1.add(new JButton("" + i));
		}
		p1.add(new JButton("" + 0));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));
		//Declaramos el panel 2
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(new JTextField("Aquí el tiempo"),BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);

		add(p2, BorderLayout.EAST);
		//Añadimos al JFrame en el centro el boton "Aquí la comida".
		add(new Button("Aquí la comida"),BorderLayout.CENTER);
		setSize(400, 250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejemplo03_Microondas();
	}
}