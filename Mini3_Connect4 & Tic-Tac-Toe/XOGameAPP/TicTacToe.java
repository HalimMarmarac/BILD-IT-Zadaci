package XOGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JLabel l;
	JButton bt[];
	JButton bt1;
	String xo[] = { "", "", "", "", "", "", "", "", "" };
	JTextField jtf;
	int i = 0;
	
	public TicTacToe() {
		super("Tic-Tac-Toe"); // this will be text on tittle bar
		// creating window size, location, not resizable and positioned central on monitor
		setSize(600, 630);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		// positions window to center of your screen
		setLocationRelativeTo(null);
		Container cont = getContentPane(); // container for adding components
		// adding text foeld to window (size, color, not editable)
		cont.add(jtf = new JTextField());
		jtf.setEditable(false);
		jtf.setBounds(0, 10, 600, 100);
		jtf.setBackground(Color.lightGray);
		// creating panel with grid 3x3 (3x3 panel is presenting tic-tac-toe table)
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3, 3));
		jp.setBounds(5, 120, 584, 401);
		// creating 9 (3x3) buttons and adding them to panel 3x3
		bt = new JButton[xo.length];
		for (int k = 0; k < xo.length; k++) {
			bt[k] = new JButton(xo[k]);
			bt[k].setFont(new Font("Arial Black", Font.BOLD, 100));
			jp.add(bt[k]);
		}
		cont.add(jp); // adding panel to window
		// adding button for starting a new game
		cont.add(bt1 = new JButton("START NEW GAME"));
		bt1.setBounds(150, 532, 300, 50);
		bt1.setFont(new Font("Arial", Font.BOLD, 20));
		for (i = 0; i < xo.length; i++) {
			bt[i].setEnabled(false);
		}
		// adding funktion to button for new game
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (i = 0; i < xo.length; i++) {
					bt[i].setEnabled(true);
					bt[i].setText("");
				}
				if (player1) {
					jtf.setText("    player turn:  X");
					jtf.setForeground(Color.red);
					jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
				} else {
					jtf.setText("    player turn:  O");
					jtf.setForeground(Color.blue);
					jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
				}
			}
		});
		
		/*
		 * next we add funktions for every of 9 buttons in grid 3x3
		 * including showing X or O sign, clors changes and checking if
		 * any player has won the game or it's a tie
		 */
		bt[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					// if position(button) is not used
					if (bt[0].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[0].setText("X");
						bt[0].setForeground(Color.red);
						player1 = false; // switching the player
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
						// if button is already used display message to player
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[0].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[0].setText("O");
						bt[0].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[1].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[1].setText("X");
						bt[1].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[1].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[1].setText("O");
						bt[1].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[2].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[2].setText("X");
						bt[2].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[2].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[2].setText("O");
						bt[2].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[3].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[3].setText("X");
						bt[3].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[3].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[3].setText("O");
						bt[3].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[4].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[4].setText("X");
						bt[4].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[4].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[4].setText("O");
						bt[4].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[5].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[5].setText("X");
						bt[5].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[5].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[5].setText("O");
						bt[5].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[6].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[6].setText("X");
						bt[6].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[6].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[6].setText("O");
						bt[6].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[7].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[7].setText("X");
						bt[7].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[7].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[7].setText("O");
						bt[7].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});
		bt[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (player1) {
					if (bt[8].getText() == "") {
						jtf.setText("    player turn:  O");
						jtf.setForeground(Color.blue);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[8].setText("X");
						bt[8].setForeground(Color.red);
						player1 = false;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				} else {
					if (bt[8].getText() == "") {
						jtf.setText("    player turn:  X");
						jtf.setForeground(Color.red);
						jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
						bt[8].setText("O");
						bt[8].setForeground(Color.blue);
						player1 = true;
						checkRow();
						checkColumn();
						checkDiagonal();
						checkTie();
					} else {
						JFrame info = new JFrame();
						JOptionPane.showMessageDialog(info, "This field is already used !");
					}
				}
			}
		});

	}
	// default constructor for action listener
	public void actionPerformed(ActionEvent arg0) {
	}

	public static boolean player1 = true; // for switching players

	// checking if any player has won by row
	public boolean checkRow() {
		// conditions fo player X
		if ((bt[0].getText().equals("X") && bt[1].getText().equals("X") && bt[2].getText().equals("X"))
				|| (bt[3].getText().equals("X") && bt[4].getText().equals("X") && bt[5].getText().equals("X"))
				|| (bt[6].getText().equals("X") && bt[7].getText().equals("X") && bt[8].getText().equals("X"))) {
			jtf.setText("  PLAYER X WON!");
			jtf.setForeground(Color.red);
			jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
			for (i = 0; i < xo.length; i++) {
				bt[i].setEnabled(false);
			}
			return true;
		}
		// conditions fo player O
		if ((bt[0].getText().equals("O") && bt[1].getText().equals("O") && bt[2].getText().equals("O"))
				|| (bt[3].getText().equals("O") && bt[4].getText().equals("O") && bt[5].getText().equals("O"))
				|| (bt[6].getText().equals("O") && bt[7].getText().equals("O") && bt[8].getText().equals("O"))) {
			jtf.setText("  PLAYER O WON!");
			jtf.setForeground(Color.blue);
			jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
			for (i = 0; i < xo.length; i++) {
				bt[i].setEnabled(false);
			}
			return true;
		}

		return false;
	}

	// checking if any player has won by column
	public boolean checkColumn() {
		// conditions fo player X
		if ((bt[0].getText().equals("X") && bt[3].getText().equals("X") && bt[6].getText().equals("X"))
				|| (bt[1].getText().equals("X") && bt[4].getText().equals("X") && bt[7].getText().equals("X"))
				|| (bt[2].getText().equals("X") && bt[5].getText().equals("X") && bt[8].getText().equals("X"))) {
			jtf.setText("  PLAYER X WON!");
			jtf.setForeground(Color.red);
			jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
			for (i = 0; i < xo.length; i++) {
				bt[i].setEnabled(false);
			}
			return true;
		}
		// conditions fo player O
		if ((bt[0].getText().equals("O") && bt[3].getText().equals("O") && bt[6].getText().equals("O"))
				|| (bt[1].getText().equals("O") && bt[4].getText().equals("O") && bt[7].getText().equals("O"))
				|| (bt[2].getText().equals("O") && bt[5].getText().equals("O") && bt[8].getText().equals("O"))) {
			jtf.setText("  PLAYER O WON!");
			jtf.setForeground(Color.blue);
			jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
			for (i = 0; i < xo.length; i++) {
				bt[i].setEnabled(false);
			}
			return true;
		}

		return false;
	}
	
	// checking if any player has won by diagonale
	public boolean checkDiagonal() {
		// conditions fo player X
		if ((bt[0].getText().equals("X") && bt[4].getText().equals("X") && bt[8].getText().equals("X"))
				|| (bt[2].getText().equals("X") && bt[4].getText().equals("X") && bt[6].getText().equals("X"))) {
			jtf.setText("  PLAYER X WON!");
			jtf.setForeground(Color.red);
			jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
			for (i = 0; i < xo.length; i++) {
				bt[i].setEnabled(false);
			}
			return true;
		}
		// conditions fo player O
		if ((bt[0].getText().equals("O") && bt[4].getText().equals("O") && bt[8].getText().equals("O"))
				|| (bt[2].getText().equals("O") && bt[4].getText().equals("O") && bt[6].getText().equals("O"))) {
			jtf.setText("  PLAYER O WON!");
			jtf.setForeground(Color.blue);
			jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
			for (i = 0; i < xo.length; i++) {
				bt[i].setEnabled(false);
			}
			return true;
		}

		return false;
	}

	// checking if it's a tie
	public boolean checkTie() {
		// if none of winning conditions are true and table is full then it's a tie
		if (!checkRow() && !checkColumn() && !checkDiagonal()) {
			int cnt = 0;
			for (i = 0; i < xo.length; i++) {
				if (bt[i].getText() != "") {
					cnt++;
				}
			}
			// if all nine of buttons are used
			if (cnt == 9) {
				jtf.setText("       IT'S A TIE!");
				jtf.setForeground(Color.green);
				jtf.setFont(new Font("Arial Black", Font.BOLD, 50));
				for (i = 0; i < xo.length; i++) {
					bt[i].setEnabled(false);
				}
				return true;
			}
		}
		return false;
	}

	// creating a game contructor for game and showing it on display
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TicTacToe xo = new TicTacToe();
		xo.show(true);
	}

}
