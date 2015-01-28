package decorator.pizza;

/*
 * This is the basic Pizza of all
 */

/**
 * 
 * @author Mirko Viroli ({@link https://bitbucket.org/mviroli/oop2013-esercizi-esame/src/4c7b7fcdf9b41bd533fd463a2706095692f22db2/esami2013/appello04/sol2/?at=default})
 *
 */

public class Margherita implements Pizza {
	
	public int getCost(){
		return 650;
	}
	
	public String getIngredients(){
		return "Pomodoro, Mozzarella";
	}
	
}
