package eu.mazecity.Radiomod;

import java.io.File;

public class RadiomodClient extends RadiomodCommon
{
    @Override
    public void preInit(File configFile) {
        super.preInit(configFile);
        System.out.println("pre init client side");
    }

    @Override
    public void init() {
        super.init();
    }
}
