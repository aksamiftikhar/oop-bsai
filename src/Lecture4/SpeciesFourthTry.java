package Lecture4;

public class SpeciesFourthTry implements Cloneable{
    public String name;
    public int population;
    public double growthRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public void setSpecies(String newName, int newPopulation,
                           double newGrowthRate)
    {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else
        {
            System.out.println(
                    "ERROR: using a negative population.");
            System.exit(0);
        }
        growthRate = newGrowthRate;
    }
    public boolean equals(SpeciesFourthTry otherObject)
    {
        if ((name.equals(otherObject.name)) &&
                (population == otherObject.population) &&
                (growthRate == otherObject.growthRate))
            return true;
        else
            return false;
    }

    public void writeOutput()
    {
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        SpeciesFourthTry klingonSpecies = new SpeciesFourthTry();
        SpeciesFourthTry earthSpecies = new SpeciesFourthTry();
        int n = 42;
        int m = n;
        System.out.println(m + ", " + n);

        klingonSpecies.setSpecies("Klingon ox", 10, 15);
        earthSpecies.setSpecies("Black rhino", 11, 2);

        earthSpecies = klingonSpecies;

        earthSpecies.setSpecies("Elephant", 100, 12);
        System.out.println("earthSpecies:");
        earthSpecies.writeOutput();
        System.out.println("klingonSpecies:");
        klingonSpecies.writeOutput();

        SpeciesFourthTry obj3 = new SpeciesFourthTry();
        obj3.setSpecies("ABC", 123, 456);
//        System.out.println(obj3);
//
//        SpeciesFourthTry obj5 = obj3;
//        obj5.setGrowthRate(1000);
//        if(obj3==obj5)
//            System.out.println("equal");
//        else
//            System.out.println("unequal");




        SpeciesFourthTry obj4 = new SpeciesFourthTry();

        obj4.setSpecies("abc", 123, 456);

        if(obj3.equals(obj4))
            System.out.println("equal");
        else
            System.out.println("unequal");

        if(obj3==obj4)
            System.out.println("equal");
        else
            System.out.println("unequal");

    }
}
