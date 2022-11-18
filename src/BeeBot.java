import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BeeBot {

    Stack<Accion> pila= new Stack<>();

    public void addAccion(Accion a){
        if (a.getClass().equals(Borrar.class)){
            this.borrar();
            return;
        }

        pila.add(a);
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

    public void borrar(){
        pila.pop();
    }

    public void go(){
        for (Accion a: pila){
            a.execute();
        }
    }
}
