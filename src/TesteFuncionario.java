public class TesteFuncionario {
    public static void main(String[] args) {



        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("2223232-98");
        nico.setSalario(2600.80);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        nico.salario = 300;


    }
}
