package de.unistuttgart.iste.sqa.pse.sheet11.presence.tournamenttracker;

public class Main {

	public static void main(final String[] args) {

		TTServer server = TTServer.getInstance();

		Tournament tournament = new Tournament("MiniLänderCup");


		Team team1 = tournament.registerTeam("Deutschland");
		Team team2 = tournament.registerTeam("Niederlande");
		Team team3 = tournament.registerTeam("Spanien");

		Game game1 = tournament.createGame(team1, team2);
		Game game2 = tournament.createGame(team1, team3);
		Game game3 = tournament.createGame(team2, team3);


		game1.storeResult(1, 0);
		game2.storeResult(2, 0);
		game3.storeResult(1, 1);

	}
}
