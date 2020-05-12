package day2session2.ChainOfResponsibility;

public class Supervisor implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler = new ProjectManeger();

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int days = leaveRequest.LeaveDays;
		if( days<=3)
		{
			System.out.println(leaveRequest.EmployeeName +" approved by Supervisor");
		}
		else
		{
			nextHandler.handleRequest(leaveRequest);
		}
	}


}
