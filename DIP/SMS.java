package DIP;

public class SMS implements IntMensagem{
    @Override
    public void envioMensagem(String msg) {
        System.out.println("Mensagem enviada por SMS: "+msg);
    }
}
