package unju.ejercicio2.models;

public class Paciente {
    private String dni;
    private String nombre;
    private int edad;
    private String[] antecedentes;
    private int diagnosticoPreliminar;

    public Paciente(String dni, String nombre, int edad, String[] antecedentes, int diagnosticoPreliminar) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.antecedentes = antecedentes;
        this.diagnosticoPreliminar = diagnosticoPreliminar;
    }

    public Paciente() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String[] antecedentes) {
        this.antecedentes = antecedentes;
    }

    public int getDiagnosticoPreliminar() {
        return diagnosticoPreliminar;
    }

    public void setDiagnosticoPreliminar(int diagnosticoPreliminar) {
        this.diagnosticoPreliminar = diagnosticoPreliminar;
    }
}
