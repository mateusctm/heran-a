/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class TelefoneFixo extends telefone{
    private boolean fio;
    private double peso;

    public boolean isFio() {
        return fio;
    }

    public void setFio(boolean fio) {
        this.fio = fio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getTamanho() {
        return tamanho;
    }

    @Override
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean isTela() {
        return tela;
    }

    @Override
    public void setTela(boolean tela) {
        this.tela = tela;
    }

    @Override
    public double getBateria() {
        return bateria;
    }

    @Override
    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "TelefoneFixo{" + "fio=" + fio + ", peso=" + peso + '}';
    }
    
}
