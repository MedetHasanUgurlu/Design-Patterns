## State Pattern
![img.png](img.png)
### Recipe
1) Write State interface which includes behaviour method
2) Secondly, Make concrete state class implements the State
3) Then, create a Maker class, add the behaviour as well.
4) When we create maker, we can call setState() or we inject in constructor.

### KEY POİNTS
* **Inject** the *state* interface in maker class. 
*  Rearrange the code.

<br>
State interface

    public interface State {
        void selectCoffee();
        void addWater();
        void addCoffeeBeans();
        void grindBeans();
        void brew();
    }
<br>
LatteState

    public class LatteState implements State {
        @Override
        public void selectCoffee() {
            System.out.println("Latte selected.");
        }
        @Override
        public void addWater() {
            System.out.println("Adding water for latte.");
        }
        @Override
        public void addCoffeeBeans() {
            System.out.println("Adding coffee beans for latte.");
        }
        @Override
        public void grindBeans() {
            System.out.println("Grinding coffee beans for latte.");
        }
        @Override
        public void brew() {
            System.out.println("Steaming milk for latte. Brewing latte.");
        }
    }
<br>
EspressoState

    public class EspressoState implements State {
        @Override
        public void selectCoffee() {
            System.out.println("Espresso selected.");
        }
        @Override
        public void addWater() {
            System.out.println("Adding water for espresso.");
        }
        @Override
        public void addCoffeeBeans() {
            System.out.println("Adding coffee beans for espresso.");
        }
        @Override
        public void grindBeans() {
            System.out.println("Grinding coffee beans for espresso.");
        }
        @Override
        public void brew() {
            System.out.println("Brewing espresso.");
        }
    }
<br>
Maker -> Inject State

    public class CoffeeMaker {

        private State state;
        public CoffeeMaker() {
            this.state = new LatteState();
        }
        public State getCoffeeMakerState() {
            return state;
        }
        public void setCoffeeMakerState(State state) {
            this.state = state;
        }
        public void selectCoffee() {
            state.selectCoffee();
        }
        public void addWater() {
            state.addWater();
        }
        public void addCoffeeBeans() {
            state.addCoffeeBeans();
        }
        public void grindBeans() {
            state.grindBeans();
        }
        public void brew() {
            state.brew();
        }
    }
<br>
Main Method

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.addWater();
        coffeeMaker.setCoffeeMakerState(new EspressoState());
        coffeeMaker.addWater();
    }

# [«««](https://github.com/MedetHasanUgurlu/Design-Patterns)



