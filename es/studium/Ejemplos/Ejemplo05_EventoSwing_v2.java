package es.studium.Ejemplos;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
public class Ejemplo05_EventoSwing_v2 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JToggleButton boton;
	public Ejemplo05_EventoSwing_v2()
	{
		setLayout(new FlowLayout());
		boton = new JToggleButton("Activar");
		add(boton);
		boton.addActionListener(this);
		setSize(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(boton.isSelected())
		{
			Toolkit.getDefaultToolkit().beep();
			boton.setText("Desactivar");
		}
		else
		{
			Toolkit.getDefaultToolkit().beep();
			boton.setText("Activar");
		}
	}
	public static void main(String[] args)
	{
		new Ejemplo05_EventoSwing_v2();
	}
}