package DIP;

public class Emai implements IntMensagem{
    @Override
    public void envioMensagem(String msg) {
        System.out.println("Mensagem enviada por email: "+msg);
    }
}
