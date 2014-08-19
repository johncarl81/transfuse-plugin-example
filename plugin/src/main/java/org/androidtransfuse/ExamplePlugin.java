package org.androidtransfuse;

import org.androidtransfuse.annotations.Activity;

public class ExamplePlugin implements TransfusePlugin {

    @Override
    public void run(ConfigurationRepository configurationRepository) {
        configurationRepository
                .component(Activity.class)
                .callThroughEvent(ExampleCallThrough.class);
    }
}