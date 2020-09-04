package cadastroprodutos.model;

import java.util.*;

/**
 * 
 */
public class Produto extends Observable implements Comparable<Produto> {

    /**
     * Default constructor
     */
    public Produto() {
    }
    
    private int codProduto;
    private String descricaoProd;
    private Double precoCompra;
    private Double precoVenda;
    private Double qtdProduto;
    private String unidade;
    private String fornecedorProd;

    public String getFornecedorProd() {
        return fornecedorProd;
    }

    public void setFornecedorProd(String fornecedorProd) {
        this.fornecedorProd = fornecedorProd;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(Double qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
        this.setChanged();
        this.notifyObservers();
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
        this.setChanged();
        this.notifyObservers();
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
        this.setChanged();
        this.notifyObservers();
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    //Compara os produtos pelo seu codigo
    public int compareTo(Produto outro) {
        if(this.getCodProduto() == outro.getCodProduto())
            return 0;
        else if(this.getCodProduto() < outro.getCodProduto())
            return -1;
        return 1;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Produto) {
            Produto outro = (Produto) o;
            if(this.getCodProduto() == outro.getCodProduto())
                return true;
        }
        return false;
    }


}