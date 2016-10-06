package states.client;

import states.VoteManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoteManager votema=new VoteManager();
		for (int i = 0; i < 11; i++) {
			votema.vote("ÕÅÈý", "A");
		}
	}

}
