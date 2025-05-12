package Model;
import java.util.Scanner;

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        //Crear una instancia del tablero
        Tablero mTablero = new Tablero();
        mTablero.generarTabla1();
        
        
        System.out.println();
        
        //crear un objeto scanner
        Scanner sc = new Scanner(System.in);
        //Variables auxiliares
        int iJugadaX = 0;
        int iJugadaY = 0;
        int iJugadaX2 = 0;
        int iJugadaY2 = 0;
        
        
        while(!validarVictoria.esVictoria(mTablero.getmTablero())){
            mTablero.mostrarTablero();
            System.out.print("Digite el valor en X de la pieza: ");
            iJugadaX = sc.nextInt();
            System.out.print("Digite el valor en Y de la pieza: ");
            iJugadaY = sc.nextInt();
            System.out.print("Digite el valor en X para mover la pieza: ");
            iJugadaX2 = sc.nextInt();
            System.out.print("Digite el valor en Y para mover la pieza: ");
            iJugadaY2 = sc.nextInt();
            
            if(ValidarMovimientos.validarMovimiento(iJugadaX2 - 1,iJugadaY2 - 1, iJugadaX - 1, iJugadaY - 1, mTablero.getmTablero())){
                ValidarMovimientos.realizarJugada(mTablero.getmTablero(),iJugadaX2 - 1, iJugadaY2 - 1, iJugadaX - 1, iJugadaY - 1);
                System.out.println("Jugada realizada");
            }else{
                System.out.println("Jugada Invalida");
            }
        }
    }
}
