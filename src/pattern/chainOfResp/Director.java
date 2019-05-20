package pattern.chainOfResp;

public class Director extends Leader {
    public Director(String name, Leader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 3) {
            System.out.println("主任审批：员工"+leaveRequest.getEmpName()+" 请假成功");

        } else {
            if (this.nextLeader == null) {

                System.out.println("不允许");
            } else {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
