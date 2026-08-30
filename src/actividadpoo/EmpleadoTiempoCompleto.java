package actividadpoo;

public class EmpleadoTiempoCompleto extends Empleado {

    private long bonificacion;

    public EmpleadoTiempoCompleto(String nombre, double salario, long bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }
    @Override
    public double calcularSalario() {
        return getSalario() + bonificacion;
    }
}