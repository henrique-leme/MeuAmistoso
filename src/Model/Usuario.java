/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Henrique
 */
public class Usuario {
    private int id;
    private String Email;
    private String Senha;
    public String Nome;

    public Usuario(int id, String Email, String Senha, String Nome) {
        this.id = id;
        this.Email = Email;
        this.Senha = Senha;
        this.Nome = Nome;
    }

    public Usuario(int id, String Email, String Senha) {
        this.id = id;
        this.Email = Email;
        this.Senha = Senha;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    
}
