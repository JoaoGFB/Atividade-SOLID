package DIP;

public class WhatsApp implements IntMensagem{
    @Override
    public void envioMensagem(String msg) {
        System.out.println("Mensagem enviada por WhatsApp: "+msg);
    }
}
