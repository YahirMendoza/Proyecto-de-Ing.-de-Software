package Componentes;

import MetodosDB.ConexionDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Belorzam
 */
public class ContenedorPrincipal extends javax.swing.JFrame {

    Comunicador comprin;
    public ContenedorPrincipal(Comunicador comprin) {
        this.comprin=comprin;
        initComponents();
        this.setLocationRelativeTo(this);
        this.Uno.setSelected(true);
        setTitle("Su Inventario");
        JtablaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JtablaInv.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JtablaVentas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos/Logotipo_3.png")).getImage());
//        jScrollPane2.getViewport().setBackground(Color.white);
//        jScrollPane1.getViewport().setBackground(Color.white);
        
        mostrardatos("");        
        mostrardatosInv("");
        mostrardatosVen("");
    }
    DefaultTableModel Modelo;
    DefaultTableModel ModeloInv;
    DefaultTableModel Modeloven;
    
    void mostrardatos(String busqueda){
        Modelo = new DefaultTableModel();
        Modelo.addColumn("USUARIO");
        Modelo.addColumn("CONTRASEÑA");
        Modelo.addColumn("NOMBRE");
        Modelo.addColumn("APELLIDO");
        Modelo.addColumn("CORREO");
        Modelo.addColumn("FECHA NACIMIENTO");
        Modelo.addColumn("DIRECCIÓN");
        JtablaUsuarios.setModel(Modelo);
        String []datos = new String[7]; 
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT IdUsuario,Contraseña,Nombre,Apellidos,Correo,fechanacimiento,Direccion from Usuario WHERE IdUsuario Like '%"+busqueda+"%'");
            while (rs.next()) {                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                Modelo.addRow(datos);
            }
            JtablaUsuarios.setModel(Modelo);
        } catch (Exception e) {
        }
    }

    void mostrardatosInv(String busquedainv){
        ModeloInv = new DefaultTableModel();
        ModeloInv.addColumn("CÓDIGO");
        ModeloInv.addColumn("NOMBRE");
        ModeloInv.addColumn("CANTIDAD");
        ModeloInv.addColumn("PRECIO");
        ModeloInv.addColumn("DESCRIPCIÓN");
        ModeloInv.addColumn("FECHA DE COMPRA");
        JtablaInv.setModel(ModeloInv);
        String []datosinv = new String[6]; 
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Cod_prod,Nombre,Cantidad,Precio,Descripcion,Fechaentrega from producto WHERE Cod_prod Like '%"+busquedainv+"%'");
            while (rs.next()) {                
                datosinv[0]=rs.getString(1);
                datosinv[1]=rs.getString(2);
                datosinv[2]=rs.getString(3);
                datosinv[3]=rs.getString(4);
                datosinv[4]=rs.getString(5);
                datosinv[5]=rs.getString(6);
                ModeloInv.addRow(datosinv);
            }
            JtablaInv.setModel(ModeloInv);
        } catch (Exception e) {
        }
    }
    
        void mostrardatosVen(String busquedaven){
        Modeloven = new DefaultTableModel();
        Modeloven.addColumn("N. VENTA");
        Modeloven.addColumn("CLIENTE");
        Modeloven.addColumn("PRODUCTOS");
        Modeloven.addColumn("PRECIO");
        Modeloven.addColumn("FECHA DE COMPRA");
        Modeloven.addColumn("DIRECCIÓN");
        JtablaVentas.setModel(Modeloven);
        String []datosv = new String[6]; 
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from ventas WHERE Cod_ven Like '%"+busquedaven+"%'");
            while (rs.next()) {                
                datosv[0]=rs.getString(1);
                datosv[1]=rs.getString(2);
                datosv[2]=rs.getString(3);
                datosv[3]=rs.getString(4);
                datosv[4]=rs.getString(5);
                datosv[5]=rs.getString(6);
                Modeloven.addRow(datosv);
            }
            JtablaVentas.setModel(Modeloven);
        } catch (Exception e) {
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlCabecera = new javax.swing.JPanel();
        btnMenu = new Componentes.Boton();
        BtnSalir = new Componentes.BotonPanel();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Dos = new Componentes.BotonPanel();
        Uno = new Componentes.BotonPanel();
        Cinco = new Componentes.BotonPanel();
        Tres = new Componentes.BotonPanel();
        Cuatro = new Componentes.BotonPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Ocho = new Componentes.BotonPanel();
        Siete = new Componentes.BotonPanel();
        Seis = new Componentes.BotonPanel();
        pnlPrincipal = new javax.swing.JPanel();
        jpnlUno = new javax.swing.JPanel();
        jSeparatoPass = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        BTNRegistrar1 = new Componentes.Boton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtablaUsuarios = new rojerusan.RSTableMetro();
        BTNActualizar = new Componentes.Boton();
        txtField1 = new Componentes.TxtField();
        label1 = new Componentes.Label();
        jpnlDos = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablaInv = new rojerusan.RSTableMetro();
        BTNRegistrarprod = new Componentes.Boton();
        BTNBorrarprod = new Componentes.Boton();
        txtFieldprod = new Componentes.TxtField();
        lblbuscarprod = new Componentes.Label();
        jSeparatoPass1 = new javax.swing.JSeparator();
        jpnlTres = new javax.swing.JPanel();
        jpnlTres1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtablaVentas = new rojerusan.RSTableMetro();
        TxtVen = new Componentes.TxtField();
        lblbuscarprod1 = new Componentes.Label();
        jSeparatoPass2 = new javax.swing.JSeparator();
        BTNEliminarventa = new Componentes.Boton();
        jpnlCuatro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpnlCinco = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBase.setBackground(new java.awt.Color(255, 255, 255));

        pnlCabecera.setBackground(new java.awt.Color(0, 102, 204));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/menu.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(38, 86, 186));
        BtnSalir.setText("Salir");
        BtnSalir.setColorHover(new java.awt.Color(255, 0, 0));
        BtnSalir.setColorNormal(new java.awt.Color(38, 86, 186));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCabeceraLayout = new javax.swing.GroupLayout(pnlCabecera);
        pnlCabecera.setLayout(pnlCabeceraLayout);
        pnlCabeceraLayout.setHorizontalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCabeceraLayout.setVerticalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlMenu.setBackground(new java.awt.Color(214, 217, 223));

        jPanel4.setBackground(new java.awt.Color(214, 217, 223));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setText("PEOPLE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dos.setForeground(new java.awt.Color(166, 166, 166));
        Dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/collection.png"))); // NOI18N
        Dos.setText("INVENTARIO");
        Dos.setColorHover(new java.awt.Color(204, 204, 204));
        Dos.setColorNormal(new java.awt.Color(214, 217, 223));
        Dos.setColorPressed(new java.awt.Color(204, 204, 204));
        Dos.setColorTextHover(new java.awt.Color(128, 128, 131));
        Dos.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Dos.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Dos.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Dos.setIconTextGap(25);
        Dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DosMousePressed(evt);
            }
        });
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });

        Uno.setForeground(new java.awt.Color(166, 166, 166));
        Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/home.png"))); // NOI18N
        Uno.setText("USUARIOS");
        Uno.setAlignmentY(0.0F);
        Uno.setColorHover(new java.awt.Color(204, 204, 204));
        Uno.setColorNormal(new java.awt.Color(214, 217, 223));
        Uno.setColorPressed(new java.awt.Color(204, 204, 204));
        Uno.setColorTextHover(new java.awt.Color(128, 128, 131));
        Uno.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Uno.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Uno.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Uno.setIconTextGap(25);
        Uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UnoMousePressed(evt);
            }
        });
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });

        Cinco.setForeground(new java.awt.Color(166, 166, 166));
        Cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/market.png"))); // NOI18N
        Cinco.setText("PRODUCTOS");
        Cinco.setColorHover(new java.awt.Color(204, 204, 204));
        Cinco.setColorNormal(new java.awt.Color(214, 217, 223));
        Cinco.setColorPressed(new java.awt.Color(204, 204, 204));
        Cinco.setColorTextHover(new java.awt.Color(128, 128, 131));
        Cinco.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Cinco.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Cinco.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Cinco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Cinco.setIconTextGap(25);
        Cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CincoMousePressed(evt);
            }
        });
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });

        Tres.setForeground(new java.awt.Color(166, 166, 166));
        Tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/feeedback.png"))); // NOI18N
        Tres.setText("VENTAS");
        Tres.setColorHover(new java.awt.Color(204, 204, 204));
        Tres.setColorNormal(new java.awt.Color(214, 217, 223));
        Tres.setColorPressed(new java.awt.Color(204, 204, 204));
        Tres.setColorTextHover(new java.awt.Color(128, 128, 131));
        Tres.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Tres.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Tres.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Tres.setIconTextGap(25);
        Tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TresMousePressed(evt);
            }
        });
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        Cuatro.setForeground(new java.awt.Color(166, 166, 166));
        Cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/chat.png"))); // NOI18N
        Cuatro.setText("CHAT");
        Cuatro.setColorHover(new java.awt.Color(204, 204, 204));
        Cuatro.setColorNormal(new java.awt.Color(214, 217, 223));
        Cuatro.setColorPressed(new java.awt.Color(204, 204, 204));
        Cuatro.setColorTextHover(new java.awt.Color(128, 128, 131));
        Cuatro.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Cuatro.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Cuatro.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Cuatro.setIconTextGap(25);
        Cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuatroMousePressed(evt);
            }
        });
        Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(214, 217, 223));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(128, 128, 131));
        jLabel2.setText("DEVICES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 100, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ocho.setForeground(new java.awt.Color(166, 166, 166));
        Ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/web.png"))); // NOI18N
        Ocho.setText("WEB");
        Ocho.setColorHover(new java.awt.Color(204, 204, 204));
        Ocho.setColorNormal(new java.awt.Color(214, 217, 223));
        Ocho.setColorPressed(new java.awt.Color(204, 204, 204));
        Ocho.setColorTextHover(new java.awt.Color(128, 128, 131));
        Ocho.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Ocho.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Ocho.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Ocho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ocho.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Ocho.setIconTextGap(25);
        Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoActionPerformed(evt);
            }
        });

        Siete.setForeground(new java.awt.Color(166, 166, 166));
        Siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/ios.png"))); // NOI18N
        Siete.setText("IOS");
        Siete.setColorHover(new java.awt.Color(204, 204, 204));
        Siete.setColorNormal(new java.awt.Color(214, 217, 223));
        Siete.setColorPressed(new java.awt.Color(204, 204, 204));
        Siete.setColorTextHover(new java.awt.Color(128, 128, 131));
        Siete.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Siete.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Siete.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Siete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Siete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Siete.setIconTextGap(25);

        Seis.setForeground(new java.awt.Color(166, 166, 166));
        Seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/android.png"))); // NOI18N
        Seis.setText("ANDROID");
        Seis.setColorHover(new java.awt.Color(204, 204, 204));
        Seis.setColorNormal(new java.awt.Color(214, 217, 223));
        Seis.setColorPressed(new java.awt.Color(204, 204, 204));
        Seis.setColorTextHover(new java.awt.Color(128, 128, 131));
        Seis.setColorTextNormal(new java.awt.Color(166, 166, 166));
        Seis.setColorTextPressed(new java.awt.Color(166, 166, 166));
        Seis.setFont(new java.awt.Font("CALIBRI", 1, 18)); // NOI18N
        Seis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Seis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Seis.setIconTextGap(25);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Siete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new java.awt.CardLayout());

        jpnlUno.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/home.png"))); // NOI18N
        jLabel3.setText("Usuarios");
        jLabel3.setToolTipText("");

        BTNRegistrar1.setText("REGISTRAR");
        BTNRegistrar1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrar1ActionPerformed(evt);
            }
        });

        JtablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USUARIO", "NOMBRE", "APELLIDO", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtablaUsuarios.setAltoHead(30);
        JtablaUsuarios.setColorBackgoundHead(new java.awt.Color(0, 102, 204));
        JtablaUsuarios.setColorFilasForeground1(new java.awt.Color(0, 102, 204));
        JtablaUsuarios.setColorFilasForeground2(new java.awt.Color(0, 102, 204));
        JtablaUsuarios.setColorSelBackgound(new java.awt.Color(0, 102, 204));
        JtablaUsuarios.setGrosorBordeFilas(0);
        JtablaUsuarios.setGrosorBordeHead(0);
        JtablaUsuarios.getTableHeader().setReorderingAllowed(false);
        JtablaUsuarios.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                JtablaUsuariosComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(JtablaUsuarios);

        BTNActualizar.setText("BORRAR");
        BTNActualizar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNActualizarActionPerformed(evt);
            }
        });

        txtField1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtField1.setText("BUSCAR");
        txtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField1ActionPerformed(evt);
            }
        });

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/Search.png"))); // NOI18N
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnlUnoLayout = new javax.swing.GroupLayout(jpnlUno);
        jpnlUno.setLayout(jpnlUnoLayout);
        jpnlUnoLayout.setHorizontalGroup(
            jpnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlUnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jpnlUnoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jpnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatoPass)
                            .addComponent(txtField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnlUnoLayout.setVerticalGroup(
            jpnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlUnoLayout.createSequentialGroup()
                .addGroup(jpnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlUnoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jpnlUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(BTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnlUnoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparatoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlPrincipal.add(jpnlUno, "card2");

        jpnlDos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/collection.png"))); // NOI18N
        jLabel14.setText("Inventario");
        jLabel14.setToolTipText("");

        JtablaInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CANTIDAD", "PRECIO", "DESCRIPCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtablaInv.setAltoHead(30);
        JtablaInv.setGrosorBordeFilas(0);
        JtablaInv.setGrosorBordeHead(0);
        jScrollPane1.setViewportView(JtablaInv);

        BTNRegistrarprod.setText("INGRESAR");
        BTNRegistrarprod.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNRegistrarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrarprodActionPerformed(evt);
            }
        });

        BTNBorrarprod.setText("BORRAR");
        BTNBorrarprod.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNBorrarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBorrarprodActionPerformed(evt);
            }
        });

        txtFieldprod.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtFieldprod.setText("BUSCAR");
        txtFieldprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldprodActionPerformed(evt);
            }
        });

        lblbuscarprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/search.png"))); // NOI18N
        lblbuscarprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbuscarprodMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnlDosLayout = new javax.swing.GroupLayout(jpnlDos);
        jpnlDos.setLayout(jpnlDosLayout);
        jpnlDosLayout.setHorizontalGroup(
            jpnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlDosLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNRegistrarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNBorrarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jpnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatoPass1)
                            .addComponent(txtFieldprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblbuscarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnlDosLayout.setVerticalGroup(
            jpnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblbuscarprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnlDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(BTNRegistrarprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNBorrarprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldprod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlDosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jSeparatoPass1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pnlPrincipal.add(jpnlDos, "card3");

        jpnlTres.setBackground(new java.awt.Color(255, 255, 255));

        jpnlTres1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/feeedback.png"))); // NOI18N
        jLabel13.setText("VENTAS");
        jLabel13.setToolTipText("");

        JtablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. de venta", "Cliente", "Productos", "Precio", "Fecha", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtablaVentas.setAltoHead(30);
        JtablaVentas.setGrosorBordeFilas(0);
        JtablaVentas.setGrosorBordeHead(0);
        jScrollPane3.setViewportView(JtablaVentas);

        TxtVen.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TxtVen.setText("BUSCAR");
        TxtVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtVenActionPerformed(evt);
            }
        });

        lblbuscarprod1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/search.png"))); // NOI18N
        lblbuscarprod1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbuscarprod1MouseClicked(evt);
            }
        });

        BTNEliminarventa.setText("ELIMINAR");
        BTNEliminarventa.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BTNEliminarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlTres1Layout = new javax.swing.GroupLayout(jpnlTres1);
        jpnlTres1.setLayout(jpnlTres1Layout);
        jpnlTres1Layout.setHorizontalGroup(
            jpnlTres1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTres1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlTres1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jpnlTres1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNEliminarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addGroup(jpnlTres1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtVen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparatoPass2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblbuscarprod1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnlTres1Layout.setVerticalGroup(
            jpnlTres1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTres1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlTres1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlTres1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(BTNEliminarventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlTres1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TxtVen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparatoPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblbuscarprod1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnlTresLayout = new javax.swing.GroupLayout(jpnlTres);
        jpnlTres.setLayout(jpnlTresLayout);
        jpnlTresLayout.setHorizontalGroup(
            jpnlTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTresLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpnlTres1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jpnlTresLayout.setVerticalGroup(
            jpnlTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTresLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jpnlTres1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pnlPrincipal.add(jpnlTres, "card4");

        jpnlCuatro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logotipo_1.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/chat.png"))); // NOI18N
        jLabel10.setText("CHAT");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jpnlCuatroLayout = new javax.swing.GroupLayout(jpnlCuatro);
        jpnlCuatro.setLayout(jpnlCuatroLayout);
        jpnlCuatroLayout.setHorizontalGroup(
            jpnlCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnlCuatroLayout.setVerticalGroup(
            jpnlCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlCuatroLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(225, 225, 225))
        );

        pnlPrincipal.add(jpnlCuatro, "card5");

        jpnlCinco.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logotipo_1.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/img/market.png"))); // NOI18N
        jLabel12.setText("MARKET");
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout jpnlCincoLayout = new javax.swing.GroupLayout(jpnlCinco);
        jpnlCinco.setLayout(jpnlCincoLayout);
        jpnlCincoLayout.setHorizontalGroup(
            jpnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnlCincoLayout.setVerticalGroup(
            jpnlCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlCincoLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(225, 225, 225))
        );

        pnlPrincipal.add(jpnlCinco, "card6");

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoActionPerformed


    }//GEN-LAST:event_OchoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        int posicion = this.pnlMenu.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -192, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(186, 90, 2, 2, pnlPrincipal);
        } else {
            Animacion.Animacion.mover_derecha(-192, 0, 2, 2, pnlMenu);
            Animacion.Animacion.mover_derecha(90, 186, 2, 2, pnlPrincipal);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
        new CambiaPanel(pnlPrincipal, jpnlUno);
        if (this.Uno.isSelected()) {
            this.Uno.setColorNormal(new Color(204, 204, 204));
            this.Uno.setColorHover(new Color(204, 204, 204));
            this.Uno.setColorPressed(new Color(204, 204, 204));

            this.Dos.setColorNormal(new Color(214, 217, 223));
            this.Dos.setColorHover(new Color(204, 204, 204));
            this.Dos.setColorPressed(new Color(214, 217, 223));

            this.Tres.setColorNormal(new Color(214, 217, 223));
            this.Tres.setColorHover(new Color(204, 204, 204));
            this.Tres.setColorPressed(new Color(214, 217, 223));

            this.Cuatro.setColorNormal(new Color(214, 217, 223));
            this.Cuatro.setColorHover(new Color(204, 204, 204));
            this.Cuatro.setColorPressed(new Color(214, 217, 223));

            this.Cinco.setColorNormal(new Color(214, 217, 223));
            this.Cinco.setColorHover(new Color(204, 204, 204));
            this.Cinco.setColorPressed(new Color(214, 217, 223));

            this.Seis.setColorNormal(new Color(214, 217, 223));
            this.Seis.setColorHover(new Color(204, 204, 204));
            this.Seis.setColorPressed(new Color(214, 217, 223));

            this.Siete.setColorNormal(new Color(214, 217, 223));
            this.Siete.setColorHover(new Color(204, 204, 204));
            this.Siete.setColorPressed(new Color(214, 217, 223));

            this.Ocho.setColorNormal(new Color(214, 217, 223));
            this.Ocho.setColorHover(new Color(204, 204, 204));
            this.Ocho.setColorPressed(new Color(214, 217, 223));
        } else {
            this.Uno.setColorNormal(new Color(214, 217, 223));
            this.Uno.setColorHover(new Color(204, 204, 204));
            this.Uno.setColorPressed(new Color(214, 217, 223));
        }
        
    }//GEN-LAST:event_UnoActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
        new CambiaPanel(pnlPrincipal,jpnlDos);
        if (this.Dos.isSelected()) {
            this.Uno.setColorNormal(new Color(214, 217, 223));
            this.Uno.setColorHover(new Color(204, 204, 204));
            this.Uno.setColorPressed(new Color(214, 217, 223));

            this.Dos.setColorNormal(new Color(204, 204, 204));
            this.Dos.setColorHover(new Color(204, 204, 204));
            this.Dos.setColorPressed(new Color(204, 204, 204));

            this.Tres.setColorNormal(new Color(214, 217, 223));
            this.Tres.setColorHover(new Color(204, 204, 204));
            this.Tres.setColorPressed(new Color(214, 217, 223));

            this.Cuatro.setColorNormal(new Color(214, 217, 223));
            this.Cuatro.setColorHover(new Color(204, 204, 204));
            this.Cuatro.setColorPressed(new Color(214, 217, 223));

            this.Cinco.setColorNormal(new Color(214, 217, 223));
            this.Cinco.setColorHover(new Color(204, 204, 204));
            this.Cinco.setColorPressed(new Color(214, 217, 223));

            this.Seis.setColorNormal(new Color(214, 217, 223));
            this.Seis.setColorHover(new Color(204, 204, 204));
            this.Seis.setColorPressed(new Color(214, 217, 223));

            this.Siete.setColorNormal(new Color(214, 217, 223));
            this.Siete.setColorHover(new Color(204, 204, 204));
            this.Siete.setColorPressed(new Color(214, 217, 223));

            this.Ocho.setColorNormal(new Color(214, 217, 223));
            this.Ocho.setColorHover(new Color(204, 204, 204));
            this.Ocho.setColorPressed(new Color(214, 217, 223));
        } else {
            this.Dos.setColorNormal(new Color(214, 217, 223));
            this.Dos.setColorHover(new Color(204, 204, 204));
            this.Dos.setColorPressed(new Color(214, 217, 223));
        }
    }//GEN-LAST:event_DosActionPerformed

    private void UnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnoMousePressed
        this.Uno.setSelected(true);
        this.Dos.setSelected(false);
        this.Tres.setSelected(false);
        this.Cuatro.setSelected(false);
        this.Cinco.setSelected(false);
        this.Seis.setSelected(false);
        this.Siete.setSelected(false);
        this.Ocho.setSelected(false);
    }//GEN-LAST:event_UnoMousePressed

    private void DosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DosMousePressed
        this.Uno.setSelected(false);
        this.Dos.setSelected(true);
        this.Tres.setSelected(false);
        this.Cuatro.setSelected(false);
        this.Cinco.setSelected(false);
        this.Seis.setSelected(false);
        this.Siete.setSelected(false);
        this.Ocho.setSelected(false);
    }//GEN-LAST:event_DosMousePressed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        new CambiaPanel(pnlPrincipal, jpnlTres);
        if (this.Tres.isSelected()) {
            this.Uno.setColorNormal(new Color(214, 217, 223));
            this.Uno.setColorHover(new Color(204, 204, 204));
            this.Uno.setColorPressed(new Color(214, 217, 223));

            this.Dos.setColorNormal(new Color(214, 217, 223));
            this.Dos.setColorHover(new Color(204, 204, 204));
            this.Dos.setColorPressed(new Color(214, 217, 223));

            this.Tres.setColorNormal(new Color(204, 204, 204));
            this.Tres.setColorHover(new Color(204, 204, 204));
            this.Tres.setColorPressed(new Color(204, 204, 204));

            this.Cuatro.setColorNormal(new Color(214, 217, 223));
            this.Cuatro.setColorHover(new Color(204, 204, 204));
            this.Cuatro.setColorPressed(new Color(214, 217, 223));

            this.Cinco.setColorNormal(new Color(214, 217, 223));
            this.Cinco.setColorHover(new Color(204, 204, 204));
            this.Cinco.setColorPressed(new Color(214, 217, 223));

            this.Seis.setColorNormal(new Color(214, 217, 223));
            this.Seis.setColorHover(new Color(204, 204, 204));
            this.Seis.setColorPressed(new Color(214, 217, 223));

            this.Siete.setColorNormal(new Color(214, 217, 223));
            this.Siete.setColorHover(new Color(204, 204, 204));
            this.Siete.setColorPressed(new Color(214, 217, 223));

            this.Ocho.setColorNormal(new Color(214, 217, 223));
            this.Ocho.setColorHover(new Color(204, 204, 204));
            this.Ocho.setColorPressed(new Color(214, 217, 223));
        } else {
            this.Tres.setColorNormal(new Color(214, 217, 223));
            this.Tres.setColorHover(new Color(204, 204, 204));
            this.Tres.setColorPressed(new Color(214, 217, 223));
        }
    }//GEN-LAST:event_TresActionPerformed

    private void TresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TresMousePressed
        this.Uno.setSelected(false);
        this.Dos.setSelected(false);
        this.Tres.setSelected(true);
        this.Cuatro.setSelected(false);
        this.Cinco.setSelected(false);
        this.Seis.setSelected(false);
        this.Siete.setSelected(false);
        this.Ocho.setSelected(false);
    }//GEN-LAST:event_TresMousePressed

    private void CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroActionPerformed
        new CambiaPanel(pnlPrincipal,jpnlCuatro);
        if (this.Cuatro.isSelected()) {
            this.Uno.setColorNormal(new Color(214, 217, 223));
            this.Uno.setColorHover(new Color(204, 204, 204));
            this.Uno.setColorPressed(new Color(214, 217, 223));

            this.Dos.setColorNormal(new Color(214, 217, 223));
            this.Dos.setColorHover(new Color(204, 204, 204));
            this.Dos.setColorPressed(new Color(214, 217, 223));

            this.Tres.setColorNormal(new Color(214, 217, 223));
            this.Tres.setColorHover(new Color(204, 204, 204));
            this.Tres.setColorPressed(new Color(214, 217, 223));

            this.Cuatro.setColorNormal(new Color(204, 204, 204));
            this.Cuatro.setColorHover(new Color(204, 204, 204));
            this.Cuatro.setColorPressed(new Color(204, 204, 204));

            this.Cinco.setColorNormal(new Color(214, 217, 223));
            this.Cinco.setColorHover(new Color(204, 204, 204));
            this.Cinco.setColorPressed(new Color(214, 217, 223));

            this.Seis.setColorNormal(new Color(214, 217, 223));
            this.Seis.setColorHover(new Color(204, 204, 204));
            this.Seis.setColorPressed(new Color(214, 217, 223));

            this.Siete.setColorNormal(new Color(214, 217, 223));
            this.Siete.setColorHover(new Color(204, 204, 204));
            this.Siete.setColorPressed(new Color(214, 217, 223));

            this.Ocho.setColorNormal(new Color(214, 217, 223));
            this.Ocho.setColorHover(new Color(204, 204, 204));
            this.Ocho.setColorPressed(new Color(214, 217, 223));
        } else {
            this.Cuatro.setColorNormal(new Color(214, 217, 223));
            this.Cuatro.setColorHover(new Color(204, 204, 204));
            this.Cuatro.setColorPressed(new Color(214, 217, 223));
        }
    }//GEN-LAST:event_CuatroActionPerformed

    private void CuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuatroMousePressed
        this.Uno.setSelected(false);
        this.Dos.setSelected(false);
        this.Tres.setSelected(false);
        this.Cuatro.setSelected(true);
        this.Cinco.setSelected(false);
        this.Seis.setSelected(false);
        this.Siete.setSelected(false);
        this.Ocho.setSelected(false);

    }//GEN-LAST:event_CuatroMousePressed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        new CambiaPanel(pnlPrincipal,jpnlCinco);
        if (this.Cinco.isSelected()) {
            this.Uno.setColorNormal(new Color(214, 217, 223));
            this.Uno.setColorHover(new Color(204, 204, 204));
            this.Uno.setColorPressed(new Color(214, 217, 223));

            this.Dos.setColorNormal(new Color(214, 217, 223));
            this.Dos.setColorHover(new Color(204, 204, 204));
            this.Dos.setColorPressed(new Color(214, 217, 223));

            this.Tres.setColorNormal(new Color(214, 217, 223));
            this.Tres.setColorHover(new Color(204, 204, 204));
            this.Tres.setColorPressed(new Color(214, 217, 223));

            this.Cuatro.setColorNormal(new Color(214, 217, 223));
            this.Cuatro.setColorHover(new Color(204, 204, 204));
            this.Cuatro.setColorPressed(new Color(214, 217, 223));

            this.Cinco.setColorNormal(new Color(204, 204, 204));
            this.Cinco.setColorHover(new Color(204, 204, 204));
            this.Cinco.setColorPressed(new Color(204, 204, 204));

            this.Seis.setColorNormal(new Color(214, 217, 223));
            this.Seis.setColorHover(new Color(204, 204, 204));
            this.Seis.setColorPressed(new Color(214, 217, 223));

            this.Siete.setColorNormal(new Color(214, 217, 223));
            this.Siete.setColorHover(new Color(204, 204, 204));
            this.Siete.setColorPressed(new Color(214, 217, 223));

            this.Ocho.setColorNormal(new Color(214, 217, 223));
            this.Ocho.setColorHover(new Color(204, 204, 204));
            this.Ocho.setColorPressed(new Color(214, 217, 223));
        } else {
            this.Cinco.setColorNormal(new Color(214, 217, 223));
            this.Cinco.setColorHover(new Color(204, 204, 204));
            this.Cinco.setColorPressed(new Color(214, 217, 223));
        }
    }//GEN-LAST:event_CincoActionPerformed

    private void CincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CincoMousePressed
        this.Uno.setSelected(false);
        this.Dos.setSelected(false);
        this.Tres.setSelected(false);
        this.Cuatro.setSelected(false);
        this.Cinco.setSelected(true);
        this.Seis.setSelected(false);
        this.Siete.setSelected(false);
        this.Ocho.setSelected(false);
    }//GEN-LAST:event_CincoMousePressed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        comprin.AbrirLogin();
        comprin.CerrarContendorPrincipal();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BTNRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrar1ActionPerformed
        comprin.AbrirRegistro();
    }//GEN-LAST:event_BTNRegistrar1ActionPerformed

    private void JtablaUsuariosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_JtablaUsuariosComponentAdded
        
    }//GEN-LAST:event_JtablaUsuariosComponentAdded

    private void BTNActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActualizarActionPerformed
        String IdUsuario = JtablaUsuarios.getValueAt(JtablaUsuarios.getSelectedRow(), 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE from Usuario WHERE IdUsuario ='"+IdUsuario+"'");
            pst.executeUpdate();
            
        } catch (Exception e) {
        }
        Modelo.removeRow(JtablaUsuarios.getSelectedRow());
    }//GEN-LAST:event_BTNActualizarActionPerformed

    private void txtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField1ActionPerformed

    }//GEN-LAST:event_txtField1ActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        mostrardatos(txtField1.getText());
    }//GEN-LAST:event_label1MouseClicked

    private void BTNRegistrarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrarprodActionPerformed
        comprin.AbrirRegistroprod();
    }//GEN-LAST:event_BTNRegistrarprodActionPerformed

    private void BTNBorrarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBorrarprodActionPerformed
        String Cod_prod = JtablaInv.getValueAt(JtablaInv.getSelectedRow(), 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE from producto WHERE Cod_prod='"+Cod_prod+"'"); 
            pst.executeUpdate();
            
        } catch (Exception e) {
        }
        ModeloInv.removeRow(JtablaInv.getSelectedRow());
    }//GEN-LAST:event_BTNBorrarprodActionPerformed

    private void txtFieldprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldprodActionPerformed

    private void lblbuscarprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbuscarprodMouseClicked
        mostrardatosInv(txtFieldprod.getText());
    }//GEN-LAST:event_lblbuscarprodMouseClicked

    private void lblbuscarprod1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbuscarprod1MouseClicked
        mostrardatosVen(TxtVen.getText());
    }//GEN-LAST:event_lblbuscarprod1MouseClicked

    private void BTNEliminarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarventaActionPerformed
        String Cod_ven = JtablaVentas.getValueAt(JtablaVentas.getSelectedRow(), 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE from ventas WHERE Cod_ven='"+Cod_ven+"'"); 
            pst.executeUpdate();
            
        } catch (Exception e) {
        }
        Modeloven.removeRow(JtablaVentas.getSelectedRow());
    }//GEN-LAST:event_BTNEliminarventaActionPerformed

    private void TxtVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtVenActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ContenedorPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Boton BTNActualizar;
    private Componentes.Boton BTNBorrarprod;
    private Componentes.Boton BTNEliminarventa;
    private Componentes.Boton BTNRegistrar1;
    private Componentes.Boton BTNRegistrarprod;
    private Componentes.BotonPanel BtnSalir;
    private Componentes.BotonPanel Cinco;
    private Componentes.BotonPanel Cuatro;
    private Componentes.BotonPanel Dos;
    private rojerusan.RSTableMetro JtablaInv;
    private rojerusan.RSTableMetro JtablaUsuarios;
    private rojerusan.RSTableMetro JtablaVentas;
    private Componentes.BotonPanel Ocho;
    private Componentes.BotonPanel Seis;
    private Componentes.BotonPanel Siete;
    private Componentes.BotonPanel Tres;
    private Componentes.TxtField TxtVen;
    private Componentes.BotonPanel Uno;
    private Componentes.Boton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparatoPass;
    private javax.swing.JSeparator jSeparatoPass1;
    private javax.swing.JSeparator jSeparatoPass2;
    private javax.swing.JPanel jpnlCinco;
    private javax.swing.JPanel jpnlCuatro;
    private javax.swing.JPanel jpnlDos;
    private javax.swing.JPanel jpnlTres;
    private javax.swing.JPanel jpnlTres1;
    private javax.swing.JPanel jpnlUno;
    private Componentes.Label label1;
    private Componentes.Label lblbuscarprod;
    private Componentes.Label lblbuscarprod1;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlCabecera;
    private javax.swing.JPanel pnlMenu;
    public javax.swing.JPanel pnlPrincipal;
    private Componentes.TxtField txtField1;
    private Componentes.TxtField txtFieldprod;
    // End of variables declaration//GEN-END:variables
    ConexionDB cc = new ConexionDB();
    Connection cn = cc.conectar();
}
