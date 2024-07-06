package SnakeGame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame implements ActionListener {

    JButton button;
    Image startBackgroundImage;
    ImageIcon start;
    JLabel label;


    GameFrame() {

//		this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600, 600);
        startBackgroundImage = new ImageIcon("SnakeGame_Images/snakebg.png").getImage();
        this.setIconImage(startBackgroundImage);
        start = new ImageIcon("SnakeGame_Images/play.png");
//		
//		label = new JLabel();
//		label.setIcon(start);
//		label.setBounds(0,0,100,100);


        this.setVisible(true);
        this.setLocationRelativeTo(null);
//		this.add(label);

    }

	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D)g;
		
//		startBackgroundImage = new ImageIcon("SnakeGame_Images/snakebg.png").getImage();
//		g2D.drawImage(startBackgroundImage, 0, 0,null);
		
//		start = new ImageIcon("SnakeGame_Images/play.png").getImage();
//		g2D.drawImage(start, 50, 50, null);
		
		
	}

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
