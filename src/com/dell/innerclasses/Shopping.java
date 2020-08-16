package com.dell.innerclasses;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
	 Product product = new Product(1,"Bike","Vehicle", 800000);
	
	 
	 class ShowProduct{
		 public void showProductByName() {
			 System.out.println("Product is :"+ product.getName());
		 }
		 public void showProductByCategory() {
			 System.out.println("Product is :"+ product.getName() 
			 + " belongs to category "+ product.getCategory());
		 }
	 }
	 class BuyProduct{
		 public void showProductPrice() {
			 System.out.println("Product is :"+ product.getName()+ 
					 " having price "+ product.getPrice());
		 }
		 public void showProductLastPrice() {
			 System.out.println("Product is :"+ product.getName() 
			 + " having pice after deduction "+ (product.getPrice()-100));
		 }
	 }
}
