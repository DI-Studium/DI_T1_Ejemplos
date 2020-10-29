package es.studium.Ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Ejemplo05_EventoSwing_v3 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton botonES, botonIN, botonFR;
	public Ejemplo05_EventoSwing_v3()
	{
		setLayout(new FlowLayout());
		botonES = new JButton(new ImageIcon("./es.jpg"));
		botonIN = new JButton(new ImageIcon("./in.png"));
		botonFR = new JButton();
		botonFR.setIcon(new ImageIcon("./fr.png"));
		
		add(botonES);
		botonES.setSize(50, 50);
		add(botonIN);
		add(botonFR);
		botonES.addActionListener(this);
		botonIN.addActionListener(this);
		botonFR.addActionListener(this);
		setSize(150, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o.equals(botonES))
		{
			System.out.println("¡Viva España!");
		}
		else if(o.equals(botonIN))
		{
			System.out.println("God save The Queen!");
		}
		else
		{
			System.out.println("Equalité, Fraternité et Liberté!");
		}
	}
	public static void main(String[] args)
	{
		new Ejemplo05_EventoSwing_v3();
	}
}