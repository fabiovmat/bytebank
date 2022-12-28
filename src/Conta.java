

    /* Especificao de conta  instancia do tipo conta / objeto do tipo conta*/
    public class Conta {

        private double saldo;
        private int agencia;
        private int numero;
        Cliente titular;
        private static int total;


        /*METODOS saca , deposita , transfere*/

        public Conta(int agencia, int numero){
            total++;
            System.out.println("O total de contas é " + total);
            this.agencia = agencia;
            this.numero = numero;

            System.out.println("Estou criando uma conta");
        }


        public void deposita(double valor){
            this.saldo += valor;
            //valor é um argumento
        }

        public boolean saca(double valor ){
            if (this.saldo >= valor
            ){
                this.saldo -= valor;
                return true;
            }else {
                return false;
            }

        }

        public boolean transfere(double valor, Conta destino) {
            if(this.saldo >= valor) {
                saca(valor);
                //this.saldo -= valor;
                destino.deposita(valor);
                return true;
            } else {
                return false;
            }


        }

        public double getSaldo(){
            return this.saldo;

        }

        public  static int getTotal() {

            return Conta.total;
        }

        public int getNumero(){
            return  this.numero;
        }

        public void setNumero(int numero){
            if (numero <= 0){
                System.out.println("Valor menor ou igual a zero nao é permitido");
                return;
            }

            this.numero = numero;
        }

        public int getAgencia() {
            return this.agencia;
        }

        public void setAgencia(int agencia) {
            if (agencia <= 0 ){
                System.out.println("Valor menor ou igual a zero nao é permitido");
                return;
            }
                this.agencia = agencia;

        }

        public Cliente getTitular() {
            return titular;
        }

        public void setTitular(Cliente titular) {
            this.titular = titular;
        }
    }





