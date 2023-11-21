package zookeeper;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ILeader extends Remote {
    void receiveWriteRequest(String modification) throws RemoteException;
    // 其他必要的方法
}

