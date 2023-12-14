package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;

public enum typeTerrain {
	CONIFEROUS_FOREST("Forêt de conifères"),
	DECIDUOUS("Forêt de feuillus"),
	DESERT("Désert"),
	HILLS("Collines"),
	MARSH("Marais"),
	MOUNTAIN("Montagne"),
	OCEAN("Océan"),
	PLAIN("Plaine"),
	TUNDRA("Toundra");
	
	//private typeTerrain terrain = CONIFEROUS_FOREST;
	private String nom;
	
	private typeTerrain(String nom) {
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
