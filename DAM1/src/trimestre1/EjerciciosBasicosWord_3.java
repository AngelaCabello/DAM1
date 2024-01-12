package trimestre1;

public class EjerciciosBasicosWord_3 {
/*1. Define una variable de tipo `double` llamada `temperaturaCelsius` y asígnale un valor en grados Celsius (por ejemplo, 25.0).
2. Utiliza la fórmula de conversión para calcular la temperatura equivalente en grados Fahrenheit: `temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32`.
3. Finalmente, muestra el resultado de la conversión en la consola, indicando la temperatura en grados Celsius y su equivalente en grados Fahrenheit.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double temperaturaCelsius=25;
		double temperaturaFahrenheit=((temperaturaCelsius*9)/5)+32;
		
		System.out.println("la temperatura en Fahrenheit es: " + temperaturaFahrenheit + " la temperatura en Celsius es:" + temperaturaCelsius);
	}

}
