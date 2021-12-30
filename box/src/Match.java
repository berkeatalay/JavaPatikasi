public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if(isCheck()){
            whoFirst();
            while (this.f1.health>0 && this.f2.health >0){
                System.out.println("====New Round====");
                f2.health = f1.hit(f2);
                if(isWin()) break;
                f1.health = f2.hit(f1);
                if(isWin()) break;
                System.out.println(this.f1.name + " Health: "+this.f1.health);
                System.out.println(this.f2.name + " Health: "+this.f2.health);
            }
        }else{
            System.out.println("Agirliklar uyusmuyor");
        }
    }

    private void whoFirst() {
        if(Math.random()<=.5) {
            Fighter fTemp = this.f1;
            this.f1=this.f2;
            this.f2=fTemp;
        }
    }

    private boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                &&(this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(f2.name + " kazandi!");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(f1.name + " kazandi!");
            return true;
        }
        return false;
    }
}
