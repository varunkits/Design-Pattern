package day2session2.ChainOfResponsibility;

public interface ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	void handleRequest(LeaveRequest leaveRequest);
}
