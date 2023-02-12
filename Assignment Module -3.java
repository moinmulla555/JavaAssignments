package com.p;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Snacks patis=new Snacks();
		patis.setName("Patis");
		patis.setPrice(50);
		
		Snacks kachori=new Snacks();
		kachori.setName("Kachori");
		kachori.setPrice(30);
		
		List<Snacks>snacklist= new ArrayList();
		snacklist.add(patis);
		snacklist.add(kachori);
		
		
		
	
        Samosa ragada=new Samosa();
        ragada.setName("RagadaSamosa");
        ragada.setPrice(40);
        
        Samosa chutney=new Samosa();
        chutney.setName("ChutneySamosa");
        chutney.setPrice(60);
        
        
        List<Samosa>samosalist= new ArrayList();
        samosalist.add(ragada);
        samosalist.add(chutney);
        
        
        
        System.out.println();
        System.out.println(" "+"Todays Special Menu");
        System.out.println("----------------------");
        
        
        
        System.out.println();
        System.out.println(" "+"Snacks ");
        System.out.println("-------------");
        for(Snacks snacks:snacklist) {
			snacks.display();
			}
        
        
        System.out.println();
        System.out.println(" "+"Samosa ");
        System.out.println("-------------");
        for(Snacks samosa:samosalist) {
			samosa.display();
			}
        
	}

}




class Snacks{
	String name;
	float price;
	
	public void display() {
		System.out.println(" "+name+":" +price);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price=price;
	}
	
}

class Samosa extends Snacks{
	public void display() {
		System.out.println(" "+name+":" +price);
	}
}
