package InnerClassTest;
/*
* 成员内部类
*
* */


public class Supermarket {

    private String name;

    private Supermarket(String name){
        this.name = name;
    }

    private Shelf getShelfInstance(int code){
        return new Shelf(code);
    }

    private void displayOut(){
        System.out.print("超市名 : "+ name);
    }

    /*3 .成员内部类中不能存在任何static的变量和方法*/
    private class Shelf{

        private int code;

        private Shelf(int code){
            this.code = code;
        }

        private int getCode() {
            return code;
        }

        private void setCode(int code) {
            this.code = code;
        }

        private void display(){
            /* 1 .成员内部类也是最普通的内部类，它是外围类的一个成员，所以他是可以无限制的访问外围类的所有 成员属性和方法,尽管是private的*/
            displayOut();
            System.out.print(" | 货架号 : " + code);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        /*4 .成员内部类是依附于外围类的，所以只有先创建了外围类才能够创建内部类。*/
        Supermarket supermarket = new Supermarket("苏果超市");
        Supermarket.Shelf shelf1 = supermarket.getShelfInstance(1);
        Supermarket.Shelf shelf2 = supermarket.getShelfInstance(2);

        /*2 .但是外围类要访问内部类的成员属性和方法则需要通过内部类实例来访问。*/
        shelf1.display();
        System.out.println("-----------------------------------------------");
        shelf2.display();


    }

}