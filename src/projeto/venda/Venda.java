package projeto.venda;


import projeto.venda.Produto;
import projeto.venda.ItemVenda;
import projeto.venda.Funcionario;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j.anderson
 */
public class Venda {
 





	private int NumeroVenda;

	private Funcionario funcionario;

	private Produto produto;

	private Clientes clientes;

	private Collection<ItemVenda> itemVenda;

    private static class Clientes {

        public Clientes() {
        }
    }

}
    

