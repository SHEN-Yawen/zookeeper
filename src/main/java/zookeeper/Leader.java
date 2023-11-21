package zookeeper;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Leader extends UnicastRemoteObject implements ILeader {
    protected Leader() throws RemoteException {
        super();
    }

    @Override
    public void receiveWriteRequest(String modification) throws RemoteException {
        // 实现逻辑
    }

    // 其他方法的实现
}

