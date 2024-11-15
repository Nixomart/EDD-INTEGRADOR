package unju.ejercicio2.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cirugia {
    private Medico medicoResponsable;
    private Paciente paciente;
    private LocalDate fecha;

    public Cirugia(Medico medicoResponsable, Paciente paciente, LocalDate fecha) {
        this.medicoResponsable = medicoResponsable;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public Medico getMedicoResponsable() {
        return medicoResponsable;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

}
