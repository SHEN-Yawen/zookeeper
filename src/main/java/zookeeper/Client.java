package zookeeper;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("hostname", 1099);
            ILeader leader = (ILeader) registry.lookup("Leader");

            leader.receiveWriteRequest("Some modification");

            // 其他操作
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
