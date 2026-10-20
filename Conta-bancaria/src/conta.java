public class conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status;

    public void estadoAtual(){
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public conta() {
        this.saldo = 0;
        this.status = false;
    } //não entendi pra que serve o construtor aqui, eu achava que quando eu abrisse uma conta eu ia precisar chamar o construtor mas isso não aconteceu

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t=="CC"){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada pois ainda possui saldo.");
        }else if(this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada pois possui débito.");
        }else {
            this.setStatus(false);
            System.out.println("Conta encerrada.");
        }
    }

    public void depositar(float n){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + n );
        }
    }

    public void sacar(float n){
        if(this.getStatus()){
            if(this.getSaldo()<n){
                System.out.println("Saldo insuficiente.");
            }else{
                this.setSaldo(this.getSaldo() - n);
                System.out.println("Operação realizada. Saldo atual =" + this.getSaldo());
            }
        }else{
            System.out.println("Conta fechada.");
        }
    }
    public void pagarMensal(){
        if(this.getStatus()) {
            if (this.getTipo() == "CC") {
                if (this.getSaldo() < 12) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    this.setSaldo(this.getSaldo() - 12);
                }
            } else {
                if (this.getSaldo() >= 20) {
                    this.setSaldo(this.getSaldo() - 20);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            }
        }else{
            System.out.println("Conta fechada.");
        }
    }


}
