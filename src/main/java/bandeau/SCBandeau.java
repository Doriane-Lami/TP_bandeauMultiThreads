package bandeau;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SCBandeau extends Bandeau {

    private final Lock verrou = new ReentrantLock();

    public void verrouiller(){
        verrou.lock();
    }

    public void deVerrouiller(){
        verrou.unlock();
    }

}
