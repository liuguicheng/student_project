package states;

public class BlackVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager votemanager) {
		// TODO Auto-generated method stub
		System.out.println("进入黑名单，将禁止登陆本系统");
	}

}
