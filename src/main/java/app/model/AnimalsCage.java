package app.model;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

private final Animal animal;

private final Timer time;

public AnimalsCage(@Qualifier("dog") Animal animal, Timer time) {
    this.animal = animal;
    this.time = time;
}

public Timer getTimer() {
    return time;
}

public void whatAnimalSay() {
    System.out.println("Say:");
    System.out.println(animal.toString());
    System.out.println("At:");
    System.out.println(new Timer().getTime());
    System.out.println("________________________");
}


}

