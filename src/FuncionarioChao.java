/*
        A empresa trabalha, porém, com diferentes categorias de funcionários. Funcionários do
        chão de fábrica recebem um adicional de periculosidade. Esse adicional é um
        percentual do salário base e é negociado individualmente com cada funcionário.
 */

public class FuncionarioChao extends Funcionario {

    private double percentualPericulosidade;

    public FuncionarioChao(String nome, String CPF, double salarioBase, double percentualPericulosidade) {
        super(nome, CPF, salarioBase);
        this.percentualPericulosidade = percentualPericulosidade;
    }

    public double getPercentualPericulosidade() {        return percentualPericulosidade;    }

    @Override
    public String toString() {
        return "\nFuncionário do chão de fábrica - " + super.toString() +
                " Percentual de Periculosidade: " + percentualPericulosidade +
                " Salário líquido: " + (super.getSalarioLiquido() + (super.getSalarioBase()*percentualPericulosidade));
    }
}




