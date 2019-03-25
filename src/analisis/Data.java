/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis;

import com.opencsv.bean.CsvBindByName;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author SEED
 */
public class Data {

    public Data() {
    }

public Object getMeta(String key)
    {
        Map<String,Object> datasetMeta = new LinkedHashMap<>();
        datasetMeta.put("HARI RAYA", variable1);        
        datasetMeta.put("PENUNDAAN", variable2);
        datasetMeta.put("HARI LIBUR", variable3);
        datasetMeta.put("MINGGU GAJIAN", variable4);        
        datasetMeta.put("GANGGUAN CUACA", variable5);        
        datasetMeta.put("STATUS", target);        
        return datasetMeta.get(key);    
    }    
    public String getRelevancy()
    {
        if  (( target.equals("Normal")) && (klasifikasi.equals("Normal") )) {
            return "TP";
        }
        if  (( target.equals("Ramai")) && (klasifikasi.equals("Normal") )) {
            return "FN";
        }
        if  (( target.equals("Normal")) && (klasifikasi.equals("Ramai") )) {
            return "FP";
        }
        if  (( target.equals("Ramai")) && (klasifikasi.equals("Ramai") )) {
            return "TN";
        }
        return "null";
    }

    public Data(String jenisTomat, String diameter,String bentuk, String warna,  String usia, String hiperglikemia) {
        this.variable3 = jenisTomat;
        this.variable1 = bentuk;
        this.variable5 = warna;
        this.variable2 = diameter;
        this.variable4 = usia;
        this.target = hiperglikemia;
    }
    @CsvBindByName(column = "HARILIBUR")
    private String variable3;

    /**
     * Get the value of variable3
     *
     * @return the value of variable3
     */
    public String getVariable3() {
        return variable3;
    }

    /**
     * Set the value of variable3
     *
     * @param variable3 new value of variable3
     */
    public void setVariable3(String variable3) {
        this.variable3 = variable3;
    }
    @CsvBindByName(column = "HARIRAYA")
    private String variable1;

    /**
     * Get the value of variable1
     *
     * @return the value of variable1
     */
    public String getVariable1() {
        return variable1;
    }

    /**
     * Set the value of variable1
     *
     * @param variable1 new value of variable1
     */
    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }
    @CsvBindByName(column = "GANGGUANCUACA")
    private String variable5;

    /**
     * Get the value of variable5
     *
     * @return the value of variable5
     */
    public String getVariable5() {
        return variable5;
    }

    /**
     * Set the value of variable5
     *
     * @param variable5 new value of variable5
     */
    public void setVariable5(String variable5) {
        this.variable5 = variable5;
    }
    @CsvBindByName(column = "PENUNDAAN")
    private String variable2;

    /**
     * Get the value of variable2
     *
     * @return the value of variable2
     */
    public String getVariable2() {
        return variable2;
    }

    /**
     * Set the value of variable2
     *
     * @param variable2 new value of variable2
     */
    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }
    @CsvBindByName(column = "MINGGUGAJIAN")
    private String variable4;

    /**
     * Get the value of variable4
     *
     * @return the value of variable4
     */
    public String getVariable4() {
        return variable4;
    }

    /**
     * Set the value of variable4
     *
     * @param variable4 new value of variable4
     */
    public void setVariable4(String variable4) {
        this.variable4 = variable4;
    }
    @CsvBindByName(column = "STATUS")
    private String target;

    /**
     * Get the value of target
     *
     * @return the value of target
     */
    public String getTarget() {
        return target;
    }

    /**
     * Set the value of target
     *
     * @param target new value of target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    private String klasifikasi;

    /**
     * Get the value of klasifikasi
     *
     * @return the value of klasifikasi
     */
    public String getKlasifikasi() {
        return klasifikasi;
    }

    /**
     * Set the value of klasifikasi
     *
     * @param klasifikasi new value of klasifikasi
     */
    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

}
