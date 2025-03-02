package com.configuraciondejuegosporplataforma.factories;

import com.configuraciondejuegosporplataforma.configs.GraphisConfig;
import com.configuraciondejuegosporplataforma.configs.InputConfig;
import com.configuraciondejuegosporplataforma.configs.PCGraphicsConfig;
import com.configuraciondejuegosporplataforma.configs.PCInputConfig;



public class PCPlataformFactory implements PlataformFactory {
    @Override
    public InputConfig createInputConfig() {
        return (InputConfig) new PCInputConfig();
    }

    @Override
    public GraphisConfig createGraphisConfig() {
        return (GraphisConfig) new PCGraphicsConfig();
    }

}
