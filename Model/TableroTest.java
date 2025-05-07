package Model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TableroTest
{
    @Test
    public void testGenerarTriangulo(){
        Tablero tableroPrueba = new Tablero();
        tableroPrueba.generarTriangulo();
        
        assertArrayEquals(new char[] {'-', '-','-', '-','-', '-','-'}, tableroPrueba.getmTablero()[0]);
        assertArrayEquals(new char[] {'-', '-','-', '*','-', '-','-'}, tableroPrueba.getmTablero()[1]);
        assertArrayEquals(new char[] {'-', '-','*', '*','*', '-','-'}, tableroPrueba.getmTablero()[2]);
        assertArrayEquals(new char[] {'-', '*','*', '*','*', '*','-'}, tableroPrueba.getmTablero()[3]);
        assertArrayEquals(new char[] {'*', '*','*', '*','*', '*','*'}, tableroPrueba.getmTablero()[4]);
        assertArrayEquals(new char[] {'-', '-','-', '-','-', '-','-'}, tableroPrueba.getmTablero()[5]);
        assertArrayEquals(new char[] {'-', '-','-', '-','-', '-','-'}, tableroPrueba.getmTablero()[6]);
        
        /*
        -------
        ---*---
        --***--
        -*****-
        *******
        -------
        -------   
        */
    }
    @Test
    public void testGenerarTabla1(){
        Tablero tableroPrueba = new Tablero();
        tableroPrueba.generarTabla1();
        
        assertArrayEquals(new char[] {'-', '-','*', '*','*', '-','-'}, tableroPrueba.getmTablero()[0]);
        assertArrayEquals(new char[] {'-', '-','*', '*','*', '-','-'}, tableroPrueba.getmTablero()[1]);
        assertArrayEquals(new char[] {'*', '*','*', '*','*', '*','*'}, tableroPrueba.getmTablero()[2]);
        assertArrayEquals(new char[] {'*', '*','*', '*','*', '*','*'}, tableroPrueba.getmTablero()[3]);
        assertArrayEquals(new char[] {'*', '*','*', '*','*', '*','*'}, tableroPrueba.getmTablero()[4]);
        assertArrayEquals(new char[] {'-', '-','*', '*','*', '-','-'}, tableroPrueba.getmTablero()[5]);
        assertArrayEquals(new char[] {'-', '-','*', '*','*', '-','-'}, tableroPrueba.getmTablero()[6]);
        
    }
}
