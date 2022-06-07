/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.JogosDAO;
import Helper.ListaJogosHelper;
import Model.Jogos;
import View.ListaJogos;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class ListaJogosController {
    
    private final ListaJogos view;
    private final ListaJogosHelper helper;
    
    public ListaJogosController(ListaJogos view) {
        this.view = view;
        this.helper = new ListaJogosHelper(view);
    }
   
    
    public void atualizarTabela(){
        //Buscar Lista de Jogos no banco de dados
        JogosDAO jogosDAO = new JogosDAO();
        ArrayList<Jogos> jogos = jogosDAO.selectAll();
        //Exibir lista de Jogos
        helper.listarJogos(jogos);
    }
}
