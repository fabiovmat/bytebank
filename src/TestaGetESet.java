public class TestaGetESet {


    public static void main(String[] args) {

        Conta conta = new Conta(1224,323232);
        conta.setNumero(1334);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);
        paulo.setNome("Paulo Silveira");
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

        //outro jeito
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador JAVA");
        System.out.println(titularDaConta.getProfissao());
    }
}
