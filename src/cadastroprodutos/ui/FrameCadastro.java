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
public class FrameCadastro extends FrameAbstratoProduto {

    public FrameCadastro() {
        super();
        this.jLabel1.setText("Cadastrar produto");
        this.btnCadastrar.setText("Cadastrar");
    }
    
    @Override
    public void acaoProduto() {
        ProdutoController pc = new ProdutoController();
        Produto p = new Produto();
        p.setCodigo(Integer.parseInt(txtCod.getText()));
        p.setNome(txtNome.getText());
        p.setPreco(Double.parseDouble(txtpreco.getText()));
        p.setDescricao(txtDesc.getText());
        
        pc.cadastrar(p);
        limpar();   
    }
    
}
