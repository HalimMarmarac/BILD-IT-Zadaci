package Mini2_Craps;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Craps extends JFrame implements ActionListener {
	// random method for random dice roll
	Random r = new Random();
	// array with dice numbers
	int dice[] = { 1, 2, 3, 4, 5, 6 };
	// for temp. saving roll score to be used if must roll again
	int temp = 0;

	// constructor for craps object
	public Craps() {
		// this will be text on tittle bar
		super("Craps");
		// creating window size, location, not resizable and positioned central on monitor
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		// positions window to center of your screen
		setLocationRelativeTo(null);

		// panel for background of the window
		JPanel background = new JPanel();
		// setting layout to null will ensure to position every object to wanted position
		background.setLayout(null);
		// position 2px from left, 0px from top size 590px width and 369px hight
		background.setBounds(2, 0, 590, 369);
		// setting color of background
		background.setBackground(Color.green);
		// adding panel to the window
		add(background);

		// panel for showing rolled dices and score of the roll
		JPanel Score = new JPanel();
		Score.setLayout(null);
		Score.setBounds(2, 217, 120, 150);
		Score.setBackground(Color.white);
		// adding this panel to bacground panel
		background.add(Score);

		// this is label to show information for winning
		JLabel win = new JLabel("YOU WIN!");
		win.setBounds(300, 15, 180, 50);
		// setting font size and style
		win.setFont(new Font("Tahoma", Font.BOLD, 30));
		// setting this label not visible
		win.setVisible(false);
		background.add(win);
		// this label is for showing information for natural win (with 7 or 11)
		JLabel natural = new JLabel("natural");
		natural.setBounds(320, 75, 200, 50);
		natural.setFont(new Font("Comic Sense", Font.ITALIC, 35));
		natural.setVisible(false);
		background.add(natural);
		// this label is for showing player that he lose
		JLabel lose = new JLabel("YOU LOSE!");
		lose.setBounds(300, 15, 180, 50);
		lose.setFont(new Font("Tahoma", Font.BOLD, 30));
		lose.setVisible(false);
		background.add(lose);
		// showing information when craps is rolled and player lose (2,3 or 12)
		JLabel craps = new JLabel("craps");
		craps.setBounds(340, 75, 200, 50);
		craps.setFont(new Font("Comic Sense", Font.ITALIC, 35));
		craps.setVisible(false);
		background.add(craps);
		// information for player to roll again
		JLabel rollagain = new JLabel("ROLL AGAIN...");
		rollagain.setBounds(280, 15, 220, 50);
		rollagain.setFont(new Font("Tahoma", Font.BOLD, 30));
		rollagain.setVisible(false);
		background.add(rollagain);

		// label with text "score" in left corner of the window atached to Score panel
		JLabel score = new JLabel("SCORE: ");
		score.setBounds(10, 117, 60, 30);
		score.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Score.add(score);
		// text field for prompting score of the roll
		// but also used to read temp variable from it
		JTextField scoren = new JTextField("0");
		scoren.setBounds(80, 118, 50, 30);
		scoren.setEditable(false);
		scoren.setFont(new Font("Tahoma", Font.BOLD, 14));
		Score.add(scoren);
		
		// this is the label that is showing picture of rolled dices
		JLabel diceroll = new JLabel();
		diceroll.setBounds(5, 5, 110, 52);
		Score.add(diceroll);

		// creating images to add to label that is showing rolled dices
		ImageIcon i11 = new ImageIcon("11.png");
		ImageIcon i12 = new ImageIcon("12.png");
		ImageIcon i13 = new ImageIcon("13.png");
		ImageIcon i14 = new ImageIcon("14.png");
		ImageIcon i15 = new ImageIcon("15.png");
		ImageIcon i16 = new ImageIcon("16.png");
		ImageIcon i21 = new ImageIcon("21.png");
		ImageIcon i22 = new ImageIcon("22.png");
		ImageIcon i23 = new ImageIcon("23.png");
		ImageIcon i24 = new ImageIcon("24.png");
		ImageIcon i25 = new ImageIcon("25.png");
		ImageIcon i26 = new ImageIcon("26.png");
		ImageIcon i31 = new ImageIcon("31.png");
		ImageIcon i32 = new ImageIcon("32.png");
		ImageIcon i33 = new ImageIcon("33.png");
		ImageIcon i34 = new ImageIcon("34.png");
		ImageIcon i35 = new ImageIcon("35.png");
		ImageIcon i36 = new ImageIcon("36.png");
		ImageIcon i41 = new ImageIcon("41.png");
		ImageIcon i42 = new ImageIcon("42.png");
		ImageIcon i43 = new ImageIcon("43.png");
		ImageIcon i44 = new ImageIcon("44.png");
		ImageIcon i45 = new ImageIcon("45.png");
		ImageIcon i46 = new ImageIcon("46.png");
		ImageIcon i51 = new ImageIcon("51.png");
		ImageIcon i52 = new ImageIcon("52.png");
		ImageIcon i53 = new ImageIcon("53.png");
		ImageIcon i54 = new ImageIcon("54.png");
		ImageIcon i55 = new ImageIcon("55.png");
		ImageIcon i56 = new ImageIcon("56.png");
		ImageIcon i61 = new ImageIcon("61.png");
		ImageIcon i62 = new ImageIcon("62.png");
		ImageIcon i63 = new ImageIcon("63.png");
		ImageIcon i64 = new ImageIcon("64.png");
		ImageIcon i65 = new ImageIcon("65.png");
		ImageIcon i66 = new ImageIcon("66.png");
		ImageIcon i0 = new ImageIcon("null.png");

		// creating a label to be button for rolling dices and adding a nice look with image
		ImageIcon ia = new ImageIcon("btn.png");
		JLabel rolla = new JLabel();
		rolla.setBounds(10, 30, 100, 50);
		// adding nice look icon to be button
		rolla.setIcon(ia);
		background.add(rolla);
		// same button again but for second roll if roll again is calld
		ImageIcon ib = new ImageIcon("btn.png");
		JLabel rollb = new JLabel();
		rollb.setBounds(10, 30, 100, 50);
		rollb.setIcon(ib);
		background.add(rollb);
		// curent visibility is false
		rollb.setVisible(false);
		// creating label to show gif photo of dices roll when button is clicked
		ImageIcon rx = new ImageIcon("rolling.gif");
		JLabel rolling = new JLabel();
		rolling.setBounds(200, 27, 364, 312);
		rolling.setIcon(rx);
		background.add(rolling);
		rolling.setVisible(false);
		// label to be "play again" button same lokk as "roll" button
		// and it's showed after win or lose
		ImageIcon i = new ImageIcon("playagain.png");
		JLabel playagain = new JLabel();
		playagain.setBounds(10, 30, 100, 50);
		playagain.setIcon(i);
		background.add(playagain);
		playagain.setVisible(false);

		// action to run when timer object is called (show gif of dices roll)
		ActionListener t = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				rolling.setVisible(false);
			}
		};
		// timer of 1000ms for showing gif image when rolling dices
		Timer timer = new Timer(1000, t);
		
		/* actions to be executed when "play ahgain" button is clicked
		 * background to starting one, all labels for info to false
		 */
		playagain.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				background.setBackground(Color.green);
				natural.setVisible(false);
				win.setVisible(false);
				craps.setVisible(false);
				lose.setVisible(false);
				rollagain.setVisible(false);
				scoren.setText("0");
				rolla.setVisible(true);
				rollb.setVisible(false);
				playagain.setVisible(false);
				diceroll.setIcon(i0);
				rolling.setVisible(false);
				temp = Integer.parseInt(scoren.getText());
			}
		});

		// getting score after roll and adding it to variable temp
		temp = Integer.parseInt(scoren.getText());

		// actions to be executed when starting roll is done
		rolla.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				natural.setVisible(false);
				win.setVisible(false);
				craps.setVisible(false);
				lose.setVisible(false);
				rollagain.setVisible(false);
				// shows dice roll gif
				rolling.setVisible(true);
				// timer is used to hide dice roll gif after a time set in its constructor
				timer.setRepeats(false);
				timer.start();
				// 2 random created numbers on dices
				int dice1 = dice[r.nextInt(6)];
				int dice2 = dice[r.nextInt(6)];
				// sum of 2 dice numbers = score
				int points = dice1 + dice2;

				// next block of code is used to show image to display rolled dices combination
				if ((dice1 == 1) && (dice2 == 1)) {
					diceroll.setIcon(i11);
				} else if ((dice1 == 1) && (dice2 == 12)) {
					diceroll.setIcon(i12);
				} else if ((dice1 == 1) && (dice2 == 3)) {
					diceroll.setIcon(i13);
				} else if ((dice1 == 1) && (dice2 == 4)) {
					diceroll.setIcon(i14);
				} else if ((dice1 == 1) && (dice2 == 5)) {
					diceroll.setIcon(i15);
				} else if ((dice1 == 1) && (dice2 == 6)) {
					diceroll.setIcon(i16);
				} else if ((dice1 == 2) && (dice2 == 1)) {
					diceroll.setIcon(i21);
				} else if ((dice1 == 2) && (dice2 == 2)) {
					diceroll.setIcon(i22);
				} else if ((dice1 == 2) && (dice2 == 3)) {
					diceroll.setIcon(i23);
				} else if ((dice1 == 2) && (dice2 == 4)) {
					diceroll.setIcon(i24);
				} else if ((dice1 == 2) && (dice2 == 5)) {
					diceroll.setIcon(i25);
				} else if ((dice1 == 2) && (dice2 == 6)) {
					diceroll.setIcon(i26);
				} else if ((dice1 == 3) && (dice2 == 1)) {
					diceroll.setIcon(i31);
				} else if ((dice1 == 3) && (dice2 == 2)) {
					diceroll.setIcon(i32);
				} else if ((dice1 == 3) && (dice2 == 3)) {
					diceroll.setIcon(i33);
				} else if ((dice1 == 3) && (dice2 == 4)) {
					diceroll.setIcon(i34);
				} else if ((dice1 == 3) && (dice2 == 5)) {
					diceroll.setIcon(i35);
				} else if ((dice1 == 3) && (dice2 == 6)) {
					diceroll.setIcon(i36);
				} else if ((dice1 == 4) && (dice2 == 1)) {
					diceroll.setIcon(i41);
				} else if ((dice1 == 4) && (dice2 == 2)) {
					diceroll.setIcon(i42);
				} else if ((dice1 == 4) && (dice2 == 3)) {
					diceroll.setIcon(i43);
				} else if ((dice1 == 4) && (dice2 == 4)) {
					diceroll.setIcon(i44);
				} else if ((dice1 == 4) && (dice2 == 5)) {
					diceroll.setIcon(i45);
				} else if ((dice1 == 4) && (dice2 == 6)) {
					diceroll.setIcon(i46);
				} else if ((dice1 == 5) && (dice2 == 1)) {
					diceroll.setIcon(i51);
				} else if ((dice1 == 5) && (dice2 == 2)) {
					diceroll.setIcon(i52);
				} else if ((dice1 == 5) && (dice2 == 3)) {
					diceroll.setIcon(i53);
				} else if ((dice1 == 5) && (dice2 == 4)) {
					diceroll.setIcon(i54);
				} else if ((dice1 == 5) && (dice2 == 5)) {
					diceroll.setIcon(i55);
				} else if ((dice1 == 5) && (dice2 == 6)) {
					diceroll.setIcon(i56);
				} else if ((dice1 == 6) && (dice2 == 1)) {
					diceroll.setIcon(i61);
				} else if ((dice1 == 6) && (dice2 == 2)) {
					diceroll.setIcon(i62);
				} else if ((dice1 == 6) && (dice2 == 3)) {
					diceroll.setIcon(i63);
				} else if ((dice1 == 6) && (dice2 == 4)) {
					diceroll.setIcon(i64);
				} else if ((dice1 == 6) && (dice2 == 5)) {
					diceroll.setIcon(i65);
				} else if ((dice1 == 6) && (dice2 == 6)) {
					diceroll.setIcon(i66);
				}
				// calling craps and player lose if these conditions are true
				if ((points == 2) || (points == 3) || (points == 12)) {
					// sets background color to red
					background.setBackground(Color.red);
					rolling.setVisible(true);
					timer.setRepeats(false);
					timer.start();
					scoren.setText(Integer.toString(points));
					craps.setVisible(true);
					lose.setVisible(true);
					rolla.setVisible(false);
					playagain.setVisible(true);
					// calling natural and playerwin if conditions are true
				} else if ((points == 7) || (points == 11)) {
					// background coloer is set to blue
					background.setBackground(Color.blue);
					rolling.setVisible(true);
					timer.setRepeats(false);
					timer.start();
					scoren.setText(Integer.toString(points));
					natural.setVisible(true);
					win.setVisible(true);
					rolla.setVisible(false);
					playagain.setVisible(true);
					// if previous 2 conditions are false prepare to roll again
				} else {
					// bkg color is set to yellow
					background.setBackground(Color.yellow);
					rolling.setVisible(true);
					timer.setRepeats(false);
					timer.start();
					// hiding button of first roll
					rolla.setVisible(false);
					// and showing button for second roll and third and so on while needed
					rollb.setVisible(true);
					scoren.setText(Integer.toString(points));
					rollagain.setVisible(true);
					// temp is set to last rolled score
					temp = Integer.parseInt(scoren.getText());
				}
			}
		});

		// actions to be executed if roll again is calld
		rollb.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				natural.setVisible(false);
				win.setVisible(false);
				craps.setVisible(false);
				lose.setVisible(false);
				rollagain.setVisible(true);
				rolling.setVisible(true);
				timer.setRepeats(false);
				timer.start();
				// same as roll 1
				int dice1 = dice[r.nextInt(6)];
				int dice2 = dice[r.nextInt(6)];
				int points = dice1 + dice2;

				// same as roll 1
				if ((dice1 == 1) && (dice2 == 1)) {
					diceroll.setIcon(i11);
				} else if ((dice1 == 1) && (dice2 == 12)) {
					diceroll.setIcon(i12);
				} else if ((dice1 == 1) && (dice2 == 3)) {
					diceroll.setIcon(i13);
				} else if ((dice1 == 1) && (dice2 == 4)) {
					diceroll.setIcon(i14);
				} else if ((dice1 == 1) && (dice2 == 5)) {
					diceroll.setIcon(i15);
				} else if ((dice1 == 1) && (dice2 == 6)) {
					diceroll.setIcon(i16);
				} else if ((dice1 == 2) && (dice2 == 1)) {
					diceroll.setIcon(i21);
				} else if ((dice1 == 2) && (dice2 == 2)) {
					diceroll.setIcon(i22);
				} else if ((dice1 == 2) && (dice2 == 3)) {
					diceroll.setIcon(i23);
				} else if ((dice1 == 2) && (dice2 == 4)) {
					diceroll.setIcon(i24);
				} else if ((dice1 == 2) && (dice2 == 5)) {
					diceroll.setIcon(i25);
				} else if ((dice1 == 2) && (dice2 == 6)) {
					diceroll.setIcon(i26);
				} else if ((dice1 == 3) && (dice2 == 1)) {
					diceroll.setIcon(i31);
				} else if ((dice1 == 3) && (dice2 == 2)) {
					diceroll.setIcon(i32);
				} else if ((dice1 == 3) && (dice2 == 3)) {
					diceroll.setIcon(i33);
				} else if ((dice1 == 3) && (dice2 == 4)) {
					diceroll.setIcon(i34);
				} else if ((dice1 == 3) && (dice2 == 5)) {
					diceroll.setIcon(i35);
				} else if ((dice1 == 3) && (dice2 == 6)) {
					diceroll.setIcon(i36);
				} else if ((dice1 == 4) && (dice2 == 1)) {
					diceroll.setIcon(i41);
				} else if ((dice1 == 4) && (dice2 == 2)) {
					diceroll.setIcon(i42);
				} else if ((dice1 == 4) && (dice2 == 3)) {
					diceroll.setIcon(i43);
				} else if ((dice1 == 4) && (dice2 == 4)) {
					diceroll.setIcon(i44);
				} else if ((dice1 == 4) && (dice2 == 5)) {
					diceroll.setIcon(i45);
				} else if ((dice1 == 4) && (dice2 == 6)) {
					diceroll.setIcon(i46);
				} else if ((dice1 == 5) && (dice2 == 1)) {
					diceroll.setIcon(i51);
				} else if ((dice1 == 5) && (dice2 == 2)) {
					diceroll.setIcon(i52);
				} else if ((dice1 == 5) && (dice2 == 3)) {
					diceroll.setIcon(i53);
				} else if ((dice1 == 5) && (dice2 == 4)) {
					diceroll.setIcon(i54);
				} else if ((dice1 == 5) && (dice2 == 5)) {
					diceroll.setIcon(i55);
				} else if ((dice1 == 5) && (dice2 == 6)) {
					diceroll.setIcon(i56);
				} else if ((dice1 == 6) && (dice2 == 1)) {
					diceroll.setIcon(i61);
				} else if ((dice1 == 6) && (dice2 == 2)) {
					diceroll.setIcon(i62);
				} else if ((dice1 == 6) && (dice2 == 3)) {
					diceroll.setIcon(i63);
				} else if ((dice1 == 6) && (dice2 == 4)) {
					diceroll.setIcon(i64);
				} else if ((dice1 == 6) && (dice2 == 5)) {
					diceroll.setIcon(i65);
				} else if ((dice1 == 6) && (dice2 == 6)) {
					diceroll.setIcon(i66);
				}
				// if player rolls same score of 2 dices as first roll call player win
				if (points == temp) {
					background.setBackground(Color.blue);
					rolling.setVisible(true);
					timer.setRepeats(false);
					timer.start();
					win.setVisible(true);
					rollagain.setVisible(false);
					scoren.setText(Integer.toString(points));
					rollb.setVisible(false);
					rolla.setVisible(false);
					playagain.setVisible(true);
					// if player roll 7 at any point player lose is called
				} else if (points == 7) {
					background.setBackground(Color.red);
					rolling.setVisible(true);
					timer.setRepeats(false);
					timer.start();
					lose.setVisible(true);
					rollagain.setVisible(false);
					scoren.setText(Integer.toString(points));
					rollb.setVisible(false);
					rolla.setVisible(false);
					playagain.setVisible(true);
				}
			}
		});

	}
	
	// default constructor for actionPerformed method for buttons
	@Override
	public void actionPerformed(ActionEvent arg0) {
	}

	// main to create Craps object and show it to the user/player
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Craps c = new Craps();
		c.show(true);
	}

}
