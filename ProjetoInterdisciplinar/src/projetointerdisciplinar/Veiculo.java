/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar;

/**
 *
 * @author Richa
 */
public class Veiculo {
    private String placa, marca, modelo,Estado,Loja;
    private int Ano;
    private String date;
    private float preco;

    public Veiculo() {
    }

    public Veiculo(String placa, String marca, String modelo, String Estado, String Loja, int Ano, String date, float preco) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.Estado = Estado;
        this.Loja = Loja;
        this.Ano = Ano;
        this.date = date;
        this.preco = preco;
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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getLoja() {
        return Loja;
    }

    public void setLoja(String Loja) {
        this.Loja = Loja;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
