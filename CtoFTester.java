public class CtoFTester{
    public static double celsiusToFahrenheit(double temp){
      return temp * 9.0 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double temp){
      return (temp - 32) * 5.0 / 9;
    }

    // main function
    public static void main(String[] args){
      System.out.println(celsiusToFahrenheit(23)); // ~73.4
      System.out.println(fahrenheitToCelsius(23)); // -5
      System.out.println(celsiusToFahrenheit(0)); // 32
      System.out.println(fahrenheitToCelsius(0)); // -17.78
      System.out.println(celsiusToFahrenheit(32)); // ~89.6
      System.out.println(fahrenheitToCelsius(32)); // 0
    }
}
