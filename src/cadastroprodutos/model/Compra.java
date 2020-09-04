/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroprodutos.model;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 */
public class Compra {
    private int codigo;
    private String data;
    private List<ItemCompra> itens = new ArrayList();
    
    public Compra() {
       SimpleDateFormat dFormat = 
               new SimpleDateFormat("dd/MM/yyyy HH:mm");
       data = dFormat.format(new Date());
        
    }
    
    public double getTotal() {
        double total = 0;
        Iterator<ItemCompra> i = itens.iterator();
        while(i.hasNext()) {
            ItemCompra ic = i.next();
            total += ic.getTotal();
        }
        return total;
    }

    public void adicionar(Produto p, int quantidade) {
        ItemCompra ic = new ItemCompra();
        ic.setProduto(p);
        ic.setQuantidade(quantidade);
        itens.add(ic);
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the itens
     */
    public List<ItemCompra> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }
}
