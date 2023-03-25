package food;
public class Sandwich {

    private String bread;
    private boolean meat;
    private boolean cheese;
    private boolean veggies;
    private double price;

    public Sandwich(boolean meat, boolean cheese, boolean veggies) {
        bread = "White";

        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;

        if( meat && cheese && veggies){
            price = 7.99;
        } else if( meat && cheese){
            price = 7.59;
        } else if(meat && veggies){
            price = 7.09;
        } else if(meat){
            price = 6.89;
        } else if(cheese && veggies){
            price = 5.99;
        }else if(cheese){
            price = 5.59;
        }else if(veggies){
            price = 5.09;
        }else{
            price = 4.99;
        }


    }//end sandwich
    public Sandwich(String bread,
                    boolean meat,
                    boolean cheese,
                    boolean veggies) {
        this(meat, cheese, veggies);
        this.bread = bread;
    }

    public String getBread(){
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public boolean isMeat() {
        return meat;
    }
    public void setMeat(boolean meat) {
        this.meat = meat;
    }
    public boolean isCheese() {
        return cheese;
    }
    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isVeggies() {
        return veggies;
    }

    public void setVeggies(boolean veggies) {
        this.veggies = veggies;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo(){
        System.out.println("==========================================");
        System.out.println("Sandwich Info");
        System.out.println("==========================================");
        System.out.printf("Bread:\t\t\t %-15s\n", bread);
        System.out.printf("Meat:\t\t\t %-15b \n", meat);
        System.out.printf("Cheese:\t\t\t %-15b \n", cheese);
        System.out.printf("Veggies:\t\t %-15b \n", veggies);
        System.out.printf("Price:\t\t\t $%-15.2f \n", price);
        System.out.println();
    }

}
// end of class
