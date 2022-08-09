package programacao1;

import programacao1.Evento;
import programacao1.ingressoCamarote;
import programacao1.ingressoPista;
import programacao1.ingressoVip;

/**
 *
 * @author Gerleidson
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //intancias das subclasses da classe ingresso

        ingressoPista pista = new ingressoPista ("Gerleidson Bomfim", "192.168.000.01" , "Rock in Rio 2022", 100);
        ingressoVip vip = new ingressoVip ("Sylla Bomfim", "192.168.000.02" , "Rock in Rio 2022",100);
        ingressoCamarote camarote = new ingressoCamarote ("Iris Bomfim", "192.168.000.03" , "Rock in Rio 2022", 100);

        //instancia da classe evento
        Evento evento1 = new Evento ("Rock in Rio 2022", "14/10/2022", (double) 100.00, 100 );

        //vender ingresso
        evento1.venderIngresso(pista);
        evento1.venderIngresso(vip);
        evento1.venderIngresso(camarote);
        evento1.mostrarEvento();

        //metodos para imprimir os ingressos.
        pista.imprimir();
        vip.imprimir();
        camarote.imprimir();

        //metodo que mostrar a quantidade de ingressos vendidos
        evento1.ingressosVendidos();

    }
}
