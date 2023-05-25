package Vistas;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
//Atributos
    private PanelEntradaDatos panelEntradaDatos;
    

    public void PanelEntradaDatos() {


        panelEntradaDatos = new PanelEntradaDatos();
        panelEntradaDatos.setBounds(10, 10, 480, 300);
        this.add(panelEntradaDatos);



        //Caracteristicas de la ventana
        this.setTitle("Biblioteca");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);


    }
    
}
