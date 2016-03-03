package GroupProject;

// klasa City
public class City {
	
	int ID;
	String Name;
	String CountryCode;
	String District;
	long Population;
	
	public City(
			int ID,
			String Name,
			String CountryCode,
			String District,
			long Population
			) {
		
		this.ID = ID;
		this.Name = Name;
		this.CountryCode = CountryCode;
		this.District = District;
		this.Population = Population;
	}
	
	public City() {
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getDistrict() {
		return District;
	}

	public long getPopulation() {
		return Population;
	}
	
}
