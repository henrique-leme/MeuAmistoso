/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.UsuarioDAO;
import Helper.LoginHelper;
import Model.Usuario;
import View.Login;
import View.Registro;
import View.TelaPrincipal;

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
     //Pega os dados inseridos na View
     Usuario usuario = helper.obterModelo();   
    //Verifica no Banco de Dados
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario usuarioAutenticado = usuarioDAO.selectPorEmailESenha(usuario);
    //Direcionar para a Tela Principal caso esteja cadastrado
    if(usuarioAutenticado != null) {
        //Enviar para TelaPrincipal
        TelaPrincipal menu = new TelaPrincipal();
        menu.setVisible(true);
        this.view.dispose();
        // Mostra tela de erro por conta do usuario nao exisitr
    }else{
         view.exibirMensagem("Usuário ou Senha Incorretos!");
         }
    }
    public void abrirRegistro() {
        Registro registro = new Registro();
        registro.setVisible(true);
    }
    
}
