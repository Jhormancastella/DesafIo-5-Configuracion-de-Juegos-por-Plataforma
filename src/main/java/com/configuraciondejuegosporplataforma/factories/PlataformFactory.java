package com.configuraciondejuegosporplataforma.factories;


import com.configuraciondejuegosporplataforma.configs.GraphisConfig;
import com.configuraciondejuegosporplataforma.configs.InputConfig;


public interface PlataformFactory {
    InputConfig createInputConfig();
    GraphisConfig createGraphisConfig();

}
