/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Usuario;
import View.Registro;

/**
 *
 * @author Henrique
 */
public class RegistroHelper {
    private final Registro view;

    public RegistroHelper(Registro view) {
        this.view = view;
    }
    
    public Usuario obterDados() {
        String nome = view.getCampoNomeRegistro().getText();
        String email = view.getCampoEmailRegistro().getText();
        String senha = view.getCampoSenhaRegistro().getText();
        Usuario modelo = new Usuario(0, email, senha, nome);
    return modelo;
    }  
    public void setDados(Usuario modelo){
        String nome = modelo.getNome();
        String email = modelo.getEmail();
        String senha = modelo.getSenha();
            view.getCampoNomeRegistro().setText(nome);
            view.getCampoEmailRegistro().setText(email);
            view.getCampoSenhaRegistro().setText(senha);
        
    }
}
