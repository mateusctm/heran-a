/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class SmartPhone extends telefone  {
    private boolean touchscreen;
    private boolean internet;
    private double qtdPxCamera;

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void setTela(boolean tela) {
        this.tela = tela;
    }

    @Override
    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getTamanho() {
        return tamanho;
    }

    @Override
    public boolean isTela() {
        return tela;
    }

    @Override
    public double getBateria() {
        return bateria;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void setQtdPxCamera(double qtdPxCamera) {
        this.qtdPxCamera = qtdPxCamera;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public boolean isInternet() {
        return internet;
    }

    public double getQtdPxCamera() {
        return qtdPxCamera;
    }
}
