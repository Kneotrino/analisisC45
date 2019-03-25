/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import weka.core.FastVector;
import weka.core.Instances;

/**
 *
 * @author SEED
 */
public class toolUtil {
    
        public static String [] readHeader(File fileARFF)
        {
                List<String> data = new ArrayList<String>();
//		DataSet data = new DataSet();
		Scanner scanner = null;
		try {
			scanner = new Scanner(fileARFF);
		} catch (FileNotFoundException exception) {
			System.out.println("Error: could not find file");
			System.exit(1);
		}
		String line;
		scanner.nextLine(); // Skip first line

                while (scanner.hasNextLine()) {
			line = scanner.nextLine();
                        if (line.equals("")) {                        
                            continue;
                        }
			if (line.equals("@data"))
				break;
                        
                        ArrayList<String> splitLine = new ArrayList<String>(Arrays.asList(line.split(" ")));
                        splitLine.remove("@attribute");
                        splitLine.remove("{");
                        splitLine.remove("}");

                        String name = splitLine.get(0);
			data.add(name);
		}

            return data.stream().toArray(String[]::new);
        }
        public String getAtribute(String line)
        {
		ArrayList<String> splitLine = new ArrayList<String>(Arrays.asList(line.split(" ")));
		splitLine.remove("@attribute");
		splitLine.remove("{");
		splitLine.remove("}");
                return splitLine.get(0);
        }

    @SuppressWarnings("resource")
	public static DataSet read(String filename) {
		DataSet data = new DataSet();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filename));
		} catch (FileNotFoundException exception) {
			System.out.println("Error: could not find file");
			System.exit(1);
		}
		String line;
		scanner.nextLine(); // Skip first line
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			if (line.equals("@data"))
				break;
			data.addAttribute(line);
		}
                //System.out.println("data = " + data.attributes);
                
		while (scanner.hasNextLine())
			data.addInstance(scanner.nextLine());
		return data;
	}
        
        public static Object[][] readData(File fileARFF)
        {
            //skip header    
//            while (scanner.hasNextLine()) {
//			line = scanner.nextLine();
//                        if (line.equals("")) {                        
//                            continue;
//                        }
//			if (line.equals("@data"))
//				break;
//                }
            return null;
        }

        public static String getFileExtension(File file) {
            String name = file.getName();
            try {
                return name.substring(name.lastIndexOf(".") + 1);
            } catch (Exception e) {
                return "";
            }
        }

    public static weka.core.Attribute createAttribute(List<Data> Data,String key)
     {
        Function<Data, String> funcTemp = (Data a) -> (String) a.getMeta(key);         
        Map<String, Long> fun = Data
                .stream()
                .collect(Collectors.groupingBy(
                                     funcTemp , Collectors.counting()
                            ));
        
        Set<String> keySet = fun.keySet();
        FastVector fvNominalVal = new FastVector(keySet.size());
         for (String string : keySet) {
            fvNominalVal.addElement(string);             
         }
        return new weka.core.Attribute(key, fvNominalVal);
     }
        
    public static  Instances createInstances(List<Data> Data)
     {
        int max = 6;
        FastVector listAttributes = new FastVector(max);
        listAttributes.addElement(createAttribute(Data, "HARI RAYA"));
        listAttributes.addElement(createAttribute(Data, "PENUNDAAN"));
        listAttributes.addElement(createAttribute(Data, "HARI LIBUR"));
        listAttributes.addElement(createAttribute(Data, "MINGGU GAJIAN"));
        listAttributes.addElement(createAttribute(Data, "GANGGUAN CUACA"));
        listAttributes.addElement(createAttribute(Data, "STATUS"));

        
        
        Instances temp = new Instances("data", listAttributes, Data.size());
        temp.setClassIndex(max-1);        
         for (Data dataset : Data) {
            weka.core.Instance x = new weka.core.Instance(max);
            for (int i = 0; i < 6; i++) {
                 weka.core.Attribute elementAt = (weka.core.Attribute) listAttributes.elementAt(i);
                 Object meta = dataset.getMeta(elementAt.name());
                 if (meta instanceof Integer) {
                     int v = (int) meta;
                     double value = v*1d;                     
                     x.setValue(elementAt, value);
                 }
                 else if (meta instanceof Double) {                                 
                     x.setValue(elementAt, (double) meta);
                 }                 
                 else if (meta instanceof String) {                                 
                     x.setValue(elementAt, (String) meta);
                 }
                 
             }
//            System.out.println("x = " + x);     
            temp.add(x);
         }
         return temp;
     }
        
}
