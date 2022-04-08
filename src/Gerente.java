//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;

    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;

    }
}




