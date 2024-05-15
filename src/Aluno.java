import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas  = new double[3][4];



    //metodo para mostrar informações
    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i] + ": ");
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }



        //metodo para saber se está aprovado
        boolean verificarAprovado(int indice){
            if(obterMedia(indice) >= 7){
                return true;
            } else {
                return false;
            }
        }

        //metodo para obter media
        double obterMedia(int indice){
            double soma = 0;

            for(int i = 0; i < notasDisciplinas[indice].length; i++){
                soma += notasDisciplinas[indice][i];
            }
            double media = soma/4;
            return media;
        }

        //metodo para verificar se foi aprovado

    void mostrarAprovacao(){
        for(int i = 0; i < notasDisciplinas.length; i++){
            if(verificarAprovado(i)){
                System.out.println("Aluno aprovado com sucesso! Na disciplina: "+nomeDisciplinas[i]);
            }
            else {
                System.out.println("Reprovado com sucesso!");
            }
        }
    }

        //metodo para informar os dados
        void entradaDeDados(){

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o nome do aluno: ");
            nome = entrada.nextLine();

            System.out.println("Digite o nome do curso: ");
            nomeCurso = entrada.nextLine();

            System.out.println("Digite a matricula: ");
            matricula = entrada.nextLine();

            for(int i = 0; i < nomeDisciplinas.length; i++){
                System.out.println("Informe o nome da disciplina: ");
                nomeDisciplinas[i] = entrada.nextLine();
            }
            for(int i = 0; i < notasDisciplinas.length; i++){
                System.out.println("Notas da disciplina " + nomeDisciplinas[i] + ": ");
                for(int j = 0; j < notasDisciplinas[i].length; j++){
                    System.out.println("Entre com a nota: "+(j+1));
                    notasDisciplinas[i][j] = entrada.nextInt();
                }
            }

        }
    }

