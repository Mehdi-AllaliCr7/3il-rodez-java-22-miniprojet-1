package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;

public enum TypeTerrain {
	FORET_CONIFÈRES("coniferous_forest"),
	FORET_FEUILLUS("deciduous_forest"),
	DESERT("desert"),
	COLLINES("hills"),
	MARAIS("marsh"),
	MONTAGNE("mountain"),
	OCEAN("ocean"),
	PLAINE("plain"),
	TOUNDRA("tundra");
	
	//private typeTerrain terrain = CONIFEROUS_FOREST;
	private String nom;
	
	private TypeTerrain(String nom) {
		this.nom=nom;
	}
	
	public BufferedImage getImage() {
		String nomfichier = nom+".png";
		return Utils.chargerTuile(nomfichier);
	
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	
	
	

}
