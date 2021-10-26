/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;

/**
 *
 * @author rafae
 */
public class Estacionamento {
    
    private double valorHora;
    private double totalFaturamento;
    private double totalFaturamentoCarro;
    private double totalFaturamentoMoto;
    private double totalFaturamentoUtilitario;
    private List<Veiculo> veiculos;

    public Estacionamento(double valorHora){
        this.valorHora = valorHora;
        veiculos = new ArrayList<>();
    }
    
    public void darEntrada(Veiculo veiculo){
                
        String horaEntrada = ""+Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        veiculo.setHoraEntrada(horaEntrada);
        veiculos.add(veiculo);
        
    }
    
    public void darSaida(Veiculo veiculo){
        
        if(veiculos.contains(veiculo)){
            
            GregorianCalendar data = new GregorianCalendar();
            String horaSaida = ""+data.get(Calendar.HOUR_OF_DAY);
            veiculo.setHoraSaida(horaSaida);
            
            String tipoCarro = veiculo.getClass().getSimpleName();

                switch(tipoCarro){
                    case "Moto":
                        veiculo.calculaValor(valorHora * 0.85);
                        totalFaturamentoMoto += veiculo.getTotalEstacionamento();
                        break;
                    case "Utilitario":
                        veiculo.calculaValor(valorHora * 1.15);
                        totalFaturamentoUtilitario += veiculo.getTotalEstacionamento();
                        break;
                    default:
                        veiculo.calculaValor(valorHora);
                        totalFaturamentoCarro += veiculo.getTotalEstacionamento();
                        break;
                        
                }
                
            totalFaturamento += veiculo.getTotalEstacionamento();
            veiculos.remove(veiculo);
            
        } else throw new NoSuchElementException("Veículo Não Encontrado");
    }
    
    public Veiculo procurarVeiculo(String placa){
        
        for(Veiculo veiculo : veiculos){
            if(veiculo.getPlaca().equals(placa))
                return veiculo;
        }
        
        throw new NoSuchElementException("Nenhum Veículo Encontrado");
    }
    
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public void setTotalFaturamento(double totalFaturamento) {
        this.totalFaturamento = totalFaturamento;
    }

    public double getTotalFaturamentoCarro() {
        return totalFaturamentoCarro;
    }

    public void setTotalFaturamentoCarro(double totalFaturamentoCarro) {
        this.totalFaturamentoCarro = totalFaturamentoCarro;
    }

    public double getTotalFaturamentoMoto() {
        return totalFaturamentoMoto;
    }

    public void setTotalFaturamentoMoto(double totalFaturamentoMoto) {
        this.totalFaturamentoMoto = totalFaturamentoMoto;
    }

    public double getTotalFaturamentoUtilitario() {
        return totalFaturamentoUtilitario;
    }

    public void setTotalFaturamentoUtilitario(double totalFaturamentoUtilitario) {
        this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    
    
    
}
