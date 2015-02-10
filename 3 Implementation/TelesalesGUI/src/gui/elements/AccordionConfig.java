/**
 * 
 */
package gui.elements;

import java.util.LinkedList;

import javafx.scene.control.Accordion;

/**
 * This is extended version of the accordion element that also contains list of the countries already used in the configuration,
 * list of the free countries.
 * @author rasgarbayli
 * @version 1.0
 */
public class AccordionConfig extends Accordion {
	private LinkedList<Countries> freeCountries;
	private LinkedList<Countries> usedCountries;
	/**
	 * 
	 */
	public AccordionConfig() {
		super();
		freeCountries.addLast(Countries.DE);
		freeCountries.addLast(Countries.US);
		freeCountries.addLast(Countries.CA);
		freeCountries.addLast(Countries.UK);
		freeCountries.addLast(Countries.ES);
		freeCountries.addLast(Countries.FR);
		freeCountries.addLast(Countries.IT);
		freeCountries.addLast(Countries.PL);
		freeCountries.addLast(Countries.MX);
	}
	
	public void move(Countries country, LinkedList<Countries> from, LinkedList<Countries> to) {
		if (from.remove(country)) {
			to.add(country);
		}
	}

}
