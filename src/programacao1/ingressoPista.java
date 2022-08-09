package programacao1;

//subclasse da classe ingresso contendo o metodo que imprime o valor do ingresso

public class ingressoPista extends ingresso{
    private double valorUnico;

    public ingressoPista(String nomeCliente, String cpf, String eventoRelacionado, double valorUnico) {
        super( nomeCliente, cpf, eventoRelacionado);
        this.valorUnico = valorUnico;

    }


    public void imprimir() {
        super.mostrarResumo( );
        System.out.println("Valor ingresso Pista = " + this.valorUnico);
    }
}