package Switch;

public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Darck";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Darck":
                System.out.println("Seleccionaste Blue Darck Mode");
                break;
            case "Darck":
                System.out.println("Seleccionaste Darck Mode");
            default:
                System.out.println("Selecciona una opcion que sea correcta");
        }
    }
}
