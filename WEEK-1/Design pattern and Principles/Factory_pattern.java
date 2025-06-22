public class Factory_pattern {
    public static void main(String[] args) {
   foodfactory Factory = new pizzafactory();
   Food food = Factory.createfood();
        System.out.println(food.prepare());
         foodfactory Factory2 = new burgerfactory();
         Food food2 = Factory2.createfood();
        System.out.println(food2.prepare());
    }
}
interface Food
{
    String prepare();
}
class pizza implements Food{
    public String prepare(){
        return "Pizza is preparing";
    }
}
class burger implements Food {
    public String prepare()
    {    return "burger is preparing"; }
}
abstract class foodfactory{
    abstract Food createfood();
}
class pizzafactory extends foodfactory{
    public Food createfood()
    {        return new pizza(); }
}
class burgerfactory extends foodfactory{
    public Food createfood()
    {        return new burger();}
}
