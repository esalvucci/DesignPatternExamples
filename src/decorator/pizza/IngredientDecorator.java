package decorator.pizza;

/**
 * 
 * @author Mirko Viroli ({@link https://bitbucket.org/mviroli/oop2013-esercizi-esame/src/4c7b7fcdf9b41bd533fd463a2706095692f22db2/esami2013/appello04/sol2/?at=default})
 *
 */

public abstract class IngredientDecorator implements Pizza {
	
	protected final Pizza decorated;
	
	protected IngredientDecorator(Pizza decorated){
		this.decorated = decorated;
	}
	
	public int getCost(){
		return this.decorated.getCost();
	}
	
	public String getIngredients(){
		return this.decorated.getIngredients();
	}
	
}
