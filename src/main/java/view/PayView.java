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

    public PayView(PayViewController controller){
        this.controller = controller;
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
        JLabel concepto = new JLabel("Conceptio de pago:");
        concepto.setBounds(30,10,150,30);
        panel.add(concepto);

        JLabel tipoBien = new JLabel("Tipo de bien:");
        tipoBien.setBounds(30,40,150,30);
        panel.add(tipoBien);

        JLabel idEvento = new JLabel("ID de evento:");
        idEvento.setBounds(30,70,150,30);
        panel.add(idEvento);

        JLabel importe = new JLabel("Importe del servicio:");
        importe.setBounds(30,100,150,30);
        panel.add(importe);

        //right

        JLabel fechaAdj = new JLabel("Fecha de adjudicacion:");//inicializo con "profesores
        fechaAdj.setBounds(300,10,150,30);
        panel.add(fechaAdj);

        JLabel horaAdj = new JLabel("Hora de adjudicacion:");//inicializo con "profesores
        horaAdj.setBounds(300,40,150,30);
        panel.add(horaAdj);

        JLabel usoHorario = new JLabel("Huso-horario deseado:");//inicializo con "profesores
        usoHorario.setBounds(300,70,150,30);
        panel.add(usoHorario);
    }

    private void tiposPago(){
        JLabel seleccion = new JLabel("Seleccione metodo de pago:");
        seleccion.setBounds(30,140,180,30);
        panel.add(seleccion);

        JButton tarjeta = new JButton("pago tarjeta");
        tarjeta.setBounds(30,190,150,30);
        panel.add(tarjeta);

        pagar = new JButton("Pagar");
        pagar.setBounds(400,380,80,30);
        panel.add(pagar);

        JButton oxxo = new JButton("pago oxxo");
        oxxo.setBounds(300,190,150,30);
        panel.add(oxxo);

        generarComprobante = new JButton("Generar comprobante");
        generarComprobante.setBounds(30,300,180,30);
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
        tarjetaHabiente = new JLabel("Nombre del tarjetahabiente");
        tarjetaHabiente.setBounds(30, 230, 180, 30);
        panel.add(tarjetaHabiente);

        campoTarjetaHabiente = new JTextField();
        campoTarjetaHabiente.setBounds(30,260,180,30);
        campos.add(campoTarjetaHabiente);
        panel.add(campoTarjetaHabiente);

        numeroTarjeta = new JLabel("Numero de tarjeta de credito");
        numeroTarjeta.setBounds(300, 230, 180, 30);
        panel.add(numeroTarjeta);

        campoNumeroTarjeta = new JTextField();
        campoNumeroTarjeta.setBounds(300,260,180,30);
        campos.add(campoNumeroTarjeta);
        panel.add(campoNumeroTarjeta);

        fechaExpiracion = new JLabel("Fecha de expiracion (MM/AAAA)");
        fechaExpiracion.setBounds(30, 290, 190, 30);
        panel.add(fechaExpiracion);

        campoFechaExpiracionMonth = new JTextField();
        campoFechaExpiracionMonth.setBounds(30,320,80,30);
        campos.add(campoFechaExpiracionMonth);
        separador = new JLabel("/");
        separador.setBounds(120,320,80,30);
        campoFechaExpiracionYear = new JTextField();
        campoFechaExpiracionYear.setBounds(130,320,80,30);
        campos.add(campoFechaExpiracionYear);
        panel.add(campoFechaExpiracionMonth);
        panel.add(separador);
        panel.add(campoFechaExpiracionYear);

        cvc = new JLabel("CVC");
        cvc.setBounds(300, 290, 180, 30);
        panel.add(cvc);

        campoCVC = new JTextField();
        campoCVC.setBounds(300,320,180,30);
        campos.add(campoCVC);
        panel.add(campoCVC);

        numeroTelefonoTarjeta = new JLabel("Numero telefonico");
        numeroTelefonoTarjeta.setBounds(30, 350, 180, 30);
        panel.add(numeroTelefonoTarjeta);

        campoTelefonoTarjeta = new JTextField();
        campoTelefonoTarjeta.setBounds(30,380,180,30);
        campos.add(campoTelefonoTarjeta);
        panel.add(campoTelefonoTarjeta);

        //oxxo

        numeroTelefonoOxxo = new JLabel("Numero telefonico");
        numeroTelefonoOxxo.setBounds(30, 230, 180, 30);
        panel.add(numeroTelefonoOxxo);

        campoTelefonoOxxo = new JTextField();
        campoTelefonoOxxo.setBounds(30,260,180,30);
        //campos.add(campoTelefonoOxxo);
        panel.add(campoTelefonoOxxo);

        //Por defecto pago de tarjeta

        numeroTelefonoOxxo.setVisible(false);
        campoTelefonoOxxo.setVisible(false);
        generarComprobante.setVisible(false);

    }

    private void deshabilitarCampoTarjeta(){
        tarjetaHabiente.setVisible(false);
        campoTarjetaHabiente.setVisible(false);
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

        numeroTelefonoOxxo.setVisible(true);
        campoTelefonoOxxo.setVisible(true);
        generarComprobante.setVisible(true);
    }

    private void deshabilitarCampoOxxo(){
        numeroTelefonoOxxo.setVisible(false);
        campoTelefonoOxxo.setVisible(false);
        generarComprobante.setVisible(false);

        tarjetaHabiente.setVisible(true);
        campoTarjetaHabiente.setVisible(true);
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
    }

    private void generarComprobante(){
        if(verificarPagoOxxo() == true){
            System.out.println("nice");
            controller.setMethod("oxxo");
            controller.phoneNumber(Long.parseLong(numeroTelefonoOxxo.getText()));
            controller.pay(550.50);
        }else{
            System.out.println("Llene todos los campos antes");
        }
    }

    private void pagar(){
        if(verificarPagoTarjeta() == true){
            System.out.println("nice");
            controller.setMethod("credit-card");
            controller.ownerName(campoTarjetaHabiente.getText());
            controller.creaditCardNumer(campoNumeroTarjeta.getText());
            controller.month(Integer.parseInt(campoFechaExpiracionMonth.getText()));
            controller.year(Integer.parseInt(campoFechaExpiracionYear.getText()));
            controller.cvc(Integer.parseInt(campoCVC.getText()));
            controller.phoneNumber(Long.parseLong(campoTelefonoTarjeta.getText()));
            controller.pay(550.50);
        }else{
            System.out.println("Llene todos los campos antes");
        }
    }

    private boolean verificarPagoTarjeta(){
        boolean camposLlenos = true;
        for (int i = 0; i < campos.size(); i++){
            if(campos.get(i).getText().equals("")){
                camposLlenos = false;
            }
        }
        return camposLlenos;
    }

    private boolean verificarPagoOxxo(){
        boolean campoLleno = true;
        if(campoTelefonoOxxo.getText().equals("")){
            campoLleno = false;
        }
        return campoLleno;
    }

}
