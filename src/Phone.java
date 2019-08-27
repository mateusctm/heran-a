/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Phone extends telefone{

    public int getQtdBotao() {
        return qtdBotao;
    }

    public void setQtdBotao(int qtdBotao) {
        this.qtdBotao = qtdBotao;
    }

    public boolean isFlip() {
        return flip;
    }

    public void setFlip(boolean flip) {
        this.flip = flip;
    }

    public boolean isAntena() {
        return antena;
    }

    public void setAntena(boolean antena) {
        this.antena = antena;
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
    private int qtdBotao;
    private boolean flip;
    private boolean antena;
    
}
