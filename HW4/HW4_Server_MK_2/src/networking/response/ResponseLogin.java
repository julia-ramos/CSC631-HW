package networking.response;

// Other Imports

import core.GameServer;
import metadata.Constants;
import model.Player;
import utility.GamePacket;

import java.util.List;

/**
 * The ResponseLogin class contains information about the authentication
 * process.
 */
public class ResponseLogin extends GameResponse {

    public ResponseLogin() {
        responseCode = Constants.SMSG_LOGIN;
    }

    // TODO: Implement this function
    @Override
    public byte[] constructResponseInBytes() {
        return null;
    }

}