
public class RoboAdapter implements Spieler {
    Robot roboter;
    
    public RoboAdapter(Robot roboter){
        this.roboter = roboter;
    }
    
    public int geheNachLinks(int a) {
        roboter.rolleNach(roboter.getX()-a, roboter.getY());
        return (int)roboter.getX();
    }
    
    public int geheNachRechts(int a) {
        roboter.rolleNach(roboter.getX()+a, roboter.getY());
        return (int)roboter.getX();
    }
    
    public int geheNachOben(int a) {
        roboter.rolleNach(roboter.getX(), roboter.getY()+a);
        return (int)roboter.getY();
    }
    
    public int geheNachUnten(int a) {
        roboter.rolleNach(roboter.getX(), roboter.getY()-a);
        return (int)roboter.getY();
    }
}
