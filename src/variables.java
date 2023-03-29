public class variables {
    public static void main(String[] args) {
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary); // 1200

        salary += 300;
        System.out.println(salary); // 1500

        // Actualizar variables de tipo String:
        String employeeName = " Anahí";
        employeeName = employeeName + " Salgado";
        System.out.println(salary); // Anahí Salgado

        employeeName += " Díaz de la Vega";
        System.out.println(employeeName); // Anahí Salgado Díaz de la Vega

        employeeName = "Irene" + employeeName;
        System.out.println(employeeName);

        int numero8 = 55;
        int numero20 = 44;
        int totalnumero = numero8 + numero20;
        System.out.println(totalnumero);

    }
}
