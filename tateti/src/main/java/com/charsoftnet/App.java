package com.charsoftnet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] iTablero = new String[9];
        boolean bitWinner = false;
        boolean bitJugador = true;
        //indica que en true juega la persona, en false juega la maquina
        //armar combinaciones ganadoras posibles
        /*
        012
        345
        678
        036
        147
        852
        642
        048
        */
        DrawTable(iTablero);

        while (!bitWinner) {
        String equis = "X";
        String circulo = "O";

        int intPosicionSeleccionada = 0;

        int seleccion = 0;
        if (bitJugador){
            System.out.println("Turno jugador.");
            //juega la persona
            Scanner entradaEscaner = new Scanner(System.in); 
            System.out.println("Ingrese donde colocará su marcador.");
            intPosicionSeleccionada = Integer.valueOf(entradaEscaner.nextLine()); 
            if(iTablero[result] != null) {
             result = random.nextInt(9);
            }
            iTablero[result] = circulo;
            bitJugador = true;
            DrawTable(iTablero);
        }

       //verificar si hay ganador  
       if((equis.equals(iTablero[0]) && equis.equals(iTablero[1]) && equis.equals(iTablero[2])) || (circulo.equals(iTablero[0]) && circulo.equals(iTablero[1]) && circulo.equals(iTablero[2]))){
         bitWinner = true;
       }
       else if((equis.equals(iTablero[3]) && equis.equals(iTablero[4]) && equis.equals(iTablero[5])) || (circulo.equals(iTablero[3]) && circulo.equals(iTablero[4]) && circulo.equals(iTablero[5]))){
         bitWinner = true;
       }
           else if((equis.equals(iTablero[6]) && equis.equals(iTablero[7]) && equis.equals(iTablero[8])) || (circulo.equals(iTablero[6]) && circulo.equals(iTablero[7]) && circulo.equals(iTablero[8]))){
             bitWinner = true;
           }
           else if((equis.equals(iTablero[0]) && equis.equals(iTablero[3]) && equis.equals(iTablero[6])) || (circulo.equals(iTablero[0]) && circulo.equals(iTablero[3]) && circulo.equals(iTablero[6]))){
             bitWinner = true;
           }
           else if((equis.equals(iTablero[1]) && equis.equals(iTablero[4]) && equis.equals(iTablero[7])) || (circulo.equals(iTablero[1]) && circulo.equals(iTablero[4]) && circulo.equals(iTablero[7]))){
             bitWinner = true;
           }
           else if((equis.equals(iTablero[8]) && equis.equals(iTablero[5]) && equis.equals(iTablero[2])) || (circulo.equals(iTablero[8]) && circulo.equals(iTablero[5]) && circulo.equals(iTablero[2]))){
             bitWinner = true;
           }
           else if((equis.equals(iTablero[6]) && equis.equals(iTablero[4]) && equis.equals(iTablero[2])) || (circulo.equals(iTablero[6]) && circulo.equals(iTablero[4]) && circulo.equals(iTablero[2]))){
             bitWinner = true;
           }
           else if((equis.equals(iTablero[0]) && equis.equals(iTablero[4]) && equis.equals(iTablero[8])) || (circulo.equals(iTablero[0]) && circulo.equals(iTablero[4]) && circulo.equals(iTablero[8]))){
             bitWinner = true;
           }            
          }
          System.out.println("Se encontro un ganador");
          if(!bitJugador){
            System.out.println("Ganó el jugador");
          }
          else{
            System.out.println("Ganó la máquina");
          }
    }
    public static void DrawTable(String[] iTablero){   
            //Dibujar el tablero
            String linea1 = "";
            String linea2 = "";
            String linea3 = "";
            for (int i = 0; i < iTablero.length; i++) {
             String strValor = "";
             if (iTablero[i] != null) {
              strValor = "  " + iTablero[i] + "  ";
             } else {
              strValor = " [" + i + "] ";
             }
             if (i < 3) {
              linea1 += strValor;
             }
             if (i >= 3 && i < 6) {
              linea2 += strValor;
             }
             if (i >= 6 && i < 9) {
              linea3 += strValor;
             }
            }
            System.out.println(linea1);
            System.out.println(linea2);
            System.out.println(linea3);
         }
}
