package Object;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Object someValue = new House();
/*        House house = new House();
        house.setCost(1000_000);
        house.setColor("White");

        house.setDog(new Dog());
        house.getDog().setName("Stas");
        House house2 = new House();
        house2.setCost(500);
        house2.setColor("Black");
        System.out.println(house.getDog().getName());
        // getClass позволяет получить метаданные вашего класса(которого вы применяете)
        Class metaInfo = house.getClass();
        Class[] interfaces = metaInfo.getInterfaces();
        for (Class classInterface : interfaces) {
            System.out.println(classInterface.getName());
        }*/
        // рефлексия (выше)

        Person person = new Person();
        person.setName("Stas");
     //   Person personClone = (Person) person.clone();
        person.setMan(new Man());
        person.getMan().setName("Vasya");
        person.setCat(new Cat());

        System.out.println(person);
        System.out.println(person.getMan());
        System.out.println(person.hashCode());

        // equals по умолчанию сравнивает ссылки объектов(не по полям!!)
        // есть стек и куча( stack and heap) в стеке - ссылки, в куче объекты
        // переопределенный equals сравнивает значения полей объекта
        // просто знак "=" сравнивает ссылки
        // equals and hashcode есть контракт
        // Для коллекций(могут давать сбой)
    }
}