package unju.ejercicio2.models;

import unju.ejercicio2.utils.*;

import java.time.LocalDate;

public class Hospital {
    private Medicamento[] medicamentos; // Arreglo de medicamentos
    private QueuePriorizaVelocidad<Paciente> prioridadAlta; // Cola para prioridad 1
    private Queue<Paciente> prioridadMedia; // Cola para prioridad 2
    private Pila<Cirugia> programadas; // Pila para cirugías programadas
    private SimpleLinkedList<Consulta> consultasRealizadas; // Lista de consultas realizadas
    private SimpleLinkedList<Cirugia> cirugiasRealizadas; // Lista de cirugías realizadas
    private BinaryTree<Medico> disponibles; // Árbol binario de médicos disponibles

    public Hospital(int numMedicamentos) {
        this.medicamentos = new Medicamento[numMedicamentos];
        this.prioridadAlta = new QueuePriorizaVelocidad<>();
        this.prioridadMedia = new Queue<>();
        this.programadas = new Pila<>();
        this.consultasRealizadas = new SimpleLinkedList<>();
        this.cirugiasRealizadas = new SimpleLinkedList<>();
        this.disponibles = new BinaryTree<>();
    }


    // Método para registrar pacientes y clasificarlos en colas de prioridad
    public void registrarPaciente(Paciente paciente) {
        if (paciente.getDiagnosticoPreliminar() == 1) {
            prioridadAlta.add(paciente); // Diagnóstico 1 -> Prioridad Alta
        } else if (paciente.getDiagnosticoPreliminar() == 2) {
            prioridadMedia.add(paciente); // Diagnóstico 2 -> Prioridad Media
        } else {
            System.out.println("Diagnóstico no válido para el paciente: " + paciente.getNombre());
        }
        System.out.println("Paciente registrado: " + paciente.getNombre());
    }

    // Método para atender pacientes diferenciando entre consultas y cirugías
    public void atenderPaciente() {
        if (!prioridadAlta.isEmpty()) {
            // Atender paciente en prioridad alta (cirugía)
            Paciente paciente = prioridadAlta.remove();
            asignarCirugia(paciente);
        } else if (!prioridadMedia.isEmpty()) {
            // Atender paciente en prioridad media (consulta)
            Paciente paciente = prioridadMedia.remove();
            asignarConsulta(paciente);
        } else {
            System.out.println("No hay pacientes en espera.");
        }
    }

    // Método para asignar una cirugía a un paciente de prioridad alta
    private void asignarCirugia(Paciente paciente) {
        Medico cirujano = buscarMedicoDisponible("cirujano");
        if (cirujano != null) {
            Cirugia cirugia = new Cirugia(cirujano, paciente, LocalDate.now());
            programadas.push(cirugia);
            System.out.println("Cirugía programada para el paciente: " + paciente.getNombre() + " con el cirujano: " + cirujano.getNombre());
        } else {
            System.out.println("No hay cirujanos disponibles.");
        }
    }

    // Método para asignar una consulta a un paciente de prioridad media
    private void asignarConsulta(Paciente paciente) {
        Medico clinico = buscarMedicoDisponible("clinica general");
        if (clinico != null) {
            Consulta consulta = new Consulta(clinico, paciente, null, 0, LocalDate.now());
            consultasRealizadas.addFirst(consulta);
            System.out.println("Consulta registrada para el paciente: " + paciente.getNombre() + " con el clínico: " + clinico.getNombre());
        } else {
            System.out.println("No hay médicos de clínica general disponibles.");
        }
    }

    // Método para buscar un médico disponible por especialidad en el árbol
    private Medico buscarMedicoDisponible(String especialidad) {
        for (Medico medico : disponibles) {
            if (medico.getEspecialidad().equals(especialidad)) {
                // Remover médico del árbol para indicar que no está disponible
                disponibles.remove(medico);
                return medico;
            }
        }
        return null; // No se encontró médico disponible con la especialidad
    }
    public void registrarMedico(Medico medico) {
        disponibles.add(medico);
        System.out.println("Médico registrado: " + medico.getNombre() + " - Especialidad: " + medico.getEspecialidad());
    }
}
