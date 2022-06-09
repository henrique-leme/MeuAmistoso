/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.UsuarioDAO;
import Helper.RegistroHelper;
import Model.Usuario;
import View.Registro;

/**
 *
 * @author Henrique
 */
public class RegistroController {   
    private final Registro view;
    private RegistroHelper helper;
    
    // Cria o controller e Helper da view Registro
    public RegistroController(Registro view) {
    this.view = view;
    this.helper = new RegistroHelper(view);       
    }
    //Registra um novo Usuario com os dados da view
    public void registrarNoSistema(){
    //Pega os dados inseridos na View
     Usuario usuario = helper.obterDados();
    // Inseri um novo usuario com o model
     new UsuarioDAO().insert(usuario);
    }
}
