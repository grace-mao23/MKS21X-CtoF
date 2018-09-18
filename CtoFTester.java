public class CtoFTester{
    public static double celsiusToFahrenheit(double temp){
	return temp * 9.0 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double temp){
	return (temp - 32) * 5.0 / 9;
    }

    // main function
    public static void main(String[] args){
	System.out.println(celsiusToFahrenheit(23));
	double answer = celsiusToFahrenheit(23);
	System.out.println(fahrenheitToCelsius(answer));
    }
}
