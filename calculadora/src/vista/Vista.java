/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import modelo.Modelo;


public class Vista extends javax.swing.JFrame {

    double n1 = 0;
    Modelo modelo = new Modelo();
    boolean nuevoNumero = false;
    boolean fueOperando = false;
    boolean puntoDecimal = false;
    Font pequenya = new Font("Agency FB", Font.BOLD, 20); ;
    Font mediana = new Font("Agency FB", Font.BOLD, 40); ;
    Font grande = new Font("Agency FB", Font.BOLD, 70); 
    ComponentAdapter resizeListener = new ComponentAdapter() {
        public void componentResized(ComponentEvent e) {
          //-------------pequeña--------------------------- 
            if(getWidth()<300 && getHeight()<500){
            pantalla.setFont(pequenya);   
            btnBorrar.setFont(pequenya);
            btnCero.setFont(pequenya);
            btnCinco.setFont(pequenya);
            btnCuatro.setFont(pequenya);
            btnDividir.setFont(pequenya);
            btnDos.setFont(pequenya);
            btnMultiplicar.setFont(pequenya);
            btnNueve.setFont(pequenya);
            btnOcho.setFont(pequenya);
            btnPunto.setFont(pequenya);
            btnRestar.setFont(pequenya);
            btnSeis.setFont(pequenya);
            btnSiete.setFont(pequenya);
            btnSumar.setFont(pequenya);
            btnTres.setFont(pequenya);
            btnUno.setFont(pequenya);
          
            }
          
         //--------------mediana------------------------
            if(getWidth()>400 && getHeight()>600){
            pantalla.setFont(mediana);  
            btnBorrar.setFont(mediana);
            btnCero.setFont(mediana);
            btnCinco.setFont(mediana);
            btnCuatro.setFont(mediana);
            btnDividir.setFont(mediana);
            btnDos.setFont(mediana);
            btnMultiplicar.setFont(mediana);
            btnNueve.setFont(mediana);
            btnOcho.setFont(mediana);
            btnPunto.setFont(mediana);
            btnRestar.setFont(mediana);
            btnSeis.setFont(mediana);
            btnSiete.setFont(mediana);
            btnSumar.setFont(mediana);
            btnTres.setFont(mediana);
            btnUno.setFont(mediana);
           
            } 
         //---------------grande--------------------------
             if(getWidth()>500 && getHeight()>1000){
            pantalla.setFont(grande); 
            btnBorrar.setFont(grande);
            btnCero.setFont(grande);
            btnCinco.setFont(grande);
            btnCuatro.setFont(grande);
            btnDividir.setFont(grande);
            btnDos.setFont(grande);
            btnMultiplicar.setFont(grande);
            btnNueve.setFont(grande);
            btnOcho.setFont(grande);
            btnPunto.setFont(grande);
            btnRestar.setFont(grande);
            btnSeis.setFont(grande);
            btnSiete.setFont(grande);
            btnSumar.setFont(grande);
            btnTres.setFont(grande);
            btnUno.setFont(grande);
            
           
            
           }
          System.out.println("ancho : " + getWidth() + " alto: " + getHeight());
            
        }
      };
 
    public Vista() {
        initComponents();
        
         
        addComponentListener(resizeListener);
       
        
        
      
        //CERO
        this.btnCero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_0, 0), "1");
        this.btnCero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0), "1");
        this.btnCero.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnCero.doClick();

            }
        });

        //UNO
        this.btnUno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0), "1");
        this.btnUno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0), "1");
        this.btnUno.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnUno.doClick();

            }
        });

        //DOS
        this.btnDos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0), "2");
        this.btnDos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0), "2");
        this.btnDos.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnDos.doClick();

            }
        });

        //TRES
        this.btnTres.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0), "3");
        this.btnTres.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0), "3");
        this.btnTres.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnTres.doClick();

            }
        });

        //CUATRO
        this.btnCuatro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0), "4");
        this.btnCuatro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0), "4");
        this.btnCuatro.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnCuatro.doClick();

            }
        });

        //CINCO
        this.btnCinco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0), "5");
        this.btnCinco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0), "5");
        this.btnCinco.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnCinco.doClick();

            }
        });

        // SEIS
        this.btnSeis.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0), "6");
        this.btnSeis.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0), "6");
        this.btnSeis.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnSeis.doClick();

            }
        });

        //SIETE
        this.btnSiete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0), "7");
        this.btnSiete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0), "7");
        this.btnSiete.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnSiete.doClick();

            }
        });

        //OCHO
        this.btnOcho.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_8, 0), "8");
        this.btnOcho.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0), "8");
        this.btnOcho.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnOcho.doClick();

            }
        });

        //NUEVE
        this.btnNueve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_9, 0), "9");
        this.btnNueve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0), "9");
        this.btnNueve.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnNueve.doClick();

            }
        });
        //PUNTO 
        this.btnPunto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0), "+");
        this.btnPunto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), "+");
        this.btnPunto.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnPunto.doClick();

            }
        });

        //SUMAR
        this.btnSumar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0), "+");
        this.btnSumar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "+");
        this.btnSumar.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnSumar.doClick();

            }
        });
        //RESTAR
        this.btnRestar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "-");
        this.btnRestar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "-");
        this.btnRestar.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnRestar.doClick();

            }
        });
        //MULTIPLICAR
        
        this.btnMultiplicar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,InputEvent.SHIFT_DOWN_MASK), "*");
        this.btnMultiplicar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "*");
        this.btnMultiplicar.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnMultiplicar.doClick();

            }
        });
        //DIVISIÓN
        // TODO: cambiar tecla
        this.btnDividir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_7 ,  InputEvent.SHIFT_DOWN_MASK), "/");
        this.btnDividir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "/");
        this.btnDividir.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnDividir.doClick();

            }
        });

        //BORRAR
        this.btnBorrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "c");
        this.btnBorrar.getActionMap().put("c", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnBorrar.doClick();

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        btnDividir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(82, 100, 115));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(3000, 3000));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        java.awt.GridBagLayout jPanel1Layout1 = new java.awt.GridBagLayout();
        jPanel1Layout1.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout1.rowHeights = new int[] {0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0};
        jPanel1.setLayout(jPanel1Layout1);

        btnCinco.setBackground(new java.awt.Color(61, 61, 61));
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.setFocusable(false);
        btnCinco.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnCinco.setOpaque(true);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnCinco, gridBagConstraints);

        btnSeis.setBackground(new java.awt.Color(61, 61, 61));
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.setFocusable(false);
        btnSeis.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnSeis.setOpaque(true);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnSeis, gridBagConstraints);

        btnUno.setBackground(new java.awt.Color(61, 61, 61));
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.setFocusable(false);
        btnUno.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnUno.setOpaque(true);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnUno, gridBagConstraints);

        btnDos.setBackground(new java.awt.Color(61, 61, 61));
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.setFocusable(false);
        btnDos.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnDos.setOpaque(true);
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnDos, gridBagConstraints);

        btnTres.setBackground(new java.awt.Color(61, 61, 61));
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.setFocusable(false);
        btnTres.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnTres.setOpaque(true);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnTres, gridBagConstraints);

        btnPunto.setBackground(new java.awt.Color(61, 61, 61));
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(",");
        btnPunto.setFocusable(false);
        btnPunto.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnPunto.setOpaque(true);
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnPunto, gridBagConstraints);

        btnCero.setBackground(new java.awt.Color(61, 61, 61));
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.setFocusable(false);
        btnCero.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnCero.setOpaque(true);
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnCero, gridBagConstraints);

        pantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setActionCommand("null");
        pantalla.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        pantalla.setDragEnabled(true);
        pantalla.setEnabled(false);
        pantalla.setMaximumSize(new java.awt.Dimension(3000, 3000));
        pantalla.setOpaque(true);
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 0, 24, 0);
        jPanel1.add(pantalla, gridBagConstraints);

        btnDividir.setBackground(new java.awt.Color(61, 61, 61));
        btnDividir.setForeground(new java.awt.Color(255, 255, 255));
        btnDividir.setText("/");
        btnDividir.setFocusable(false);
        btnDividir.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnDividir.setOpaque(true);
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnDividir, gridBagConstraints);

        btnBorrar.setBackground(new java.awt.Color(61, 61, 61));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("C");
        btnBorrar.setFocusable(false);
        btnBorrar.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnBorrar.setOpaque(true);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnBorrar, gridBagConstraints);

        btnMultiplicar.setBackground(new java.awt.Color(61, 61, 61));
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("*");
        btnMultiplicar.setFocusable(false);
        btnMultiplicar.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnMultiplicar.setOpaque(true);
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnMultiplicar, gridBagConstraints);

        btnRestar.setBackground(new java.awt.Color(61, 61, 61));
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("-");
        btnRestar.setFocusable(false);
        btnRestar.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnRestar.setOpaque(true);
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnRestar, gridBagConstraints);

        btnSiete.setBackground(new java.awt.Color(61, 61, 61));
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.setFocusable(false);
        btnSiete.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnSiete.setOpaque(true);
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnSiete, gridBagConstraints);

        btnOcho.setBackground(new java.awt.Color(61, 61, 61));
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.setFocusable(false);
        btnOcho.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnOcho.setOpaque(true);
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnOcho, gridBagConstraints);

        btnNueve.setBackground(new java.awt.Color(61, 61, 61));
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.setFocusable(false);
        btnNueve.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnNueve.setOpaque(true);
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnNueve, gridBagConstraints);

        btnSumar.setBackground(new java.awt.Color(61, 61, 61));
        btnSumar.setForeground(new java.awt.Color(255, 255, 255));
        btnSumar.setText("+");
        btnSumar.setFocusable(false);
        btnSumar.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnSumar.setOpaque(true);
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnSumar, gridBagConstraints);

        btnCuatro.setBackground(new java.awt.Color(61, 61, 61));
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.setFocusable(false);
        btnCuatro.setMaximumSize(new java.awt.Dimension(3000, 3000));
        btnCuatro.setOpaque(true);
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 3000.0;
        gridBagConstraints.weighty = 3000.0;
        jPanel1.add(btnCuatro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
       
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "4");
        pantalla.setText(this.pantalla.getText());
       
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        modelo.borrar(modelo.getResultado());
        this.pantalla.setText("");

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "1");
        pantalla.setText(this.pantalla.getText());
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "2");
        pantalla.setText(this.pantalla.getText());

    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "3");
        pantalla.setText(this.pantalla.getText());
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "5");
        pantalla.setText(this.pantalla.getText());
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "6");
        pantalla.setText(this.pantalla.getText());
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "7");
        pantalla.setText(this.pantalla.getText());
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "8");
        pantalla.setText(this.pantalla.getText());
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "9");
        pantalla.setText(this.pantalla.getText());

    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed

        if (nuevoNumero && fueOperando == false) {
            n1 = (Double.parseDouble(this.pantalla.getText()));
            modelo.calcula(modelo.getOperacion(), n1);
            this.pantalla.setText("");
        } else if (!this.pantalla.getText().isEmpty()) {
            nuevoNumero = true;
            modelo.setResultado(Double.parseDouble(this.pantalla.getText()));
            this.pantalla.setText("");
        }
        this.pantalla.setText("" + modelo.getResultado());
        fueOperando = true;
        modelo.setOperacion("+");
        System.out.println(modelo.getOperacion());

    }//GEN-LAST:event_btnSumarActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed

    }//GEN-LAST:event_pantallaActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
        }
        this.pantalla.setText(this.pantalla.getText() + "0");
        pantalla.setText(this.pantalla.getText());
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        if (nuevoNumero && fueOperando == false) {
            n1 = (Double.parseDouble(this.pantalla.getText()));
            modelo.calcula(modelo.getOperacion(), n1);

            this.pantalla.setText("");
        } else if (!this.pantalla.getText().isEmpty()) {
            nuevoNumero = true;
            modelo.setResultado(Double.parseDouble(this.pantalla.getText()));
            this.pantalla.setText("");
        }
        this.pantalla.setText("" + modelo.getResultado());
        fueOperando = true;
        modelo.setOperacion("-");
        System.out.println(modelo.getOperacion());

    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if (nuevoNumero && fueOperando == false) {
            n1 = (Double.parseDouble(this.pantalla.getText()));
            System.out.println(n1);
            modelo.calcula(modelo.getOperacion(), n1);

            this.pantalla.setText("");
        } else if (!this.pantalla.getText().isEmpty()) {
            nuevoNumero = true;
            modelo.setResultado(Double.parseDouble(this.pantalla.getText()));
            this.pantalla.setText("");
        }
        this.pantalla.setText("" + modelo.getResultado());
        fueOperando = true;
        modelo.setOperacion("*");
        System.out.println(modelo.getOperacion());
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed

        if (nuevoNumero && fueOperando == false) {
            n1 = (Double.parseDouble(this.pantalla.getText()));
            System.out.println(n1);
            modelo.calcula(modelo.getOperacion(), n1);

            this.pantalla.setText("");
        } else if (!this.pantalla.getText().isEmpty()) {
            nuevoNumero = true;
            modelo.setResultado(Double.parseDouble(this.pantalla.getText()));
            this.pantalla.setText("");
        }
        this.pantalla.setText("" + modelo.getResultado());
        fueOperando = true;
        modelo.setOperacion("/");
        System.out.println(modelo.getOperacion());
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
     
        if(!puntoDecimal){
        if (fueOperando) {
            fueOperando = false;
            this.pantalla.setText("");
       }else
        puntoDecimal = true;
        this.pantalla.setText(this.pantalla.getText() + ".");
        pantalla.setText(this.pantalla.getText());
       
       }
    }//GEN-LAST:event_btnPuntoActionPerformed

    public static void main(String args[]) {
        
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
