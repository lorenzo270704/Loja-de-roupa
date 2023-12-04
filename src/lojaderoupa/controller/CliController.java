/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.controller;

import lojaderoupa.model.Cliente;

/**
 *
 * @author 182200155
 */
public class CliController {
    public void Incluir(String nomeCliente, String emailCliente, String CPF, String endereco) {
        //Fazer validações
        if(!nomeCliente.equals("")&&!emailCliente.equals("")&&!CPF.equals("")&&!endereco.equals(""))
        {
            Cliente cli = new Cliente(nomeCliente,emailCliente,CPF,endereco);
            cli.Incluir(cli);
        }
    }
    
}
