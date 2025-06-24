public class MyGenericClass2 <Thing extends Number, Thing2 extends Number>{

    Thing x;
    Thing2 y;

    MyGenericClass2(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue(){
        return y;
    }
}
