public class Iphone implements MusicPlayer, TelephoneDevice, InternetBrowser  {
    private String musicaAtual;

    @Override
    public void tocar() throws IphoneCustomException {
        if(musicaAtual == null){
            throw new IphoneCustomException("Por favor, escolha uma musica para ser reproduzida");
        } else {System.out.println("Musica tocando: " + musicaAtual);}
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor pausado! ");
    }

    @Override
    public void selecionarMusica(String musica) throws IphoneCustomException{
        if(musica == null){
            throw new IphoneCustomException("Por favor, escolha uma musica!");
        } else {
            this.musicaAtual = musica;
            System.out.println("Musica sendo reproduzida: " + musicaAtual);
        }
    }

    @Override
    public void ligar(String numero) throws IphoneCustomException {
        if(numero == null){
            throw new IphoneCustomException("Por favor, informe um numero!");
        } else {System.out.println("Ligando para o numero " + numero);}
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void exibirPagina(String url)  throws IphoneCustomException{
        if(url == null){
            throw new IphoneCustomException("Por favor, informe uma url!");
        } else {System.out.println("Pagina sendo exibida " + url);}
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }

}
