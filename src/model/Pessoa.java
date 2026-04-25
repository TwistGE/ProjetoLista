package model;

public class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    private String email;



    public Pessoa(){

    }

    public Pessoa(String nome, String endereco, String cpf, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

     public String getNome() {
        return nome;
     }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder pessoa = new StringBuilder();
        pessoa.append("Nome: ").append(getNome()).append("\n");
        pessoa.append("Endereco: ").append(getEndereco()).append("\n");
        pessoa.append("Cpf: ").append(getCpf()).append("\n");
        pessoa.append("Telefone: ").append(getTelefone()).append("\n");
        pessoa.append("Email: ").append(getEmail()).append("\n");
        pessoa.append("------------------------------------------\n");

        return pessoa.toString();
    }
}
