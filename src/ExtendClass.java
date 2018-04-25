public class ExtendClass {
    String name;
    String address;
    int age;

//  返回值为空
    public void Show() {
        System.out.println(age);
    }
//  返回值为int
    public int getAge() {
        return age;
    }
//  返回值为void
    public void setAge(int age) {
        this.age = age;
    }
//  重载
    public int overFunc(int i) {
        return i;
    }

//  重载方法
//  @Override
    public int overFunc(int i, int j) {
        return j;
    }

    public static void main(String[] args) {
        ExtendClass person = new ExtendClass();
        person.setAge(18);
        person.Show();
    }
}

