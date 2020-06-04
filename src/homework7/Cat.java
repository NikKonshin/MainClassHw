package homework7;

public class Cat {
    private String name;
    int satiety;// сытость
    int hunger;// голод
    int appetite;// аппетит

    public Cat(String name, int satiety, int hunger, int appetite) {
        this.name = name;
        this.satiety = satiety;
        this.hunger = hunger;
        this.appetite = appetite;
    }

    public boolean getSatiety() {
        if(satiety <= hunger) {
            return false;
        }else {
            return true;
        }

    }


    public String getName() {
        return name;
    }

    public void  eat(Plate plate, String name, boolean a){
        if(plate.getFood() < satiety){
            System.out.println("В тарелке маловато еды для " + name + "а он, предпочёл остаться голодным...");
            return;
        } else {
            System.out.println(name + " кушает...");
            plate.decreaseFood(appetite, satiety, name);
        }
    }
}
