import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;


public class Main {
	static String userToken = "CAAC202USZCEsBAJAZBHfmQTiJRrUBaQmQUVnK4E7hHPzFOpZA9bxtIHQUUvOZAAMQZB5KFjllMwzSFFRoUIt4AXiuNQPnWzAdZAnxzdgYccDVAfHCs1wm0PMbYxVOaOGAsV7Mg2xgwN6UEQGSZA3Lb55dSZB8ZARj0FcwTsAFTjZAvesYlyuNPU2kA90GfaqBRHy8ZD";
	
	public static void main(String[] args) throws Exception {
        FacebookClient facebookClient = new DefaultFacebookClient("CAACEdEose0cBALfkU7ShCXQALhXiNFLqnqtXgnZC5mu9fZCau3DqFWtNDtL7jrixV3v1g3Iw4jBXHxumC7z4D19pzSF0M7UaJwFSy4MGzXtQef41vCcuI0CeCgfgSojiOpcbQemFSLsNdawAI0Q9bj61ub9bpj2dWAhSPK2koZAA2sXfcnMqSDmUpqpZAZBoZD");
    String response = Utils.post("https://graph.facebook.com/oauth/authorize?client_id=" +userToken + " & redirect_uri=http://www.facebook.com/connect/login_success.html& scope=publish_stream,create_event", new LinkedHashMap<String, String> () );
    System.out.println(response);
	}
	
	 
}
