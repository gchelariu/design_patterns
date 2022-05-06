package design.patterns.proxy;

public class ConnectorProxy implements ConnectionInterface{
    private static ConnectionInterface connector;

    @Override
    public void connect() {
        if(connector == null) {
            connector = new ConnectorImpl();
        }
        connector.connect();
    }
}
