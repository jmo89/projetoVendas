/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroprodutos.infra;

import cadastroprodutos.model.Compra;
import cadastroprodutos.model.ItemCompra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 */
public class CompraDAO {
    
    public void inserir(Compra c) {
        try {
            ConnectionFactory cf = new ConnectionFactory();
            Connection con = cf.obterConexao();
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO compra (data, valorTotal) VALUES (?, ?);");
            
            stm.setString(1, c.getData());
            stm.setDouble(2, c.getTotal());
            stm.execute();
            
            stm = con.prepareStatement(" SELECT LAST_INSERT_ID();");
            ResultSet rs = stm.executeQuery();
            int codigoCompra = 0;
            while(rs.next()) {
                codigoCompra = rs.getInt(1);
            }
            c.setCodigo(codigoCompra);
            
            //Insere os itens da compra
            Iterator<ItemCompra> i = c.getItens().iterator();
            while(i.hasNext()){
                ItemCompra ic = i.next();
                stm = con.prepareStatement(
                        "INSERT INTO item_compra (codigoCompra, codigoProduto, "
                        + "quantidade, valorUnitario) VALUES (?, ?, ?, ?)");
                stm.setInt(1, codigoCompra);
                stm.setInt(2, ic.getProduto().getCodProduto());
                stm.setInt(3, ic.getQuantidade());
                stm.setDouble(4, ic.getValorUnitario());
                stm.executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }    
    }
}
