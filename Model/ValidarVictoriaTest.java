package Model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ValidarVictoriaTest
{
    
        
    @Test
    public void testVictoriaConUnaFichaEnCentro() {
        char[][] tablero = new char[7][7];
        inicializarTableroVacio(tablero);
        tablero[3][3] = '*';  // Centro

        assertTrue(validarVictoria.esVictoria(tablero), "Debe detectar victoria cuando hay una ficha en el centro");
    }

    @Test
    public void testNoVictoriaFichaFueraDeCentro() {
        char[][] tablero = new char[7][7];
        inicializarTableroVacio(tablero);
        tablero[2][3] = '*';  // No está en el centro

        assertFalse(validarVictoria.esVictoria(tablero), "No debe ser victoria si la ficha no está en el centro");
    }

    @Test
    public void testNoVictoriaConMultiplesFichas() {
        char[][] tablero = new char[7][7];
        inicializarTableroVacio(tablero);
        tablero[3][3] = '*';
        tablero[2][2] = '*';  // Más de una ficha

        assertFalse(validarVictoria.esVictoria(tablero), "No debe ser victoria si hay más de una ficha");
    }

    @Test
    public void testNoVictoriaConTableroVacio() {
        char[][] tablero = new char[7][7];
        inicializarTableroVacio(tablero);

        assertFalse(validarVictoria.esVictoria(tablero), "No debe ser victoria si el tablero está vacío");
    }

    private void inicializarTableroVacio(char[][] tablero) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    
}
