package cadastroprodutos.infra;

import cadastroprodutos.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class ProdutoDAO {

    private int codProduto;

    /**
     * Default constructor
     */
    public ProdutoDAO() {
    }



    /**
     * @param p
     */
    public void inserir(Produto p) {
        try {
            ConnectionFactory cn = new ConnectionFactory();
            Connection con = cn.obterConexao();
            PreparedStatement stm = con.prepareStatement("INSERT INTO produto(descricaoProd,precoCompra,precoVenda,qtdProduto,unidade,fornecedorProd,codProduto) VALUES(?,?,?,?,?,?,?)");
            stm.setString(1, p.getDescricaoProd());
            stm.setDouble(2, p.getPrecoCompra());
            stm.setDouble(3, p.getPrecoVenda());
            stm.setDouble(4, p.getQtdProduto ());
            stm.setString(5, p.getUnidade());
            stm.setString(6, p.getFornecedorProd());
            stm.setInt(7, p.getCodProduto());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    /**
     * @param p
     */
    public void alterar(Produto p) {
        try {
            ConnectionFactory cn = new ConnectionFactory();
            Connection con = cn.obterConexao();
            PreparedStatement stm = con.prepareStatement("UPDATE produto SET descricaoProd = ?, precoCompra = ?,precoVenda = ?,qtdProduto = ?,unidade = ?,fornecedorProd = ? WHERE codProduto = ?");
            stm.setString(1, p.getDescricaoProd());
            stm.setDouble(2, p.getPrecoCompra());
            stm.setDouble(3, p.getPrecoVenda());
            stm.setDouble(4, p.getQtdProduto ());
            stm.setString(5, p.getUnidade());
            stm.setString(6, p.getFornecedorProd());
            stm.setInt(7, p.getCodProduto());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
        /**
     * @param codigo
     */
    public void remover(int codigo) {
        try {
            ConnectionFactory cn = new ConnectionFactory();
            Connection con = cn.obterConexao();
            PreparedStatement stm = con.prepareStatement("DELETE FROM produto WHERE codProduto = ?");
            stm.setInt(1, codProduto);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    /**
     * @return
     */
    public List<Produto> obterTodos() {
        try {
            List<Produto> produtos  = new LinkedList();
            ConnectionFactory cn = new ConnectionFactory();
            Connection con = cn.obterConexao();
            PreparedStatement stm = con.prepareStatement("SELECT * FROM produto");            
            ResultSet rs = stm.executeQuery();
            
            while(rs.next())
            {
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }
            
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Produto obter(int codigo) {
        try{
            ConnectionFactory cf = new ConnectionFactory();
            Connection con = cf.obterConexao();
            PreparedStatement stm = con.prepareStatement(
                    "SELECT * FROM produto WHERE codigo = ?");
            stm.setInt(1, codigo);
            
            ResultSet rs = stm.executeQuery();    
            if(rs.next()) {
                Produto p = new Produto();
                
                p.setCodigo(codigo);
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getDouble("preco"));
                p.setDescricao(rs.getString("descricao"));
                
                return p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}