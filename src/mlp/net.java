package mlp;

import java.util.ArrayList;

public class net {
    private ArrayList<Double> data;
    private ArrayList<Integer> desired;
    private Double error;
    private int entry;
    private int exit;
    private int ocultLayer;
    private Double mistakeValue;
    private int iterations;
    private Double learningRate;
    private int options;

    public net(ArrayList<Double> data, ArrayList<Integer> desired, Double error, int entry, int exit, int ocultLayer,
            Double mistakeValue, int iterations, Double learningRate, int options) {
        this.data = data;
        this.desired = desired;
        this.error = error;
        this.entry = entry;
        this.exit = exit;
        this.ocultLayer = ocultLayer;
        this.mistakeValue = mistakeValue;
        this.iterations = iterations;
        this.learningRate = learningRate;
        this.options = options;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }

    public ArrayList<Integer> getDesired() {
        return desired;
    }

    public void setDesired(ArrayList<Integer> desired) {
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

    public Double getMistakeValue() {
        return mistakeValue;
    }

    public void setMistakeValue(Double mistakeValue) {
        this.mistakeValue = mistakeValue;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public Double getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(Double learningRate) {
        this.learningRate = learningRate;
    }

    public int getOptions() {
        return options;
    }

    public void setOptions(int options) {
        this.options = options;
    }

    
    

}
