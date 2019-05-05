package xyz.kail.demo.guava.event.jdk;

import java.util.EventListener;
import java.util.EventListenerProxy;
import java.util.EventObject;

/**
 * 1）事件源（event source）：
 * 2）事件对象（event object）：
 * 3）事件监听器（event listener）：
 */
public class JdkListenerMain {

    public static void main(String[] args) {

        Class<EventListener> eventListenerClass = EventListener.class;
        Class<EventListenerProxy> eventListenerProxyClass = EventListenerProxy.class;
        Class<EventObject> eventObjectClass = EventObject.class;


    }


}
