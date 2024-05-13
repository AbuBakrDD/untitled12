public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Abu";
        person1.age = 27;

        Person person2 = new Person();
        person2.name = "Bakr";
        person2.age = 29;
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: "+year1+"лет");
        System.out.println("Второму человеку до пенсии: "+year2+"лет");
    }
}
class Person {
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak() {
        for(int i= 0; i<3; i++){
        System.out.println("Меня зовут " +name +", мне "+age+ "лет");}

    }
    void sayHello(){
        System.out.println("Привет!");
    }
}