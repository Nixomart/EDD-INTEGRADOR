package unju.ejercicio2.utils;

public class Pila <ELEMENT>{
    private final static Integer maximoTamaño=5;
    private ELEMENT [] datos;
    private int cuenta;

    public Pila() {
        this.datos=(ELEMENT[]) new Object[this.maximoTamaño];
        this.cuenta=0;
    }
    public void push(ELEMENT elemento) {
        if (this.isFull()) {
            throw new RuntimeException("La pila esta llena...");
        }
        this.datos[this.cuenta]=elemento;
        ++this.cuenta;
    }
    public ELEMENT pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("La pila esta vacía...");
        }
        --this.cuenta;
        return this.datos[this.cuenta];
    }
    public ELEMENT peek() {
        if (this.isEmpty()) {
            throw new RuntimeException("La pila esta vacía...");
        }
        return this.datos[this.cuenta - 1];
    }
    public boolean isEmpty() {
        return this.cuenta<=0;
    }
    public boolean isFull() {
        return this.cuenta>=datos.length;
    }
    public int count() {
        return this.cuenta;
    }
}