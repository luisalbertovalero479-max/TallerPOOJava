package actividadpoo;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Carlos", 25, "123456789");

        persona1.mostrarInformacion();
        if (persona1.esMayorDeEdad()) {
            System.out.println("Carlos es mayor de edad");
        } else {
            System.out.println("Carlos no es mayor de edad");
        }
        ArrayList<Persona> personas = new ArrayList<>();
        Random random = new Random();
        String[] nombres = {
                "Carlos",
                "Ana",
                "Luis",
                "Pedro",
                "Laura",
                "Sofia",
                "Andres",
                "Camila",
                "Daniel",
                "Maria"
        };
        for (int i = 0; i < 10; i++) {

            int edadAleatoria = random.nextInt(50) + 10;

            Persona persona = new Persona(
                    nombres[i],
                    edadAleatoria,
                    "DOC-" + (i + 1)
            );

            personas.add(persona);
        }

        for (Persona persona : personas) {

            if (persona.esMayorDeEdad()) {
                System.out.println("Nombre: " + persona.getNombre() + " - Es mayor de edad");
            } else {
                System.out.println("Nombre: " + persona.getNombre() + " - No es mayor de edad");
            }
        }

        EmpleadoTiempoCompleto empleado1 =
                new EmpleadoTiempoCompleto("Juan Perez", 2000000, 500000);

        EmpleadoPorHoras empleado2 =
                new EmpleadoPorHoras("Ana Lopez", 40, 60000);
        System.out.println("Empleado: " + empleado1.getNombre()
                + " - Salario calculado: $" + empleado1.calcularSalario());

        System.out.println("Empleado: " + empleado2.getNombre()
                + " - Salario calculado: $" + empleado2.calcularSalario());

        ArrayList<Empleado> empleados = new ArrayList<>();
        String[] nombresEmpleados = {
                "Juan Perez",
                "Ana Lopez",
                "Carlos Ruiz",
                "Laura Gomez",
                "Pedro Martinez",
                "Sofia Torres",
                "Andres Rojas",
                "Camila Diaz",
                "Daniel Castro",
                "Maria Hernandez"
        };
        for (int i = 0; i < nombresEmpleados.length; i++) {

            if (i % 2 == 0) {

                double salario = random.nextInt(2000001) + 2000000;
                long bonificacion = random.nextInt(500001) + 100000;

                empleados.add(new EmpleadoTiempoCompleto(
                        nombresEmpleados[i],
                        salario,
                        bonificacion
                ));

            } else {

                int horasTrabajadas = random.nextInt(31) + 20;
                double valorHora = random.nextInt(40001) + 40000;

                empleados.add(new EmpleadoPorHoras(
                        nombresEmpleados[i],
                        horasTrabajadas,
                        valorHora
                ));
            }
        }
        for (Empleado empleado : empleados) {

            System.out.println(
                    "Empleado: " + empleado.getNombre()
                            + " - Salario calculado: $"
                            + empleado.calcularSalario()
            );
        }
        Calculadora calculadora = new Calculadora();

        double resultadoSuma = calculadora.sumar(20, 30);

        calculadora.mostrarResultado("Suma", resultadoSuma);

        double resultadoResta = calculadora.restar(20, 30);

        calculadora.mostrarResultado("Resta", resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(20, 30);

        calculadora.mostrarResultado("Multiplicacion", resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(20, 30);

        calculadora.mostrarResultado("Division", resultadoDivision);
    }
}