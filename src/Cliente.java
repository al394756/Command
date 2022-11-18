public class Cliente {
    public static void main(String[] args) {
        BeeBot bot= new BeeBot();

        Accion accion= new Adelante(bot);
        GestorBot gestorBot= new GestorBot(accion);
        gestorBot.ejecutarAccion();

        accion= new GirarIzquierda(bot);
        gestorBot.setAccion(accion);
        gestorBot.ejecutarAccion();

        accion=new Adelante(bot);
        gestorBot.setAccion(accion);
        gestorBot.ejecutarAccion();

        gestorBot.setAccion(accion);
        gestorBot.ejecutarAccion();

        accion= new GirarDerecha(bot);
        gestorBot.setAccion(accion);
        gestorBot.ejecutarAccion();

        accion= new Borrar(bot);
        gestorBot.setAccion(accion);
        gestorBot.ejecutarAccion();

        bot.go();
    }
}