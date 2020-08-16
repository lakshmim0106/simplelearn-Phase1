package com.dell.innerclasses;

public class MainProduct {

	public static void main(String[] args) {
		Shopping.ShowProduct showProduct = new Shopping().new ShowProduct();
		showProduct.showProductByName();
		System.out.println("--------------------------------------------");
		showProduct.showProductByCategory();
		
		System.out.println("--------------------------------------------");
		Shopping.BuyProduct buyProduct = new Shopping().new BuyProduct();
		buyProduct.showProductPrice();
		System.out.println("--------------------------------------------");
		buyProduct.showProductLastPrice();
	}

}
