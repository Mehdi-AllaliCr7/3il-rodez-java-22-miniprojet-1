package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;

public enum typeTerrain {
	CONIFEROUS_FOREST("For�t de conif�res"),
	DECIDUOUS("For�t de feuillus"),
	DESERT("D�sert"),
	HILLS("Collines"),
	MARSH("Marais"),
	MOUNTAIN("Montagne"),
	OCEAN("Oc�an"),
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
