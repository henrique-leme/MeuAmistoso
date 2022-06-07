package DAO;

import Model.Jogos;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class JogosDAO {
    
    
    /**
     * Insere um novo jogo dentro do banco de dados
     * @param jogos exige que seja passado um objeto do tipo jogos
     */
    public void insert(Jogos jogos){
        Banco.jogos.add(jogos);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param jogos
     * @return 
     */
    public boolean update(Jogos jogos){
        
        for (int i = 0; i < Banco.jogos.size(); i++) {
            if(idIguais(Banco.jogos.get(i),jogos)){
                Banco.jogos.set(i, jogos);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do jogo passado
     * @param jogos
     * @return 
     */
    public boolean delete(Jogos jogos){
        for (Jogos jogosLista : Banco.jogos) {
            if(idIguais(jogosLista,jogos)){
                Banco.jogos.remove(jogosLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os jogos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Jogos> selectAll(){
        return Banco.jogos;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param jogos
     * @param jogosAMarcar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idIguais(Jogos jogos, Jogos jogosAMarcar) {
        return jogos.getId() ==  jogosAMarcar.getId();
    }
    
}
