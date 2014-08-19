package org.androidtransfuse;

import org.androidtransfuse.listeners.CallThrough;

/**
 * @author John Ericksen
 */
public interface ExampleCallThrough {

    @CallThrough
    void onBackPressed();
}
