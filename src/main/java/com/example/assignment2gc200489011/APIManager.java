package com.example.assignment2gc200489011;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class APIManager
{
    /********************* SINGLETON SECTION *****************************/
    // Step 1. private static instance member variable
    private static APIManager m_instance = null;
    // Step 2. make the default constructor private
    private APIManager() {}
    // Step 3. create a public static entry point / instance method
    public static APIManager Instance()
    {
        // Step 4. Check if the private instance member variable is null
        if(m_instance == null)
        {
            // Step 5. Instantiate a new APIManager instance
            m_instance = new APIManager();
        }
        return m_instance;
    }
    /*********************************************************************/

    public List<Car> getCarFromRapidAPIByMake(String make)
    {
        // Step 1. Construct your URL
        String APIKey = "11f219496dmsh4351fcea3ccde69p1f8256jsnc4455bec46b0";
        make = make.replace(" ", "%20");
        String URL = "https://car-data.p.rapidapi.com/cars?limit=20&page=0&make=" + make + "&rapidapi-key=" + APIKey;

        // Step 2. Create a Client Object
        HttpClient client = HttpClient.newHttpClient();

        // Step 3. Create a Request Object
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(URL)).build();

        try
        {
            // Step 4. Create a Response object
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            // Step 5. Create a Gson object
            Gson gson = new Gson();


            Type listType = new TypeToken<List<Car>>() {}.getType();

            // Step 6. Deserialize the data using the fromJSON method
            List<Car> carList = gson.fromJson(response.body(), listType);
            for (Car car: carList) {
                System.out.println(car.toString());
            }

            return carList;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return null;
    }



    public List<Make> getMakeFromRapidAPI()
    {
        // Step 1. Construct your URL
        String APIKey = "11f219496dmsh4351fcea3ccde69p1f8256jsnc4455bec46b0";
        String URL = "https://car-data.p.rapidapi.com/cars/makes?rapidapi-key=" + APIKey;

        // Step 2. Create a Client Object
        HttpClient client = HttpClient.newHttpClient();

        // Step 3. Create a Request Object
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(URL)).build();

        try
        {
            // Step 4. Create a Response object
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            // Step 5. Create a Gson object
            Gson gson = new Gson();
            System.out.println(response.body());

            Type listType = new TypeToken<List<Make>>() {}.getType();

            // Step 6. Deserialize the data using the fromJSON method
            List<Make> makeList = gson.fromJson(response.body(), listType);
            for (Make make: makeList) {
                System.out.println(make.toString());
            }

            return makeList;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return null;
    }




    public List<Type> getTypeFromRapidAPI()
    {
        // Step 1. Construct your URL
        String APIKey = "11f219496dmsh4351fcea3ccde69p1f8256jsnc4455bec46b0";
        String URL = "https://car-data.p.rapidapi.com/cars/types?rapidapi-key=" + APIKey;

        // Step 2. Create a Client Object
        HttpClient client = HttpClient.newHttpClient();

        // Step 3. Create a Request Object
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(URL)).build();

        try
        {
            // Step 4. Create a Response object
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            // Step 5. Create a Gson object
            Gson gson = new Gson();

            Type listType = new TypeToken<List<Type>>() {}.getType();

            // Step 6. Deserialize the data using the fromJSON method
            List<Type> typeList = gson.fromJson(response.body(), listType);
            for (Type type: typeList) {
                System.out.println(type.toString());
            }

            return typeList;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return null;
    }
}