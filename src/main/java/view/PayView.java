package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PayView extends JFrame{

    private ArrayList<JTextField> campos;
    private ArrayList<String> salida;
    private JPanel panel;
    private PayViewController controller;
    private String userID;
    private JLabel nombreDueniotarjeta;
    private JTextField campoDueniooTarjeta;

    //campo tarjeta
    private JLabel tarjetaHabiente;
    private JTextField campoTarjetaHabiente;
    private JLabel numeroTarjeta;
    private JTextField campoNumeroTarjeta;
    private JLabel fechaExpiracion;
    private JTextField campoFechaExpiracionMonth;
    private JLabel separador;
    private JTextField campoFechaExpiracionYear;
    private JLabel cvc;
    private JTextField campoCVC;
    private JLabel numeroTelefonoTarjeta;
    private JTextField campoTelefonoTarjeta;
    private JButton pagar;

    //campo oxxo
    private JLabel numeroTelefonoOxxo;
    private JTextField campoTelefonoOxxo;
    private JButton generarComprobante;

    public PayView(PayViewController controller, String userID){
        this.controller = controller;
        this.userID = userID;
        setSize(540,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        campos = new ArrayList<JTextField>();
        salida = new ArrayList<String>();
        contenido();
    }

    private void contenido(){
        panel();
        infoPublicacion();
        tiposPago();
        camposDePago();
    }


    private void panel(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    private void infoPublicacion(){
        //left
        JLabel concepto = new JLabel("Concepto de pago: Compra");
        concepto.setBounds(30,10,200,30);
        panel.add(concepto);

        JLabel tipoBien = new JLabel("Tipo de bien: inmueble");
        tipoBien.setBounds(30,40,150,30);
        panel.add(tipoBien);

        JLabel idEvento = new JLabel("ID de evento:32432");
        idEvento.setBounds(30,70,150,30);
        panel.add(idEvento);

        JLabel importe = new JLabel("Importe del servicio:$550");
        importe.setBounds(30,100,150,30);
        panel.add(importe);

        //right

        JLabel fechaAdj = new JLabel("Fecha de adjudicacion: Hoy");//inicializo con "profesores
        fechaAdj.setBounds(300,10,200,30);
        panel.add(fechaAdj);

        JLabel horaAdj = new JLabel("Hora de adjudicacion: Aurita");//inicializo con "profesores
        horaAdj.setBounds(300,40,200,30);
        panel.add(horaAdj);

        JLabel usoHorario = new JLabel("Huso-horario deseado: Mex GMT/UTC");//inicializo con "profesores
        usoHorario.setBounds(300,70,230,30);
        panel.add(usoHorario);

        //nombre de tarjeta-habiente
        tarjetaHabiente = new JLabel("Nombre de usuario");
        tarjetaHabiente.setBounds(30, 130, 180, 30);
        panel.add(tarjetaHabiente);

        campoTarjetaHabiente = new JTextField();
        campoTarjetaHabiente.setBounds(30,160,180,30);
        campos.add(campoTarjetaHabiente);
        panel.add(campoTarjetaHabiente);

        nombreDueniotarjeta = new JLabel("Titular de la tarjeta");
        nombreDueniotarjeta.setBounds(300, 130, 180, 30);
        panel.add(nombreDueniotarjeta);

        campoDueniooTarjeta = new JTextField();
        campoDueniooTarjeta.setBounds(300,160,180,30);
        campos.add(campoDueniooTarjeta);
        panel.add(campoDueniooTarjeta);

    }

    private void tiposPago(){
        JLabel seleccion = new JLabel("Seleccione metodo de pago:");
        seleccion.setBounds(30,190,180,30);
        panel.add(seleccion);

        JButton tarjeta = new JButton("pago tarjeta");
        tarjeta.setBounds(30,220,150,30);
        panel.add(tarjeta);

        pagar = new JButton("Pagar");
        pagar.setBounds(400,410,80,30);
        panel.add(pagar);

        JButton oxxo = new JButton("pago oxxo");
        oxxo.setBounds(300,220,150,30);
        panel.add(oxxo);

        generarComprobante = new JButton("Generar comprobante");
        generarComprobante.setBounds(30,330,180,30);
        panel.add(generarComprobante);

        ActionListener seleccionTarjeta = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                deshabilitarCampoOxxo();
            }
        };

        ActionListener pagoTarjeta = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                pagar();
            }
        };

        ActionListener seleccionOxxo = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                deshabilitarCampoTarjeta();
            }
        };

        ActionListener pagoOxxo = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                generarComprobante();
            }
        };

        tarjeta.addActionListener(seleccionTarjeta);
        oxxo.addActionListener(seleccionOxxo);
        pagar.addActionListener(pagoTarjeta);
        generarComprobante.addActionListener(pagoOxxo);
    }

    private void camposDePago(){

        //Tarjeta

        numeroTarjeta = new JLabel("Numero de tarjeta de credito");
        numeroTarjeta.setBounds(300, 260, 180, 30);
        panel.add(numeroTarjeta);

        campoNumeroTarjeta = new JTextField();
        campoNumeroTarjeta.setBounds(300,290,180,30);
        campos.add(campoNumeroTarjeta);
        panel.add(campoNumeroTarjeta);

        fechaExpiracion = new JLabel("Fecha de expiracion (MM/AAAA)");
        fechaExpiracion.setBounds(30, 260, 190, 30);
        panel.add(fechaExpiracion);

        campoFechaExpiracionMonth = new JTextField();
        campoFechaExpiracionMonth.setBounds(30,290,80,30);
        campos.add(campoFechaExpiracionMonth);
        separador = new JLabel("/");
        separador.setBounds(120,290,80,30);
        campoFechaExpiracionYear = new JTextField();
        campoFechaExpiracionYear.setBounds(130,290,80,30);
        campos.add(campoFechaExpiracionYear);
        panel.add(campoFechaExpiracionMonth);
        panel.add(separador);
        panel.add(campoFechaExpiracionYear);

        cvc = new JLabel("CVC");
        cvc.setBounds(300, 320, 180, 30);
        panel.add(cvc);

        campoCVC = new JTextField();
        campoCVC.setBounds(300,350,180,30);
        campos.add(campoCVC);
        panel.add(campoCVC);

        numeroTelefonoTarjeta = new JLabel("Numero telefonico");
        numeroTelefonoTarjeta.setBounds(30, 320, 180, 30);
        panel.add(numeroTelefonoTarjeta);

        campoTelefonoTarjeta = new JTextField();
        campoTelefonoTarjeta.setBounds(30,350,180,30);
        campos.add(campoTelefonoTarjeta);
        panel.add(campoTelefonoTarjeta);

        //oxxo

        numeroTelefonoOxxo = new JLabel("Numero telefonico");
        numeroTelefonoOxxo.setBounds(30, 260, 180, 30);
        panel.add(numeroTelefonoOxxo);

        campoTelefonoOxxo = new JTextField();
        campoTelefonoOxxo.setBounds(30,290,180,30);
        //campos.add(campoTelefonoOxxo);
        panel.add(campoTelefonoOxxo);

        //Por defecto pago de tarjeta

        numeroTelefonoOxxo.setVisible(false);
        campoTelefonoOxxo.setVisible(false);
        generarComprobante.setVisible(false);

    }

    private void deshabilitarCampoTarjeta(){
        numeroTarjeta.setVisible(false);
        campoNumeroTarjeta.setVisible(false);
        fechaExpiracion.setVisible(false);
        campoFechaExpiracionMonth.setVisible(false);
        separador.setVisible(false);
        campoFechaExpiracionYear.setVisible(false);
        cvc.setVisible(false);
        campoCVC.setVisible(false);
        numeroTelefonoTarjeta.setVisible(false);
        campoTelefonoTarjeta.setVisible(false);
        pagar.setVisible(false);
        nombreDueniotarjeta.setVisible(false);
        campoDueniooTarjeta.setVisible(false);

        numeroTelefonoOxxo.setVisible(true);
        campoTelefonoOxxo.setVisible(true);
        generarComprobante.setVisible(true);
    }

    private void deshabilitarCampoOxxo(){
        numeroTelefonoOxxo.setVisible(false);
        campoTelefonoOxxo.setVisible(false);
        generarComprobante.setVisible(false);

        numeroTarjeta.setVisible(true);
        campoNumeroTarjeta.setVisible(true);
        fechaExpiracion.setVisible(true);
        campoFechaExpiracionMonth.setVisible(true);
        separador.setVisible(true);
        campoFechaExpiracionYear.setVisible(true);
        cvc.setVisible(true);;
        campoCVC.setVisible(true);
        numeroTelefonoTarjeta.setVisible(true);
        campoTelefonoTarjeta.setVisible(true);
        pagar.setVisible(true);
        nombreDueniotarjeta.setVisible(true);
        campoDueniooTarjeta.setVisible(true);
    }

    private void generarComprobante(){
        if(verificarPagoOxxo() == true) {
            controller.setMethod("oxxo");
            controller.addConstumerName(campoDueniooTarjeta.getText());
            controller.addPhoneNumber(campoTelefonoOxxo.getText());
            controller.addAmount(550.50);
            controller.addDescription("pago de con oxxo");
            controller.pay();
            JOptionPane.showMessageDialog(null,"Comprobante generado con exito");
        }else{
            JOptionPane.showMessageDialog(null,"Llene todos los campos antes");
        }
    }

    private void pagar(){
        if(verificarPagoTarjeta() == true){
            controller.setMethod("credit-card");
            controller.addCardToken(campoDueniooTarjeta.getText(),
                    campoNumeroTarjeta.getText(),
                    Integer.parseInt(campoFechaExpiracionMonth.getText()),
                    Integer.parseInt(campoFechaExpiracionYear.getText()),
                    Integer.parseInt(campoCVC.getText()));
            controller.addConstumerName(campoDueniooTarjeta.getText());
            controller.addPhoneNumber(campoTelefonoOxxo.getText());
            controller.addAmount(550.50);
            controller.addDescription("pago de inmueble con tarjeta");
            controller.pay();
            JOptionPane.showMessageDialog(null,"Transaccion realizada con exito");
        }else{
            JOptionPane.showMessageDialog(null,"Llene todos los campos antes");
        }
    }

    private boolean verificarPagoTarjeta(){
        boolean camposLlenos = true;
        for (int i = 0; i < campos.size(); i++){
            if(campos.get(i).getText().equals("")){
                camposLlenos = false;
            }
        }
        camposLlenos = verificarNombreEscrito();
        return camposLlenos;
    }

    private boolean verificarPagoOxxo(){
        boolean campoLleno = true;
        if(campoTelefonoOxxo.getText().equals("")){
            campoLleno = false;
        }
        campoLleno = verificarNombreEscrito();
        return campoLleno;
    }

    private boolean verificarNombreEscrito(){
        if(campoTarjetaHabiente.getText().equals("")){
            return false;
        }else{
            return true;
        }
    }

}
