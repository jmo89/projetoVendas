
package cadastroprodutos.controller;
        
import cadastroprodutos.infra.*;
import cadastroprodutos.model.*;
import java.util.*;

/**
 * 
 */
public class ProdutoController {

    private ProdutoDAO pDAO = new ProdutoDAO ();
    /**
     * Default constructor
     */
    public ProdutoController() {
    }

    /**
     * @param p
     */
    public void cadastrar(Produto p) {
        pDAO.inserir(p);
    }

    /**
     * @param p
     */
    public void alterar(Produto p) {   
        pDAO.alterar(p);
    }
    
    /**
     * @param codigo
     */
    public void remover(int codigo) {
        pDAO.remover(codigo);
    }
   
    /**
     * @param p
     */
    public void remover(Produto p) {
        pDAO.remover(p.getCodigo());
    }
    
    /**
     * @return
     */
    public List<Produto> obterProdutos() {
        return pDAO.obterTodos();
    }
    
    public Produto obterProduto(int codigo) {
        return pDAO.obter(codigo);
    }

}