package states;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager votemanager) {
		// TODO Auto-generated method stub
		votemanager.getMapVote().put(user, voteItem);
		System.out.println("��ϲͶƱ�ɹ�");
		
	}

}
