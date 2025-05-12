package Model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidarMovimientoTest
{
    //creamos un nuevoTablero
    private char mTablero[][] = new char[7][7];
    
    @BeforeEach
    public void crearMatriz()
    {
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mTablero[i][j] = '-';
            }
        }
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
    @Test
    public void validarMovimientoTest(){
        //test para un movimiento valido
        assertTrue(ValidarMovimientos.validarMovimiento(3,3,1,3,mTablero));
        //test para un movimiento invalido
        assertFalse(ValidarMovimientos.validarMovimiento(2,4,4,4,mTablero));
    }
    @Test
    public void esMovimientoTest(){
        //Movimiento Invalido ya que esta en diagonal
        assertFalse(ValidarMovimientos.esMovimiento(4,4,2,2));
        //Movimiento Valido
        assertTrue(ValidarMovimientos.esMovimiento(3,1,3,3));
    }
    @Test
    public void devolverMedioTest(){
        //Verifica si existe una pieza entre dos posiciones
        assertEquals('*',ValidarMovimientos.devolverMedio(mTablero,3,1,3,3));
        //Verifica si existe un guion entre dos posiciones
        assertEquals('-',ValidarMovimientos.devolverMedio(mTablero,3,4,3,2));
    }
}
