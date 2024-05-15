public class Lampada {
     String marca;
     String modelo;
     String cor;
     boolean ligado;

     boolean verificarLampada(boolean ligado){
         if (ligado){
             System.out.println("Lampada Ligada");
         }
         else {
             System.out.println("Lampada Desligada");
         }
         return ligado;
     }

    /* void mostrarLampada(){
         System.out.println("Marca: " + marca);
         System.out.println("Modelo: " + modelo);
         System.out.println("Cor: " + cor);

     }*/

     void ligar(){
         ligado = true;
     }

     void desligar(){
         ligado = false;
     }

     void mostrarLampada(){
         if(ligado){
             System.out.println("Lampada Ligada");
         }
         else {
             System.out.println("Lampada Desligada");
         }
     }

     void mudarEstado(){
         if(ligado){
             desligar();
         }
         else {
             ligar();
         }
     }
}
