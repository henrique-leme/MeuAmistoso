/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Henrique
 */
public class Jogos {
    private int id;
    public String nomeDoOrganizador;
    public String localDoJogo;
    public Date dataDoJogo;
    public int numeroDeJogadores;
    public String descricao;


//Cria construtor com todos os parametros, mas sem descricao
    public Jogos(int id, String nomeDoOrganizador, String localDoJogo, String dataDoJogo, int numeroDeJogadores ) {
        this.id = id;
        this.nomeDoOrganizador = nomeDoOrganizador;
        this.localDoJogo = localDoJogo;
        try {
            this.dataDoJogo = new SimpleDateFormat("dd/MM/yyyy").parse(dataDoJogo);
        } catch (ParseException ex) {
            Logger.getLogger(Jogos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.numeroDeJogadores = numeroDeJogadores;   
    }
//Cria construtor com todos os parametros e a descricao
    public Jogos(int id, String nomeDoOrganizador, String localDoJogo, String dataDoJogo, int numeroDeJogadores, String descricao) {
    this.id = id;
        this.nomeDoOrganizador = nomeDoOrganizador;
        this.localDoJogo = localDoJogo;
        try {
            this.dataDoJogo = new SimpleDateFormat("dd/MM/yyyy").parse(dataDoJogo);
        } catch (ParseException ex) {
            Logger.getLogger(Jogos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.numeroDeJogadores = numeroDeJogadores;
        this.descricao = descricao;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoOrganizador() {
        return nomeDoOrganizador;
    }

    public void setNomeDoOrganizador(String nomeDoOrganizador) {
        this.nomeDoOrganizador = nomeDoOrganizador;
    }

    public String getLocalDoJogo() {
        return localDoJogo;
    }

    public void setLocalDoJogo(String localDoJogo) {
        this.localDoJogo = localDoJogo;
    }

    public Date getDataDoJogo() {
        return dataDoJogo;
    }
    
    public String getDataFormatada(){
    return new SimpleDateFormat("dd/MM/yyyy").format(dataDoJogo);
    }

    public void setDataDoJogo(Date dataDoJogo) {
        this.dataDoJogo = dataDoJogo;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public void setNumeroDeJogadores(int numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
}
