package Behavioral_Design_Pattern.template_method;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
