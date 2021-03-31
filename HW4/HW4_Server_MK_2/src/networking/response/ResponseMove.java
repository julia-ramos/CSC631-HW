package networking.response;

// Other Imports
import metadata.Constants;
import model.Player;
import utility.GamePacket;
import utility.Log;
/**
 * The ResponseLogin class contains information about the authentication
 * process.
 */
public class ResponseMove extends GameResponse {
    private Player player;
    private int x;
    private int y;
    private int index;

    public ResponseMove() {
        responseCode = Constants.SMSG_MOVE;
    }

    @Override
    public byte[] constructResponseInBytes() {
        GamePacket packet = new GamePacket(responseCode);
        packet.addInt32(player.getID());
        packet.addInt32(x);
        packet.addInt32(y);

        //Log.printf("Player with id %d to (%d, %d)", player.getID(), x, y);
 
        return packet.getBytes();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setData(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("Player: " + player + "(x: " + x + " , y: " + y + ")");
    }
}