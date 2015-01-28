package decorator.pizza;

/*
 * A Pizza has a cost expressed in cents of Euros (i.e., 150 means 1 Euro and 50 cents), 
 * and a list of ingredients as a string  
 */

/**
 * 
 * @author Mirko Viroli ({@link https://bitbucket.org/mviroli/oop2013-esercizi-esame/src/4c7b7fcdf9b41bd533fd463a2706095692f22db2/esami2013/appello04/sol2/?at=default})
 *
 */

public interface Pizza {
	
	int getCost();
	
	String getIngredients();
	
}
