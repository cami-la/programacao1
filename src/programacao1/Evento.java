package programacao1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerleidson
 */
public class Evento {
    private String nomeEvento;
    private String data;
    private double valorUnico;
    private int capacidadeMax;
    List<ingresso>ingressos;

    public Evento(){

    }

    public Evento (String nomeEvento, String data, double valorUnico, int capacidadeMax){
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMax = capacidadeMax;
        this.ingressos = new ArrayList<ingresso>();
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public List<ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    //metodo para vender ingresso
    public void venderIngresso (ingresso ingresso){
        ingressos.add(ingresso);
    }

    //imprime dados do evento
    public void mostrarEvento(){

        System.out.println("\n------------------------- EVENTO -------------------------------");
        System.out.println("Nome do Evento: " +  nomeEvento);
        System.out.println("Data: " + data);
        System.out.println("Valor do Ingresso: " + valorUnico);
        System.out.println("Capacidade Maxima: " + capacidadeMax);

    }

    //metodo que indica a quantidade de ingressos vendidos
    public void ingressosVendidos(){
        System.out.println("\n>>> Total de ingressos vendidos: " + ingressos.size());
    }
}

