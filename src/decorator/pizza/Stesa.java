package decorator.pizza;

/**
 * 
 * @author Mirko Viroli ({@link https://bitbucket.org/mviroli/oop2013-esercizi-esame/src/4c7b7fcdf9b41bd533fd463a2706095692f22db2/esami2013/appello04/sol2/?at=default})
 *
 */
public class Stesa extends IngredientDecorator {
	
	public Stesa(Pizza p){
		super(p);
	}
	
	public int getCost(){
		return (int)(super.getCost() * 1.1);
	}
	
	public String getIngredients(){
		return "[STESA] "+super.getIngredients();
	}
	
}
