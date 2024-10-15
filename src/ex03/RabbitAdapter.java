package ex03;

import ex03.Animal;
import ex03.lib.OuterRabbit;

public class RabbitAdapter  extends Animal {

     private OuterRabbit rabbit;

    public RabbitAdapter(OuterRabbit rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String getName() {
        return rabbit.getFullname();
    }
}
