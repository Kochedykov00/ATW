import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dispatcher {

    public void process(String request) throws IOException {

        String[] requestData = request.split("\\?");
        String path = requestData[0];
        Map<String, String> params = getRequestParameters(requestData[1]);
        if ("/friends".equals(path)) {
            new FriendsHandler().service(params);
        }
        else if ("/profile".equals(path)) {
            new ProfileHandler().service(params);
        }

        else if ("/im".equals(path) || "/om".equals(path)) {
            new MessageHandler().service(params,path);
        }
        else if ("/messages".equals(path) || "/om".equals(path)) {
            new MessageHandler().service(params,path);
        }

    }


        public Map<String,String> getRequestParameters(String str){
            Map <String,String> request = new HashMap<>();
            String[] data = str.split("=");//id, 1&showfriends true
            if (data[1].contains("&")) {
                String[] parameters = data[1].split("&");//1 and showfriends
                request.put(data[0], parameters[0]);
                request.put(parameters[1],data[2]);
            } else {
                request.put(data[0], data[1]);
            }
            return request;
        }
}







