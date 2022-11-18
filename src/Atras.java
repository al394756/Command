public class Atras implements Accion{
    private BeeBot bot;

    public void execute(){

        bot.irAtras();
    }

    public Atras(BeeBot bot){
        this.bot=bot;
    }
}
