package Model;
public class Tablero
{
    private char mTablero[][];
    private static int iTamanio = 7;
    //Constructor
    public Tablero(){
        mTablero = new char[iTamanio][iTamanio];
    }
    //Getters y Setters
    public char[][] getmTablero() {
        return mTablero;
    }
    public void setmTablero(char[][] mTablero) {
        this.mTablero = mTablero;
    }
    public static int getiTamanio() {
        return iTamanio;
    }
    public static void setiTamanio(int iTamanio) {
        Tablero.iTamanio = iTamanio;
    }
    public void generarTabla1(){
        limpiarTablero();
        
        //Genera en la parte del centro
        for(int i = 2; i<=4;i++){
            for(int j = 2; j<=4;j++){
                mTablero[i][j] = '*';
            }
        }
        
        //Genera el lado derecho
        for(int i = 2; i<=4; i++){
            for(int j = 5; j<=6;j++){
                mTablero[i][j] = '*';
            }
        }
        
        //Genera el lado izquierdo
        for(int i = 2; i<=4;i++){
            for(int j = 0;j<=1;j++){
                mTablero[i][j] = '*';
            }
        }
        
        //parte superior
        for(int i = 0;i<=1;i++){
            for(int j = 2;j<=4;j++){
                mTablero[i][j] = '*';
            }
        }
        
        //parte inferior
        for(int i = 5;i<=6;i++){
            for(int j = 2;j<=4;j++){
                mTablero[i][j] = '*';
            }
        }
        
        mTablero[3][3] = '-';
     }
    public void generarTriangulo(){
        limpiarTablero();
        int iAlturaTriangulo = 4;      // El triángulo ocupa 4 filas
        int iFilasTotales = 7;
        int iCentroColumna = 3;

        int iOffsetFila = (iFilasTotales - iAlturaTriangulo) / 2;  // para centrar verticalmente

        for (int i = 0; i < iAlturaTriangulo; i++) {
            int filaActual = iOffsetFila + i;
            int inicio = iCentroColumna - i;
            int fin = iCentroColumna + i;

            for (int j = inicio; j <= fin; j++) {
                mTablero[filaActual][j] = '*';
            }
        }
    }
    public void limpiarTablero(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mTablero[i][j] = '-';
            }
        }
    }
    public void mostrarTablero() {
        System.out.print("  ");
        for (int j = 0; j < 7; j++) {
            System.out.print((j + 1) + " ");
        }
        System.out.println();
    
        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 7; j++) {
                System.out.print(mTablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
