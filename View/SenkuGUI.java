package View;

import Model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SenkuGUI extends JFrame {
    private Tablero tablero;
    private JButton[][] botones;
    private int filaSeleccionada = -1, colSeleccionada = -1;

    public SenkuGUI() {
        tablero = new Tablero();
        tablero.generarTabla1();
        botones = new JButton[7][7];

        setTitle("Senku");
        setSize(600, 600);
        setLayout(new GridLayout(7, 7));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        inicializarBotones();
        actualizarVista();
        setVisible(true);
    }

    private void inicializarBotones() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                JButton boton = new JButton();
                botones[i][j] = boton;

                int finalI = i, finalJ = j;

                boton.addActionListener(e -> manejarClick(finalI, finalJ));

                add(boton);
            }
        }
    }

    private void manejarClick(int fila, int col) {
        char[][] mTablero = tablero.getmTablero();

        if (filaSeleccionada == -1 && mTablero[fila][col] == '*') {
            // Primera selección: origen
            filaSeleccionada = fila;
            colSeleccionada = col;
            botones[fila][col].setBackground(Color.YELLOW);
        } else if (filaSeleccionada != -1) {
            // Segunda selección: destino
            if (ValidarMovimientos.validarMovimiento(fila, col, filaSeleccionada, colSeleccionada, mTablero)) {
                ValidarMovimientos.realizarJugada(mTablero, fila, col, filaSeleccionada, colSeleccionada);
                actualizarVista();

                if (validarVictoria.esVictoria(mTablero)) {
                    JOptionPane.showMessageDialog(this, "¡Victoria! Has ganado.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Movimiento inválido");
            }

            // Limpiar selección
            filaSeleccionada = -1;
            colSeleccionada = -1;
            actualizarVista();
        }
    }

    private void actualizarVista() {
        char[][] mTablero = tablero.getmTablero();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                JButton boton = botones[i][j];
                char valor = mTablero[i][j];

                boton.setText(valor == '*' ? "●" : (valor == '-' ? "" : " "));
                boton.setBackground(Color.LIGHT_GRAY);

                if (valor == '*') {
                    boton.setForeground(Color.BLACK);
                } else {
                    boton.setForeground(Color.GRAY);
                }

                boton.setEnabled(valor != ' '); // Deshabilita botones fuera del tablero
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SenkuGUI::new);
    }
}
