package unju.ejercicio2.utils;

public class QueuePriorizaVelocidad<E>  {

	protected final static Integer defaulDimension = 10;// Capacidad máxima de la cola
    private E[] arreglo; // Arreglo para almacenar los elementos de la cola
    private int frente; // Índice del frente de la cola
    private int fin; // Índice del final de la cola

    // Constructor
    public QueuePriorizaVelocidad(int capacidad) {
        this.arreglo = (E[]) new Object[capacidad];
        this.frente = 0;
        this.fin = -1;
    }

    public QueuePriorizaVelocidad() {
		this(QueuePriorizaVelocidad.defaulDimension);
	}

	public void add(E elemento) {
        // Verificar si la cola está llena
        if (isFull()) {
            throw new IllegalStateException("La cola está llena");
        }
        // Incrementar el índice del final y circular si es necesario
        fin = (fin + 1) % defaulDimension;
        // Insertar el elemento en el índice del final
        arreglo[fin] = elemento;
    }

    public E remove() {
        // Verificar si la cola está vacía
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        // Obtener el elemento del frente de la cola
        E elemento = arreglo[frente];
        // Mover el índice del frente al siguiente elemento (circular si es necesario)
        frente = (frente + 1) % defaulDimension;
        return elemento;
    }

    public E element() {
        // Verificar si la cola está vacía
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        // Devolver el elemento del frente de la cola
        return arreglo[frente];
    }

    public boolean isEmpty() {
        // La cola está vacía si frente y fin están en la misma posición
        return frente == (fin + 1) % defaulDimension;
    }

    public boolean isFull() {
        // La cola está llena si el siguiente índice después de fin es igual a frente
        return frente == (fin + 2) % defaulDimension;
    }

    public int size() {
        // Calcular el tamaño de la cola en tiempo real
        if (isEmpty()) {
            return 0;
        } else {
            return (fin - frente + 1 + defaulDimension) % defaulDimension;
        }
    }
}