package GroupProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Search extends JFrame {
	// potrebni objekti
	JComboBox<String> filterChooser;
	String filter[] = { "SEARCH BY...", "Country name", "Population (0 to... )", "City", "Language" };
	JTextField input;
	JTextArea output;
	JLabel searchButton;
	JTable tableall;
	String columns[] = { "Code", "Name", "Continent", "Region", "SurfaceArea", "IndepYear", "Population",
			"LifeExpectancy", "GNP", "GNPOld", "LocalName", "GovernmentForm", "HeadOfState", "Capital", "Code2" };
	// konstruktor za prozor
	public Search() {
		super("Search");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		Container cont = getContentPane();
		cont.setLayout(null);
		// dodavanje text area u prozor
		cont.add(output = new JTextArea());
		output.setBounds(5, 100, 1185, 660);
		output.setEditable(false);
		output.setBackground(Color.WHITE);
		output.setFont(new Font("Tahoma", Font.PLAIN, 12));
		// dodavanje filtera u padajuæi izbornik
		cont.add(filterChooser = new JComboBox<String>(filter));
		filterChooser.setSize(380, 30);
		filterChooser.setLocation(50, 35);
		filterChooser.setSelectedIndex(0);
		filterChooser.setFont(new Font("Tahoma", Font.BOLD, 14));
		// dodavanje polja za unos
		cont.add(input = new JTextField(50));
		input.setSize(480, 30);
		input.setLocation(505, 35);
		input.setFont(new Font("Tahoma", Font.PLAIN, 14));
		input.setText("");
		// postavljanje ikone za dugme za pretragu
		ImageIcon i = new ImageIcon("src\\GroupProject\\searchbtn.png");
		cont.add(searchButton = new JLabel());
		searchButton.setSize(60, 60);
		searchButton.setLocation(1050, 17);
		searchButton.setIcon(i);
		searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		// dodavanje funkcija za dugme za pretragu
		searchButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int q = filterChooser.getSelectedIndex();
				CountryInterface country = new Countries();
				if (q == 1) {
					if (input.getText().equals("")) {
						output.setText("");
					} else {
						input.setEditable(true);
						ArrayList<Country> countries = country.SearchCountryName(input.getText());
						output.setText("");
						Object[][] o = new Object[countries.size()][15];
						Object[] xx = new Object[countries.size() * 15];
						int k = 0;
						for (int i = 0; i < countries.size(); i++) {
							if (countries.get(i) != null) {
								xx[k] = countries.get(i).getCode();
								k++;
								xx[k] = countries.get(i).getName();
								k++;
								xx[k] = countries.get(i).getContinent();
								k++;
								xx[k] = countries.get(i).getRegion();
								k++;
								xx[k] = countries.get(i).getSurfaceArea();
								k++;
								xx[k] = countries.get(i).getIndepYear();
								k++;
								xx[k] = countries.get(i).getPopulation();
								k++;
								xx[k] = countries.get(i).getLifeExpectancy();
								k++;
								xx[k] = countries.get(i).getGNP();
								k++;
								xx[k] = countries.get(i).getGNPOld();
								k++;
								xx[k] = countries.get(i).getLocalName();
								k++;
								xx[k] = countries.get(i).getGovernmentForm();
								k++;
								xx[k] = countries.get(i).getHeadOfState();
								k++;
								xx[k] = countries.get(i).getCapital();
								k++;
								xx[k] = countries.get(i).getCode2();
								k++;
							}
						}
						k = 0;
						for (int i = 0; i < countries.size(); i++) {
							for (int j = 0; j < 15; j++) {
								o[i][j] = xx[k];
								k++;
							}
						}
						tableall = new JTable(o, columns);
						tableall.setDefaultEditor(Object.class, null);
						tableall.setDefaultEditor(Number.class, null);
						tableall.setDefaultEditor(Boolean.class, null);
						tableall.setFillsViewportHeight(true);
						tableall.setAutoCreateRowSorter(true);
						tableall.setShowHorizontalLines(false);
						tableall.setShowVerticalLines(false);
						JScrollPane spall = new JScrollPane(tableall);
						spall.setBounds(0, 0, 1185, 660);
						output.add(spall);
						input.setText("");
					}
				}
				if (q == 2) {
					if (input.getText().equals("")) {
						output.setText("");
					} else {
						try {
							ArrayList<Country> countries = country
									.SearchCountryPopulation(Long.parseLong(input.getText()));
							output.setText("");
							Object[][] o = new Object[countries.size()][15];
							Object[] xx = new Object[countries.size() * 15];
							int k = 0;
							for (int i = 0; i < countries.size(); i++) {
								if (countries.get(i) != null) {
									xx[k] = countries.get(i).getCode();
									k++;
									xx[k] = countries.get(i).getName();
									k++;
									xx[k] = countries.get(i).getContinent();
									k++;
									xx[k] = countries.get(i).getRegion();
									k++;
									xx[k] = countries.get(i).getSurfaceArea();
									k++;
									xx[k] = countries.get(i).getIndepYear();
									k++;
									xx[k] = countries.get(i).getPopulation();
									k++;
									xx[k] = countries.get(i).getLifeExpectancy();
									k++;
									xx[k] = countries.get(i).getGNP();
									k++;
									xx[k] = countries.get(i).getGNPOld();
									k++;
									xx[k] = countries.get(i).getLocalName();
									k++;
									xx[k] = countries.get(i).getGovernmentForm();
									k++;
									xx[k] = countries.get(i).getHeadOfState();
									k++;
									xx[k] = countries.get(i).getCapital();
									k++;
									xx[k] = countries.get(i).getCode2();
									k++;
								}
							}
							k = 0;
							for (int i = 0; i < countries.size(); i++) {
								for (int j = 0; j < 15; j++) {
									o[i][j] = xx[k];
									k++;
								}
							}
							tableall = new JTable(o, columns);
							tableall.setDefaultEditor(Object.class, null);
							tableall.setDefaultEditor(Number.class, null);
							tableall.setDefaultEditor(Boolean.class, null);
							tableall.setFillsViewportHeight(true);
							tableall.setAutoCreateRowSorter(true);
							tableall.setShowHorizontalLines(false);
							tableall.setShowVerticalLines(false);
							JScrollPane spall = new JScrollPane(tableall);
							spall.setBounds(0, 0, 1185, 660);
							output.add(spall);
							input.setText("");
						} catch (NumberFormatException nfe) {
							JFrame info = new JFrame();
							JOptionPane.showMessageDialog(info, "Input field for population must be an integer number!");
							input.setText("");
						}
					}
				}
				if (q == 3) {
					if (input.getText().equals("")) {
						output.setText("");
					} else {
						ArrayList<Country> countries = country
								.SearchCountryCity(country.SearchCountryCode(input.getText()));
						output.setText("");
						Object[][] o = new Object[countries.size()][15];
						Object[] xx = new Object[countries.size() * 15];
						int k = 0;
						for (int i = 0; i < countries.size(); i++) {
							if (countries.get(i) != null) {
								xx[k] = countries.get(i).getCode();
								k++;
								xx[k] = countries.get(i).getName();
								k++;
								xx[k] = countries.get(i).getContinent();
								k++;
								xx[k] = countries.get(i).getRegion();
								k++;
								xx[k] = countries.get(i).getSurfaceArea();
								k++;
								xx[k] = countries.get(i).getIndepYear();
								k++;
								xx[k] = countries.get(i).getPopulation();
								k++;
								xx[k] = countries.get(i).getLifeExpectancy();
								k++;
								xx[k] = countries.get(i).getGNP();
								k++;
								xx[k] = countries.get(i).getGNPOld();
								k++;
								xx[k] = countries.get(i).getLocalName();
								k++;
								xx[k] = countries.get(i).getGovernmentForm();
								k++;
								xx[k] = countries.get(i).getHeadOfState();
								k++;
								xx[k] = countries.get(i).getCapital();
								k++;
								xx[k] = countries.get(i).getCode2();
								k++;
							}
						}
						k = 0;
						for (int i = 0; i < countries.size(); i++) {
							for (int j = 0; j < 15; j++) {
								o[i][j] = xx[k];
								k++;
							}
						}
						tableall = new JTable(o, columns);
						tableall.setDefaultEditor(Object.class, null);
						tableall.setDefaultEditor(Number.class, null);
						tableall.setDefaultEditor(Boolean.class, null);
						tableall.setFillsViewportHeight(true);
						tableall.setAutoCreateRowSorter(true);
						tableall.setShowHorizontalLines(false);
						tableall.setShowVerticalLines(false);
						JScrollPane spall = new JScrollPane(tableall);
						spall.setBounds(0, 0, 1185, 660);
						output.add(spall);
						input.setText("");
					}
				}
				if (q == 4) {
					if (input.getText().equals("")) {
						output.setText("");
					} else {
						ArrayList<Country> countries = country
								.SearchCountryLanguage(country.SearchCountryCode1(input.getText()));
						output.setText("");
						Object[][] o = new Object[countries.size()][15];
						Object[] xx = new Object[countries.size() * 15];
						int k = 0;
						for (int i = 0; i < countries.size(); i++) {
							if (countries.get(i) != null) {
								xx[k] = countries.get(i).getCode();
								k++;
								xx[k] = countries.get(i).getName();
								k++;
								xx[k] = countries.get(i).getContinent();
								k++;
								xx[k] = countries.get(i).getRegion();
								k++;
								xx[k] = countries.get(i).getSurfaceArea();
								k++;
								xx[k] = countries.get(i).getIndepYear();
								k++;
								xx[k] = countries.get(i).getPopulation();
								k++;
								xx[k] = countries.get(i).getLifeExpectancy();
								k++;
								xx[k] = countries.get(i).getGNP();
								k++;
								xx[k] = countries.get(i).getGNPOld();
								k++;
								xx[k] = countries.get(i).getLocalName();
								k++;
								xx[k] = countries.get(i).getGovernmentForm();
								k++;
								xx[k] = countries.get(i).getHeadOfState();
								k++;
								xx[k] = countries.get(i).getCapital();
								k++;
								xx[k] = countries.get(i).getCode2();
								k++;
							}
						}
						k = 0;
						for (int i = 0; i < countries.size(); i++) {
							for (int j = 0; j < 15; j++) {
								o[i][j] = xx[k];
								k++;
							}
						}
						tableall = new JTable(o, columns);
						tableall.setDefaultEditor(Object.class, null);
						tableall.setDefaultEditor(Number.class, null);
						tableall.setDefaultEditor(Boolean.class, null);
						tableall.setFillsViewportHeight(true);
						tableall.setAutoCreateRowSorter(true);
						tableall.setShowHorizontalLines(false);
						tableall.setShowVerticalLines(false);
						JScrollPane spall = new JScrollPane(tableall);
						spall.setBounds(0, 0, 1185, 660);
						output.add(spall);
						input.setText("");
					}
				}
			}
		});

	}
	// main metoda za prikaz prozora
	public static void main(String[] args) throws SQLException {
		Search search = new Search();
		search.show(true);
	}

}
