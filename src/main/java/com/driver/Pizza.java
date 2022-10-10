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
        bill = "Base Price Of The Pizza: "+Base_Price_Of_The_Pizza+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
    	this.Extra_Cheese_Added = 1;
    }

    public void addExtraToppings(){
    	if(this.isVeg) {
        	this.Extra_Toppings_Added = 1;
        }else {
        	this.Extra_Toppings_Added = 2;
        }
    }

    public void addTakeaway(){
    	this.Paperbag_Added = 1;
    }

    public String getBill(){
    	if(Extra_Cheese_Added == 1) {
    		Extra_Cheese_Added = 80;
    		bill += "Extra Cheese Added: "+Extra_Cheese_Added+"\n";
    	}
    	if(Extra_Toppings_Added == 1) {
    		Extra_Toppings_Added = 70;
    		bill += "Extra Toppings Added: "+Extra_Toppings_Added+"\n";
    	}
    	if(Extra_Toppings_Added == 2) {
    		Extra_Toppings_Added = 120;
    		bill += "Extra Toppings Added: "+Extra_Toppings_Added+"\n";
    	}
    	if(Paperbag_Added == 1) {
    		Paperbag_Added = 20;
    		bill += "Paperbag Added: "+Paperbag_Added+"\n";
    	}
    	int total = Base_Price_Of_The_Pizza+Extra_Cheese_Added+Extra_Toppings_Added+Paperbag_Added;
        bill += "Total Price: "+total;
        return this.bill;
    }
}
