package de.monticore.mlpipelines.automl.hyperparameters.parallel;

import conflang._ast.ASTConfLangCompilationUnit;

import java.util.List;

public class BOHBAlgorithm extends ParallelAlgorithm{
    private double R;
    private double eta;
    private double n;
    private double b;

    public void bo_sample() {
        // TODO: Implement method
    }

    public void successive_halving() {
        // TODO: Implement method
    }
    public void validation_loss() {
        // TODO: Implement method
    }

    public void top_configurations() {
        // TODO: Implement method
    }

    @Override
    public void executeOptimizationStep(ASTConfLangCompilationUnit hyperParams, ASTConfLangCompilationUnit searchSpace, Double evalValue, String metricType) {

    }

    @Override
    public ASTConfLangCompilationUnit getNewHyperparamsCandidate(ASTConfLangCompilationUnit searchSpace) {
        return null;
    }

    @Override
    public List<ASTConfLangCompilationUnit> getNewPopulation(ASTConfLangCompilationUnit searchSpace, String metricType) {
        return null;
    }

    @Override
    public void executeOptimizationStep(List<ASTConfLangCompilationUnit> hyperParamsPopulation, ASTConfLangCompilationUnit searchSpace, List<Double> evalValues, String metricType) {

    }
}
