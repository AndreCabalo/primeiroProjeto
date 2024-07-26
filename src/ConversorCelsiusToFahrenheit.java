public class ConversorCelsiusToFahrenheit {

    public static void main(String [] args) {
        double celsius = 1;
        double fahrenheit = (celsius * 1.8)+32;

        System.out.println("A temperatura de " + celsius + " graus Celsius é equivalente a " + fahrenheit + " graus Fahrenheit");
        System.out.println("Este valor sem casas decimais é : " + (int) fahrenheit);
    }
}
