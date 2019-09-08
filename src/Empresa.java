import java.util.ArrayList;

public class Empresa {

    private ArrayList<Funcionario> empregados;
    private String nome;

    public Empresa (String nome){
        this.nome = nome;
        empregados = new ArrayList<Funcionario>();
    }

    public void cadastrarFuncionario (Funcionario empregado){
        empregados.add(empregado);
    }

    public ArrayList<Funcionario> getEmpregados() {        return empregados;    }

    public String getNome() {        return nome;    }

    public void setNome(String nome) {        this.nome = nome;    }

    @Override
    public String toString() {
        return "Empresa - Nome: " + nome +
                "\nQuadro de funcionários:\n" + empregados;
    }
}
