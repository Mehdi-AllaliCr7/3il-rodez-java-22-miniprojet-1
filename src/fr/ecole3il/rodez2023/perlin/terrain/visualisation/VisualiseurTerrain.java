package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public class VisualiseurTerrain {
	private DetermineurTerrain terrain;
	private Carte uneCarte;
	

	public VisualiseurTerrain(DetermineurTerrain terrain, Carte uneCarte) {
		
		this.terrain = terrain;
		this.uneCarte = uneCarte;
		
	}
	
	public TypeTerrain getTypeTerrain(int x, int y) {
		return uneCarte.getTerrain(x, y).getTypeTerrain(terrain);
	}
	
	public HydrometrieAffichee getHydrometrieAffichee(int x, int y) {
		double hydrometrie = uneCarte.getTerrain(x, y).getHydrometrie();
		if(hydrometrie < 0.33) {
			return HydrometrieAffichee.SEC;
		}
		else if (hydrometrie < 0.66) {
			return HydrometrieAffichee.MOYEN;
		}
		return HydrometrieAffichee.HUMIDE;	
	}
	
	public AltitudeAffichee getAltitudeAffichee(int x, int y) {
		double altitude = uneCarte.getTerrain(x, y).getAltitude();
		if(altitude < 0) {
			return AltitudeAffichee.FOND_MARIN;
		}
		else if(altitude < 0.33) {
			return AltitudeAffichee.BASSE;
		}
		else if (altitude < 0.66) {
			return AltitudeAffichee.MOYENNE;
		}
		return AltitudeAffichee.ELEVEE;	
	}
	
	public TemperatureAffichee getTemperatureAffichee(int x, int y) {
		double temperature = uneCarte.getTerrain(x, y).getTemperature();
		if(temperature < 0.33) {
			return TemperatureAffichee.FROID;
		}
		else if (temperature < 0.66) {
			return TemperatureAffichee.TEMPERE;
		}
		return TemperatureAffichee.CHAUD;	
	}
}
