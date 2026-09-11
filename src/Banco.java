import javax.swing.*;

public class Banco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
//-----------------METODOS PERSONALIZADOS---------------------------
    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    //----------------------METODOS--------------------------------
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
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Inpossivel depositar em outra conta fechado!");
        }
    }
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado na conta de " + this.getDono());
            } else {
                System.out.println(" saldo insuficiente para saque");
            }
        } else {
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v =  20;
        }
        if (this.getStatus()) {
            this.setStatus(this.getStatus() - v);
            System.out.println("Mensalidade paga com sucesso" + this.getDono());
        }else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

    //----------------------METODOS ESPECIAS----------------------------

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

}
