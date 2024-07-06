package Bro_codes_java_reloaded;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class SliderDemo implements ChangeListener{
	
	JFrame frame ;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); 	// this constructor takes three values -- starting_point | end_point | start from(default location)
		
		slider.setPreferredSize(new Dimension(400,200));	// adding width and height of the slider
		
		slider.setPaintTicks(true);			// to add ticks (points) it is needed -- like mm  in rular(scale) 
		slider.setMinorTickSpacing(10);		// add points in this difference 
		
		slider.setPaintTrack(true);			// to add track (big marks ) it is needed == like inches in scale (rular)
		slider.setMajorTickSpacing(25);		// add marks in this differnce
		
		slider.setPaintLabels(true); 		//  IMPORTANT______to show the number on marks 
		
		slider.setFont(new Font("MV Boli" , Font.PLAIN,15));
		slider.addChangeListener(this);			// add change listener to listen a value when it changes
		
		slider.setOrientation(SwingConstants.VERTICAL);
//		slider.setOrientation(SwingConstants.HORIZONTAL);
		
		label.setText(slider.getValue()+"°C");
		label.setFont(new Font("MV Boli" , Font.PLAIN,25));
		
		panel.add(slider);		// adding slider to the pannel
		panel.add(label);		// adding label to the pannel
		frame.add(panel);		// adding panel to the frame
		frame.setSize(400,400);	// set the size of frame
		frame.setVisible(true);	// make sure the visibility is true - otherwise it run  in the background
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText(slider.getValue()+"°C");	// set value when changeListener detects any change on the frame		
		
	}
}

public class Sh_41_Slider {
	public static void main(String[] args) {
		
		// JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track
		
		SliderDemo sliderDemo = new SliderDemo();
		
	}
}
