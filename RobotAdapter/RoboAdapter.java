
public class RoboAdapter implements Spieler {
    Robot roboter;
    
    RoboAdapter(Robot roboter){
        this.roboter = roboter;
    }
    
    public int geheNachLinks(int a) {
        roboter.rolleNach(roboter.getX()-a, roboter.getY());
        return (int)roboter.getX()-a;
    }
    
    public int geheNachRechts(int a) {
        roboter.rolleNach(roboter.getX()+a, roboter.getY());
        return (int)roboter.getX()+a;
    }
    
    public int geheNachOben(int a) {
        roboter.rolleNach(roboter.getX(), roboter.getY()+a);
        return (int)roboter.getY()+a;
    }
    
    public int geheNachUnten(int a) {
        roboter.rolleNach(roboter.getX(), roboter.getY()-a);
        return (int)roboter.getY()-a;
    }
}
