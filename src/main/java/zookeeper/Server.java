package zookeeper;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            ILeader leader = new Leader();
            IFollower follower = new Follower();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Leader", leader);
            registry.bind("Follower", follower);

            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
