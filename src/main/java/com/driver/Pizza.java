package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    
    private int Base_Price_Of_The_Pizza = 0;
    private int Extra_Cheese_Added = 0;
    private int Extra_Toppings_Added= 0;
    private int Paperbag_Added= 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg) {
        	this.price = 300;
        }else {
        	this.price = 400;
        }
        this.Base_Price_Of_The_Pizza = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
    	this.Extra_Cheese_Added = 80;
    }

    public void addExtraToppings(){
    	if(this.isVeg) {
        	this.Extra_Toppings_Added = 70;
        }else {
        	this.Extra_Toppings_Added = 120;
        }
    }

    public void addTakeaway(){
    	this.Paperbag_Added = 20;
    }

    public String getBill(){
    	int total = Base_Price_Of_The_Pizza+Extra_Cheese_Added+Extra_Toppings_Added+Paperbag_Added;
        bill = "Base Price Of The Pizza: "+Base_Price_Of_The_Pizza+"\n"+
               "Extra Cheese Added: "+Extra_Cheese_Added+"\n"+
        	   "Extra Toppings Added: "+Extra_Toppings_Added+"\n"+
               "Paperbag Added: "+Paperbag_Added+"\n"+
        	   "Total Price: "+total;
        return this.bill;
    }
}
