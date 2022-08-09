package programacao1;

//subclasse da classe ingresso contendo o metodo que calcula e imprime o valor do ingresso adicionando + 30%


public class ingressoVip extends ingresso{

    private double valorUnico;

    public ingressoVip(String nomeCliente, String cpf, String eventoRelacionado, double valorUnico) {

        super( nomeCliente, cpf, eventoRelacionado);

        this.valorUnico = valorUnico;

    }


    public void imprimir() {
        super.mostrarResumo( );

        System.out.println("Valor ingresso Vip = " + this.valorUnico *1.3);
    }
}