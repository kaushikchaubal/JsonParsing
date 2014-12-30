package secretsauce.food;

import java.util.List;

public class Food {
	private String mainDish;
	private String drinks;
	private List<String> sideDishes;
	private String dessert;
	
	public Food(String mainDish, String drinks, List<String> sideDishes,
			String dessert) {
		this.mainDish = mainDish;
		this.drinks = drinks;
		this.sideDishes = sideDishes;
		this.dessert = dessert;
	}
	
	public Food() {};

	public String getMainDish() {
		return mainDish;
	}

	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}

	public String getDrinks() {
		return drinks;
	}

	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}

	public List<String> getSideDishes() {
		return sideDishes;
	}

	public void setSideDishes(List<String> sideDishes) {
		this.sideDishes = sideDishes;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		return "Food [mainDish=" + mainDish + ", drinks=" + drinks
				+ ", sideDishes=" + sideDishes + ", dessert=" + dessert + "]";
	}
}
