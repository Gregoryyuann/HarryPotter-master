public class level2 extends Level{
    public level2(){
        super("Basilic","You must fight against the Basilic in the dChambre des secrets.");
    }

    public void generateEnemies(){enemies.add(new Enemy("Basilic",100,20,2));}
    public void startLevel(Wizard wizard) {

        System.out.println("Welcome to Level 1: " + name + ", " + description);
        System.out.println("You are facing a " + enemies.get(0).getName() + ".");
        System.out.println(enemies.get(0).getName() + " has " + enemies.get(0).getMaxHealth() + " health.");


    }


}

