package zookeeper;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IFollower extends Remote {
    void receiveUpdate(String proposal) throws RemoteException;
    // 其他必要的方法
}
