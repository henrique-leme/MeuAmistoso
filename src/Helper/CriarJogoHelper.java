/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Jogos;
import View.CriarJogo;

/**
 *
 * @author Henrique
 */
public class CriarJogoHelper {
  private final CriarJogo view;
    public CriarJogoHelper(CriarJogo view) {
        this.view = view;
    }
    
    public Jogos obterModelo() {
    //Importar texto dos campos
    String stringId = view.getIdJogo().getText();
    int idJogo = Integer.parseInt(stringId);
    String nomeDoOrganizador = view.getNomeDoOrganizador().getText();
    String localDoJogo = view.getLocalDoJogo().getText();
    String dataDoJogo = view.getDataDoJogo().getText();
    String stringNumeroDeJogadores = view.getNumeroDeJogadores().getText();
    int numeroDeJogadores = Integer.parseInt(stringNumeroDeJogadores);
    String descricao = view.getDescricao().getText();
    // Criar novo jogo
        Jogos jogos = new Jogos(idJogo, nomeDoOrganizador, localDoJogo, dataDoJogo, numeroDeJogadores, descricao);
        return jogos;
    }
    
    public void limparCampos() {
    view.getNomeDoOrganizador().setText("");
    view.getLocalDoJogo().setText("");
    view.getDataDoJogo().setText("");
    view.getNumeroDeJogadores().setText("");
    view.getDescricao().setText("");
    }
}
