package metier;

public class Convertisseur {
	
	//final String CELCUS = "°C";
	
	public void convertir(String temperature, double valeur) throws Exception{
		if (temperature.equals("K")) {
			double value1 = valeur - 273.15;
			double value2 = valeur * 9/5 - 459.67;
			System.out.println(value1 + " °C");
			System.out.println(value2 + " °F");
		} 
		else if(temperature.equals("C")) {
			double value1 = valeur + 273.15;
			double value2 = valeur * 9/5 + 32;
			System.out.println(value1 + " °K");
			System.out.println(value2 + " °F");
		}
		else if(temperature.equals("F")){
			double value1 = (valeur - 32) * 5/9;
			double value2 = (valeur + 459.67) * 5/9 ;
			System.out.println(value1 + " °C");
			System.out.println(value2 + " °K");
		}
		else {
			throw new Exception(" unité invalide");
		}
	}
}
