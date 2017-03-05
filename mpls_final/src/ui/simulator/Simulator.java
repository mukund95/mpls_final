/* 
 * Copyright 2015 (C) Manuel Domínguez Dorado - ingeniero@ManoloDominguez.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ui.simulator;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import simMPLS.io.osm.TOSMLoader;
import simMPLS.scenario.TScenario;
import simMPLS.ui.dialogs.Licence;
import simMPLS.ui.dialogs.About;
import simMPLS.ui.dialogs.JVentanaAdvertencia;
import simMPLS.ui.dialogs.WindowHelp;
import simMPLS.ui.dialogs.WindowBoolean;
import simMPLS.ui.dialogs.JVentanaComentario;
import simMPLS.ui.dialogs.WindowError;
import simMPLS.ui.utils.TImagesBroker;
import simMPLS.utils.JOSMFilter;
import simMPLS.utils.TIDGenerator;

/**
 * Esta clase implementa un simulador completo para simular, valga la redundancia,
 * escenarios MPLS y escenarios MPLS con Garant�a de Servicio.
 * @author <B>Manuel Dom�nguez Dorado</B><br><A
 * href="mailto:ingeniero@ManoloDominguez.com">ingeniero@ManoloDominguez.com</A><br><A href="http://www.ManoloDominguez.com" target="_blank">http://www.ManoloDominguez.com</A>
 * @version 1.0
 * @since 2.0
 */
public class Simulator extends javax.swing.JFrame {
    
    /**
     * Este m�todo crea una nueva instancia de la clase, esto es un nuevo simulador.
     * @since 2.0
     * @param pd El dispensador de im�genes que se encargar� de precargar las im�genes necesarias
     * en el simulador, ahorrando tiempo y mejorando el rendimiento de la aplicaci�n.
     */
    public Simulator(TImagesBroker pd) {
        pictureDispenser = pd;
        initComponents();
        initComponents2();
    }
    
    /**
     * Este m�todo inicia los componentes que no han sido suficientemente definidos por
     * el constructor.
     * @since 2.0
     */    
    public void initComponents2() {
        GeneratorId = new TIDGenerator();
        numWindowsOpen = 0;
    }
    
    /** Este m�todo se llama desde el constructor de la clase y lo que hace es dar unos
     * valores iniciales a los atributos.
     * @since 2.0
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Desk = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        submenuScene = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        closeMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        exitMenuItem = new javax.swing.JMenuItem();
        submenuView = new javax.swing.JMenu();
        mosaicHorizontalMenuItem = new javax.swing.JMenuItem();
        mosaicVerticalMenuItem = new javax.swing.JMenuItem();
        cascadeMenuItem = new javax.swing.JMenuItem();
        iconsMenuItem = new javax.swing.JMenuItem();
        submenuHelp = new javax.swing.JMenu();
        tutorialMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        licenseMenuItem = new javax.swing.JMenuItem();
        comentarioMenuItem1 = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes"); // NOI18N
        setTitle(bundle.getString("Open_SimMPLS")); // NOI18N
        setIconImage(pictureDispenser.obtenerImagen(simMPLS.ui.utils.TImagesBroker.SPLASH_MENU));
        setName(bundle.getString("simulator")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        getContentPane().add(Desk, java.awt.BorderLayout.CENTER);

        menu.setDoubleBuffered(true);

        submenuScene.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("LetraEscenario").charAt(0));
        submenuScene.setText(bundle.getString("Scene")); // NOI18N
        submenuScene.setToolTipText(bundle.getString("Scene")); // NOI18N
        submenuScene.setActionCommand(bundle.getString("File")); // NOI18N
        submenuScene.setDoubleBuffered(true);
        submenuScene.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        newMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.NUEVO_MENU));
        newMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Nuevo").charAt(0));
        newMenuItem.setText(bundle.getString("New")); // NOI18N
        newMenuItem.setDoubleBuffered(true);
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnNew(evt);
            }
        });
        submenuScene.add(newMenuItem);

        openMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        openMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.ABRIR_MENU));
        openMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Abrir").charAt(0));
        openMenuItem.setText(bundle.getString("Open")); // NOI18N
        openMenuItem.setDoubleBuffered(true);
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockOnOpen(evt);
            }
        });
        submenuScene.add(openMenuItem);

        closeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        closeMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        closeMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.CERRAR_MENU));
        closeMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Cerrar").charAt(0));
        closeMenuItem.setText(bundle.getString("Close")); // NOI18N
        closeMenuItem.setDoubleBuffered(true);
        closeMenuItem.setEnabled(false);
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnClose(evt);
            }
        });
        submenuScene.add(closeMenuItem);

        saveMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        saveMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.GUARDAR_MENU));
        saveMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Guardar").charAt(0));
        saveMenuItem.setText(bundle.getString("Save")); // NOI18N
        saveMenuItem.setDoubleBuffered(true);
        saveMenuItem.setEnabled(false);
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnSave(evt);
            }
        });
        submenuScene.add(saveMenuItem);

        saveAsMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        saveAsMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.GUARDAR_COMO_MENU));
        saveAsMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Guardar_como").charAt(0));
        saveAsMenuItem.setText(bundle.getString("Save_as...")); // NOI18N
        saveAsMenuItem.setDoubleBuffered(true);
        saveAsMenuItem.setEnabled(false);
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnSaveAs(evt);
            }
        });
        submenuScene.add(saveAsMenuItem);
        submenuScene.add(jSeparator1);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        exitMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.SALIR_MENU));
        exitMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Salir").charAt(0));
        exitMenuItem.setText(bundle.getString("Exit")); // NOI18N
        exitMenuItem.setDoubleBuffered(true);
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnExit(evt);
            }
        });
        submenuScene.add(exitMenuItem);

        menu.add(submenuScene);

        submenuView.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("MenuPrincipal.Vista.Resaltado").charAt(0));
        submenuView.setText(bundle.getString("MenuPrincipal.Vista")); // NOI18N
        submenuView.setDoubleBuffered(true);
        submenuView.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        mosaicHorizontalMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        mosaicHorizontalMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.VISTA_HORIZONTAL));
        mosaicHorizontalMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("SubmenuVista.MosaicoHorixontal.Resaltado").charAt(0));
        mosaicHorizontalMenuItem.setText(bundle.getString("SubmenuVista.MosaicoHorizontal")); // NOI18N
        mosaicHorizontalMenuItem.setDoubleBuffered(true);
        mosaicHorizontalMenuItem.setEnabled(false);
        mosaicHorizontalMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnVistaMosaicHorizontal(evt);
            }
        });
        submenuView.add(mosaicHorizontalMenuItem);

        mosaicVerticalMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        mosaicVerticalMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.VISTA_VERTICAL));
        mosaicVerticalMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("SubmenuVista.MosaicoVertical.Resaltado").charAt(0));
        mosaicVerticalMenuItem.setText(bundle.getString("SubmenuVista.MosaicoVertical")); // NOI18N
        mosaicVerticalMenuItem.setDoubleBuffered(true);
        mosaicVerticalMenuItem.setEnabled(false);
        mosaicVerticalMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnVistaMosaicVertical(evt);
            }
        });
        submenuView.add(mosaicVerticalMenuItem);

        cascadeMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cascadeMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.VISTA_CASCADA));
        cascadeMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("SubmenuVista.Cascadal.Resaltado").charAt(0));
        cascadeMenuItem.setText(bundle.getString("SubmenuVista.Cascada")); // NOI18N
        cascadeMenuItem.setDoubleBuffered(true);
        cascadeMenuItem.setEnabled(false);
        cascadeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnVistaCascade(evt);
            }
        });
        submenuView.add(cascadeMenuItem);

        iconsMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        iconsMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.VISTA_ICONOS));
        iconsMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("SubmenuVista.Iconos.Resaltado").charAt(0));
        iconsMenuItem.setText(bundle.getString("SubmenuVista.Iconos")); // NOI18N
        iconsMenuItem.setDoubleBuffered(true);
        iconsMenuItem.setEnabled(false);
        iconsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnVistaIcons(evt);
            }
        });
        submenuView.add(iconsMenuItem);

        menu.add(submenuView);

        submenuHelp.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("LetraAyuda").charAt(0));
        submenuHelp.setText(bundle.getString("Help")); // NOI18N
        submenuHelp.setDoubleBuffered(true);
        submenuHelp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        tutorialMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        tutorialMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tutorialMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.TUTORIAL_MENU));
        tutorialMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Contenidos").charAt(0));
        tutorialMenuItem.setText(bundle.getString("Contents")); // NOI18N
        tutorialMenuItem.setDoubleBuffered(true);
        tutorialMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnTutorial(evt);
            }
        });
        submenuHelp.add(tutorialMenuItem);
        submenuHelp.add(jSeparator2);

        licenseMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        licenseMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.LICENCIA_MENU));
        licenseMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Licencia").charAt(0));
        licenseMenuItem.setText(bundle.getString("License")); // NOI18N
        licenseMenuItem.setToolTipText(bundle.getString("License")); // NOI18N
        licenseMenuItem.setDoubleBuffered(true);
        licenseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnLicence(evt);
            }
        });
        submenuHelp.add(licenseMenuItem);

        comentarioMenuItem1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comentarioMenuItem1.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.COMENTARIO_MENU));
        comentarioMenuItem1.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Comentario").charAt(0));
        comentarioMenuItem1.setText(bundle.getString("Contact_the_authors")); // NOI18N
        comentarioMenuItem1.setToolTipText(bundle.getString("License")); // NOI18N
        comentarioMenuItem1.setDoubleBuffered(true);
        comentarioMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicEnEnviarComentario(evt);
            }
        });
        submenuHelp.add(comentarioMenuItem1);

        aboutMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        aboutMenuItem.setIcon(pictureDispenser.obtenerIcono(simMPLS.ui.utils.TImagesBroker.SPLASH_MENU));
        aboutMenuItem.setMnemonic(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Menu.Letra_resaltada.Sobre").charAt(0));
        aboutMenuItem.setText(bundle.getString("About")); // NOI18N
        aboutMenuItem.setDoubleBuffered(true);
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickOnAbout(evt);
            }
        });
        submenuHelp.add(aboutMenuItem);

        menu.add(submenuHelp);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>                        

    private void clickOnTutorial(java.awt.event.ActionEvent evt) {                                 
        WindowHelp wh = new WindowHelp(this, true, this.pictureDispenser);
        wh.show();
    }                                

    private void clockOnOpen(java.awt.event.ActionEvent evt) {                             
        boolean finOpen = false;
        JFileChooser dialogOpen = new JFileChooser();
        dialogOpen.setFileFilter(new JOSMFilter());
        dialogOpen.setDialogType(JFileChooser.CUSTOM_DIALOG);
        dialogOpen.setApproveButtonMnemonic('A');
        dialogOpen.setApproveButtonText(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("JSimulador.DialogoAbrir.OK"));
        dialogOpen.setDialogTitle(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("JSimulador.DialogoAbrir.CargarUnEscenario"));
        dialogOpen.setAcceptAllFileFilterUsed(false);
        dialogOpen.setFileSelectionMode(JFileChooser.FILES_ONLY);
        while (!finOpen) {
            int resultado = dialogOpen.showOpenDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                if (dialogOpen.getSelectedFile().exists()) {
                    TOSMLoader cargador = new TOSMLoader();
                    boolean cargado = cargador.cargar(dialogOpen.getSelectedFile());
                    if (cargado) {
                        try {
                            TScenario esc = new TScenario();
                            esc = cargador.getScenario();
                            String tit = esc.obtenerFichero().getName();
                            numWindowsOpen++;
                            activateOptions();
                            JVentanaHija newScene = new JVentanaHija(this, pictureDispenser, tit);
                            newScene.ponerEscenario(esc);
                            Desk.add(newScene, javax.swing.JLayeredPane.FRAME_CONTENT_LAYER);
                            try {
                                newScene.setSelected(true);
                            } catch (Exception e) {
                                e.printStackTrace(); 
                            }
                            getContentPane().add(Desk, java.awt.BorderLayout.CENTER);
                        }
                        catch (Exception e) {
                            WindowError we;
                            we = new WindowError(this, true, pictureDispenser);
                            we.mostrarMensaje(e.toString());
                            we.show();
                        }
                    } else {
                        JVentanaAdvertencia va;
                        va = new JVentanaAdvertencia(this, true, pictureDispenser);
                        va.mostrarMensaje(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("JSimulador.DialogoAbrir.FicheroCorrupto"));
                        va.show();
                    }
                    dialogOpen = null;
                    finOpen = true;
                } else {
                    JVentanaAdvertencia va;
                    va = new JVentanaAdvertencia(this, true, pictureDispenser);
                    va.mostrarMensaje(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("JSimulador.DialogoAbrir.FicheroDebeExistir"));
                    va.show();
                }
            } else {
                finOpen = true;
            }
        }
    }                            

    private void clickOnSaveAs(java.awt.event.ActionEvent evt) {                               
        JVentanaHija vActiva= (JVentanaHija) Desk.getSelectedFrame();
        if (vActiva != null) {
            vActiva.gestionarGuardarComo();
        }
    }                              

    private void clickOnSave(java.awt.event.ActionEvent evt) {                             
        JVentanaHija vActiva= (JVentanaHija) Desk.getSelectedFrame();
        if (vActiva != null) {
            vActiva.gestionarGuardar();
        }
    }                            

    /**
     * @param evt
     * @since 2.0
     */    
private void clicEnEnviarComentario(java.awt.event.ActionEvent evt) {                                        
    JVentanaComentario vc = new JVentanaComentario(pictureDispenser, this, true);
    vc.show();
}                                       

/**
 * @param evt
 * @since 2.0
 */
/**
 * @param evt
 * @since 2.0
 */
private void clickOnVistaMosaicHorizontal(java.awt.event.ActionEvent evt) {                                              
    javax.swing.JInternalFrame[] windows = Desk.getAllFrames();
    Dimension tam = Desk.getSize();
    int incremento = tam.width/windows.length;
    Point p = new Point(0, 0);
    tam.width = incremento;
    try {
        for (int i=windows.length-1; i >= 0; i--) {
            windows[i].setVisible(false);
            windows[i].setIcon(false);
            windows[i].setSize(tam);
            windows[i].setLocation(p);
            p.x += incremento;
        }
        for (int j=windows.length-1; j >= 0; j--)
            windows[j].setVisible(true);
    } catch (Exception e) {
        WindowError ve;
        ve = new WindowError(this, true, pictureDispenser);
        ve.mostrarMensaje(e.toString());
        ve.show();
    }
}                                             

/**
 * @param evt
 * @since 2.0
 */
private void clickOnVistaMosaicVertical(java.awt.event.ActionEvent evt) {                                            
    javax.swing.JInternalFrame[] windows = Desk.getAllFrames();
    Dimension tam = Desk.getSize();
    int increment = tam.height/windows.length;
    Point p = new Point(0, 0);
    tam.height = increment;
    try {
        for (int i=windows.length-1; i >= 0; i--) {
            windows[i].setVisible(false);
            windows[i].setIcon(false);
            windows[i].setSize(tam);
            windows[i].setLocation(p);
            p.y += increment;
        }
        for (int j=windows.length-1; j >= 0; j--)
            windows[j].setVisible(true);
    } catch (Exception e) {
        WindowError ve;
        ve = new WindowError(this, true, pictureDispenser);
        ve.mostrarMensaje(e.toString());
        ve.show();
    }
}                                           

/**
 * @param evt
 * @since 2.0
 */
private void clickOnVistaCascade(java.awt.event.ActionEvent evt) {                                     
    int increment=20;
    Dimension d = Desk.getSize();
    d.height = d.height-increment;
    d.width = d.width-increment;
    Point p = new Point(increment, increment);
    Dimension tam = Desk.getSize();
    tam.height = tam.height/2;
    tam.width = tam.width/2;
    javax.swing.JInternalFrame[] windows = Desk.getAllFrames();
    try {
        for (int i=windows.length-1; i >= 0; i--) {
            windows[i].setVisible(false);
            windows[i].setIcon(false);
            windows[i].setSize(tam);
            windows[i].setLocation(p);
            p.x += increment;
            p.y += increment;
            if ((p.x+tam.width) >= d.width)
                p.x = increment;
            if ((p.y+tam.height) >= d.height)
                p.y = increment;
        }
        for (int j=windows.length-1; j >= 0; j--)
            windows[j].setVisible(true);
    } catch (Exception e) {
        WindowError ve;
        ve = new WindowError(this, true, pictureDispenser);
        ve.mostrarMensaje(e.toString());
        ve.show();
    }
}                                    

/**
 * @param evt
 * @since 2.0
 */
private void clickOnVistaIcons(java.awt.event.ActionEvent evt) {                                   
    javax.swing.JInternalFrame[] windows = Desk.getAllFrames();
    try {
        for (int i=0; i < windows.length; i++) {
            windows[i].setIcon(true);
        }
        windows[0].setSelected(true);
    } catch (Exception e) {
        WindowError ve;
        ve = new WindowError(this, true, pictureDispenser);
        ve.mostrarMensaje(e.toString());
        ve.show();
    }
}                                  
    
/**
 * @param evt
 * @since 2.0
 */
    private void clickOnClose(java.awt.event.ActionEvent evt) {                              
        JVentanaHija vActiva= (JVentanaHija) Desk.getSelectedFrame();
        if (vActiva != null) {
            vActiva.gestionarGuardarParaCerrar();
            vActiva.cerrar();
            numWindowsOpen--;
        }
        if (numWindowsOpen==0){
            deactivateOptions();
        } else {
            if (numWindowsOpen == 1)
                deactivateOptionsVista();
            javax.swing.JInternalFrame[] windows = Desk.getAllFrames();
            try {
                if (windows[0].isIcon()) {
                    windows[0].setIcon(false);
                }
                windows[0].setSelected(true);
            } catch (Exception e) {
                WindowError ve;
                ve = new WindowError(this, true, pictureDispenser);
                ve.mostrarMensaje(e.toString());
                ve.show();
            }
        }
    }                             
    
    /**
     * @param evt
     * @since 2.0
     */    
    private void clickOnNew(java.awt.event.ActionEvent evt) {                            
        try {
            int id = GeneratorId.getNew();
            String tit = java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("TextoUntitled-")+id;
            numWindowsOpen++;
            activateOptions();
            JVentanaHija newScene = new JVentanaHija(this, pictureDispenser, tit);
            Desk.add(newScene, javax.swing.JLayeredPane.FRAME_CONTENT_LAYER);
            try {
                newScene.setSelected(true);
            } catch (Exception e) {
                e.printStackTrace(); 
            }
            getContentPane().add(Desk, java.awt.BorderLayout.CENTER);
        }
        catch (Exception e) {
            WindowError ve;
            ve = new WindowError(this, true, pictureDispenser);
            ve.mostrarMensaje(e.toString());
            ve.show();
        }
    }                           
    
    /**
     * @param evt
     * @since 2.0
     */    
    private void clickOnLicence(java.awt.event.ActionEvent evt) {                                
        Licence windowLicence;
        windowLicence = new Licence(this, true, pictureDispenser);
        windowLicence.show();
    }                               
    
    /**
     * @param evt
     * @since 2.0
     */    
    private void clickOnAbout(java.awt.event.ActionEvent evt) {                              
        About newSobre;
        newSobre = new About(this, true, pictureDispenser);
        newSobre.show();
    }                             
    
    /**
     * Este m�todo cierra todas las windows hijas que haya abiertas en ese momento.
     * @since 2.0
     */    
    public void cerrarTodo() {
        while (numWindowsOpen > 0) {
            JVentanaHija vActiva= (JVentanaHija) Desk.getSelectedFrame();
            if (vActiva != null) {
                vActiva.gestionarGuardarParaCerrar();
                vActiva.cerrar();
                numWindowsOpen--;
            }
            if (numWindowsOpen > 0) {
                javax.swing.JInternalFrame ventanas[] = Desk.getAllFrames();
                if (ventanas.length > 0) {
                    try {
                        if (ventanas[0].isIcon()) {
                            ventanas[0].setIcon(false);
                        }
                        ventanas[0].setSelected(true);
                    } catch (Exception e) {
                        WindowError ve;
                        ve = new WindowError(this, true, pictureDispenser);
                        ve.mostrarMensaje(e.toString());
                        ve.show();
                    }
                } else {
                    numWindowsOpen = 0;
                }
            }
        }
    }
    
    /** Muestra la ventana Splash mientras que se cargan todos los valores para el
     * correct funcionamiento de la aplicaci�n.
     */
    /** Sale del simulador cuando se elige desde el men� ARCHIVO
     * @param evt
     * @since 2.0
     */
    private void clickOnExit(java.awt.event.ActionEvent evt) {                             
        clicEnCualquierSalir();
    }                            
    
    /**
     * @since 2.0
     */    
    private void clicEnCualquierSalir() {
        WindowBoolean wb = new WindowBoolean(this, true, pictureDispenser);
        wb.mostrarPregunta(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("JSimulador.PreguntaSalirDelSimulador"));
        wb.show();
        boolean answer = wb.getAnswer();
        wb.dispose();
        if (answer) {
            cerrarTodo();
            this.dispose();
        }
    }

    /** Sale del simulador
     * @param evt
     * @since 2.0
     */
    private void exitForm(java.awt.event.WindowEvent evt) {                          
        clicEnCualquierSalir();
    }                         
    
    /**
     * @since 2.0
     */    
    private void deactivateOptions() {
        closeMenuItem.setEnabled(false);
        saveAsMenuItem.setEnabled(false);
        saveMenuItem.setEnabled(false);
        deactivateOptionsVista();
    }
    
    /**
     * @since 2.0
     */    
    private void activateOptions() {
        closeMenuItem.setEnabled(true);
        saveAsMenuItem.setEnabled(true);
        saveMenuItem.setEnabled(true);
        activateOptionsVista();
    }
    
    /**
     * @since 2.0
     */    
    private void deactivateOptionsVista() {
        if (numWindowsOpen == 0) {
            mosaicHorizontalMenuItem.setEnabled(false);
            mosaicVerticalMenuItem.setEnabled(false);
            cascadeMenuItem.setEnabled(false);
            iconsMenuItem.setEnabled(false);
        }
        else if (numWindowsOpen == 1) {
            mosaicHorizontalMenuItem.setEnabled(false);
            mosaicVerticalMenuItem.setEnabled(false);
            cascadeMenuItem.setEnabled(false);
            iconsMenuItem.setEnabled(true);
        }
    }

    /**
     * @since 2.0
     */    
    private void activateOptionsVista() {
        if (numWindowsOpen == 1) {
            mosaicHorizontalMenuItem.setEnabled(false);
            mosaicVerticalMenuItem.setEnabled(false);
            cascadeMenuItem.setEnabled(false);
            iconsMenuItem.setEnabled(true);
        }
        else if (numWindowsOpen > 1) {
            mosaicHorizontalMenuItem.setEnabled(true);
            mosaicVerticalMenuItem.setEnabled(true);
            cascadeMenuItem.setEnabled(true);
            iconsMenuItem.setEnabled(true);
        }
    }

    /**
     * @since 2.0
     */    
        private TImagesBroker pictureDispenser;
    /**
     * @since 2.0
     */    
    private TIDGenerator GeneratorId;
    /**
     * @since 2.0
     */    
    private int numWindowsOpen;
    // Variables declaration - do not modify                     
    private javax.swing.JDesktopPane Desk;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem cascadeMenuItem;
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JMenuItem comentarioMenuItem1;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem iconsMenuItem;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem licenseMenuItem;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem mosaicHorizontalMenuItem;
    private javax.swing.JMenuItem mosaicVerticalMenuItem;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenu submenuHelp;
    private javax.swing.JMenu submenuScene;
    private javax.swing.JMenu submenuView;
    private javax.swing.JMenuItem tutorialMenuItem;
    // End of variables declaration                   
}
