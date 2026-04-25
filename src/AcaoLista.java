import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AcaoLista {
    public static void main(String[] args) {
        Opcoes opcao;

        do {
            opcao = Opcoes.values()[menu()];

            switch (opcao) {
                case ADICIONAR:
                    System.out.println("Adicionado!");
                    break;
                case EXCLUIR:
                    break;
                case ALTERAR:
                    break;
                case IMPRIMIR:
                    break;
                case IMPRIMIR_TODOS:
                    break;
                case ORDENAR:
                    break;
                case SAIR:
                    break;
                default:
                    break;
            }
        } while (opcao != Opcoes.SAIR);
    }

    public enum Opcoes{
        OP_NAO_SELECIONADA,
        ADICIONAR,
        EXCLUIR,
        ALTERAR,
        IMPRIMIR,
        IMPRIMIR_TODOS,
        ORDENAR,
        SAIR
    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opcao;

        StringBuilder menu = new StringBuilder();
        do {


        menu.append("\n\n======= MENU ======\n");
        menu.append(Opcoes.ADICIONAR.ordinal()).append(" - Adicionar Usuario\n");
        menu.append(Opcoes.EXCLUIR.ordinal()).append(" - Excluir Usuario\n");
        menu.append(Opcoes.ALTERAR.ordinal()).append(" - Alterar Dados\n");
        menu.append(Opcoes.IMPRIMIR.ordinal()).append(" - Imprimir Unico Usuario\n");
        menu.append(Opcoes.IMPRIMIR_TODOS.ordinal()).append(" - Imprimir Todos\n");
        menu.append(Opcoes.ORDENAR.ordinal()).append(" - Ordenar Lista\n");
        menu.append(Opcoes.SAIR.ordinal()).append(" - Sair\n");
        menu.append("Escolha: ");

        System.out.print(menu);
        opcao = sc.nextInt();
        }while(opcao < Opcoes.OP_NAO_SELECIONADA.ordinal() || opcao > Opcoes.SAIR.ordinal());
        return opcao;
    }

}