package com.configuraciondejuegosporplataforma.factories;

import com.configuraciondejuegosporplataforma.configs.GraphisConfig;
import com.configuraciondejuegosporplataforma.configs.InputConfig;
import com.configuraciondejuegosporplataforma.configs.XboxGraphicsConfig;
import com.configuraciondejuegosporplataforma.configs.XboxInputConfig;

public class XboxPlataformFactory implements PlataformFactory {
    @Override
    public InputConfig createInputConfig() {
        return (InputConfig) new XboxInputConfig();
    }

    @Override
    public GraphisConfig createGraphisConfig() {
        return (GraphisConfig) new XboxGraphicsConfig();
    }

}
