/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Jogos;
import View.ListaJogos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Henrique
 */
public class ListaJogosHelper {
    private final ListaJogos view;
    
    public ListaJogosHelper(ListaJogos view) {
        this.view = view;
    }

    public void listarJogos(ArrayList<Jogos> Jogos) {
        
        DefaultTableModel tablemodel = (DefaultTableModel) view.getTabelaJogos().getModel();
        tablemodel.setNumRows(0);
        
        
        //Preencher as listas com o table model
        for (Jogos jogos : Jogos){
            tablemodel.addRow(
                    new Object[]{
                        jogos.getId(),
                        jogos.getNomeDoOrganizador(),
                        jogos.getLocalDoJogo(),
                        jogos.getDataFormatada(),
                        jogos.getNumeroDeJogadores(),
                        jogos.getDescricao()
                    });
        }
    }
}
