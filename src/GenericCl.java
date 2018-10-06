// 泛型实例
public class GenericCl<T> {
    private T key;

    public GenericCl(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        GenericCl<Integer> genericInteger = new GenericCl<Integer>(123456);

        // 传入的实参类型需与泛型的类型参数类型相同，即为String.
        GenericCl<String> genericString = new GenericCl<String>("key_vlaue");

        System.out.println(genericInteger.getKey());
        System.out.println(genericString.getKey());
        System.out.println("Hello World!");
    }
}