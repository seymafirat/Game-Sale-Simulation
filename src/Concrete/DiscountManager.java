package Concrete;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService{

	@Override
	public void add(Discount discount) {
		System.out.println("Discount is added: " +discount.getDiscountName());
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println("Discount deleted: " +discount.getDiscountName());
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println("Discount updated: " +discount.getDiscountName());
		
	}

}
