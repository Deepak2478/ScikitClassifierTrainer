package com.pavoindus.modeltraining.service;

import com.pavoindus.modeltraining.model.*;
import com.pavoindus.modeltraining.response.APIResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ModelTrainingService {

    TrainingDataInfo uploadTrainingData(MultipartFile file, String name);
    ModelConfig createModel(Long trainingDataInfoId, String name, String type, Double[] coeff);
    ModelDetails getModel(Long id);
    List<TrainingDataInfo> getAllTrainingDataInfo();
    List<ModelDetails> getAllModels();
    List<TrainingData> getTrainingDataForInfo(Long id);
    void queueModelForTraining(ModelConfig config);
    APIResponse getModelAnalysisFromPredictiveService(MultipartFile file, Long modelId);
}
