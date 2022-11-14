/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comerciante;

/**
 *
 * @author frank
 */
public class Produto {
    private String nome;
    private double precoVenda;
    private double precoCompra;

    public Produto(String nome, double precoVenda, double precoCompra) {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
    
    
    
}
