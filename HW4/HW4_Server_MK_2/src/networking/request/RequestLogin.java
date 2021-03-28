package networking.request;

// Java Imports
import java.io.IOException;

// Other Imports
import networking.response.ResponseLogin;
import utility.DataReader;
import database.Database;

import static database.Database.authenticate;

public class RequestLogin extends GameRequest {

    // Data
    private String userID;
    private String password;

    // Responses
    private ResponseLogin responseLogin;

    public RequestLogin() {
        responses.add(responseLogin = new ResponseLogin());
    }

    /**
     * Reads and stores the given userID and password using DataReader
     * @throws IOException
     */
    @Override
    public void parse() throws IOException {
        userID = DataReader.readString(dataInput).trim();
        password = DataReader.readString(dataInput).trim();
    }

    /**
     * Authenticates the given userID and password using Database
     * @throws Exception
     */
    @Override
    public void doBusiness() throws Exception {
        boolean isAuthenticated = authenticate(userID, password);

        if(isAuthenticated) {
            // TODO: Do stuff after successful authentication
        } else {
            // TODO: Do stuff after failed authentication
        }
    }

}
