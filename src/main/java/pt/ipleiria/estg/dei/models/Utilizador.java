package pt.ipleiria.estg.dei.models;

public class Utilizador {

    private String nome;
    private String email;
    private String telemovel;
    private Cargo cargo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Utilizador(String nome, String email, String telemovel, Cargo cargo) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.cargo = cargo;
    }
}
