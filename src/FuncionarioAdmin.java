/*
        Funcionários administrativos recebem um adicional de 5% a cada 10 anos trabalhados.
        Por essa razão para esse tipo de funcionário é necessário armazenar o ano de contratação.
 */

import java.util.Calendar;

public class FuncionarioAdmin extends Funcionario{

    private int anoContratado;

    public FuncionarioAdmin(String nome, String CPF, double salarioBase) {
        super(nome, CPF, salarioBase);
        this.anoContratado = Calendar.getInstance().get(Calendar.YEAR);
    }

    public double getSalarioLiquido(){
        double salarioLiquido = super.getSalarioLiquido() + ((Calendar.getInstance().get(Calendar.YEAR)-anoContratado)/10)*0.05*(super.getSalarioLiquido());
        return salarioLiquido;
    }

    public int getAnoContratado() {
        return anoContratado;
    }

    @Override
    public String toString() {
        return "Funcionario Administrativo - " + super.toString() + " Ano Contratado: " + anoContratado;
    }
}
