import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.border.*;
public class GUI extends JPanel implements ActionListener{


	JFrame frame;
	JMenuBar menuBar;
	JMenu fontMenu,sizeMenu, colorMenu, backgroundColor, outlineColor;
	JMenuItem Serif, Times, Helvetica, twelve, fourteen, sixteen, color1, color2, randColor, bcolor1, bcolor2, bcolor3, noColor, ocolor1, ocolor2, oRand;
	JButton north,south,east, west, reset;
	JPanel buttonPanel;
	JTextArea area;



	public GUI()
	{
		frame = new JFrame();
		frame.add(this);

		area = new JTextArea();


		fontMenu = new JMenu("Font");
		sizeMenu = new JMenu("Size");
		colorMenu = new JMenu("Text Color");
		backgroundColor = new JMenu("Background Color");
		outlineColor = new JMenu("Button Outline Color");

		buttonPanel = new JPanel();
		menuBar = new JMenuBar();

		Serif = new JMenuItem("Serif");Serif.addActionListener(this);
		Times  = new JMenuItem("TNR"); Times.addActionListener(this);
		Helvetica = new JMenuItem("Helvetica");Helvetica.addActionListener(this);
		fontMenu.add(Serif);
		fontMenu.add(Times);
		fontMenu.add(Helvetica);



		twelve = new JMenuItem("12"); twelve.addActionListener(this);
		fourteen = new JMenuItem("14"); fourteen.addActionListener(this);
		sixteen = new JMenuItem("16"); sixteen.addActionListener(this);
		sizeMenu.add(twelve);
		sizeMenu.add(fourteen);
		sizeMenu.add(sixteen);

		color1 = new JMenuItem("Red");color1.addActionListener(this);
		color2 = new JMenuItem("Blue");color2.addActionListener(this);
		randColor = new JMenuItem("Random");randColor.addActionListener(this);
		colorMenu.add(color1);
		colorMenu.add(color2);
		colorMenu.add(randColor);

		bcolor1 = new JMenuItem("Yellow"); bcolor1.addActionListener(this);
		bcolor2 = new JMenuItem("Green"); bcolor2.addActionListener(this);
		bcolor3 = new JMenuItem("Random"); bcolor3.addActionListener(this);
		backgroundColor.add(bcolor1);
		backgroundColor.add(bcolor2);
		backgroundColor.add(bcolor3);

		noColor = new JMenuItem("No Color"); noColor.addActionListener(this);
		ocolor1 = new JMenuItem("Purple"); ocolor1.addActionListener(this);
		ocolor2 = new JMenuItem("Orange"); ocolor2.addActionListener(this);
		oRand = new JMenuItem("Random");oRand.addActionListener(this);
		outlineColor.add(noColor);
		outlineColor.add(ocolor1);
		outlineColor.add(ocolor2);
		outlineColor.add(oRand);



		menuBar.setLayout(new GridLayout(1,2));
		menuBar.add(fontMenu);
		menuBar.add(sizeMenu);
		menuBar.add(colorMenu);
		menuBar.add(backgroundColor);
		menuBar.add(outlineColor);

		buttonPanel.setLayout(new GridLayout(1,5));


		north  = new JButton("North"); north.addActionListener(this);
		south = new JButton("South"); south.addActionListener(this);
		east = new JButton("East"); east.addActionListener(this);
		west = new JButton("West"); west.addActionListener(this);

		north.setBorder(new LineBorder(Color.WHITE));
		south.setBorder(new LineBorder(Color.WHITE));
		east.setBorder(new LineBorder(Color.WHITE));
		west.setBorder(new LineBorder(Color.WHITE));


		reset = new JButton("RESET"); reset.addActionListener(this);
		reset.setBorder(new LineBorder(Color.WHITE));


		buttonPanel.add(north);
		buttonPanel.add(south);
		buttonPanel.add(east);
		buttonPanel.add(west);
		buttonPanel.add(reset);
		buttonPanel.add(menuBar);

		menuBar.setLayout(new GridLayout(6,1));

		frame.add(buttonPanel, BorderLayout.NORTH);
		frame.add(area, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);

		//System.out.print(north.getFont().getFontName());


	}



	public void actionPerformed(ActionEvent e)
	{
		int rand = 0;
		//reset
		if(e.getSource() == reset){
			frame.remove(buttonPanel);
			buttonPanel.setLayout(new GridLayout(1,5));
			frame.add(buttonPanel,BorderLayout.NORTH);
			//font and size
			Font font = new Font("Dialog",Font.BOLD,12);
			north.setFont(font);
			reset.setFont(font);
			south.setFont(font);
			area.setFont(font);
			east.setFont(font);
			west.setFont(font);
			fontMenu.setFont(font);
			sizeMenu.setFont(font);
			colorMenu.setFont(font);
			outlineColor.setFont(font);
			backgroundColor.setFont(font);
			Times.setFont(font);
			Helvetica.setFont(font);
			Serif.setFont(font);
			twelve.setFont(font);
			fourteen.setFont(font);
			sixteen.setFont(font);
			color1.setFont(font);
			color2.setFont(font);
			randColor.setFont(font);
			bcolor1.setFont(font);
			bcolor2.setFont(font);
			bcolor3.setFont(font);
			ocolor1.setFont(font);
			ocolor2.setFont(font);
			noColor.setFont(font);
			oRand.setFont(font);
			//text color
			north.setForeground(Color.BLACK);
			south.setForeground(Color.BLACK);
			area.setForeground(Color.BLACK);
			east.setForeground(Color.BLACK);
			west.setForeground(Color.BLACK);
			reset.setForeground(Color.BLACK);
			fontMenu.setForeground(Color.BLACK);
			sizeMenu.setForeground(Color.BLACK);
			colorMenu.setForeground(Color.BLACK);
			outlineColor.setForeground(Color.BLACK);
			backgroundColor.setForeground(Color.BLACK);
			Times.setForeground(Color.BLACK);
			Helvetica.setForeground(Color.BLACK);
			Serif.setForeground(Color.BLACK);
			twelve.setForeground(Color.BLACK);
			fourteen.setForeground(Color.BLACK);
			sixteen.setForeground(Color.BLACK);
			color1.setForeground(Color.BLACK);
			color2.setForeground(Color.BLACK);
			randColor.setForeground(Color.BLACK);
			bcolor1.setForeground(Color.BLACK);
			bcolor2.setForeground(Color.BLACK);
			bcolor3.setForeground(Color.BLACK);
			ocolor1.setForeground(Color.BLACK);
			ocolor2.setForeground(Color.BLACK);
			noColor.setForeground(Color.BLACK);
			oRand.setForeground(Color.BLACK);
			//area background color reset
			area.setBackground(Color.WHITE);
			//border
			north.setBorder(new LineBorder(Color.WHITE));
			south.setBorder(new LineBorder(Color.WHITE));
			east.setBorder(new LineBorder(Color.WHITE));
			west.setBorder(new LineBorder(Color.WHITE));
			reset.setBorder(new LineBorder(Color.WHITE));
		}
		//button Clicks
		if(e.getSource() == north){
			frame.remove(buttonPanel);
			buttonPanel.setLayout(new GridLayout(1,5));
			frame.add(buttonPanel, BorderLayout.NORTH);
		}
		if(e.getSource() == south){
			frame.remove(buttonPanel);
			buttonPanel.setLayout(new GridLayout(1,5));
			frame.add(buttonPanel, BorderLayout.SOUTH);
		}
		if(e.getSource() == east){
			frame.remove(buttonPanel);
			buttonPanel.setLayout(new GridLayout(6,1));
			frame.add(buttonPanel, BorderLayout.EAST);
		}
		if(e.getSource() == west){
			frame.remove(buttonPanel);
			buttonPanel.setLayout(new GridLayout(6,1));
			frame.add(buttonPanel, BorderLayout.WEST);
		}

		//button outline color
		if(e.getSource() == ocolor1){
			north.setBorder(new LineBorder(Color.MAGENTA));
			south.setBorder(new LineBorder(Color.MAGENTA));
			east.setBorder(new LineBorder(Color.MAGENTA));
			west.setBorder(new LineBorder(Color.MAGENTA));
			reset.setBorder(new LineBorder(Color.MAGENTA));

		}
		if(e.getSource() == ocolor2){
			north.setBorder(new LineBorder(Color.ORANGE));
			south.setBorder(new LineBorder(Color.ORANGE));
			east.setBorder(new LineBorder(Color.ORANGE));
			west.setBorder(new LineBorder(Color.ORANGE));
			reset.setBorder(new LineBorder(Color.ORANGE));
		}
		if(e.getSource() == oRand){
			rand  = (int)(Math.random()*11)+1;

			if(rand == 1){
				north.setBorder(new LineBorder(Color.BLACK));
				south.setBorder(new LineBorder(Color.BLACK));
				east.setBorder(new LineBorder(Color.BLACK));
				west.setBorder(new LineBorder(Color.BLACK));
				reset.setBorder(new LineBorder(Color.BLACK));

			}
			if(rand == 2){
				north.setBorder(new LineBorder(Color.BLUE));
				south.setBorder(new LineBorder(Color.BLUE));
				east.setBorder(new LineBorder(Color.BLUE));
				west.setBorder(new LineBorder(Color.BLUE));
				reset.setBorder(new LineBorder(Color.BLUE));
			}
			if(rand == 3){
				north.setBorder(new LineBorder(Color.CYAN));
				south.setBorder(new LineBorder(Color.CYAN));
				east.setBorder(new LineBorder(Color.CYAN));
				west.setBorder(new LineBorder(Color.CYAN));
				reset.setBorder(new LineBorder(Color.CYAN));
			}
			if(rand == 4){
				north.setBorder(new LineBorder(Color.DARK_GRAY));
				south.setBorder(new LineBorder(Color.DARK_GRAY));
				east.setBorder(new LineBorder(Color.DARK_GRAY));
				west.setBorder(new LineBorder(Color.DARK_GRAY));
				reset.setBorder(new LineBorder(Color.DARK_GRAY));
			}
			if(rand == 5){
				north.setBorder(new LineBorder(Color.GREEN));
				south.setBorder(new LineBorder(Color.GREEN));
				east.setBorder(new LineBorder(Color.GREEN));
				west.setBorder(new LineBorder(Color.GREEN));
				reset.setBorder(new LineBorder(Color.GREEN));
			}
			if(rand == 6){
				north.setBorder(new LineBorder(Color.LIGHT_GRAY));
				south.setBorder(new LineBorder(Color.LIGHT_GRAY));
				east.setBorder(new LineBorder(Color.LIGHT_GRAY));
				west.setBorder(new LineBorder(Color.LIGHT_GRAY));
				reset.setBorder(new LineBorder(Color.LIGHT_GRAY));
			}
			if(rand == 7){
				north.setBorder(new LineBorder(Color.MAGENTA));
				south.setBorder(new LineBorder(Color.MAGENTA));
				east.setBorder(new LineBorder(Color.MAGENTA));
				west.setBorder(new LineBorder(Color.MAGENTA));
				reset.setBorder(new LineBorder(Color.MAGENTA));
			}
			if(rand == 8){
				north.setBorder(new LineBorder(Color.ORANGE));
				south.setBorder(new LineBorder(Color.ORANGE));
				east.setBorder(new LineBorder(Color.ORANGE));
				west.setBorder(new LineBorder(Color.ORANGE));
				reset.setBorder(new LineBorder(Color.ORANGE));
			}
			if(rand == 9){
				north.setBorder(new LineBorder(Color.PINK));
				south.setBorder(new LineBorder(Color.PINK));
				east.setBorder(new LineBorder(Color.PINK));
				west.setBorder(new LineBorder(Color.PINK));
				reset.setBorder(new LineBorder(Color.PINK));
			}
			if(rand == 10){
				north.setBorder(new LineBorder(Color.RED));
				south.setBorder(new LineBorder(Color.RED));
				east.setBorder(new LineBorder(Color.RED));
				west.setBorder(new LineBorder(Color.RED));
				reset.setBorder(new LineBorder(Color.RED));
			}
			if(rand == 11){
				north.setBorder(new LineBorder(Color.GRAY));
				south.setBorder(new LineBorder(Color.GRAY));
				east.setBorder(new LineBorder(Color.GRAY));
				west.setBorder(new LineBorder(Color.GRAY));
				reset.setBorder(new LineBorder(Color.GRAY));
			}
			if(rand == 12){
				north.setBorder(new LineBorder(Color.YELLOW));
				south.setBorder(new LineBorder(Color.YELLOW));
				east.setBorder(new LineBorder(Color.YELLOW));
				west.setBorder(new LineBorder(Color.YELLOW));
				reset.setBorder(new LineBorder(Color.YELLOW));
			}

		}
		//font size
		int fontSize = 12;
		if(e.getSource() == twelve){
			Font temp = new Font(north.getFont().getFontName(),Font.PLAIN,12);
			fontSize = 12;
			north.setFont(temp);
			south.setFont(temp);
			area.setFont(temp);
			east.setFont(temp);
			west.setFont(temp);
			reset.setFont(temp);
			fontMenu.setFont(temp);
			sizeMenu.setFont(temp);
			colorMenu.setFont(temp);
			outlineColor.setFont(temp);
			backgroundColor.setFont(temp);
			Times.setFont(temp);
			Helvetica.setFont(temp);
			Serif.setFont(temp);
			twelve.setFont(temp);
			fourteen.setFont(temp);
			sixteen.setFont(temp);
			color1.setFont(temp);
			color2.setFont(temp);
			randColor.setFont(temp);
			bcolor1.setFont(temp);
			bcolor2.setFont(temp);
			bcolor3.setFont(temp);
			ocolor1.setFont(temp);
			ocolor2.setFont(temp);
			noColor.setFont(temp);
			oRand.setFont(temp);
		}
		if(e.getSource() == fourteen){
			Font temp = new Font(north.getFont().getFontName(),Font.PLAIN,14);
			fontSize = 14;
			north.setFont(temp);
			area.setFont(temp);
			south.setFont(temp);
			east.setFont(temp);
			west.setFont(temp);
			reset.setFont(temp);
			fontMenu.setFont(temp);
			sizeMenu.setFont(temp);
			colorMenu.setFont(temp);
			outlineColor.setFont(temp);
			backgroundColor.setFont(temp);
			Times.setFont(temp);
			Helvetica.setFont(temp);
			Serif.setFont(temp);
			twelve.setFont(temp);
			fourteen.setFont(temp);
			sixteen.setFont(temp);
			color1.setFont(temp);
			color2.setFont(temp);
			randColor.setFont(temp);
			bcolor1.setFont(temp);
			bcolor2.setFont(temp);
			bcolor3.setFont(temp);
			ocolor1.setFont(temp);
			ocolor2.setFont(temp);
			noColor.setFont(temp);
			oRand.setFont(temp);
		}
		if(e.getSource() == sixteen){
			Font temp = new Font(north.getFont().getFontName(),Font.PLAIN,16);
			fontSize = 16;
			north.setFont(temp);
			reset.setFont(temp);
			area.setFont(temp);
			south.setFont(temp);
			east.setFont(temp);
			west.setFont(temp);
			fontMenu.setFont(temp);
			sizeMenu.setFont(temp);
			colorMenu.setFont(temp);
			outlineColor.setFont(temp);
			backgroundColor.setFont(temp);
			Times.setFont(temp);
			Helvetica.setFont(temp);
			Serif.setFont(temp);
			twelve.setFont(temp);
			fourteen.setFont(temp);
			sixteen.setFont(temp);
			color1.setFont(temp);
			color2.setFont(temp);
			randColor.setFont(temp);
			bcolor1.setFont(temp);
			bcolor2.setFont(temp);
			bcolor3.setFont(temp);
			ocolor1.setFont(temp);
			ocolor2.setFont(temp);
			noColor.setFont(temp);
			oRand.setFont(temp);
		}

		//font clicks
		if(e.getSource() == Times){
			Font TNR = new Font("TimesRoman",Font.PLAIN, fontSize);
			north.setFont(TNR);
			area.setFont(TNR);
			reset.setFont(TNR);
			south.setFont(TNR);
			east.setFont(TNR);
			west.setFont(TNR);
			fontMenu.setFont(TNR);
			sizeMenu.setFont(TNR);
			colorMenu.setFont(TNR);
			outlineColor.setFont(TNR);
			backgroundColor.setFont(TNR);
			Times.setFont(TNR);
			Helvetica.setFont(TNR);
			Serif.setFont(TNR);
			twelve.setFont(TNR);
			fourteen.setFont(TNR);
			sixteen.setFont(TNR);
			color1.setFont(TNR);
			color2.setFont(TNR);
			randColor.setFont(TNR);
			bcolor1.setFont(TNR);
			bcolor2.setFont(TNR);
			bcolor3.setFont(TNR);
			ocolor1.setFont(TNR);
			ocolor2.setFont(TNR);
			noColor.setFont(TNR);
			oRand.setFont(TNR);

		}
		if(e.getSource() == Helvetica){
			Font helvetica = new Font("Helvetica",Font.PLAIN, fontSize);
			north.setFont(helvetica);
			south.setFont(helvetica);
			area.setFont(helvetica);
			reset.setFont(helvetica);
			east.setFont(helvetica);
			west.setFont(helvetica);
			fontMenu.setFont(helvetica);
			sizeMenu.setFont(helvetica);
			colorMenu.setFont(helvetica);
			outlineColor.setFont(helvetica);
			backgroundColor.setFont(helvetica);
			Times.setFont(helvetica);
			Helvetica.setFont(helvetica);
			Serif.setFont(helvetica);
			twelve.setFont(helvetica);
			fourteen.setFont(helvetica);
			sixteen.setFont(helvetica);
			color1.setFont(helvetica);
			color2.setFont(helvetica);
			randColor.setFont(helvetica);
			bcolor1.setFont(helvetica);
			bcolor2.setFont(helvetica);
			bcolor3.setFont(helvetica);
			ocolor1.setFont(helvetica);
			ocolor2.setFont(helvetica);
			noColor.setFont(helvetica);
			oRand.setFont(helvetica);
		}
		if(e.getSource() == Serif){
			Font ser = new Font("Courier",Font.PLAIN, fontSize);
			north.setFont(ser);
			reset.setFont(ser);
			south.setFont(ser);
			area.setFont(ser);
			east.setFont(ser);
			west.setFont(ser);
			fontMenu.setFont(ser);
			sizeMenu.setFont(ser);
			colorMenu.setFont(ser);
			outlineColor.setFont(ser);
			backgroundColor.setFont(ser);
			Times.setFont(ser);
			Helvetica.setFont(ser);
			Serif.setFont(ser);
			twelve.setFont(ser);
			fourteen.setFont(ser);
			sixteen.setFont(ser);
			color1.setFont(ser);
			color2.setFont(ser);
			randColor.setFont(ser);
			bcolor1.setFont(ser);
			bcolor2.setFont(ser);
			bcolor3.setFont(ser);
			ocolor1.setFont(ser);
			ocolor2.setFont(ser);
			noColor.setFont(ser);
			oRand.setFont(ser);
		}
		//text color
		if(e.getSource() == color1){
			north.setForeground(Color.RED);
			south.setForeground(Color.RED);
			area.setForeground(Color.RED);
			east.setForeground(Color.RED);
			west.setForeground(Color.RED);
			reset.setForeground(Color.RED);
			fontMenu.setForeground(Color.RED);
			sizeMenu.setForeground(Color.RED);
			colorMenu.setForeground(Color.RED);
			outlineColor.setForeground(Color.RED);
			backgroundColor.setForeground(Color.RED);
			Times.setForeground(Color.RED);
			Helvetica.setForeground(Color.RED);
			Serif.setForeground(Color.RED);
			twelve.setForeground(Color.RED);
			fourteen.setForeground(Color.RED);
			sixteen.setForeground(Color.RED);
			color1.setForeground(Color.RED);
			color2.setForeground(Color.RED);
			randColor.setForeground(Color.RED);
			bcolor1.setForeground(Color.RED);
			bcolor2.setForeground(Color.RED);
			bcolor3.setForeground(Color.RED);
			ocolor1.setForeground(Color.RED);
			ocolor2.setForeground(Color.RED);
			noColor.setForeground(Color.RED);
			oRand.setForeground(Color.RED);
		}
		if(e.getSource() == color2){
			north.setForeground(Color.BLUE);
			south.setForeground(Color.BLUE);
			area.setForeground(Color.BLUE);
			east.setForeground(Color.BLUE);
			west.setForeground(Color.BLUE);
			reset.setForeground(Color.BLUE);
			fontMenu.setForeground(Color.BLUE);
			sizeMenu.setForeground(Color.BLUE);
			colorMenu.setForeground(Color.BLUE);
			outlineColor.setForeground(Color.BLUE);
			backgroundColor.setForeground(Color.BLUE);
			Times.setForeground(Color.BLUE);
			Helvetica.setForeground(Color.BLUE);
			Serif.setForeground(Color.BLUE);
			twelve.setForeground(Color.BLUE);
			fourteen.setForeground(Color.BLUE);
			sixteen.setForeground(Color.BLUE);
			color1.setForeground(Color.BLUE);
			color2.setForeground(Color.BLUE);
			randColor.setForeground(Color.BLUE);
			bcolor1.setForeground(Color.BLUE);
			bcolor2.setForeground(Color.BLUE);
			bcolor3.setForeground(Color.BLUE);
			ocolor1.setForeground(Color.BLUE);
			ocolor2.setForeground(Color.BLUE);
			noColor.setForeground(Color.BLUE);
			oRand.setForeground(Color.BLUE);
		}
		if(e.getSource() == randColor){
			Color c = Color.BLUE;
			int random = (int)(Math.random()*3);
			if(random ==0){ c = Color.GREEN;}
			if(random == 1){ c= Color.BLUE;}
			if(random == 2){ c = Color.MAGENTA;}

			north.setForeground(c);
			south.setForeground(c);
			area.setForeground(c);
			east.setForeground(c);
			reset.setForeground(c);
			west.setForeground(c);
			fontMenu.setForeground(c);
			sizeMenu.setForeground(c);
			colorMenu.setForeground(c);
			outlineColor.setForeground(c);
			backgroundColor.setForeground(c);
			Times.setForeground(c);
			Helvetica.setForeground(c);
			Serif.setForeground(c);
			twelve.setForeground(c);
			fourteen.setForeground(c);
			sixteen.setForeground(c);
			color1.setForeground(c);
			color2.setForeground(c);
			randColor.setForeground(c);
			bcolor1.setForeground(c);
			bcolor2.setForeground(c);
			bcolor3.setForeground(c);
			ocolor1.setForeground(c);
			ocolor2.setForeground(c);
			noColor.setForeground(c);
			oRand.setForeground(c);

		}


		//area background color
		if(e.getSource() == bcolor1){
			area.setBackground(Color.YELLOW);
		}
		if(e.getSource() == bcolor2){
			area.setBackground(Color.GREEN);
		}
		if(e.getSource() == bcolor3){
			rand = (int)(Math.random()*11)+1;
			//random color assignments
			if(rand == 1){
				area.setBackground(Color.BLACK);
			}
			if(rand == 2){
				area.setBackground(Color.BLUE);
			}
			if(rand == 3){
				area.setBackground(Color.CYAN);
			}
			if(rand == 4){
				area.setBackground(Color.darkGray);
			}
			if(rand == 5){
				area.setBackground(Color.GRAY);
			}
			if(rand == 6){
				area.setBackground(Color.GREEN);
			}
			if(rand == 7){
				area.setBackground(Color.LIGHT_GRAY);
			}
			if(rand == 8){
				area.setBackground(Color.MAGENTA);
			}
			if(rand == 9){
				area.setBackground(Color.ORANGE);
			}
			if(rand == 10){
				area.setBackground(Color.PINK);
			}
			if(rand == 11){
				area.setBackground(Color.RED);
			}
			if(rand == 12){
				area.setBackground(Color.YELLOW);
			}
		}

		frame.add(area, BorderLayout.CENTER);
		frame.revalidate();

	}

	public static void main(String [] args)
	{
		GUI app = new GUI();
	}






}