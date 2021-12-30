public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health,int weight,double dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge/100;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " damage" );

        if(foe.isDodge()) {
            System.out.println( foe.name + " damage dodged" );
            return foe.health;
        }

        return Math.max((foe.health - this.damage), 0);
    }

    boolean isDodge(){
        return (Math.random()<=this.dodge);
    }
}
