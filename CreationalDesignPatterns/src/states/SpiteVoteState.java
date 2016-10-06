package states;

public class SpiteVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager votemanager) {
		// TODO Auto-generated method stub
		String str=votemanager.getMapVote().get(user);
		if(str!=null){
			votemanager.getMapVote().remove(user);
		}
		System.out.println("恶意投票，取消资格");	
		
	}

}
