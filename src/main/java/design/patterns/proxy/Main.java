package design.patterns.proxy;

public class Main {

    public static void main(String[] args) {
        ConnectionInterface connector = new ConnectorProxy();
        connector.connect();
        connector.connect();

    }
}
