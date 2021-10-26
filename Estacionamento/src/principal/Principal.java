/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import model.Carro;
import model.Estacionamento;
import model.Moto;
import model.Utilitario;

/**
 *
 * @author rafae
 */
public class Principal {
   
    public static void main(String[] args) {
        
        Moto moto = new Moto("000", "Honda", "Pop");
        Carro carro = new Carro("001", "Fiat", "Uno");
        Utilitario utilitario = new Utilitario("002", "Scania", "Caminhãozão");
        
        Estacionamento estacionamento = new Estacionamento(5f);
        
        estacionamento.darEntrada(moto);
        estacionamento.darEntrada(carro);
        estacionamento.darEntrada(utilitario);
        
        moto.setHoraEntrada("14");
        carro.setHoraEntrada("7");
        utilitario.setHoraEntrada("19");
        
        estacionamento.darSaida(moto);
        estacionamento.darSaida(carro);
        estacionamento.darSaida(utilitario);
        
        double faturamentoMoto = estacionamento.getTotalFaturamentoMoto();
        double faturamentoCarro = estacionamento.getTotalFaturamentoCarro();
        double faturamentoUtilitario = estacionamento.getTotalFaturamentoUtilitario();
        double faturamentoTotal = estacionamento.getTotalFaturamento();
        

        System.out.println("\t\t\tMoto\t\tCarro\t\tUtilitario\tTotal");
        System.out.println( "Faturamento\t\t" + faturamentoMoto + "\t\t" + faturamentoCarro + "\t\t" + faturamentoUtilitario +"\t\t" + faturamentoTotal);

    }
}
