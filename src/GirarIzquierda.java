public class GirarIzquierda implements  Accion{
    private BeeBot bot;

    public void execute(){
        bot.girarIzquierda();
    }

    public void almacenar(){
        bot.addAccion(this);
    }

    public GirarIzquierda(BeeBot bot) {
        this.bot = bot;
    }
}
