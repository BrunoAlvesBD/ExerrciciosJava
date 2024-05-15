import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*
        Lampada lampada = new Lampada();
        lampada.marca = "Desconhecido";
        lampada.cor = "amarela";
        lampada.modelo = "normal";

        lampada.mudarEstado();
        lampada.mostrarLampada();

        lampada.mudarEstado();
        lampada.mostrarLampada();

        lampada.mudarEstado();
        lampada.mostrarLampada();

         */
        // ex2 conta corrente -----------------------------------------------------------------

/*
    ContaCorrente conta = new ContaCorrente();
    conta.numero = "123456";
    conta.agencia = "1234";
    conta.especial = true;
    conta.limiteEspecial = 500;
    conta.valorEspecialUsado = 0;
    conta.saldo = -10;

        conta.sacarEmostrarMensagem(50);
//deposito--------------------------
        System.out.println("Deposito de 500 ");
        conta.depositar(500);

//consultar saldo
        conta.consultarSaldo();

//Verificar cheque especial
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Cheque Especial sendo usado!");
        }
        else{
            System.out.println("Cheque especial não usado!");
        }
*/
 // ex3 ------------------------------------------------------------------------------------------

        Aluno aluno = new Aluno();

        aluno.entradaDeDados();
        //aluno.nomeDisciplinas = new String[3];

        aluno.mostrarInfo();

       aluno.mostrarAprovacao();


    }
}
