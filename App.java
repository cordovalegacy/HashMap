import java.util.HashMap;
import java.util.Set;
import static java.lang.System.out;

class App {

    public static void main(String[] args){

        out.println("<----Running App---->");

        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("1", "Master of Puppets");
        trackMap.put("2", "Ride the Lightning");
        trackMap.put("3", "Sad But True");
        trackMap.put("4", "One");

        String trackOne = trackMap.get("1");
        out.println(trackOne);

        Set<String> titleList = trackMap.keySet();
            out.println("this is the whole list!: " + titleList);
            for(String key : titleList){
                out.println("this is the key!: " + key);
                out.println("this is the value!: " + trackMap.get(key));
            }

    }

}