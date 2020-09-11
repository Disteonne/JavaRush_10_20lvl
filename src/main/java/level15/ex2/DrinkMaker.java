package level15.ex2;

public abstract class DrinkMaker {
   abstract void getRightCup();
   abstract void putIngredient();
   abstract void pour();

   void makeDrink(){
       getRightCup();
       putIngredient();
       pour();
   }
}
