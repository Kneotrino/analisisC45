/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import weka.core.Instances;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

/**
 *
 * @author SEED
 */
public class guiApplication extends javax.swing.JFrame {

    /**
     * Creates new form guiApplication
     */
    boolean isImport = false;
    boolean isSplit = false;
    boolean isRandomUse = false;
    boolean isSupplyTrainning = false;
    
    public guiApplication() {
        initComponents();
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//        .setUndecorated(true);
//        frame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listData = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(new LinkedList<>()); ;
        listDataTrain = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(new LinkedList<>()); ;
        listDataTest = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(new LinkedList<>()); ;
        listDataHasil = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(new LinkedList<>()); ;
        listRelevancy = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(new LinkedList<>()); ;
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        importButtonArff = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        bagiDataButton = new javax.swing.JButton();
        KlasifikasiButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFocusable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        importButtonArff.setText("Import");
        importButtonArff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonArffActionPerformed(evt);
            }
        });
        jPanel4.add(importButtonArff);

        DeleteButton.setText("Hapus Semua");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel4.add(DeleteButton);

        jPanel1.add(jPanel4, java.awt.BorderLayout.NORTH);

        jTable1.setAutoCreateRowSorter(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listData, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${target}"));
        columnBinding.setColumnName("Target");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable1}"));
        columnBinding.setColumnName("Hari Raya");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable2}"));
        columnBinding.setColumnName("Penundaan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable3}"));
        columnBinding.setColumnName("Libur ");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable4}"));
        columnBinding.setColumnName("Minggu Gajian");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable5}"));
        columnBinding.setColumnName("Ganguan Cuaca");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Dataset", jPanel1);

        jPanel2.setFocusable(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setLayout(new java.awt.GridLayout(0, 2));

        bagiDataButton.setText("BAGI DATA");
        bagiDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiDataButtonActionPerformed(evt);
            }
        });
        jPanel10.add(bagiDataButton);

        KlasifikasiButton.setText("KLASIFIKASI");
        KlasifikasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlasifikasiButtonActionPerformed(evt);
            }
        });
        jPanel10.add(KlasifikasiButton);

        jLabel1.setText("METODE");
        jPanel10.add(jLabel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RANDOM USE TRAINNING", "SUPPLY TRAINNING" }));
        jPanel10.add(jComboBox1);

        jLabel4.setText("PERSENTASE PEMBAGIAN");
        jPanel10.add(jLabel4);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(70.0d, 0.0d, 100.0d, 5.0d));
        jPanel10.add(jSpinner3);

        jPanel2.add(jPanel10);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA LATIH", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jTable5.setAutoCreateRowSorter(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listDataTrain, jTable5);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${target}"));
        columnBinding.setColumnName("Target");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable1}"));
        columnBinding.setColumnName("Variable1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable2}"));
        columnBinding.setColumnName("Variable2");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable3}"));
        columnBinding.setColumnName("Variable3");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable4}"));
        columnBinding.setColumnName("Variable4");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable5}"));
        columnBinding.setColumnName("Variable5");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane5.setViewportView(jTable5);

        jPanel9.add(jScrollPane5);

        jPanel2.add(jPanel9);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA UJI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jTable4.setAutoCreateRowSorter(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listDataTest, jTable4);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${target}"));
        columnBinding.setColumnName("Target");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable1}"));
        columnBinding.setColumnName("Variable1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable2}"));
        columnBinding.setColumnName("Variable2");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable3}"));
        columnBinding.setColumnName("Variable3");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable4}"));
        columnBinding.setColumnName("Variable4");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable5}"));
        columnBinding.setColumnName("Variable5");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(jTable4);

        jPanel8.add(jScrollPane4);

        jPanel2.add(jPanel8);

        jTabbedPane1.addTab("Pembagian Data", jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jTable2.setAutoCreateRowSorter(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listDataHasil, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${klasifikasi}"));
        columnBinding.setColumnName("Klasifikasi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${target}"));
        columnBinding.setColumnName("Target");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable1}"));
        columnBinding.setColumnName("Variable1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable2}"));
        columnBinding.setColumnName("Variable2");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable3}"));
        columnBinding.setColumnName("Variable3");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable4}"));
        columnBinding.setColumnName("Variable4");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${variable5}"));
        columnBinding.setColumnName("Variable5");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listRelevancy, jTable3);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${info}"));
        columnBinding.setColumnName("Info");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ACC}"));
        columnBinding.setColumnName("ACC");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jumlahData}"));
        columnBinding.setColumnName("Jumlah Data");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jumlahDataLatih}"));
        columnBinding.setColumnName("Jumlah Data Latih");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3);

        jTabbedPane1.addTab("Hasil Klasifikasi", jPanel3);

        jPanel5.setLayout(new java.awt.BorderLayout());
        jScrollPane6.setViewportView(jPanel5);

        jTabbedPane1.addTab("Tree View", jScrollPane6);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Import");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    public static <T> List<T> randomSubList(List<T> list, int newSize) {
        list = new ArrayList<>(list);
        Collections.shuffle(list);
        return list.subList(0, newSize);
    }
    public static <T> List<T> SubList(List<T> list, int newSize) {
        list = new ArrayList<>(list);
        return list.subList(0, newSize);
    }
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        importButtonArffActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void KlasifikasiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlasifikasiButtonActionPerformed

        Instances dataLatih = toolUtil.createInstances(listDataTrain);
        Instances dataUji = toolUtil.createInstances(listDataTest);

        listDataHasil.clear();
        listDataHasil.addAll(listDataTest);

        C45 tree = new C45();
        tree.setBinarySplits(true);
        tree.setUnpruned(true);

        try {
            tree.buildClassifier(dataLatih);
            System.out.println("tree = " + tree.graph());
            for (Data object : listDataHasil) {
                int indexOf = listDataHasil.indexOf(object);
                weka.core.Instance instance = dataUji.instance(indexOf);
                double classifyInstance = tree.classifyInstance(instance);
                if (classifyInstance > .5d) {
                    object.setKlasifikasi("Normal");
                }
                else {
                    object.setKlasifikasi("Ramai");
                }
                String graph = tree.graph();
                TreeVisualizer tv = new TreeVisualizer(null,
                    tree.graph(),
                    new PlaceNode2());
                jPanel5.remove(tv);
                jPanel5.add(tv, BorderLayout.CENTER);
//                jScrollPane6.add(tv);

            }
        } catch (Exception ex) {
            Logger.getLogger(Analisis.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTabbedPane1.setEnabledAt(2, true);
        jTabbedPane1.setSelectedIndex(2);

        relevancy R = new relevancy(new Date().toString());
        R.setJumlahData(listDataTest.size());
        R.setJumlahDataLatih(listDataTrain.size());
        Map<String, Long> collectTrue =
        listDataHasil
        .stream()
        .collect(Collectors.groupingBy( (Data e) -> e.getRelevancy(), Collectors.counting()));
        
        System.out.println("collectTrue = " + collectTrue);
        
        double TP = collectTrue.get("TP") != null? collectTrue.get("TP"):0d;
        double TN = collectTrue.get("TN") != null? collectTrue.get("TN"):0d;
        double FP = collectTrue.get("FP") != null? collectTrue.get("FP"):0d;
        double FN = collectTrue.get("FN") != null? collectTrue.get("FN"):0d;
        R.setTP(TP);
        R.setTN(TN);
        R.setFP(FP);
        R.setFN(FN);
        listRelevancy.add(R);

        // TODO add your handling code here:
    }//GEN-LAST:event_KlasifikasiButtonActionPerformed

    private void bagiDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiDataButtonActionPerformed
        System.out.println("analisis.guiApplication.bagiDataButtonActionPerformed()");
        double value = (double) jSpinner3.getValue();
        value = value * .01d;
        int size = listData.size();
        int hasil = (int) (value * size);
        listDataTest.clear();
        listDataTrain.clear();

        int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex == 0) {
            System.out.println("RANDOM USE");

            List<Data> randomSubList = randomSubList(listData, hasil);
            listDataTrain.addAll(randomSubList);
            listDataTest.addAll(listData);
            listDataTest.removeAll(listDataTrain);
        }
        else if (selectedIndex == 1) {
            System.out.println("SUPPLY");
            List<Data> SubList = SubList(listData, hasil);
            listDataTrain.addAll(SubList);
            listDataTest.addAll(listData);
            listDataTest.removeAll(listDataTrain);

        }
        //        listData.removeAll(listDataTrain);
        System.out.println("value = " + value);

    }//GEN-LAST:event_bagiDataButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        listData.clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void importButtonArffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonArffActionPerformed
        System.out.println("analisis.guiApplication.importButtonArffActionPerformed()");
        JFileChooser jfc = new JFileChooser("C:/tomat");
        //        jfc.setFileFilter(new FileNameExtensionFilter("csv","arff"));
        jfc.addChoosableFileFilter(new FileNameExtensionFilter("Train CSV Files", "csv"));
        //        jfc.addChoosableFileFilter(new FileNameExtensionFilter("Train ARFF Files", "arff"));
        int r = jfc.showOpenDialog(null);
        if (r == JFileChooser.CANCEL_OPTION) {
            batal(new UnsupportedOperationException("Not supported yet."));
        }
        //        peforma p = new peforma();

        File selectedFile = jfc.getSelectedFile();
        System.out.println("selectedFile = " + selectedFile);
        String fileExtension = toolUtil.getFileExtension(selectedFile);
        System.out.println("fileExtension = " + fileExtension);
        //        if ( fileExtension.equals("arff")) {
            //            System.out.println("arff");
            //            DataSet data = toolUtil.read(selectedFile.getAbsolutePath());
            //            data.instances.stream().forEach((Instance a) -> {
                //                String jenisTomat = a.getValues("jenisTomat").toString();
                //                String diameter = a.getValues("diameter").toString();
                //                String bentuk = a.getValues("bentuk").toString();
                //                String warna = a.getValues("usia").toString();
                //                String usia = a.getValues("warna").toString();
                //                String hiperglikemia = a.label;
                //                listData.add( new Data(jenisTomat, diameter, bentuk, warna, usia, hiperglikemia));
                //            });
        //            jTabbedPane1.setEnabledAt(1, true);
        ////            Object dataRow [][] = new Object[0][0];
        //        }
        //        else
        if ( fileExtension.equals("csv") )
        {
            System.out.println("CSV");
            CSVReader reader;
            try {
                reader = new CSVReader(new FileReader(selectedFile));
                CsvToBean<Data> dataBean =
                new CsvToBeanBuilder
                (Files.newBufferedReader(selectedFile.toPath()))
                .withType(Data.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
                List<Data> parse = dataBean.parse();
                listData.addAll(parse);
                System.out.println("listData = " + listData.size());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(guiApplication.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(guiApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTabbedPane1.setEnabledAt(1, true);

        }

    }//GEN-LAST:event_importButtonArffActionPerformed

    private void batal(UnsupportedOperationException unsupportedOperationException) {
        JOptionPane.showMessageDialog(null, "Pembatalan Proese Klasifikasi");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton KlasifikasiButton;
    private javax.swing.JButton bagiDataButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton importButtonArff;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private java.util.List<analisis.Data> listData;
    private java.util.List<analisis.Data> listDataHasil;
    private java.util.List<analisis.Data> listDataTest;
    private java.util.List<analisis.Data> listDataTrain;
    private java.util.List<relevancy> listRelevancy;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
