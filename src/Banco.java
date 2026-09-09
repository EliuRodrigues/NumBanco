public class Banco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //METODOS
    public void abrirConta() {

    }
    public void fechaConta(){

    }
    public void depositar(){

    }
    public void sacar() {

    }
    public void pagarMensal() {

    }

    //METODOS ESPECIAS

    public void numConta(){
        this.saldo = 0;
        this.status = false;
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

}
//COMMIT TESTE
