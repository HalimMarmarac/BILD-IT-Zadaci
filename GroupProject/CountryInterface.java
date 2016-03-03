package GroupProject;

import java.util.*;

public interface CountryInterface {
	
	public ArrayList<Country> SearchCountryName(String Name);
	public ArrayList<Country> SearchCountryPopulation(long Population);
	public ArrayList<String> SearchCountryCode(String Name);
	public ArrayList<Country> SearchCountryCity(ArrayList<String> CountyCode);
	public ArrayList<String> SearchCountryCode1(String Language);
	public ArrayList<Country> SearchCountryLanguage(ArrayList<String> CountyCode);

}
