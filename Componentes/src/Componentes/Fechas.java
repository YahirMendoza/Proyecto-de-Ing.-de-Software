package Componentes;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

public class Fechas extends JDateChooser {
//
//    JDateChooser jDateChooser1 = new com.toedter.calendar.JDateChooser();

    public Fechas() {
     this.setBorder(null);
        this.setOpaque(true);
        this.setFont(new Font("Calibri", 14, 14));
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setPreferredSize(new Dimension(200, 25));
        this.setSize(200, 40);
        this.setCursor(new Cursor(2));
    }

}
