package unju.ejercicio2.models;

import unju.ejercicio2.utils.*;

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
}
