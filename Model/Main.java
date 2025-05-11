package Model;


/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.generarTabla1();
        tablero.mostrarTablero();
        
        System.out.println();
        
        
        Tablero tablero2 = new Tablero();
        tablero.generarTriangulo();
        tablero.mostrarTablero();
    }
}
