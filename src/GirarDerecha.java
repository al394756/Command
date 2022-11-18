public class GirarDerecha implements Accion{
    BeeBot bot;
    public void execute(){
        bot.girarDerecha();
    }
    public GirarDerecha(BeeBot bot){
        this.bot=bot;
    }
    public void almacenar(){
        bot.addAccion(this);
    }
}
