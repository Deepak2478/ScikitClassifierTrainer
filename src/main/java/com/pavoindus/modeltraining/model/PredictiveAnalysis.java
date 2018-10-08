package com.pavoindus.modeltraining.model;

public class PredictiveAnalysis {

    private String modelLocation;
    private String[][] wageTypes;


    public PredictiveAnalysis(String modelLocation, String[][] wageTypes) {
        this.modelLocation = modelLocation;
        this.wageTypes = wageTypes;
    }

    protected PredictiveAnalysis() {
    }

    public String getModelLocation() {
        return modelLocation;
    }

    public void setModelLocation(String modelLocation) {
        this.modelLocation = modelLocation;
    }

    public String[][] getWageTypes() {
        return wageTypes;
    }

    public void setWageTypes(String[][] wageTypes) {
        this.wageTypes = wageTypes;
    }
}
