package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
    public  ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    //Criando pessoas para haver povoamento:
    Pessoa p1 = new Pessoa(
            "Ana Paula Ferreira",
            "Rua das Flores, 123 - Belo Horizonte/MG",
            "123.456.789-00",
            "(31) 99812-3456",
            "ana.ferreira@email.com"
    );

    Pessoa p2 = new Pessoa(
            "Carlos Eduardo Santos",
            "Av. Paulista, 1000 - São Paulo/SP",
            "987.654.321-11",
            "(11) 98765-4321",
            "carlos.santos@email.com"
    );

    Pessoa p3 = new Pessoa(
            "Mariana Oliveira Lima",
            "Rua XV de Novembro, 55 - Curitiba/PR",
            "456.789.123-22",
            "(41) 97654-3210",
            "mariana.lima@email.com"
    );

    public Funcoes() {
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
    }
    public void execAdicionar(){
        Pessoa novaPessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Pessoa:");
        novaPessoa.setNome(sc.nextLine());

        System.out.println("Digite o endereco:");
        novaPessoa.setEndereco(sc.nextLine());

        System.out.println("Digite o CPF:");
        String cpf;
        do {
            cpf = sc.nextLine();
            if (validaCPF(cpf)){
                novaPessoa.setCpf(cpf);
            } else System.out.println("Digite um cpf valido...\n");
        }while (!validaCPF(cpf));

        System.out.println("Digite o telefone:");
        novaPessoa.setTelefone(sc.nextLine());

        System.out.println("Digite o email:");
        String email;
        do {
            email = sc.nextLine();
            if (validaEmail(email)){
                novaPessoa.setEmail(email);
            }else System.out.println("Digite um email valido....\n");
        }while(!validaEmail(email));

        novaPessoa.setEmail(email);
        adicionarPessoas(novaPessoa);
    }

    public void adicionarPessoas(Pessoa novaPessoa){
        listaPessoas.add(novaPessoa);
    }

    public void ImprimirTodos(){
        for(Pessoa pessoa : listaPessoas){
            System.out.println(pessoa.toString());
        }
    }

    public boolean validaCPF(String cpf){
        for (Pessoa p : listaPessoas){
            if (cpf.equals(p.getCpf())) return false;
        }
        return true;
    }

    public boolean validaEmail(String email){
        if (email.contains("@") && email.contains(".") && !email.endsWith(".")){
            return true;
        }else return false;
    }
}
