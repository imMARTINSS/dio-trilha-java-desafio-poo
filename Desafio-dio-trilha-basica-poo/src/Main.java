public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Dark Necessities - RHCP");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n");//só pra separar

        iphone.ligar("(98)987787635");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n"); //só pra separar

        iphone.exibirPagina("www.Dio.me");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }

}
