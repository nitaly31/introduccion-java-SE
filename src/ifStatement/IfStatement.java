package ifStatement;

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // send file
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            System.out.println("Por favor enciende tu bluetooth");
        }
        System.out.println(fileSended);
        System.out.println(isBluetoothEnabled);
    }
}
