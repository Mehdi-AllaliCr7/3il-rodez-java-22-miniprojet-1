package fr.ecole3il.rodez2023.perlin.terrain.generation;


import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurPerlin extends GenerateurCarte{
	
	private BruitPerlin2D hydrometrie;
	private BruitPerlin2D temperature;
	private BruitPerlin2D altitude;

	public GenerateurPerlin(long graine) {
		
		super(graine);
		this.hydrometrie=new BruitPerlin2D(graine, 7);
		this.temperature=new BruitPerlin2D(graine*2, 8);
		this.altitude= new BruitPerlin2D(graine*2*2, 9);
	}

	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		
		 double x = (double) i / largeur;
	     double y = (double) j / hauteur;
	     
		double hydrometrie = this.hydrometrie.bruit2D(x, y);
		double temperature = this.temperature.bruit2D(x, y);
		double altitude = this.altitude.bruit2D(x, y);
		
		Terrain leTerrain = new Terrain(altitude, hydrometrie, temperature);
		
		return leTerrain;
	}
	
	
	
	

}
