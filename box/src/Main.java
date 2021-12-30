public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,120,100, 30);
        Fighter f2 = new Fighter("B",40,60,85,10);

        Match match = new Match(f1,f2, 50,120);
        match.run();
    }
}
