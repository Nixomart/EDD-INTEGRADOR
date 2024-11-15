package unju.ejercicio2.models;

public class Medico {
    private int matriculaProfesional;
    private String nombre;
    private String especialidad;

    public Medico(int matriculaProfesional, String nombre, String especialidad) {
        this.matriculaProfesional = matriculaProfesional;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public Medico() {
    }

    public int getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(int matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
