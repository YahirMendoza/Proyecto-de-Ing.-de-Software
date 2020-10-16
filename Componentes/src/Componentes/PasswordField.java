package Componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPasswordField;

/**
 *
 * @author Belorzam
 */
public class PasswordField extends JPasswordField implements MouseListener{

    public PasswordField() {

        this.setText("Contraseña");
        this.setBorder(null);
        this.setOpaque(true);
        this.setFont(new Font("Calibri", 14, 14));
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setPreferredSize(new Dimension(200, 40));
        this.setSize(200, 40);
        this.setCursor(new Cursor(2));
        
        addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        this.setText("");
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }
}
