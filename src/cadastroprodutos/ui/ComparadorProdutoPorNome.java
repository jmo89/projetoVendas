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
public class ComparadorProdutoPorNome implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getDescricaoProd().compareTo(o2.getDescricaoProd());
    }
    
}
