package anonymous_class_Cookable_5;

public class Food {
    public void prepare(Cookable c, String str){
        c.cook(str);
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(Cookable.cookable,"Торт");
    }
}
