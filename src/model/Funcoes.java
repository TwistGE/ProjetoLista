package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        novaPessoa.setCpf(sc.nextLine());

        System.out.println("Digite o telefone:");
        novaPessoa.setTelefone(sc.nextLine());

        System.out.println("Digite o email:");
        novaPessoa.setEmail(sc.nextLine());
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

    public void ExcluirPessoa(Pessoa pessoa){
        //Antes, verificar se CPF Existe
        listaPessoas.remove(pessoa);
    }

    public void ImprimirPessoa(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CPF desejado:");
        String cpf = sc.nextLine();
        //Valida CPF


        for(Pessoa pessoa : listaPessoas){
            if(pessoa.getCpf().equals(cpf)){
                System.out.println(pessoa.toString());
                break;
            }
        }
    }

    public void ordenarPessoas(){
        Collections.sort(listaPessoas, Comparator.comparing(Pessoa::getNome));
        System.out.println("List ordenada!!!!\n");
    }

    public void alterarPessoa(){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoaEncontrada = new Pessoa();

        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();
        //Valida o CPF

        //Encontrar pessoa:
        for(Pessoa pessoa:listaPessoas){
            if(pessoa.getCpf().equals(cpf)){
                pessoaEncontrada = pessoa;
                break;
            }
        }

        if(pessoaEncontrada == null){
            System.out.println("PESSOA NAO ENCONTRADA!!!");
        }else{
            System.out.println("Campos a serem mudadados:");
            System.out.println(pessoaEncontrada.toString());
        }

        System.out.println("Digite novo nome:");
        String novoNome = sc.nextLine();

        if(pessoaEncontrada.getNome().isBlank()){
            
        }

    }
}
