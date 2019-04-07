package name.lzc.pattern.creational.builder;


/**
 * Description: 建造者模式  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 20:49:50  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class Product {

	private int id;
	private String name;
	private double price;//为了简单，没用BigDecimal
	
	private Product(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.price = builder.price;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public static class Builder{
		private int id;
		private String name;
		private double price;
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder price(double price) {
			this.price = price;
			return this;
		}
		
		public Product build() {
			return new Product(this);
		}
	}
	
}
