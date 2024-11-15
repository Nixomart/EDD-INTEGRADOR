package unju.ejercicio2.utils;

import java.util.Arrays;

public class ColaCircularGenerica <T>{
	 private final static Integer defaulDimension = 4;

	    //endregion

	    //region Attributes

	    private T [] data;
	    private int head;
	    private int tail;
	    
	    public ColaCircularGenerica() {
	        this(ColaCircularGenerica.defaulDimension);
	    }
	    public ColaCircularGenerica(int dimension) {
	        this.data = (T[]) new Object[dimension];
	        this.head = 0;
	        this.tail = 0;
	    }
	    
	    private int next(int pos) {
	        if (++pos >= this.data.length) {
	            pos = 0;
	        }
	        return pos;
	    }

	    //AGREGA UN ELEMENTO A LA COLA DEVOLVIENDO UNA EXCEPCION SI ESTA LLENA,
	    //solo se pueden guardar (n-1) elementos donde n es el tamaño del arreglo, por eso desperdicia siempre un espacio
	    public boolean add(T element) {

	        if (head==next(tail)){//Aqui se pregunta si la posicion siguiente a donde quiero
	        	//guardar el elemento no es el head si el siguiente no es head lo guarda sino no lo guarda.
	            throw new IllegalStateException("Cola llena ...");
	        }

	        this.data[this.tail] = element;
	        this.tail = this.next(this.tail);
	        return true;
	    }
	    
	    //DEVUELVE EL ELEMENTO PROXIMO A SALIR DE LA COLA SI LA COLA ESTA VACIA DEVUELVE UNA EXCEPCION
	    public T element() {

	        if (head==tail) {
	            throw new IllegalStateException("Cola vacía ...");
	        }

	        return this.data[this.head];
	    }
	    
	    //AGREGA UN ELEMENTO A LA COLA ,RETORNA FALSE SI ESTA LLENA
	    public boolean offer(T element) {

	        if (head==next(tail)) {
	            return false;
	        }

	        this.data[this.tail] = element;
	        this.tail = this.next(this.tail);

	        return true;
	    }
	    
	  //DEVUELVE EL ELEMENTO PROXIMO A SALIR,DEVUELVE NULL SI ESTA VACIA LA COLA
	    public T peek() {
	        if (head==tail) {
	            return null;
	        }

	        return this.data[this.head];
	    }

	  //DEVUELVE Y ELIMINA EL ELEMENTO PROXIMO A SALIR EN LA COLA ,LUEGO HEAD AVANZA EN UNO Y MERMA EN UNO LOS 
	    //ELEMENTOS CARGADOS,SI LA COLA ESTA VACIA DEVUELVE NULL.
	    public T pool() {
	        if (head==tail) {
	            return null;
	        }

	        T result = this.data[this.head];
	        this.head = this.next(this.head);

	        return result;
	    }

	  	//DEVUELVE Y ELIMINA EL ELEMENTO PROXIMO A SALIR EN LA COLA ,LUEGO HEAD AVANZA EN UNO Y MERMA EN UNO LOS
	    //ELEMENTOS CARGADOS,SI LA COLA ESTA VACIA DEVUELVE UNA EXCEPCION.
	    public T remove() {
	        if (head==tail) {
	            throw new IllegalStateException("Cola vacía ...");
	        }

	        T result = this.data[this.head];
	        this.head = this.next(this.head);

	        return result;
	    }
	public int size() {
		// Calcular el tamaño de la cola en tiempo real
		if (isEmpty()) {
			return 0;
		} else {
			return (head - tail + 1 + defaulDimension) % defaulDimension;
		}
	}
	/*  @Override
	  public String toString() {
	        if (this.size() <=0) {
	            return "";
	        }
	        // from https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuilder.html
	        StringBuilder sb = new StringBuilder();
	        sb.append("[" + this.data[this.head].toString());
	        for (int cta = 1, pos = this.next(this.head); cta < this.size(); ++cta, pos = this.next(pos)) {
	            sb.append(", " + this.data[pos].toString());
	        }
	        sb.append("]");
	        return sb.toString();
	    }*/

	@Override
	public String toString() {
		return "ColaCircularGenerica{" +
				"data=" + Arrays.toString(data) +
				", head=" + head +
				", tail=" + tail +
				'}';
	}

	//DEVUELVE TRUE SI LA COLA ESTA VACIA Y FALSE EN CASO CONTRARIO
	    public boolean isEmpty() {
	    	boolean vacio=false;
	        if(head==tail) {
	        	vacio=true;
	        }
	        return vacio;
	    }
		public boolean addd(T item){
			if(isEmpty()){
				return false;
			}
			this.data[this.tail] = item;
			this.tail = next(this.tail);
			return true;
		}
	 /* public Object[] toArray() {
	        Object[] result = new Object[this.count];
	        for(int i = 0, pos = this.head, cta = this.size(); cta > 0; ++i, pos = this.next(pos), --cta) {
	            result[i] = this.data[pos];
	        }
	        return result;
	    }*/
}
