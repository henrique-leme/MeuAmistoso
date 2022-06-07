/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author Henrique
 */
public class LoginHelper {
    private final Login view;
    
    public LoginHelper(Login view) {
    this.view   = view;
    }
    
    public Usuario obterModelo(){
    //Pegar os dados da View
        String email = view.getCampoEmail().getText();
        String senha = view.getCampoSenha().getText();
        Usuario modelo = new Usuario(0, email, senha);
    return modelo;
    }
    public void setModelo(Usuario modelo){
        String email = modelo.getEmail();
        String senha = modelo.getSenha();
            view.getCampoEmail().setText(email);
            view.getCampoSenha().setText(senha);
        
    }
    // Limpa os Campos
    public void clear(){
        view.getCampoEmail().setText("");
        view.getCampoEmail().setText("");
    }
}
