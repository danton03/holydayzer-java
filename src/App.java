import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("============== HolyDayzer ==============");
        System.out.println(
        "1-Buscar feriado\n2-Listar feriados\nEscolha uma opção no menu:"
        );
        try (Scanner inputOpcao = new Scanner(System.in)) {
            String opcao = inputOpcao.next();
            if (opcao.equals("1")) {
                System.out.println("Digite a data desejada (DD/MM/AAAA):");
                try (Scanner inputData = new Scanner(System.in)) {
                    String data = inputData.nextLine();
                    String resultado = buscarFeriado(data);
                    System.out.println("\n\n>>> "+resultado);
                }
            }
            else if(opcao.equals("2"))
                listarFeriado();
            else
                System.out.println("opção inválida!");
        }
    }
    
    static String buscarFeriado(String data){
        String resultado = "";
        for (Feriado feriado : ListaDeFeriados.getFeriados()) {
            if (Objects.equals(data, feriado.getData()))
                resultado = "Dia "+feriado.getData()+" é "+feriado.getNome();
        }
        if(resultado.length() == 0)
            resultado = "Não existe feriado com a data informada";  
        return resultado;
    }

    static void listarFeriado(){
        System.out.println("================================");
        System.out.println("Lista de feriados:");
        for (Feriado feriado : ListaDeFeriados.getFeriados()) {
            System.out.println(feriado.getData()+" => "+feriado.getNome());
        }
    }
}
