public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    //metodo para realizar o saque, precisa verificar se é póssível fazer o saque
    //com saldo disponivel, se há dinheiro, irá retornar TRUE
    boolean realizarSaque(double quantiaASacar) {
        if(saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        }
        else { // se não há sal, verifica-se se existe o cheque especial
            if(especial){ //então verifica-se se esse cheque especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                }else {
                    return false;
                }
            }
            else { //se não há especial e não há saldo retorna FALSE
                return false;
            }
        }
    }
    //metodo para imprimir mensagem
    public void sacarEmostrarMensagem(double valor){
        boolean saqueEfetuado = realizarSaque(valor);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!");
            consultarSaldo();
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    //-------------------------------------------------------------
    //metodo para depositar dinheiro
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    //----------------------------------------------------
    //metodo consultar saldo
    void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
    //metodo para verificar se o chegue especial está sendo usado
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
