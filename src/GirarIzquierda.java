public class GirarIzquierda implements  Accion{
    private BeeBot bot;

    public void execute(){
        bot.girarIzquierda();
    }

    public GirarIzquierda(BeeBot bot) {
        this.bot = bot;
    }
}
