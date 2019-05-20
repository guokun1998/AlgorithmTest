package pattern.chainOfResp;

public class Manager extends Leader{
    public Manager(String name, Leader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println("经理审批：员工"+leaveRequest.getEmpName()+" 请假成功");

        } else {
            if (this.nextLeader == null) {

                System.out.println("不允许");
            } else {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
