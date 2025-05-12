package Model;

public class validarVictoria
{
    public static boolean esVictoria(char[][] mTablero) {
        int iContador = 0;
        int iFilaFicha = -1;
        int iColFicha = -1;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (mTablero[i][j] == '*') {
                    iContador++;
                    iFilaFicha = i;
                    iColFicha = j;
                }
            }
        }

        return iContador == 1 && iFilaFicha == 3 && iColFicha == 3;
    }

}
    

