package de.unistuttgart.iste.sqa.pse.sheet11.presence.tournamenttracker;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides a Tournament Server with the functionality to create sports tournaments.
 *
 * @author andrevanhoorn
 *
 */
public class TTServer {
	private static final TTServer instance = new TTServer();

	private final Map<String, Tournament> tournaments = new HashMap<String, Tournament>();

	/**
	 * Private constructor to prevent instantiation.
	 */
	private TTServer() {}

	/**
	 * Creates and registers a new tournament with the given name.
	 *
	 * @param name name of the tournament
	 * @return the new tournament
	 */
	public Tournament createTournament(String name) {
		Tournament newTournament = null;
		if (this.tournaments.containsKey(name)) {
			throw new IllegalArgumentException("Tournament with the name exists");
		} else {
			newTournament = new Tournament(name);
			this.tournaments.put(name, newTournament);
		}
		return newTournament;
	}

	/**
	 * Returns the singleton instance of the Tournament Server.
	 *
	 * @return the singleton instance of the Tournament Server.
	 */
	public static TTServer getInstance() {
		return TTServer.instance;
	}
}
