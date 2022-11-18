public class Borrar implements Accion{
    BeeBot bot;

    public void execute(){
        bot.borrar();
    }
    public Borrar(BeeBot bot){
        this.bot=bot;
    }
    public void almacenar(){
        bot.addAccion(this);
    }
}
