package DataTypesJava;

public class DataTypes {
    public static void main(String[] args) {
        //int es una variable que tiene un limite de espacio de memoria, pudiendo almacenar hasta 10 digitos.
        int n = 1234567890;
        // tipos de datos enteros: (byte = 1 byte) (short = 2 byte) (int = 4 bytes) (long = 8 bytes)

        //En los casos de tipo long no solo basta iniciarlo con esa variable. sino tambien colocar la letra "L"
        // al final del valor para que sea considerado de ese tipo.
        long nL = 12345678901L;
        // Tipo de datos Flotantes: (float = 4 bytes) (double = 8 bytes)
        double nD = 1234.23456;
        //para el caso de float se debe colocar la letra "F" al final del valor para poderlo diferenciar.
        float nF = 1234.23456F;
    }
}
