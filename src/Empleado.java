import java.util.Scanner;

public class Empleado {
    String nombre;
    String cargo;
    float salario;
    String fecha;

    public Empleado(String nombre, String cargo, float salario, String fecha) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;
    }

    public void informacion(){
        System.out.println(" ");
        System.out.println("Infromación del empleado ");
        System.out.println("Nombre del empleado: " + nombre+ "\nCargo: " + cargo+ "\nSalario: " + salario+ "\nFecha: " + fecha);
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // Valores Quemados
        /*

        Empleado empleado1 = new Empleado("Mark Anagumbla","Gerente", 1200.67F, "12-04-2022");
        Empleado empleado2 = new Empleado ("Mayra Salazar","Secretaria",1350.25F, "10-01-2021");
        Empleado empleado3 = new Empleado ("Gabriela Fernandez","Doctora",1350.25F, "24-12-2020");

        empleado1.informacion();
        empleado2.informacion();
        empleado3.informacion();*/


        Scanner sc = new Scanner(System.in);

        Empleado[] empleados= new Empleado[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Ingrese el nombre del empleado " + (i + 1)+": ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la ocupacion del empleado " +(i + 1)+": ");
            String cargo = sc.nextLine();

            System.out.println("Ingrese la fecha que ingreso el empleado " +(i + 1)+ ": ");
            String fecha = sc.nextLine();

            System.out.println("Ingrese el salario del empleado " +(i + 1)+ ": ");
            float salario = sc.nextFloat();

            sc.nextLine();

            empleados[i] = new Empleado(nombre, cargo, salario, fecha);
        }


        for (int i = 0; i < 3; i++){
            empleados[i].informacion();
        }






    }
}
