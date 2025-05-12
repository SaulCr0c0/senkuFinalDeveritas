package Model;
public class ValidarMovimientos
{
    // Lógica típica de Senku:
    // Debe haber una ficha en origen HECHO
    // Debe haber un hueco en destino HECHO
    // Entre origen y destino debe haber una ficha que se “salta” HECHO
    // Movimiento válido en línea recta (2 celdas de distancia) HECHO
    public static boolean validarMovimiento(int iXNuevo,int iYNuevo,int iXViejo, int iYViejo, char mTablero[][]){
        if(mTablero[iXViejo][iYViejo]=='*' && mTablero[iXNuevo][iYNuevo]== '-' && esMovimiento(iXNuevo, iYNuevo, iXViejo, iYViejo)){
            return devolverMedio(mTablero, iXNuevo, iYNuevo, iXViejo, iYViejo) == '*';
        }
        return false;
    }
    public static boolean esMovimiento(int iXNuevo,int iYNuevo,int iXViejo, int iYViejo){
        // Movimiento horizontal válido
        if (iXViejo == iXNuevo) {
            return Math.abs(iYViejo - iYNuevo) == 2;
        }
        // Movimiento vertical válido
        if (iYNuevo == iYViejo) {
            return Math.abs(iXViejo - iXNuevo) == 2;
        }
        return false;
    }


    public static char devolverMedio(char mTablero[][],int iXNuevo,int iYNuevo,int iXViejo, int iYViejo){
        if (iXNuevo==iXViejo && Math.abs(iYNuevo - iYViejo) == 2){
            int iYMedio = (iYNuevo + iYViejo) / 2;
            return mTablero[iXViejo][iYMedio];
        }
        if(iYNuevo==iYViejo && Math.abs(iXNuevo - iXViejo) == 2){
            int iXMedio = (iXNuevo + iXViejo) / 2;
            return mTablero[iXMedio][iYViejo];
        }
        return '-';
    }
    
    //Cambia las fichas de lugar
    public static void realizarJugada(char mTablero[][],int iXNuevo,int iYNuevo,int iXViejo, int iYViejo){
        if(iXNuevo==iXViejo){
            mTablero[iXViejo][iYViejo] = '-';
            mTablero[iXNuevo][iYNuevo] = '*';
            mTablero[iXViejo][(iYNuevo + iYViejo) / 2] = '-';
        }else{
            mTablero[iXViejo][iYViejo] = '-';
            mTablero[iXNuevo][iYNuevo] = '*';
            mTablero[(iXNuevo + iXViejo) / 2][iYViejo] = '-';
        }
    }

}
