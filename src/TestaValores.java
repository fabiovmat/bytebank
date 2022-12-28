public class TestaValores {

    public static void main(String[] args) {

        Conta conta = new Conta(001, 323232);
        Conta conta2 = new Conta(001, 323233);
        System.out.println("Numero da conta " + conta.getNumero() + " Agencia " + conta.getAgencia());
        System.out.println(Conta.getTotal());



        }
}
