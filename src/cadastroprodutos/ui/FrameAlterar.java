/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroprodutos.ui;

import cadastroprodutos.controller.ProdutoController;
import cadastroprodutos.model.Produto;

/**
 *
 */
public class FrameAlterar extends CadastroProduto {

    /*private Produto produto;
    private Object descricaoProd;
    private Object precoCompra;
    private Object codProduto;
    private Object precoVenda;
    private Object PrecoCompra;
    private Object DescricaoProd;*/
   
    
    public FrameAlterar(Produto p) {
        super();
        this.produto = p;
        codProduto.setText(Integer.toString(produto.getCodProduto()));
        codProduto.setEnabled(false);
        descricaoProd.setText(produto.getDescricaoProd());
        precoCompra.setText(produto.getPrecoCompra().toString());
        precoVenda.setText(produto.getPrecoVenda().toString());
        fornecedorProd.setText(produto.getFornecedorProd());
        jLabel1.setText("Alterar Produto");
        salvarProd.setText("Alterar");
    }
    
    @Override
    public void acaoProduto() {
        ProdutoController pc = new ProdutoController();
        produto.setDescricaoProd(DescricaoProd.getText());
        produto.setPrecoCompra(Double.parseDouble(PrecoCompra.getText()));
        produto.setPrecoVenda(Double.parseDouble(PrecoVenda.getText()));
        produto.setQtdProduto(Double.parseDouble(QtdProduto.getText()));
        produto.setUnidade(Unidade.getText());
        pc.alterar(produto);
        setVisible(false);
    }
    
}
