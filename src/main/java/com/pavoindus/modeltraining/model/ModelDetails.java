package com.pavoindus.modeltraining.model;

import java.io.Serializable;

public class ModelDetails implements Serializable {

    private Model model;
    private ModelConfig config;
    private ModelAnalysis analysis;

    public ModelDetails(Model model, ModelConfig config, ModelAnalysis analysis) {
        this.model = model;
        this.config = config;
        this.analysis = analysis;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public ModelConfig getConfig() {
        return config;
    }

    public void setConfig(ModelConfig config) {
        this.config = config;
    }

    public ModelAnalysis getAnalysis() {
        return analysis;
    }

    public void setAnalysis(ModelAnalysis analysis) {
        this.analysis = analysis;
    }
}
