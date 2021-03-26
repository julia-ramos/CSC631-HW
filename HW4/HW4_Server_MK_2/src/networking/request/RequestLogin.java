package networking.request;

// Java Imports
import java.io.IOException;

// Other Imports
import model.Player;
import networking.response.ResponseName;
import utility.DataReader;
import core.NetworkManager;

public class RequestLogin extends GameRequest {
    // Data
    private String name;

    // Responses
    private ResponseName responseName;

    public RequestLogin() {
        responses.add(responseName = new ResponseName());
    }

    @Override
    public void parse() throws IOException {

    }

    @Override
    public void doBusiness() throws Exception {
    }
}
