import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String dough;
    private String sous;
    private String topping;
    private String name;

    public Pizza(String dough, String sous, String topping, String name) {
        this.dough = dough;
        this.sous = sous;
        this.topping = topping;
        this.name = name;
    }

    public Pizza(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza : " +name +
                " , dough = " + dough + ' ' +
                ", sous =" + sous + ' ' +
                ", topping = " + topping ;
    }
}

interface PizzaBuilder {
    Pizza getPizza();

    void buildSouce();

    void buildTopping();

    void buildDought();

}

class MargheritaPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public MargheritaPizzaBuilder() {
        this.pizza = new Pizza("Margherita");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    @Override
    public void buildSouce() {
        this.pizza.setSous(" tomatniy");
    }

    @Override
    public void buildTopping() {
        this.pizza.setTopping(" sir i kolbasa");
    }

    @Override
    public void buildDought() {
        this.pizza.setDough(" sredneye");
    }
}

class HawaianPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaianPizzaBuilder() {
        this.pizza = new Pizza("Hawaian");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    @Override
    public void buildSouce() {
        this.pizza.setSous(" bez sousa");
    }

    @Override
    public void buildTopping() {
        this.pizza.setTopping(" ananas i vetcina ");
    }

    @Override
    public void buildDought() {
        this.pizza.setDough(" tonkoe ");
    }
}


class Director {
   private List<PizzaBuilder> pizzaBuilders;
    public Director(List<PizzaBuilder> pizzaBuilders) {
        this.pizzaBuilders = pizzaBuilders;
    }
    public List<Pizza> getPizza() {
        return getPizzaDifferent();
    }
    private List<Pizza> getPizzaDifferent() {
        List<Pizza> list = new ArrayList<>();
        for (int i = 0; i < pizzaBuilders.size(); i++) {
            pizzaBuilders.get(i).buildTopping();
            pizzaBuilders.get(i).buildSouce();
            pizzaBuilders.get(i).buildDought();
            Pizza pizza = pizzaBuilders.get(i).getPizza();
            list.add(pizza);
        }
        return list;
    }

}

public class Main {
    public static void main(String[] args) {

        List<PizzaBuilder> list = new ArrayList<>();
        list.addAll(
                List.of(
                        new HawaianPizzaBuilder(),
                        new MargheritaPizzaBuilder() )
        );

        Director director = new Director(list);
        List<Pizza> pizza = director.getPizza();

        for (int i = 0; i < pizza.size(); i++) {
            System.out.println(pizza.get(i));
        }
    }
}