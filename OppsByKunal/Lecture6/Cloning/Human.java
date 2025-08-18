public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    Human(String name, int age){
        this.name = name;
        this.age =  age;
        this.arr = new int[]{1,2,3,4,5};
    }

    Human(Human other){
        this.name = other.name;
        this.age = other.age;
    }
     
    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }



    @Override   // for deep cloning
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone(); // this is actually shallow copy

        twin.arr = new int[twin.arr.length];
        for(int i=0; i<twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
