package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurAleatoire extends GenerateurCarte{

	public GenerateurAleatoire(long graine) {
		super(graine);	
	}

	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		Random rdm = new Random(getGraine());
		
		double hydrometrie = rdm.nextDouble();
		double temperature = rdm.nextDouble();
		double altitude = rdm.nextDouble();
		
		Terrain leTerrain = new Terrain(altitude, hydrometrie, temperature);
		
		return leTerrain;
	}
	
	
	
}
