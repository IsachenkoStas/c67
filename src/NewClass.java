public class NewClass {
        // 1. Состояние - (характеристики, что-то описывающее) цвет, вес, порода
        String color;
        String breed;
        int age;
        int weight;
        String name;
        // 2. Поведение - (что он умеет) мяукать, бегать

        // КОНСТРУКТОР ПО УМОЛЧАНИЮ
/*        public NewClass() {
                System.out.println("We create object");*/
        //}

// CODE - GENERATE - CONSTRUCTOR
        public NewClass(String color, String breed, int age, int weight, String name) {
                this.color = color;
                this.breed = breed;
                this.age = age;
                this.weight = weight;
                this.name = name;
        }

        // Поведение (метод) (что он умеет) мяукать, бегать

        // имя(параметры) {
        // тело метода
        // }
        void makeVoice(){
                System.out.println("Meow meow!!!");
        }
        int giveMeAgePlusOneYear(){
                return age++;
        }
        void printAgePlusOneYear(){
                System.out.println(age++);
        }
}
