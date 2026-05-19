package DIP;

public class Main {
    public static void main(String[] args) {
        IntMensagem sms = new SMS();
        SistemaNotificacao sistema = new SistemaNotificacao(sms);
        sistema.fazerEnvio("estou anviando uma mensagem");
    }
}
