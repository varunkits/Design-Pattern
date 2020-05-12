package day2session2.ChainOfResponsibility;

public class Program {

	public static void main(String[] args) {
		
		ILeaveRequestHandler supervisor = new Supervisor();
		
		
		
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Varun");
		leaveRequest.setLeaveDays(1);
		
		supervisor.handleRequest(leaveRequest);

	}

}
