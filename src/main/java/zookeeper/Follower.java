package zookeeper;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Follower extends UnicastRemoteObject implements IFollower {
    protected Follower() throws RemoteException {
        super();
    }

    @Override
    public void receiveUpdate(String proposal) throws RemoteException {
        // 实现逻辑
    }

    // 其他方法的实现
}
