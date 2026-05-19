package DIP;

public class SistemaNotificacao {
    private IntMensagem formaMensagem;

    public SistemaNotificacao(IntMensagem formaMensagem) {
        this.formaMensagem = formaMensagem;
    }
    public void fazerEnvio(String msg) {
        this.formaMensagem.envioMensagem(msg);
    }
}
