/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Henrique
 */
public class Jogos {
    private int id;
    public Usuario nomeDoOrganizador;
    public String localDoJogo;
    public Date dataDoJogo;
    public int numeroDeJogadores;
    public String descricao;

    

    public Jogos(int id, Usuario nomeDoOrganizador, String localDoJogo, Date dataDoJogo, int numeroDeJogadores) {
        this.id = id;
        this.nomeDoOrganizador = nomeDoOrganizador;
        this.localDoJogo = localDoJogo;
        this.dataDoJogo = dataDoJogo;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getNomeDoOrganizador() {
        return nomeDoOrganizador;
    }

    public void setNomeDoOrganizador(Usuario nomeDoOrganizador) {
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
