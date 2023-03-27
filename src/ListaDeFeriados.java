import java.util.ArrayList;
import java.util.List;

public class ListaDeFeriados {
  private ListaDeFeriados() {
  }

  private static List <Feriado> feriados = new ArrayList<>();

  static final String[] dataDosFeriados = {
    "01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023",
    "01/05/2023", "08/06/2023", "07/09/2023", "12/10/2023",
    "02/11/2023", "15/11/2023", "25/12/2023"
  };

  static final String[] nomeDosFeriados = {
    "Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes",
    "Dia do trabalho", "Corpus Christi", "Independência do Brasil",
    "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Natal"
  };

  public static List<Feriado> getFeriados() {
    for (int i = 0; i < dataDosFeriados.length; i++) {
      Feriado feriado = new Feriado(nomeDosFeriados[i], dataDosFeriados[i]);
      feriados.add(feriado);
    }
    
    return feriados;
  }
}
