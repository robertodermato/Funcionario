/*      Em uma empresa para todos os funcionários armazena-se o nome, o cpf e o salário
        base. O salário líquido é calculado descontando-se 10% de INSS do salário base. A
        empresa trabalha, porém, com diferentes categorias de funcionários. Funcionários do
        chão de fábrica recebem um adicional de periculosidade. Esse adicional é um
        percentual do salário base e é negociado individualmente com cada funcionário.
        Funcionários administrativos recebem um adicional de 5% a cada 10 anos trabalhados.
        Por essa razão para esse tipo de funcionário é necessário armazenar o ano de
        contratação. Finalmente os diretores recebem um adicional de 0.01% por cada
        funcionário que tem de supervisionar. Por esta razão para este tipo de funcionário é
        necessário armazenar a quantidade de funcionários sob sua supervisão. Observação: o
        INSS é calculado sobre o salário base sem os adicionais. Implemente uma hierarquia de
        classes que modele esta situação. Faça um exemplo de uso.
*/

public abstract class Funcionario {
    private String nome;
    private String CPF;
    private double salarioBase;
    private double salarioLiquido;

    public Funcionario (String nome, String CPF, double salarioBase){
        this.nome = nome;
        this.CPF = CPF;
        this.salarioBase = salarioBase;
        salarioLiquido = salarioBase + salarioBase*0.1;
    }

    public String getNome() {        return nome;    }

    public String getCPF() {        return CPF;    }

    public double getSalarioBase() {        return salarioBase;    }

    public double getSalarioLiquido() {        return salarioLiquido;    }

    public void setNome(String nome) {        this.nome = nome;    }

    public void setCPF(String CPF) {        this.CPF = CPF;    }

    public void setSalarioBase(double salarioBase) {        this.salarioBase = salarioBase;    }

    @Override
    public String toString() {
        return "Nome: " + nome + " CPF: " + CPF + " Salário Base: " + salarioBase;
    }
}
