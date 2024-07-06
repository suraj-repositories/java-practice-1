package CLOCK;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	
//	Calendar calender;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(325,200);
		this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		
		timeLabel= new JLabel();
		timeLabel.setFont(new Font("MS Reference Sans Serif",Font.PLAIN,46));
		timeLabel.setForeground(Color.green);
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("MS Reference Sans Serif",Font.PLAIN,35));
		dayLabel.setForeground(Color.white);
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("MS Reference Sans Serif",Font.PLAIN,30));
		dateLabel.setForeground(Color.white);
		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.getContentPane().setBackground(Color.DARK_GRAY); 
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		while(true) {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
