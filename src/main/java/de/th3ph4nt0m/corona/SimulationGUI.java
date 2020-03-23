package de.th3ph4nt0m.corona;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimulationGUI extends JFrame implements ActionListener {
	//private Simulation s;


	//Fenster bauen
	private BackgroundPanel panel;
	private JButton btnNewButton;
	public SimulationGUI() {
		//Simulation s = new Simulation();
		
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Runde simulieren");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(10, 422, 158, 45);
		getContentPane().add(btnNewButton);
		
		Image img=null;
		try {
		    img = ImageIO.read(getClass().getClassLoader().getResource("map_anzeige.png"));
		} 
		catch (IOException e) {
		    e.printStackTrace();
		}
		panel = new BackgroundPanel(img);
		panel.setBounds(178,11,788,454);
		getContentPane().add(panel);
		
		this.setBounds(0, 0, 992, 517);
		this.setVisible(true);
	}
	
	//Daten aus Simulation in Bild zeichnen
	private void updateImage() {
		String text = "740M";
		BufferedImage img=null;
		
		try {
		    img = ImageIO.read(getClass().getClassLoader().getResource("map_anzeige.png"));
		} 
		catch (IOException e) {
		    e.printStackTrace();
		}
        /*
           Because font metrics is based on a graphics context, we need to create
           a small, temporary image so we can ascertain the width and height
           of the final image
         */
        Graphics2D g2d = img.createGraphics();
        Font font = new Font("Arial", Font.PLAIN, 72);
        g2d.setFont(font);
        FontMetrics fm = g2d.getFontMetrics();
        int width = fm.stringWidth(text);
        int height = fm.getHeight();
        g2d.dispose();

        g2d = img.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g2d.setFont(font);
        fm = g2d.getFontMetrics();
        g2d.setColor(Color.BLACK);
        //Daten aus Simulation in Bild zeichnen
        g2d.drawString(text, 2750, 420+fm.getAscent());
        g2d.dispose();
        panel.setImage(img);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimulationGUI s = new SimulationGUI();
		
	}
	
	//Reaktion auf Events
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnNewButton)) {
			updateImage();
		}
	}
}
