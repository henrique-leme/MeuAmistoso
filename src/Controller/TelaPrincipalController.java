/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CriarJogo;
import View.ListaJogos;
import View.TelaPrincipal;

/**
 *
 * @author Henrique
 */
public class TelaPrincipalController {
    
    private final TelaPrincipal view;

    public TelaPrincipalController(TelaPrincipal view) {
        this.view = view;
    }
    public void navegarParaCriarJogo() {
        CriarJogo criarJogo = new CriarJogo();
        criarJogo.setVisible(true);
    }
    public void navegarParaListaJogos() {
        ListaJogos listaJogos = new ListaJogos();
        listaJogos.setVisible(true);
    }
}
