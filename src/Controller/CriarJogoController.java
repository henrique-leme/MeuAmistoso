/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.JogosDAO;
import Helper.CriarJogoHelper;
import Model.Jogos;
import View.CriarJogo;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class CriarJogoController {
    
    private final CriarJogo view;
    private final CriarJogoHelper helper;
   
    //Pega os aprametros da view Criar Jogo
    public CriarJogoController(CriarJogo view) {
        this.view = view;
        this.helper = new CriarJogoHelper(view);
    }
    public void CriarJogo(){
     //Obtem objeto Jogos
    Jogos jogos = helper.obterModelo();
     //Insere um novo jogo no banco de dados
    new JogosDAO().insert(jogos);
    //Limpar Campos
    helper.limparCampos();
    }
    
}
