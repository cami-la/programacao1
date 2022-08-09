package programacao1;

//subclasse da classe ingresso contendo o metodo que calcula e imprime o valor do ingresso adicionando + 60%

public class ingressoCamarote extends ingresso{
    private double valorUnico;

    public ingressoCamarote(String nomeCliente, String cpf, String eventoRelacionado, double valorUnico) {

        super( nomeCliente, cpf, eventoRelacionado);

        this.valorUnico = valorUnico;

    }

    public void imprimir() {
        super.mostrarResumo( );
        System.out.println("Valor ingresso Camarote = " + this.valorUnico * 1.6);
    }
}