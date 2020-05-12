package day2session2.ChainOfResponsibility;

public class ProjectManeger implements ILeaveRequestHandler {

	private ILeaveRequestHandler netHandler = new HR();

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int days = leaveRequest.LeaveDays;
		if( days<=5)
		{
			System.out.println(leaveRequest.EmployeeName +" approved by Project Manager");
		}
		else
		{
			netHandler.handleRequest(leaveRequest);
		}
		
	}



}
