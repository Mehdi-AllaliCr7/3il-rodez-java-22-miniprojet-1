package fr.ecole3il.rodez2023.perlin.terrain.carte;

import java.util.Scanner;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.TerrainInnexistantException;

public class Carte {
	private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] terrains;

    
    
    
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
    	this.nom=nom;
    	this.largeur=largeur;
    	this.hauteur=hauteur;
    	this.terrains=generateurCarte.genererCarte(largeur, hauteur);
    	
    }
    
    
    public Carte(String donneesCarte) {
    	try (Scanner scanner = new Scanner(donneesCarte)) {
            
            nom = scanner.nextLine();
            largeur = Integer.parseInt(scanner.nextLine());
            hauteur = Integer.parseInt(scanner.nextLine());

            terrains = new Terrain[largeur][hauteur];

            
            for (int i = 0; i < largeur; i++) {
                for (int j = 0; j < hauteur; j++) {
                    double altitude = scanner.nextDouble();
                    double hydrometrie = scanner.nextDouble();
                    double temperature = scanner.nextDouble();
                    terrains[i][j] = new Terrain(altitude, hydrometrie, temperature);
                }
            }
    	}
    }
    
    // Accesseurs pour le nom de la carte
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Accesseurs pour la largeur
    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    // Accesseurs pour la hauteur
    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    // Accesseur pour un terrain à une position donnee
    public Terrain getTerrain(int x, int y) throws TerrainInnexistantException {
    	try {
        return terrains[x][y];
    	} 
    	catch(Exception e) {
    		throw new TerrainInnexistantException("le terrain est innexistant");
    	}
    }
    
    

    

}
