public class CtoFTester{
    public static double celsiusToFahrenheit(double temp){
	return temp * 9.0 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double temp){
	return (temp - 32) * 5.0 / 9;
    }

    // main function
    public static double main(double temp){
	return celsiusToFahrenheit(temp);
	return fahrenheitToCelsius(temp);
    }
}
