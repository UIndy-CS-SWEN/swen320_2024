package examples;

import java.util.EventListener;

class EventHandler implements EventListener {

    public EventHandler(EventSource source) {
        // Register this object as a listener
        source.registerListener(this);
    }
    
    @Overrride
    public void changeEvent(Event e) {
        // respond to event
    }
}

