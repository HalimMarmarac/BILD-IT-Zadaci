package GroupProject;

//klasa CountyLanguage
public class CountryLanguage {
	
	String CountryCode;
	String Language;
	char IsOfficial;
	double Percentage;
	
	public CountryLanguage(
			String CountryCode,
			String Language,
			char IsOfficial,
			double Percentage
			) {
		this.CountryCode = CountryCode;
		this.Language = Language;
		this.IsOfficial = IsOfficial;
		this.Percentage = Percentage;
	}
	
	public CountryLanguage(){
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getLanguage() {
		return Language;
	}

	public char getIsOfficial() {
		return IsOfficial;
	}

	public double getPercentage() {
		return Percentage;
	}
	
}
