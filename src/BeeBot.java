import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BeeBot {

    Queue<Accion> cola= new LinkedList<>();

    public void addAccion(Accion a){
        cola.add(a);
    }
        public void irAdelante(){
        System.out.println("Siguiendo recto...");
    }

    public void irAtras(){
        System.out.println("Dando la vuelta...");
    }

    public void girarDerecha(){
        System.out.println("Girando derecha...");
    }
    public void girarIzquierda(){
        System.out.println("Girando izquierda...");
    }
}
