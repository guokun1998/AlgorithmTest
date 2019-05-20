package pattern.chainOfResp;

public class GeneralManager extends Leader {
    public GeneralManager(String name, Leader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 20) {
            System.out.println("总经理审批：员工"+leaveRequest.getEmpName()+" 请假成功");

        } else {
            if (this.nextLeader == null) {
                System.out.println("不允许");
            } else {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
