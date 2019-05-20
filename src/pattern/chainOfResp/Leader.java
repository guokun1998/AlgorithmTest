package pattern.chainOfResp;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name, Leader nextLeader) {
        this.name = name;
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest leaveRequest);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
}
