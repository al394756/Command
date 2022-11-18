public class Adelante implements Accion{
    private BeeBot bot;
    public void execute(){
        bot.irAdelante();
    }

    public Adelante(BeeBot bot) {
        this.bot = bot;
    }
}
