public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789.0;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес бойцов: " + (boxer1Weight + boxer2Weight) + " кг.");
        System.out.println("Разница между весами бойцов: " + (boxer2Weight - boxer1Weight) + " кг.");
        System.out.println("Разница между весами бойцов(%): " + (boxer2Weight % boxer1Weight) + " кг.");
        var totalHours = 640;
        var oneWorker = 8;
        var totalWorker = totalHours / oneWorker;
        System.out.println("Всего в кампании работают " + totalWorker + " человек");
        totalWorker = totalWorker + 94;
        System.out.println("Если в компании работает " + totalWorker + " человек, то всего " + (totalWorker * oneWorker) + " часов работы может быть поделено между сотрудниками");

    }
}