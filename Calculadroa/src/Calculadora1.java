import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora1 {
    private JPanel Calculadora;
    private JTextField txtResultado;
    private JButton btnSumar;
    private JButton btnLogaritmo;
    private JButton btnPotencia2;
    private JButton btnValorAbsoluto;
    private JButton btnSeno;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnModulo;
    private JButton btnSalir;
    private JButton btnLn;
    private JButton btnCoseno;
    private JButton btnTangente;
    private JButton btnRaiz;
    private JButton btnPotencia;
    private JTextField txtNumero1;
    private JTextField txtNumero2;

    public Calculadora1() {
        btnSumar.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = numero1 + numero2;
            txtResultado.setText(String.valueOf(resultado));
        });

        btnRestar.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = numero1 - numero2;
            txtResultado.setText(String.valueOf(resultado));
        });

        btnMultiplicar.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = numero1 * numero2;
            txtResultado.setText(String.valueOf(resultado));
        });

        btnDividir.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            if (numero2 != 0) {
                double resultado = numero1 / numero2;
                txtResultado.setText(String.valueOf(resultado));
            } else {
                txtResultado.setText("Error: División por cero");
            }
        });

        btnSeno.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double resultado = Math.sin(Math.toRadians(numero1));
            txtResultado.setText(String.valueOf(resultado));
        });

        btnCoseno.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double resultado = Math.cos(Math.toRadians(numero1));
            txtResultado.setText(String.valueOf(resultado));
        });

        btnTangente.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double resultado = Math.tan(Math.toRadians(numero1));
            txtResultado.setText(String.valueOf(resultado));
        });

        btnLogaritmo.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double resultado = Math.log10(numero1);
            txtResultado.setText(String.valueOf(resultado));
        });

        btnLn.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double resultado = Math.log(numero1);
            txtResultado.setText(String.valueOf(resultado));
        });

        btnPotencia.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = Math.pow(numero1, numero2);
            txtResultado.setText(String.valueOf(resultado));
        });

        btnPotencia2.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = Math.pow(numero1, numero2);
            txtResultado.setText(String.valueOf(resultado));
        });

        btnRaiz.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double resultado = Math.sqrt(numero1);
            txtResultado.setText(String.valueOf(resultado));
        });

        btnValorAbsoluto.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double resultado = Math.abs(numero1);
            txtResultado.setText(String.valueOf(resultado));
        });

        btnModulo.addActionListener(e -> {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = numero1 % numero2;
            txtResultado.setText(String.valueOf(resultado));
        });

        btnSalir.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora1");
        frame.setContentPane(new Calculadora1().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
