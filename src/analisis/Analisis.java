/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader.ArffReader;

/**
 *
 * @author SEED
 */
public class Analisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        guiApplication.main(args);


//        BufferedReader reader = null;
//        ArffReader arff = null;
//        try {
//            reader = new BufferedReader(new FileReader("C:/tomat/train.arff"));
//            arff = new ArffReader(reader);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Analisis.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Analisis.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        Instances data = arff.getData();        
////        data.
//        data.setClassIndex(data.numAttributes() - 1);
//
//        C45 tree = new C45();
//        try {
//            tree.buildClassifier(data);
//            System.out.println(tree.toString());
////            for (int i = 0; i < 30; i++) {
////                Instance instance = data.instance(i);
////                double classifyInstance = tree.classifyInstance(instance);
////                System.out.println("classifyInstance = " + classifyInstance);
////            }
//        } catch (Exception ex) {
//            Logger.getLogger(Analisis.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
    }
    
}
