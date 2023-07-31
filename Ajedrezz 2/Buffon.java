import java.util.List;
import java.util.ArrayList;
/**

 */
public class Buffon extends Piezas
{
    Buffon(int cd) {
        super(cd);  
        if (this.cd == 1) setImage("BuffonN.png");
        else setImage("BuffonB.png");
    }
  
    public List<Posiciones> getLegalPositions(){
        List<Posiciones> list = new ArrayList<Posiciones>();
        if (!isOwnPieceAtOffset(0,2) && isOnBoardDelta(0,2)) {
            list.add(new Posiciones(getX()+0, getY()+2)); 
        }
        if (!isOwnPieceAtOffset(0,-2) && isOnBoardDelta(0,-2)) {
            list.add(new Posiciones(getX()+0, getY()-2)); 
        }
        if (!isOwnPieceAtOffset(0,2) && isOnBoardDelta(0,2)) {
            list.add(new Posiciones(getX()-0, getY()+2)); 
        }
        if (!isOwnPieceAtOffset(-0,-2) && isOnBoardDelta(-0,-2)) {
            list.add(new Posiciones(getX()-0, getY()-2)); 
        }
        if (!isOwnPieceAtOffset(-2,0) && isOnBoardDelta(-2,0)) {
            list.add(new Posiciones(getX()-2, getY()+0)); 
        }
        if (!isOwnPieceAtOffset(-2,-0) && isOnBoardDelta(-2,-0)) {
            list.add(new Posiciones(getX()-2, getY()-0)); 
        }
        if (!isOwnPieceAtOffset(2,0) && isOnBoardDelta(2,0)) {
            list.add(new Posiciones(getX()+2, getY()+0)); 
        }
        if (!isOwnPieceAtOffset(2,-0) && isOnBoardDelta(2,-0)) {
            list.add(new Posiciones(getX()+2, getY()-0)); 
        }
        return list;
    } 
}
