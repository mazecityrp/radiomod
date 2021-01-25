package eu.mazecity.Radiomod;

import java.io.File;

public class RadiomodServer extends RadiomodCommon
{
    @Override
    public void preInit(File configFile) {
        super.preInit(configFile);
        System.out.println("pre init server side");
    }

    @Override
    public void init() {
        super.init();
    }
}
