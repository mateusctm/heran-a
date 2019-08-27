/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class telefone {
    protected String cor;
    protected String marca;
    protected String modelo;
    protected double tamanho;
    protected boolean tela;
    protected double bateria;

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public double getBateria() {
        return bateria;
    }

    public boolean isTela() {
        return tela;
    }

    public void setTela(boolean tela) {
        this.tela = tela;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamanho() {
        return tamanho;
    }
    
    

    @Override
    public String toString() {
        return "telefone{" + "cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", tamanho=" + tamanho + ", tela=" + tela + ", bateria=" + bateria + '}';
    }
            
}
