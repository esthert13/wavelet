import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

class Handler implements URLHandler {
    // The one bit of state on the server: a list of strings that will be manipulated by
    // various requests.
    ArrayList<String> listOfStrings = new ArrayList<String>();
    ArrayList<String> results = new ArrayList<String>();
    int[] searched = null; 

    public String handleRequest(URI url) {
        if (url.getPath().equals("/search")) {
             String[] parameters = url.getQuery().split("=");
             if (parameters[0].equals("s")) {
                for (int i = 0; i < listOfStrings.size(); i++) {
                    if (listOfStrings.contains(parameters[1])) {
                        listOfStrings.indexOf(listOfStrings.contains(parameters[1]));
                        searched[i] = listOfStrings.indexOf(listOfStrings.contains(parameters[1]));
                        listOfStrings[searched[i]];
                        //not complete
                        }
                    }
                return String.format(asdf);
                }
             }
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    listOfStrings.add(parameters[1]);
                    return String.format(parameters[1] + " has been added to the list!");
                }
            }
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

