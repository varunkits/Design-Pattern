package day3session1.mediator;

import java.util.List;
import java.util.ArrayList;

public class ChatMediator implements IChatMediator{

	List<IUser> users = new ArrayList<IUser>();
	

	@Override
	public void sendMessage(String msg) {
		for(IUser user:users)
		{
			user.ReceiveMessage(msg);
		}
	}


	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

}
