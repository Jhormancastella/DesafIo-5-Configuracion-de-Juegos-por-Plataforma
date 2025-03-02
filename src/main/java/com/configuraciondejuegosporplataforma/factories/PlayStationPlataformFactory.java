package com.configuraciondejuegosporplataforma.factories;

import com.configuraciondejuegosporplataforma.configs.GraphisConfig;    
import com.configuraciondejuegosporplataforma.configs.InputConfig;
import com.configuraciondejuegosporplataforma.configs.PlayStationGraphicsConfig;
import com.configuraciondejuegosporplataforma.configs.PlayStationInputConfig;


public class PlayStationPlataformFactory implements PlataformFactory {
    @Override
    public InputConfig createInputConfig() {
        return (InputConfig) new PlayStationInputConfig();
    }

    @Override
    public GraphisConfig createGraphisConfig() {
        return (GraphisConfig) new PlayStationGraphicsConfig();
    }

}
