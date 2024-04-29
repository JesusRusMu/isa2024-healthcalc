package healthcalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Vista_Calculadora {

    private JFrame frame;
    private JTextField WeightValue;
    private JTextField HeightValue;
    private JTextField IdealWeightResults;
    private JTextField BMRResults;
    private JButton bHombre;
    private JButton bMujer;
    private JTextField AgeValue;
    private JButton BMR;
    private JButton IW;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Vista_Calculadora window = new Vista_Calculadora();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Vista_Calculadora() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 745, 607);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 500, 100);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("CALCULADORA DE LA SALUD ");
        lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
        lblNewLabel.setBounds(200, 11, 500, 66);
        panel.add(lblNewLabel);
        
        // Género
        bHombre = new JButton("HOMBRE");
        bMujer = new JButton("MUJER");
        
        bHombre.setFont(new Font("SansSerif", Font.PLAIN, 15));
        bHombre.setBounds(100, 150, 100, 40);
        frame.getContentPane().add(bHombre);
        
        bMujer.setFont(new Font("SansSerif", Font.PLAIN, 15));
        bMujer.setBounds(250, 150, 100, 40);
        frame.getContentPane().add(bMujer);
        

        // EDAD

        JLabel lblAge = new JLabel("EDAD");
        lblAge.setFont(new Font("SansSerif", Font.PLAIN, 10));
        lblAge.setBounds(450, 123, 88, 30);
        frame.getContentPane().add(lblAge);


        AgeValue = new JTextField();
        AgeValue.setBounds(427, 150, 135, 36);
        frame.getContentPane().add(AgeValue);
        AgeValue.setColumns(10);
        
        // PESO
        
        JLabel lblWeight = new JLabel("PESO");
        lblWeight.setFont(new Font("SansSerif", Font.PLAIN, 10));
        lblWeight.setBounds(200, 200, 88, 29);
        frame.getContentPane().add(lblWeight);
        
        WeightValue = new JTextField();
        WeightValue.setBounds(180, 229, 135, 36);
        frame.getContentPane().add(WeightValue);
        WeightValue.setColumns(10);
        
        // ALTURA

        JLabel lblHeight = new JLabel("ALTURA");
        lblHeight.setFont(new Font("SansSerif", Font.PLAIN, 10));
        lblHeight.setBounds(450, 200, 88, 29);
        frame.getContentPane().add(lblHeight);
        
        HeightValue = new JTextField();
        HeightValue.setColumns(10);
        HeightValue.setBounds(427, 229, 135, 36);
        frame.getContentPane().add(HeightValue);
    
        // Calculo de Los resultados

        BMR = new JButton("Calculate Basal MR");
        BMR.setFont(new Font("SansSerif", Font.PLAIN, 13));
        BMR.setBounds(400, 371, 173, 55);
        frame.getContentPane().add(BMR);

         
        BMRResults = new JTextField();
        BMRResults.setColumns(10);
        BMRResults.setBounds(532, 497, 121, 36);
        frame.getContentPane().add(BMRResults);
        

        IW = new JButton("Calculate Ideal Weight");
        IW.setFont(new Font("SansSerif", Font.PLAIN, 13));
        IW.setBounds(100, 371, 173, 55);
        frame.getContentPane().add(IW);

        
        
        IdealWeightResults = new JTextField();
        IdealWeightResults.setColumns(10);
        IdealWeightResults.setBounds(285, 497, 121, 36);
        frame.getContentPane().add(IdealWeightResults);
       
        


        JLabel lblResults = new JLabel("RESULTADOS DE CADA PRUEBA");
        lblResults.setFont(new Font("SansSerif", Font.PLAIN, 18));
        lblResults.setBounds(150, 457, 300, 29);
        frame.getContentPane().add(lblResults);


        JLabel lblNewLabel_1_2 = new JLabel("kg");
        lblNewLabel_1_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblNewLabel_1_2.setBounds(416, 502, 49, 25);
        frame.getContentPane().add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_2_1 = new JLabel("kcal/day");
        lblNewLabel_1_2_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblNewLabel_1_2_1.setBounds(656, 502, 49, 25);
        frame.getContentPane().add(lblNewLabel_1_2_1);
        
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public JTextField getWeightValue() {
        return WeightValue;
    }

    public JTextField getHeightValue() {
        return HeightValue;
    }

    public JTextField getIdealWeightResults() {
        return IdealWeightResults;
    }

    public JTextField getBMRResults() {
        return BMRResults;
    }

    public JButton getMaleButton() {
        return bHombre;
    }

    public JButton getFemaleButton() {
        return bMujer;
    }

    public JTextField getAgeValue() {
        return AgeValue;
    }

    public JButton getCalcBMR() {
        return BMR;
    }

    public JButton getCalcIdealWeight() {
        return IW;
    }
    
    public void registrarControlador(ActionListener ctrl) {
        BMR.addActionListener(ctrl);
        BMR.setActionCommand("getBMR");
        
        IW.addActionListener(ctrl);
        IW.setActionCommand("getIdealW");
        
        bHombre.addActionListener(ctrl);
        bHombre.setActionCommand("maleButton");
        
        bMujer.addActionListener(ctrl);
        bMujer.setActionCommand("femaleButton");
    }
    
    public void setBMRResults(float res) {
        BMRResults.setText(String.valueOf(res));
    }
    
    public void setIdealWResults(float res) {
        IdealWeightResults.setText(String.valueOf(res));
    }
    
    public void invalidInputsIdealWError(String errCode) {
        JOptionPane.showMessageDialog(frame,
                errCode,
                "Ingrese números válidos para la altura y género",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public void invalidInputsBMR(String errCode) {
        JOptionPane.showMessageDialog(frame,
                errCode,
                "Ingrese números válidos para la altura, peso, género y edad",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public void noInputsErr() {
        JOptionPane.showMessageDialog(frame,
                "Debe rellenar los campos necesarios antes de calcular",
                "Ha sucedido un error",
                JOptionPane.ERROR_MESSAGE);
    }
    
    
}