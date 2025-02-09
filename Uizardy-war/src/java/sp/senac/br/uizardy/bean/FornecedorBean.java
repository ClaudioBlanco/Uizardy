/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.br.uizardy.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sp.senac.br.beans.FornecedorEJBLocal;
import sp.senac.br.uizardy.commons.Fornecedor;

/**
 *
 * @author Claudio
 */
@ManagedBean
@RequestScoped
public class FornecedorBean {
    
    private Fornecedor fornecedor;

    @EJB
    private FornecedorEJBLocal fornecedorEJB;
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public void cadastrar(){
        fornecedorEJB.cadastrar(fornecedor);
    }
    
    /**
     * Creates a new instance of FornecedorBean
     */
    public FornecedorBean() {
        fornecedor = new Fornecedor();
    }
    
}
