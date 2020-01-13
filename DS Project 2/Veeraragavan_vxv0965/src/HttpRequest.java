// Name : Vijai Veeraragavan
// UTA ID: 1001670965
// NetID: vxv0965

//References:-
// 1.https://www.geeksforgeeks.org/multi-threaded-chat-application-set-1/
// 2.https://www.geeksforgeeks.org/multi-threaded-chat-application-set-2/
// 3.https://www.geeksforgeeks.org/java-util-timer-class-java/
// 4.Tanenbaum and van Steen, Chapter 6

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vijai.V
 */
public class HttpRequest {
    public String parseRequest(String s,String user){
        String t;
                          t="(\"At server: From Client "+user+" \nPOST /path/script.cgi HTTP/1.0\\r\\n\" + \n" +"Message: "+s+
"            		\"\\r\\n\" + \n" +
"            		\"User-Agent: HTTPTool/1.0\\r\\n\" + \n" +
"            		\"Content-Type: application/x-www-form-urlencoded\\r\\n\" + \n" +
"            		\"Content-Length: 32\\r\\n\" + \n" +
"            		\"\\r\\n\" + \n" +
"            		\"home=home\");";
                          return t;
    }
   
}
