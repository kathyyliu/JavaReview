public class Dog {
    String name;
    int age;
    double weight;
    Dog bestFriend;
    Dog dog;


    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setBestFriend(Dog dog) {
        this.bestFriend = dog;
        dog.bestFriend = this;
    }

    public boolean isBestFriend(Dog dog) {
        if (bestFriend == dog)
            return true;
        else
            return false;
    }

    public String ageGroup() {
        if (age <= 1)
            return "Puppyhood";
        else if (age > 1 && age <= 2)
            return "Adolescence";
        else if (age > 2 && age <= 9 )
            return "Adult";
        else
            return "Senior";
    }

    public void sizeGroup() {
        System.out.print(name + ": ");
        if (weight <= 12)
            System.out.println("Toy Size");
        else if (weight > 12 && weight <= 25)
            System.out.println("Small Size");
        else if (weight > 25 && weight <= 50)
            System.out.println("Medium Size");
        else if (weight > 50 && weight <= 100)
            System.out.println("Large Size");
        else if (weight > 100)
            System.out.println("Extra Large Size");
    }



}
