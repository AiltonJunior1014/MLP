package mlp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class net {
    private List<List<Double>> data;
    private ArrayList<String> desired;
    private int[] desiredIndex;
    private ArrayList<layer> layers;
    private Double error;
    private int entry;
    private int exit;
    private int ocultLayer;
    private int iterations;
    private int options;
    
    public net(Double error, int entry, int exit, int ocultLayer,
            int iterations, int options) {
        this.data = new ArrayList<List<Double>>();
        this.desired = new ArrayList<String>();
        this.layers = new ArrayList<layer>();
        this.error = error;
        this.entry = entry;
        this.exit = exit;
        this.ocultLayer = ocultLayer;
        this.iterations = iterations;
        this.options = options;
    }

    

    public ArrayList<String> getDesired() {
        return desired;
    }

    public void setDesired(ArrayList<String> desired) {
        this.desired = desired;
    }

    public Double getError() {
        return error;
    }

    public void setError(Double error) {
        this.error = error;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public int getExit() {
        return exit;
    }

    public void setExit(int exit) {
        this.exit = exit;
    }

    public int getOcultLayer() {
        return ocultLayer;
    }

    public void setOcultLayer(int ocultLayer) {
        this.ocultLayer = ocultLayer;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public int getOptions() {
        return options;
    }

    public void setOptions(int options) {
        this.options = options;
    }

    public void setWeight (){
        for(layer i : this.layers) {
            i.setWeight();
        }
    }

    public void readArq(String arqName) throws IOException {
        BufferedReader br = null;
        String line = "";
        String csvDivisor = ",";
        int aux=0;
        String arqBaseCSV = arqName;
        ArrayList<String> Data, desiredAux;


        desiredAux = new ArrayList<String>();
        br = new BufferedReader(new FileReader(arqBaseCSV));
        line = br.readLine();
        
        while (line != null) {
            String[] data = line.split(csvDivisor);
            Data = new ArrayList<String>();
            for (int j = 0; j < data.length-1; j++) {
                Data.add(data[j]);
            }
            desiredAux.add(data[data.length-1]);
            this.data.add(new ArrayList<Double>());
            for (int i = 0; i < Data.size();i++){
                
                this.data.get(aux).add(Double.parseDouble(Data.get(i)));
            }
            aux++;            
            line = br.readLine();            
        }        
        br.close();


        Collections.sort(desiredAux);

        List<String> set;
        
        set = desiredAux.stream().distinct().collect(Collectors.toList());
        
        this.desired.addAll(set);

        this.desiredIndex = new int [this.desired.size()];

        for(int i = 0; i < this.desired.size(); i++){
            this.desiredIndex[i] = i;
        }
        
    }


    public void trainning(){

        for(int i=0; i< this.ocultLayer;i++){
            this.layers.add(new layer(0.2,error,this.data.get(0).size()));
            this.layers.get(i).setWeight();
        }

        for(List<Double> vals : this.data){
            for(layer L : this.layers){
                L.setDataentries(vals);
                L.trainning();
            }
        }

    }

    public void exibe(){
        for(int i =0;i< this.data.size();i++){
            System.out.println(this.data.get(i));
        }
    }
    

}
