package xyz.kail.demo.guava.event.bus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class Main {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        eventBus.register(new Object() {

            @Subscribe
            public void lister(Integer integer) {
                System.out.printf("%s from int%n", integer);
            }

            @Subscribe
            public void lister2(Number integer) {
                System.out.printf("%s from Number%n", integer);
            }

            @Subscribe
            public void lister3(Long integer) {
                System.out.printf("%s from long%n", integer);
            }
        });

        eventBus.register(new Object() {

            @Subscribe
            public void lister(Long integer) {
                System.out.printf("%s from long%n", integer);
            }
        });

        eventBus.post(1);
        eventBus.post(1L);

    }

}
