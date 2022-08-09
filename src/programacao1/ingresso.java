package programacao1;


import java.util.ArrayList;

/**
 *
 * @author Gerleidson
 */
public class ingresso {

    private String nomeCliente;
    private String cpf;
    private String eventoRelacionado;
    ArrayList<Evento>eventos;


    public ingresso(){

    }

    public ingresso(String nomeCliente, String cpf, String eventoRelacionado){
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.eventoRelacionado = eventoRelacionado;
        this.eventos = new ArrayList<Evento>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(String eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }

    public void eventos (Evento evento){
        eventos.add(evento);
    }

    //metodo que imprime os dados da venda do ingresso (deve imprimir os dados: nome e cpf do cliente, nome e data do evento
    public void mostrarResumo( ){
        System.out.println("\n\t\t\t>>> Resumo <<<");
        System.out.println("\nNome do Cliente: " + nomeCliente+ "\t CPF:  " + cpf);

        //ao tirar o comentario da linha abaixo, apresetará erro de index, informando o array vazio

        //System.out.println("evento: " + eventos.get(0).getNomeEvento());

    }

}



