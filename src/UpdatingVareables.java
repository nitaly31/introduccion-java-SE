public class UpdatingVareables {
    public static void main(String[] args) {
        int salary = 1000;
        System.out.println(salary);
        //bono $200
        salary += 200;
        System.out.println(salary);
        //pension: $50 descuento
        salary -= 50;
        System.out.println(salary);
        //2 horas extra $30 c/h
        // comida: $45
        salary += (30*2) - 45;
        System.out.println(salary);
        //Actualizando cadenas de texto
        String employeeName = "Nitaly Meneses";
        employeeName += " Peralta";
        System.out.println(employeeName);
        employeeName = "Geraldine " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}
