/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroprodutos.controller;

import cadastroprodutos.infra.CompraDAO;
import cadastroprodutos.model.Compra;

/**
 *
 */
public class CompraController {
    private CompraDAO cDAO = new CompraDAO();
    
    public void cadastrar(Compra c) {
        cDAO.inserir(c);
    }
}
