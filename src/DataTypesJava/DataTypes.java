package DataTypesJava;

public class DataTypes {
    public static void main(String[] args) {
        //int es una variable que tiene un limite de espacio de memoria, pudiendo almacenar hasta 10 digitos.
        int n = 1234567890;
        // tipos de datos enteros: (byte = 1 byte) (short = 2 byte) (int = 4 bytes) (long = 8 bytes)
        long nL = 12345678901L;//En los casos de tipo long no solo basta iniciarlo con esa variable. sino tambien colocar la letra "L"
        // al final del valor para que sea considerado de ese tipo.
        // Tipo de datos Flotantes: (float = 4 bytes) (double = 8 bytes)
        double nD = 1234.23456;
        float nF = 1234.23456F;//para el caso de float se debe colocar la letra "F" al final del valor para poderlo diferenciar.

        var salary = 1000;//int
        //pension 3%
        var pension = salary*0.03;//double
        var totalSalary = salary - pension; //double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Geraldine Meneses";
        System.out.println("EMPLOYEE: " + employeeName +" SALARY: " + salary);
    }
}
