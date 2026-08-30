package actividadpoo;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}