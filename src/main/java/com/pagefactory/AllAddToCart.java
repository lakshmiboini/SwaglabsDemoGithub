package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllAddToCart {

	@FindBy(css = ".inventory_container .inventory_list .inventory_item_description .btn.btn_primary.btn_small.btn_inventory ")
	public List<WebElement> All_Add_To_cart;

	public void AllAddToCartElements() {
    if(All_Add_To_cart.contains("Add to cart")) {
    	
    }
		
		
		
	}
}
