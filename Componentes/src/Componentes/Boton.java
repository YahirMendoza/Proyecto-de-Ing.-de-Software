package Componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Belorzam
 */
public class Boton extends JButton implements MouseListener {

    private Color colorHover = new Color(0, 102, 255);
    private Color colorPressed = new Color(0, 51, 204);
    private Color colorNormal = new Color(0, 102, 204);

    private Color colorTextHover = new Color(0, 0, 0);
    private Color colorTextPressed = new Color(0, 0, 0);
    private Color colorTextNormal = new Color(0, 0, 0);

    public Boton() {
        this.setBorder(null);
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setVisible(true);
        this.setFont(new Font("Calibri", 14, 14));
        this.setBackground(new java.awt.Color(0, 102, 204));
//        this.setForeground(Color.black);
        this.setPreferredSize(new Dimension(85, 35));
        this.setSize(200, 40);
        this.setCursor(new Cursor(12));

        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        this.setBackground(this.colorPressed);
        this.setForeground(this.colorTextPressed);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        this.setBackground(this.colorHover);
        this.setForeground(this.colorTextHover);
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        this.setBackground(this.colorHover);
        this.setForeground(this.colorTextHover);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.colorNormal = colorNormal;
        this.setBackground(this.colorNormal);
    }

    public Color getColorTextHover() {
        return colorTextHover;
    }

    public void setColorTextHover(Color colorTextHover) {
        this.colorTextHover = colorTextHover;
    }

    public Color getColorTextNormal() {
        return colorTextNormal;
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.colorTextNormal = colorTextNormal;
        this.setForeground(this.colorTextNormal);
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
        this.setBackground(this.colorPressed);
    }

    public Color getColorTextPressed() {
        return colorTextPressed;
    }

    public void setColorTextPressed(Color colorTextPressed) {
        this.colorTextPressed = colorTextPressed;
        this.setForeground(this.colorTextPressed);
    }

}
