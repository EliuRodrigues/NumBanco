public class Banco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //METODOS
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo (50);
        } else if (t.equals("CP")) {
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    public void fechaConta(){
        if ( this.getSaldo()  > 0 ) {
            System.out.println("Conta tem dinheiro");
        } else if (this.getSaldo() < 0)
            System.out.println("Conta em débito");
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v){
        if (this.getStatus()) {
            this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono);
        } else {
            System.out.println("IMpossivel depositar em outra conta fechado!");
        }
    }
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado na conta de " + this.getDono);
            } else {
                System.out.println(" saldo isuficiente para saque");
            }
        } else {
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal() {

    }

    //METODOS ESPECIAS

    public void numConta(){
        this.saldo = 0;
        this.status = false;
    }
    private void setSaldo() {
    }
    private float getSaldo(int i) {
        return saldo ;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo (String t){
        return t;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }

}
//COMMIT TESTE
