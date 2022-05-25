package mlp;

import java.util.ArrayList;

public class node {
    private ArrayList<Double> data;
    private int Class;
    private Double peso;
    private Double net;
 
    public node(ArrayList<Double> data, int class1) {
        this.data = data;
        Class = class1;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }

    public int get_Class() {
        return Class;
    }

    public void setClass(int class1) {
        Class = class1;
    }

    public Double linearDer(){
        return 0.1;
    }
    
    public Double linear (){
         return this.net/10;
    }

    public Double logistical (){
        return 1/(1+Math.exp(-this.net));
    }
    
    public Double logisticalDer (){
        return this.logistical()*(1*this.logistical());
    }

    public Double tangent(){
        return (1-Math.exp(-(2*this.net)))/(1+Math.exp(-(2*this.net)));
    }

    public Double tangentDer (){
        return 1-Math.pow(this.tangent(),2);
    }

}
