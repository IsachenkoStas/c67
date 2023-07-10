package Collection;

public class GenericMain {
    public static void main(String[] args) {
//        GenericExample<Integer> o1 = new GenericExample<>();
//        GenericExample<Person>  o2 = new GenericExample<>();
        System.out.println(hashSum(new Person(), new Person()));
        System.out.println(hashSum(10, 20, 40));
    }

    static <T> Integer hashSum(T ... objects){
        int summ = 0;
        for (T o : objects){
            summ = summ + o.hashCode();
        }
        return summ;
    }
}
