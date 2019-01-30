package InnerClassTest;

/*匿名内部类*/


public class Zoo {

    public Animal getAnimal(String myname){
        /*这个内部类是没有名字的*/
        return new Animal(myname) {
            @Override
            public void livingHouse() {
                System.out.println(getName() + "来了");
            }
        };
    }

    public Manager getManager(String manager){
        return new Manager() {

            String nameOfManager = manager;

            @Override
            public void manage() {
                System.out.println(nameOfManager + "是管理者");
            }
        };
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal elephent = zoo.getAnimal("大象");
        elephent.livingHouse();

        Manager manager = zoo.getManager("我");
        manager.manage();
    }


}

abstract class Animal{
    private String name;

    Animal(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void livingHouse();
}

interface Manager{
    void manage();
}