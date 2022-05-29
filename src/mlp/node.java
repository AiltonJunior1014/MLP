package mlp;

import java.util.ArrayList;
import java.util.List;

public class node {
    private List<Double> data;
    private Double weight;
    private Double net;
 
    public node() {
        this.data = new ArrayList<Double> ();
    }

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }

    public Double getWeight() {
        return weight;
    }

    

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
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
