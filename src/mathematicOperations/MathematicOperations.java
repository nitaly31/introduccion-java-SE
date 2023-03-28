package mathematicOperations;

public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //devuelve un entero hacia arriba
        System.out.println(Math.ceil(x)); // 3.0
        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x)); // 2.0
        //numero elevado a otro numero
        System.out.println(Math.pow(x,y)); // 9.261000000000001
        //Devuelve el numero mayor
        System.out.println(Math.max(x,y)); // 3.0
        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y)); // 1.7320508075688772
        //Area de un circulo
        //PI * r2
        System.out.println(Math.PI * Math.pow(y,2)); // 28.274333882308138
        //Area de una esfera
        //4* PI * r2
        System.out.println(4 * Math.PI * Math.pow(y,2)); // 113.09733552923255
        //volumen de una esfera
        // (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3)); // 84.82300164692441
    }
}
