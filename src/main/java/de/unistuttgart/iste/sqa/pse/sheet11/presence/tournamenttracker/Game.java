/**
 * 
 */
package de.unistuttgart.iste.sqa.pse.sheet11.presence.tournamenttracker;

/**
 * Represents a game between a home team and a visiting team, including the resulting score if set.
 * 
 * @author andrevanhoorn
 *
 */
public class Game {
	private static final int SCORE_NOT_STORED = Integer.MIN_VALUE;

	private final Team homeTeam; 
	private final Team visitingTeam;
	private int scoreHome = SCORE_NOT_STORED;
	private int scoreVisiting = SCORE_NOT_STORED;


	/**
	 * Creates a new team between the given home team and visiting team. 
	 * 
	 * @param homeTeam
	 * @param vistingTeam
	 */
	public Game(Team homeTeam, Team vistingTeam) {
		this.homeTeam = homeTeam;
		this.visitingTeam = vistingTeam;
	}

	/**
	 * Stores the result of this game if not set before. 
	 * 
	 * @param scoreHome
	 * @param scoreVisiting
	 */
	public void storeResult(int scoreHome, int scoreVisiting) {
		if (this.scoreHome != SCORE_NOT_STORED || this.scoreVisiting != SCORE_NOT_STORED) {
			throw new IllegalStateException("Score for this game already stored");
		}
		
		this.scoreHome = scoreHome;
		this.scoreVisiting = scoreVisiting;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result + scoreHome;
		result = prime * result + scoreVisiting;
		result = prime * result + ((visitingTeam == null) ? 0 : visitingTeam.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		if (scoreHome != other.scoreHome)
			return false;
		if (scoreVisiting != other.scoreVisiting)
			return false;
		if (visitingTeam == null) {
			if (other.visitingTeam != null)
				return false;
		} else if (!visitingTeam.equals(other.visitingTeam))
			return false;
		return true;
	}

	public Team getVisitingTeam() {
		return visitingTeam;
	}

	public int getScoreHome() {
		return scoreHome;
	}

	public int getScoreVisiting() {
		return scoreVisiting;
	}
	
	@Override
	public String toString() {
		return "Game [homeTeam=" + homeTeam + ", visitingTeam=" + visitingTeam + ", scoreHome=" + scoreHome
				+ ", scoreVisiting=" + scoreVisiting + "]";
	}

}
