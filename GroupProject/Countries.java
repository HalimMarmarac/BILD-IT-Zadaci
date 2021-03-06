package GroupProject;

import java.sql.*;
import java.util.*;
// klasa koja implementira dati interface sa svim metodama iz klase potrebnim za pretragu
public class Countries implements CountryInterface {
	// metoda za konekciju sa bazom
	public Connection getConnected(String dataBaseName) throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String CONN_STRING = "jdbc:mysql://localhost/" + dataBaseName;
			String USERNAME = "root";
			String PASSWORD = "0000"; // ovo je kod mene password
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Connected");
			return connection;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	// metoda za pretragu po imenu dr�ave
	public ArrayList<Country> SearchCountryName(String Name) {
		ArrayList<Country> countries = new ArrayList<Country>();
		try {
			Connection connection = getConnected("world");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM country WHERE Name LIKE  '%"+Name+"%';");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				countries.add(new Country(result.getString("Code"), result.getString("Name"),
						result.getString("Continent"), result.getString("Region"), result.getDouble("SurfaceArea"),
						result.getInt("IndepYear"), result.getLong("Population"), result.getDouble("LifeExpectancy"),
						result.getDouble("GNP"), result.getDouble("GNPOld"), result.getString("LocalName"),
						result.getString("GovernmentForm"), result.getString("HeadOfState"), result.getInt("Capital"),
						result.getString("Code2")));
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		return countries;
	}
	// metoda za pretragu po broju stanovnika
	public ArrayList<Country> SearchCountryPopulation(long Population) {
		ArrayList<Country> countries = new ArrayList<Country>();
		try {
			Connection connection = getConnected("world");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM country WHERE Population <= "+Population+";");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				countries.add(new Country(result.getString("Code"), result.getString("Name"),
						result.getString("Continent"), result.getString("Region"), result.getDouble("SurfaceArea"),
						result.getInt("IndepYear"), result.getLong("Population"), result.getDouble("LifeExpectancy"),
						result.getDouble("GNP"), result.getDouble("GNPOld"), result.getString("LocalName"),
						result.getString("GovernmentForm"), result.getString("HeadOfState"), result.getInt("Capital"),
						result.getString("Code2")));
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		return countries;
	}
	// metoda koja vra�a country code iz tabele city
	public ArrayList<String> SearchCountryCode(String Name) {
		ArrayList<String> countrycode = new ArrayList<String>();
		try {
			Connection connection = getConnected("world");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM city WHERE Name LIKE '%"+Name+"%';");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				countrycode.add(result.getString("CountryCode"));
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		return countrycode;
	}
	// metoda uz pomo� country code iz prethodne metode vra�a dr�ave
	public ArrayList<Country> SearchCountryCity(ArrayList<String> CountyCode) {
		ArrayList<Country> countries = new ArrayList<Country>();
		try {
			Connection connection = getConnected("world");
			for(String code : CountyCode) {
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM country WHERE Code LIKE '%"+code+"%';");
				ResultSet result = statement.executeQuery();
				while (result.next()) {
					countries.add(new Country(result.getString("Code"), result.getString("Name"),
							result.getString("Continent"), result.getString("Region"), result.getDouble("SurfaceArea"),
							result.getInt("IndepYear"), result.getLong("Population"), result.getDouble("LifeExpectancy"),
							result.getDouble("GNP"), result.getDouble("GNPOld"), result.getString("LocalName"),
							result.getString("GovernmentForm"), result.getString("HeadOfState"), result.getInt("Capital"),
							result.getString("Code2")));
				}
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		return countries;
	}
	// metoda vra�a country code dr�ave iz tabele countrylanguage
	public HashSet<String> SearchCountryCode1(String Language) {
		HashSet<String> countrycode = new HashSet<String>();
		try {
			Connection connection = getConnected("world");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM countrylanguage WHERE Language LIKE '%"+Language+"%';");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				countrycode.add(result.getString("CountryCode"));
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		return countrycode;
	}
	// metoda pomo�u country code iz prethodne metode vra�a dr�ave
	public ArrayList<Country> SearchCountryLanguage(HashSet<String> CountyCode) {
		ArrayList<Country> countries = new ArrayList<Country>();
		try {
			Connection connection = getConnected("world");
			for(String code : CountyCode) {
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM country WHERE Code LIKE '%"+code+"%';");
				ResultSet result = statement.executeQuery();
				while (result.next()) {
					countries.add(new Country(result.getString("Code"), result.getString("Name"),
							result.getString("Continent"), result.getString("Region"), result.getDouble("SurfaceArea"),
							result.getInt("IndepYear"), result.getLong("Population"), result.getDouble("LifeExpectancy"),
							result.getDouble("GNP"), result.getDouble("GNPOld"), result.getString("LocalName"),
							result.getString("GovernmentForm"), result.getString("HeadOfState"), result.getInt("Capital"),
							result.getString("Code2")));
				}
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		return countries;
	}
	
}
