package hijo;
import padre.empleado;
public class ScrumMaster extends empleado {

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ScrumMaster(String nombre, double sueldo, String depto) {
        super(nombre, sueldo);
        this.departamento = depto;
    }

    @Override
    public String obtenerDetalles(){
        return "Desde Hijo Nombre" + this.getNombre() + ", sueldo: " + this.getSueldo() + " departamento: " + this.departamento;
    }
}