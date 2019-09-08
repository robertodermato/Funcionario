/*
        Finalmente os diretores recebem um adicional de 0.01% por cada
        funcionário que tem de supervisionar. Por esta razão para este tipo de funcionário é
        necessário armazenar a quantidade de funcionários sob sua supervisão.
 */

import java.util.ArrayList;

public class Diretor extends Funcionario{

    private ArrayList<Funcionario> subalternos;

    public Diretor(String nome, String CPF, double salarioBase) {
        super(nome, CPF, salarioBase);
        subalternos = new ArrayList<Funcionario>();
    }

    public void cadastrarSubalterno (Funcionario empregado){
        subalternos.add(empregado);
    }

    public double getSalarioLiquido(){
        double salarioLiquido = super.getSalarioLiquido()*0.0001*(subalternos.size());
        return salarioLiquido;
    }

    @Override
    public String toString() {
        String subs="";
        for (Funcionario sub: subalternos){
            subs=subs + sub + "\n";
        }
        return "Diretor - " + super.toString() + "\n" + (subalternos.size()) + " Subalternos:\n" + subs;
    }
}
