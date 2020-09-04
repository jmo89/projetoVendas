/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroprodutos.ui;

import cadastroprodutos.controller.ProdutoController;
import cadastroprodutos.model.Produto;
import javax.swing.table.*;
import java.util.*;

/**
 *
 */
public class ProdutoTabelaModelo extends AbstractTableModel 
    implements Observer {
    private List<Produto> produtos;
    private String[] nomeColunas = {"Código", "Nome", "Preço"};

    public ProdutoTabelaModelo(List<Produto> p) {
        produtos = p;
        Iterator<Produto> i = produtos.iterator();
        while(i.hasNext()) {
            Produto produto = i.next();
            produto.addObserver(this);
        }
    }
    
    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return nomeColunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Produto p = produtos.get(rowIndex);
       switch(columnIndex) {
           case 0:
               return p.getCodProduto();
           case 1:
               return p.getDescricaoProd();
           case 2:
               return p.getPrecoVenda();
           default:
               return "Valor inválido";
       }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    @Override
    public void setValueAt(Object dado, int rowIndex,
        int columnIndex) {
        Produto p = produtos.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                Integer codigo = (Integer) dado;
                p.setCodProduto(codigo.intValue());
                break;
            case 1:
                String nome = (String) dado;
                p.setDescricaoProd(nome);
                break;
            case 2:
                Double preco = (Double) dado;
                p.setPrecoVenda(preco);
                break;
            default:
                System.out.println("Erro!");
        }
        
        ProdutoController pc = new ProdutoController();
        pc.alterar(p);
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:    
                return Double.class;
            default:
                return String.class;
        }    
    }    

    @Override
    public void update(Observable o, Object arg) {
       this.fireTableDataChanged();
    }
}
