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
    public String NomeDoOrganizador;
    public String LocalDoJogo;
    public Date DataDoJogo;
    public int NumeroDeJogadores;
    public String Descricao;

    public Jogos(int id, String NomeDoOrganizador, String LocalDoJogo, Date DataDoJogo, int NumeroDeJogadores, String Descricao) {
        this.id = id;
        this.NomeDoOrganizador = NomeDoOrganizador;
        this.LocalDoJogo = LocalDoJogo;
        this.DataDoJogo = DataDoJogo;
        this.NumeroDeJogadores = NumeroDeJogadores;
        this.Descricao = Descricao;
    }

    public Jogos(int id, String NomeDoOrganizador, String LocalDoJogo, Date DataDoJogo, int NumeroDeJogadores) {
        this.id = id;
        this.NomeDoOrganizador = NomeDoOrganizador;
        this.LocalDoJogo = LocalDoJogo;
        this.DataDoJogo = DataDoJogo;
        this.NumeroDeJogadores = NumeroDeJogadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoOrganizador() {
        return NomeDoOrganizador;
    }

    public void setNomeDoOrganizador(String NomeDoOrganizador) {
        this.NomeDoOrganizador = NomeDoOrganizador;
    }

    public String getLocalDoJogo() {
        return LocalDoJogo;
    }

    public void setLocalDoJogo(String LocalDoJogo) {
        this.LocalDoJogo = LocalDoJogo;
    }

    public Date getDataDoJogo() {
        return DataDoJogo;
    }

    public void setDataDoJogo(Date DataDoJogo) {
        this.DataDoJogo = DataDoJogo;
    }

    public int getNumeroDeJogadores() {
        return NumeroDeJogadores;
    }

    public void setNumeroDeJogadores(int NumeroDeJogadores) {
        this.NumeroDeJogadores = NumeroDeJogadores;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}
