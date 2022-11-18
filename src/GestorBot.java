public class GestorBot {
    private Accion accion;

    public GestorBot(Accion accion){
        this.accion=accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    public void ejecutarAccion(){
        accion.execute();
    }
}
