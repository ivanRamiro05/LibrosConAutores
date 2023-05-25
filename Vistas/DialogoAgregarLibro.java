package Vistas;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class DialogoAgregarLibro  extends JDialog{
    //Atributos

    private JLabel jlnombreLibro;
    private JTextField jtnombreLibro;
    private JLabel jlautorLibro;
    private JTextField jtautorLibro;
    private JLabel añoEdicion;
    private JTextField jtañoEdicion;
    private JComboBox Lujo;
    private int id;

    public void DialogoAgregarLibro(){
        //Caracteristicas del panel
        this.setLayout(null);
        this.setVisible(true);

        //Etiquetas 
        jlnombreLibro = new JLabel("Nombre del libro");
        jlnombreLibro.setBounds(10, 10, 100, 30);
        this.add(jlnombreLibro);

        jlautorLibro = new JLabel("Autor del libro");
        jlautorLibro.setBounds(10, 50, 100, 30);
        this.add(jlautorLibro);

        añoEdicion = new JLabel("Año de edicion");
        añoEdicion.setBounds(10, 90, 100, 30);
        this.add(añoEdicion);

        //Cajas de texto

        jtnombreLibro = new JTextField();
        jtnombreLibro.setBounds(120, 10, 100, 30);
        this.add(jtnombreLibro);

        jtautorLibro = new JTextField();
        jtautorLibro.setBounds(120, 50, 100, 30);
        this.add(jtautorLibro);

        jtañoEdicion = new JTextField();
        jtañoEdicion.setBounds(120, 90, 100, 30);
        this.add(jtañoEdicion);

        //Botones

        Lujo = new JComboBox();
        Lujo.setBounds(10, 130, 100, 30);
        Lujo.addItem("Si");
        Lujo.addItem("No");
        this.add(Lujo);

        
        

    }    
}
