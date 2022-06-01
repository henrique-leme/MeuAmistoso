/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Helper.LoginHelper;
import Model.Usuario;
import View.Login;

/**
 *
 * @author Henrique
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
    // Cria o controller e o Helper da view Login
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    //Valida o Login
    public void logarNoSistema(){
     //Pegar os dados da View
     Usuario usuario = helper.obterModelo();
        
    //Verificar no Banco de Dados
    //Direcionar para a Tela Principal caso esteja cadastrado
    // Mostra tela de erro por conta do usuario nao exisitr
    }
    
    
    public void logar(){
        System.out.println("Teste do Botao");
        this.view.exibirMensagem("Botao Testado");
        
    }
    
}
