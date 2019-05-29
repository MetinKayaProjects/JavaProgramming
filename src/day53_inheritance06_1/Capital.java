package day53_inheritance06_1;

public class Capital extends City {
	
	private long population;
	
	
	public Capital(int id, String name) {
		super(id, name);
	}
	public void  setPopulation(long population) {
		this.population = population;
	}
	
	

}
