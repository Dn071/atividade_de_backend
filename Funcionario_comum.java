public class Funcionario_Comum extends Funcionario {

    public Funcionario_Comum(String nome, String cpf, double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularSalario() {
    return getSalarioBase();
    }

    @Override
    public String getTipoFuncionario(){
        return "Funcionario Comum";
    }
}
