package Funciones;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //PI * r2
        double area = circleArea(y);
        System.out.println(area + " Area de un circulo"); // 28.274333882308138
        //Area de una esfera
        //4* PI * r2
        double sArea = sphereArea(y);
        System.out.println(sArea + " Area de una esfera"); // 113.09733552923255
        //volumen de una esfera
        // (4/3) * PI * r3
        double sVolumen = sphereVolumen(y);
        System.out.println(sVolumen + " volumen de una esfera"); // 84.82300164692441

        System.out.println("PESOS A DOLARES: " + converToDolar( 1000, "COP"));
    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen (double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.055;
                break;
            case "COP":
                quantity = quantity * 0.00022;
                break;
        }
        return quantity;
    }
}
