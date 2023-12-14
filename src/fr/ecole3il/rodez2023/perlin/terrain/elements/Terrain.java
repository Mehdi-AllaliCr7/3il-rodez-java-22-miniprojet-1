package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class Terrain {
	
	
	private double altitude, hydrometrie, temperature;
	
	
	public Terrain(double altitude, double hydrometrie, double temperature) {
		
		 this.altitude = altitude;
		 this.hydrometrie = hydrometrie;
		 this.temperature = temperature;
	
	}
	
	public double getAltitude() {
		return altitude;
		
	}
	
	public double getTemperarure() {
		return temperature;
		
	}
	
	public double getHydrometrie() {
		return hydrometrie;
		
	}
	
	
	
	
}
