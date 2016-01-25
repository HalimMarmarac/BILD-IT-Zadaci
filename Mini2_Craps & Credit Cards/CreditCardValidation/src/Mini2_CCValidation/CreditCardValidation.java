package Mini2_CCValidation;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CreditCardValidation extends JFrame {

	ButtonGroup bg;
	JRadioButton rb[];
	String cards[] = { "", "", "", "" };
	JTextField cn;
	JButton check;
	JPanel line;
	long num = 0;

	// creating constructor for Credit card validation app
	public CreditCardValidation() {
		// this will be text on tittle bar
		super("Credit card validation app");
		// creating window size, location, not resizable and positioned central
		// on monitor
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		// positions window to center of your screen
		setLocationRelativeTo(null);

		// panel for background of the window
		JPanel background = new JPanel();
		// setting layout to null will ensure to position every object to wanted
		// position
		background.setLayout(null);
		// position 2px from left, 0px from top size 630px width and 449px hight
		background.setBounds(2, 0, 630, 449);
		// setting color of background
		background.setBackground(Color.lightGray);
		// adding panel to the window
		add(background);

		// creating a button group for radio buttons
		bg = new ButtonGroup();
		// creating panel for adding a radio buttons
		JPanel rbpanel = new JPanel();
		// panel layout 1 row 4 columns
		rbpanel.setLayout(new GridLayout(1, 4));
		// panel position and size
		rbpanel.setBounds(65, 50, 630, 20);
		// panel background
		rbpanel.setBackground(Color.lightGray);
		// creating radio buttons and adding them to panel
		rb = new JRadioButton[cards.length];
		for (int k = 0; k < cards.length; k++) {
			rb[k] = new JRadioButton(cards[k]);
			bg.add(rb[k]);
			rbpanel.add(rb[k]);
		}
		// setting radio buttons background to match window panel color
		rb[0].setBackground(Color.lightGray);
		rb[1].setBackground(Color.lightGray);
		rb[2].setBackground(Color.lightGray);
		rb[3].setBackground(Color.lightGray);
		// adding radio button panel to window/background panel
		background.add(rbpanel);
		// adding action listener to 1st radio button in button group
		rb[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// when button is checked line is set to color green
				line.setBackground(Color.green);
				// text field to enter card number is set to first number from
				// visa card
				cn.setText("");
				cn.setText("4");
			}
		});
		// same as radio button 1 just for mastercard
		rb[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				line.setBackground(Color.green);
				cn.setText("");
				cn.setText("5");
			}
		});
		// for american express card
		rb[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				line.setBackground(Color.green);
				cn.setText("");
				cn.setText("37");
			}
		});
		// for discover card
		rb[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				line.setBackground(Color.green);
				cn.setText("");
				cn.setText("6");
			}
		});

		// creating labels for images of specific card logo
		JLabel visa = new JLabel();
		JLabel master = new JLabel();
		JLabel american = new JLabel();
		JLabel discover = new JLabel();
		visa.setBounds(51, 15, 49, 30);
		master.setBounds(209, 15, 49, 30);
		american.setBounds(366, 15, 49, 30);
		discover.setBounds(521, 15, 49, 30);
		// creating images to be shown in label for images for specific cards
		ImageIcon ivisa = new ImageIcon("visa.jpg");
		visa.setIcon(ivisa);
		background.add(visa);
		ImageIcon imaster = new ImageIcon("mastercard.jpg");
		master.setIcon(imaster);
		background.add(master);
		ImageIcon iamerican = new ImageIcon("americanexpress.jpg");
		american.setIcon(iamerican);
		background.add(american);
		ImageIcon idiscover = new ImageIcon("discover.jpg");
		discover.setIcon(idiscover);
		background.add(discover);
		// label with text of the first step, chosing credit card
		JLabel choser = new JLabel("1. Chose a Credit card from above");
		choser.setBounds(215, 82, 200, 20);
		choser.setBackground(Color.lightGray);
		background.add(choser);
		// label with text of the second step, entering a credit card number
		JLabel enter = new JLabel("2. Enter a Credit card number");
		enter.setBounds(230, 180, 170, 20);
		enter.setBackground(Color.lightGray);
		background.add(enter);
		// line panel which changes color to green if first step is complete
		line = new JPanel();
		line.setBounds(0, 100, 630, 3);
		line.setBackground(Color.red);
		background.add(line);
		// creating and setting text field to accept max 16 characters
		try {
			cn = new JFormattedTextField(new MaskFormatter("****************"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cn.setBounds(215, 210, 200, 40);
		cn.setFont(new Font("Arial", Font.BOLD, 20));
		background.add(cn);
		// creating button for checking number
		JButton check = new JButton("C H E C K     N U M B E R");
		check.setBounds(10, 390, 610, 50);
		check.setBackground(Color.gray);
		background.add(check);
		// adding action listener to check button to check if card number is
		// valid or invalid
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean q = true; // for stopping further actions after error
									// prompt
				// try to get number from text field if it contains only digits
				// ok if not prompt error message
				try {
					num = Long.parseLong(cn.getText());
				} catch (NumberFormatException nfe) {
					JFrame info = new JFrame();
					JOptionPane.showMessageDialog(info, "Text field only accepts Integer !");
					q = false;
				}
				if (q) {
					// array list tor storing all digits from cc number
					ArrayList<Long> digits = new ArrayList<Long>();
					// while there are digits save digit to list
					while (num != 0) {
						digits.add(num % 10);
						num /= 10;
					}
					int sum1 = 0; // sum of double even places
					// ...
					for (int i = 1; i < digits.size(); i++) {
						if (i % 2 != 0) {
							if ((digits.get(i) * 2) < 10) {
								sum1 += digits.get(i) * 2;
							} else {
								sum1 += ((digits.get(i) * 2) % 10) + 1;
							}
						}
					}
					int sum2 = 0; // sum of odd places
					// ...
					for (int i = 0; i < digits.size(); i++) {
						if (i % 2 == 0) {
							sum2 += digits.get(i);
						}
					}
					// if sum of those two sums is divisible by 10 card is valid
					// prompt user
					if ((sum1 + sum2) % 10 == 0) {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "Credit card number is valid!");
						cn.setText("");
					}
					// if sum of those sums are not divisible by 10 card is
					// invalid
					// prompt user
					else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "Credit card number is invalid!");
						cn.setText("");
					}
				}
			}
		});

	}

	// main method is uset to create and show user object of credit card
	// validation app
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		CreditCardValidation ccv = new CreditCardValidation();
		ccv.show(true);
	}

}
