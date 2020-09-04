/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroprodutos.ui;

import cadastroprodutos.model.Produto;
import java.util.*;

/**
 *
 */
public class ComparadorProdutoPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        if(o1.getPrecoVenda() == o2.getPrecoVenda())
            return 0;
        else if(o1.getPrecoVenda()< o2.getPrecoVenda())
            return -1;
        return 1;  
    
    }
    
}
