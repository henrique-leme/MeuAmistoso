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
     
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "1", "12345678");
        Usuario usuario2 = new Usuario(2, "2", "12345678");
        Usuario usuario3 = new Usuario(3, "3", "12345678");
        Usuario usuario4 = new Usuario(4, "4", "12345678");
        Usuario usuario5 = new Usuario(5, "5", "12345678");
         
        
        Jogos jogos1 = new Jogos(2, "Usuario2", "Local Ficticio", "12/10/2022", 12, "Descricao Teste");
        

   
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        usuario.add(usuario4);
        usuario.add(usuario5);
        
        
        
        jogos.add(jogos1);
    
        
        
    }
    
    
}
