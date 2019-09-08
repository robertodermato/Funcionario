import java.util.ArrayList;

public class AppFuncionario {

    public static void main (String args[]) {

        Empresa dermato = new Empresa("Dermatologia Integrada");

        Funcionario roberto = new Diretor("Roberto Rezende", "895.266.430-20", 10000);
        Funcionario fabiano = new Diretor("Fabiano Pacheco", "567.456.456.-89", 40000);
        Funcionario vander = new FuncionarioAdmin("Vander Luz", "123.345.456.89", 5000);
        Funcionario priscila = new FuncionarioChao("Priscila Melo", "456.345.2354-50", 1000, 0.05);
        Funcionario shimene = new FuncionarioChao("Shimene Martins", "456.357.2354-50", 1000, 0.10);
        Funcionario tania = new FuncionarioChao("Tânia Martins", "347.357.2354-50", 1000, 0.20);

        dermato.cadastrarFuncionario(roberto);
        dermato.cadastrarFuncionario(fabiano);
        dermato.cadastrarFuncionario(vander);
        dermato.cadastrarFuncionario(priscila);
        dermato.cadastrarFuncionario(shimene);
        dermato.cadastrarFuncionario(tania);

        ((Diretor)roberto).cadastrarSubalterno(tania);
        ((Diretor)roberto).cadastrarSubalterno(shimene);
        ((Diretor)roberto).cadastrarSubalterno(priscila);
        ((Diretor)roberto).cadastrarSubalterno(vander);

        int ano = ((FuncionarioAdmin)vander).getAnoContratado();
        System.out.println("Ano de contratação do Vander: " + ano);

        System.out.println(dermato);



    }
}
