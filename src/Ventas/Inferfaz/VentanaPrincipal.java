package Ventas.Inferfaz;
import javax.swing.*;

import vehiculo.mundo.NegocioVehiculos;
import vehiculo.mundo.Vehiculo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private NegocioVehiculos negocioVehiculos;
    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public VentanaPrincipal() {
        negocioVehiculos = new NegocioVehiculos();
        inicializarVentana();
    }

    private void inicializarVentana() {
        frame = new JFrame("Negocio de Vehículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panelPrincipal = new JPanel();
        frame.getContentPane().add(panelPrincipal, BorderLayout.CENTER);
        panelPrincipal.setLayout(new GridLayout(1, 1, 0, 0));

        // Aquí debes agregar los componentes de Swing (JLabel, JTextField, JButton, etc.) y
        // organizarlos en el panel utilizando administradores de diseño.

        // Puedes crear componentes individuales para cada función requerida (como botones para
        // agregar vehículos, buscar vehículos, etc.) y agregar ActionListener a cada uno de ellos
        // para llamar a los métodos apropiados en la clase NegocioVehiculos.

        // Por ejemplo:
        JButton btnAgregarVehiculo = new JButton("Agregar vehículo");
        panelPrincipal.add(btnAgregarVehiculo);
        btnAgregarVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llama al método agregarVehiculo() en negocioVehiculos y pasa un objeto Vehiculo
                // con los valores ingresados en los campos de texto correspondientes.
            }
        });
    }
}