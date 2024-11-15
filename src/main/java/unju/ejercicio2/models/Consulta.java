package unju.ejercicio2.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta {
    private Medico medicoACargo;
    private Paciente paciente;
    private Medicamento medicacionAdministrada;
    private int cantidadAplicada;
    private LocalDate fecha;

    public Consulta(Medico medicoACargo, Paciente paciente, Medicamento medicacionAdministrada, int cantidadAplicada, LocalDate fecha) {
        this.medicoACargo = medicoACargo;
        this.paciente = paciente;
        this.medicacionAdministrada = medicacionAdministrada;
        this.cantidadAplicada = cantidadAplicada;
        this.fecha = fecha;
    }

    public Consulta() {
    }

    public Medico getMedicoACargo() {
        return medicoACargo;
    }

    public void setMedicoACargo(Medico medicoACargo) {
        this.medicoACargo = medicoACargo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicamento getMedicacionAdministrada() {
        return medicacionAdministrada;
    }

    public void setMedicacionAdministrada(Medicamento medicacionAdministrada) {
        this.medicacionAdministrada = medicacionAdministrada;
    }

    public int getCantidadAplicada() {
        return cantidadAplicada;
    }

    public void setCantidadAplicada(int cantidadAplicada) {
        this.cantidadAplicada = cantidadAplicada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
