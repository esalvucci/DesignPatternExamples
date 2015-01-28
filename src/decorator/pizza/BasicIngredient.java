package decorator.pizza;

/**
 * 
 * @author Mirko Viroli ({@link https://bitbucket.org/mviroli/oop2013-esercizi-esame/src/4c7b7fcdf9b41bd533fd463a2706095692f22db2/esami2013/appello04/sol2/?at=default})
 *
 */
public class BasicIngredient extends IngredientDecorator {
	
	private final String name;
	private final int cost;
	
	public BasicIngredient(String name, int cost,Pizza p){
		super(p);
		this.name = name;
		this.cost = cost;
	}
	
	public int getCost(){
		return super.getCost() + this.cost;
	}
	
	public String getIngredients(){
		return super.getIngredients() + ", " + this.name;
	}
	
}
