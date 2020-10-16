
package Componentes;

import javax.swing.JPanel;

/**
 *
 * @author Belorzam
 */
public class CambiaPanel {

    private JPanel container;
    private JPanel content;

    public CambiaPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
}
