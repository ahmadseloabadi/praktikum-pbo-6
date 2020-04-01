package com.Formullir_123180014;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author WINDOWS
 */
public class Form extends JFrame{

    JLabel hobi, nama, jeniskelamin, alamat,perempuan,laki;
    JTextField texthobi, textnama;
    JTextArea textalamat;

    public void tampilanForm(){
        setTitle("BIODATA");
        JButton btncetak = new JButton("Cetak");
        nama = new JLabel ("Nama");
        hobi = new JLabel ("HOBI");
        jeniskelamin = new JLabel ("Gender");
        alamat = new JLabel("Alamat");
        textnama= new JTextField();
        texthobi =new JTextField();
        textalamat = new JTextArea();
        JRadioButton l = new JRadioButton(" Laki-Laki ");
        JRadioButton p = new JRadioButton("perempuan ");
        perempuan = new JLabel("perempuan");
        laki = new JLabel("Laki");


        ButtonGroup group = new ButtonGroup();
        group.add(p);
        group.add(l);


        setLayout(null);
        add(btncetak);
        add(nama);
        add(hobi);
        add(jeniskelamin);
        add(alamat);
        add(texthobi);
        add(textnama);
        add(textalamat);
        add(p);
        add(l);
        add(perempuan);
        add(laki);

        nama.setBounds(10,20,100,20);
        hobi.setBounds(10,50,100,20);
        textnama.setBounds(120,20,120,20);
        texthobi.setBounds(120,50,120,20);
        jeniskelamin.setBounds(10,80,100,20);
        alamat.setBounds(10,110,100,20);
        textalamat.setBounds(120,110,120,50);
        p.setBounds (120,80, 20,20);
        perempuan.setBounds(150,80,100,20);
        l.setBounds(260,80,20,20);
        laki.setBounds(290,80,100,20);
        btncetak.setBounds(120,170,100,20);


        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        btncetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String JENISkel="";
                if (l.isSelected()){
                    JENISkel = l.getText();
                }else{
                    JENISkel = p.getText();
                }
                String nama = textnama.getText();
                String nim = texthobi.getText();
                String alamat = textalamat.getText();


                System.out.println("NIM = "+ nim);
                System.out.println("NAMA = "+ nama);
                System.out.println("GENDER = "+ JENISkel);
                System.out.println("ALAMAT  = "+ alamat);

            }
        });

    }
}
