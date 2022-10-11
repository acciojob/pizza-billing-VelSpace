package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    
    private int Extra_Cheese_price;
    private int Extra_Toppings_price;
    private int Paperbag_price;
    
    private boolean isChesseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
    	
    	this.isChesseAdded = false;
    	this.isToppingsAdded = false;
    	this.isPaperBagAdded = false;
    	this.Extra_Cheese_price = 80;
    	this.Paperbag_price = 20;
        this.isVeg = isVeg;
        if(this.isVeg){
        	this.price = 300;
        	this.Extra_Toppings_price = 70;
        }else {
        	this.price = 400;
        	this.Extra_Toppings_price = 120;
        }
        bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
    	if(!this.isChesseAdded) {
    		this.price += this.Extra_Cheese_price;
        	this.isChesseAdded = true;
    	}
    	
    }

    public void addExtraToppings(){
    	if(!this.isToppingsAdded) {
    		this.price += this.Extra_Toppings_price;
        	this.isToppingsAdded = true;
    	}
    }

    public void addTakeaway(){
    	if(!this.isPaperBagAdded) {
    		this.price += this.Paperbag_price;
        	this.isPaperBagAdded = true;
    	}
    }

    public String getBill(){
    	if(!this.isBillGenerated) {
    		this.isBillGenerated = true;
    		
    		if(this.isChesseAdded) {
    			this.bill = this.bill + "Extra Cheese Added: "+this.Extra_Cheese_price+"\n";
    		}
    		if(this.isToppingsAdded) {
    			this.bill = this.bill + "Extra Toppings Added: "+this.Extra_Toppings_price+"\n";
    		}
    		if(this.isPaperBagAdded) {
    			this.bill = this.bill + "Paperbag Added: "+this.Paperbag_price+"\n";
    		}
    		this.bill = this.bill + "Total Price: "+this.price+"\n";
    	}
        return bill;
    }
}
