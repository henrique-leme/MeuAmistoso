/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Jogos;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Jogos> jogos;
   
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        jogos = new ArrayList<Jogos>();
     
        
        //Lista de Usuarios
        
        Usuario usuario1 = new Usuario(1, "Fernando Kakugawa","kakugawa@anhembi.br", "12345678");
        Usuario usuario2 = new Usuario(2, "Henrique","henrique@anhembi.br", "12345678");
        Usuario usuario3 = new Usuario(3, "Felipe","felipe@anhembi.br", "12345678");
        Usuario usuario4 = new Usuario(4, "Igor", "igor@anhembi.br", "12345678");
        Usuario usuario5 = new Usuario(5, "Matheus","matheus@anhembi.br", "12345678");
         
        // Lista de Jogos
        Jogos jogos1 = new Jogos(0, "Joaozinho", "Salao de Futsal Aleatorio 1", "12/10/2022", 12, "Nenhuma");
        Jogos jogos2 = new Jogos(0, "Kleber", "Campo aberto Aleatorio 2", "21/03/2022", 24, "Nenhuma");
        Jogos jogos3 = new Jogos(0, "Pedro", "Salao de Futsal Aleatorio 2", "23/08/2022", 8, "Trazer propria agua pois nao tem no local");
        Jogos jogos4 = new Jogos(0, "Ruan", "Quadra Anhembi", "14/06/2022", 12, "Trazer bola");
        Jogos jogos5 = new Jogos(0, "Joaozinho2", "Salao de Futsal Aleatorio 3", "30/10/2022", 12, "Nenhuma");
        Jogos jogos6 = new Jogos(0, "Matheus", "Quadra Anhembi Mooca", "08/07/2022", 24, "Nenhuma");
        

   
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        usuario.add(usuario4);
        usuario.add(usuario5);           
        
        jogos.add(jogos1);
        jogos.add(jogos2);
        jogos.add(jogos3);
        jogos.add(jogos4);
        jogos.add(jogos5);
        jogos.add(jogos6);
             
        
    }
    
    
}
