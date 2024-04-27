

//Concatenacion de cadenas en java

public class Concatenacion {
    public static void main(String args[]) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        //Cuando son cadenas se pueden concatenar con el operador +
        var cadena3 = cadena1 + " " + cadena2;
        //Cuando son cadenas y numeros se pueden concatenar con el operador +
        //pero los numeros se convierten en cadenas porque la expresion se evalua de izquierda a derecha.
        //Primero encunetra la cadena3 y luego el numero 5 y el 6, por lo tanto se imprime Hola Mundo 56.
        var cadena4 = cadena3 + " " + 5 + 6;
        System.out.println(cadena4);  //Hola Mundo 56
        //Son cadenas y numeros pero se concatenan con el operador +. Lo primero que encuenta es el numero 1 y el 5, luego la cadena3 con lo que imprime 6HolaMundo ya que primero suma los numeros y luego concatena la cadena
        System.out.println(1 + 5+ cadena3);
        System.out.println(cadena3 + (1 + 5)); // Hola Mundo6
        System.out.println(cadena3 + 1+ 5);  //Hola Mundo15   
    }
}
