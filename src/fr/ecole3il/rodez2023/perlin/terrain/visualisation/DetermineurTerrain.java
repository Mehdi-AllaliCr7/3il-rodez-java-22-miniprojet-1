package fr.ecole3il.rodez2023.perlin.terrain.visualisation;


import fr.ecole3il.rodez2023.perlin.terrain.elements.typeTerrain;

public interface DetermineurTerrain {

	public typeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature);


}
