package com.test.app; // {{ groupId}}.app// import the rest service you created!
import com.test.rest.MoodService;
import com.test.rest.PersonalityService;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public class HelloApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public HelloApplication() {
        singletons.add(new PersonalityService());
        singletons.add(new MoodService());
    }    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
//Calling the service
/*
String uri =
    "http://localhost:8080/CustomerService/rest/customers/1";
URL url = new URL(uri);
HttpURLConnection connection =
    (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");
connection.setRequestProperty("Accept", "application/xml");

JAXBContext jc = JAXBContext.newInstance(Customer.class);
InputStream xml = connection.getInputStream();
Customer customer =
    (Customer) jc.createUnmarshaller().unmarshal(xml);

connection.disconnect();
 */