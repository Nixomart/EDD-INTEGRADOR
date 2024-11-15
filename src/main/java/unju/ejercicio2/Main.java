package unju.ejercicio2;

import unju.ejercicio2.models.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital(10);

        // Registrar algunos médicos
        hospital.registrarMedico(new Medico(1234, "Dr. Gómez", "cirujano"));
        hospital.registrarMedico(new Medico(5678, "Dra. Pérez", "clinica general"));

        // Registrar algunos pacientes con diferentes diagnósticos
        Paciente paciente1 = new Paciente("12345678", "Juan Pérez", 45, new String[]{"hipertenso"}, 1);
        Paciente paciente2 = new Paciente("87654321", "María López", 30, new String[]{"diabético"}, 2);
        Paciente paciente3 = new Paciente("11223344", "Carlos García", 60, new String[]{"cardíaco"}, 1);

        hospital.registrarPaciente(paciente1);
        hospital.registrarPaciente(paciente2);
        hospital.registrarPaciente(paciente3);

        // Atender pacientes
        hospital.atenderPaciente(); // Atenderá primero al paciente con prioridad alta (paciente1)
        hospital.atenderPaciente(); // Atenderá al siguiente paciente con prioridad alta (paciente3)
        hospital.atenderPaciente();
    }
}