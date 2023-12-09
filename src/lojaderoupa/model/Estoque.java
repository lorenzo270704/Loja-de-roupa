/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.model;

/**
 *
 * @author 66211020764
 */
public class Estoque {
    private int idEstoque;
    private String quantidadeEst;
    private Produto produto;

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getQuantidadeEst() {
        return quantidadeEst;
    }

    public void setQuantidadeEst(String quantidadeEst) {
        this.quantidadeEst = quantidadeEst;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Estoque(int idEstoque, String quantidadeEst, Produto produto) {
        this.idEstoque = idEstoque;
        this.quantidadeEst = quantidadeEst;
        this.produto = produto;
    }
    
    
}
