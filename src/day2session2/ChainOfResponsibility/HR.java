package day2session2.ChainOfResponsibility;

public class HR implements ILeaveRequestHandler {


	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		System.out.println(leaveRequest.EmployeeName +" approved by HR");
	}

}
