public class Adelante implements Accion{
    private BeeBot bot;
    public void execute(){
        bot.irAdelante();
    }

    public void almacenar(){
        bot.addAccion(this);
    }
    public Adelante(BeeBot bot) {
        this.bot = bot;
    }
}
