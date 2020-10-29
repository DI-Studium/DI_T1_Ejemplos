package es.studium.Ejemplos;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Ejemplo05_EventoSwing extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton boton;
	public Ejemplo05_EventoSwing()
	{
		boton = new JButton("Pulsar");
		add(boton);
		boton.addActionListener(this);
		setSize(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Toolkit.getDefaultToolkit().beep();
	}
	public static void main(String[] args)
	{
		new Ejemplo05_EventoSwing();
	}
}