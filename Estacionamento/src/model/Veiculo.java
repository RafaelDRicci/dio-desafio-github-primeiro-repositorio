/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rafae
 */
public class Veiculo {
   
    private String placa;
    private String marca;
    private String modelo;
    private double fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
    private double totalEstacionamento;

    public Veiculo(String placa, String marca, String modelo) {
        
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
    public void calculaValor(double valorHora){
        
        int entrada = Integer.valueOf(horaEntrada);
        int saida = Integer.valueOf(horaSaida);
        
        totalEstacionamento = (saida - entrada)*valorHora;
        
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFatorEstacionamento() {
        return fatorEstacionamento;
    }

    public void setFatorEstacionamento(double fatorEstacionamento) {
        this.fatorEstacionamento = fatorEstacionamento;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getTotalEstacionamento() {
        return totalEstacionamento;
    }

    public void setTotalEstacionamento(double totalEstacionamento) {
        this.totalEstacionamento = totalEstacionamento;
    }
    
    
    
    
}
