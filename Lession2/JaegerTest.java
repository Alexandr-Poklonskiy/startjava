public class JaegerTest {
    public static void main(String[] args) {
        Jaeger atlas = new Jaeger();
        Jaeger gipsy = new Jaeger();
        atlas.setModelName("Atlas Destroyer");
        atlas.setMark("Mark-3");
        atlas.setHeight(86.5f);
        atlas.setWeight(2.8f);
        atlas.setStrength(9);
        atlas.setArmor(10);
        atlas.setSpeed(5);
        atlas.setEnergy(100);
        gipsy.setModelName("Gipsy Danger");
        gipsy.setMark("Mark-3");
        gipsy.setHeight(79.25f);
        gipsy.setWeight(1.98f);
        gipsy.setStrength(8);
        gipsy.setArmor(6);
        gipsy.setSpeed(7);
        gipsy.setEnergy(100);

        atlas.showName();
        atlas.move();
        atlas.scanKaiju();
        atlas.attack();
        gipsy.showName();
        gipsy.takeDamage();
        gipsy.activShield();
        gipsy.boost();
        gipsy.showStat();
        System.out.println("Kaiju in a fury");
        atlas.setArmor(2);
        System.out.println(atlas.getModelName() + ". Armor: " + atlas.getArmor());
    }
}