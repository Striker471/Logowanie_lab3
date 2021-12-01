package pakiet.pg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dane {
    private  Map<String,char[]> dane =new HashMap<>();

    public Dane(){
        dane.put("jan",new char[]{'h','a','s','l','o'});
        dane.put("marek",new char[]{'d','z','i','a','l','a'});
        dane.put("andrzej",new char[]{'t','a','k'});
        dane.put("tadeusz",new char[]{'s','a','m','o','c','h','o','d'});
        dane.put("jonasz",new char[]{'m','o','j','z','e','s','z'});

    }
    public boolean porownanie (String login, char[] password){

        if(dane.containsKey(login))
        {
            char [] password_porownanie = dane.get(login);

            return Arrays.equals(password,password_porownanie);
        }
        else
            return false;

    }

}