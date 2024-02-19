package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class Terrain {
	
	
	private double altitude, hydrometrie, temperature;
	
	
	public Terrain(double altitude, double hydrometrie, double temperature) {
		if ((altitude < -1 || altitude > 1) || 
			(hydrometrie < 0 || hydrometrie > 1) || 
			(temperature < 0 || temperature > 1))
		{
			throw new MauvaiseValeurException();
			
		}
		
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
	
	public typeTerrain getTypeTerrain (DetermineurTerrain determineur){
		return determineur.determinerTerrain(this.altitude, this.hydrometrie, this.temperature);
		
	}
	
}
