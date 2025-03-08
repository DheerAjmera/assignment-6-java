abstract public class Duck {
    QuackBehavior quackBehavior;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;
    
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
