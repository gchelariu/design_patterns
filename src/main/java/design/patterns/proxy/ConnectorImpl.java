package design.patterns.proxy;

public class ConnectorImpl implements ConnectionInterface {

    public ConnectorImpl() {
        generateConnexion();
    }

    private void generateConnexion() {
        System.out.println("Generating connexion...");
    }

    @Override
    public void connect() {
        System.out.println("Connection established.");
    }
}
