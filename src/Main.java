public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var friend = 19;
        var frog = 3.5;
        var boxerOne = 78.8;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        var weightDiff = boxerTwo - boxerOne;

        System.out.println("friend " + friend);
        System.out.println("frog " + frog);
        System.out.println("Общая масса боксеров равна кг " + totalWeight);
        System.out.println("Разница между боксерами равна кг " + weightDiff);

        frog = frog * 10;
        friend = friend + 2;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("friend " + friend);
        System.out.println("frog " + frog);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        friend = friend / 7;
        frog = frog / 3.5;

        System.out.println("frog " + frog);
        System.out.println("friend " + friend);
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        frog = frog + 4;
        System.out.println("frog " + frog);
    }
}