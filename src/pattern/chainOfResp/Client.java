package pattern.chainOfResp;

public class Client {
    public static void main(String[] args) {
        Leader leader = new Director("张三",new Manager("李四",new GeneralManager("王五",null)));

        LeaveRequest leaveRequest1 = new LeaveRequest("gg",2,"111");
        LeaveRequest leaveRequest2 = new LeaveRequest("gg",5,"111");
        LeaveRequest leaveRequest3 = new LeaveRequest("gg",15,"111");
        LeaveRequest leaveRequest4 = new LeaveRequest("gg",38,"111");
        leader.handleRequest(leaveRequest2);
        leader.handleRequest(leaveRequest1);
        leader.handleRequest(leaveRequest3);
        leader.handleRequest(leaveRequest4);



    }
}
