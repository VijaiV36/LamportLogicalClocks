 
*************************************  Name- Vijai Veeraragavan  ************************************************

*************************************  Net ID- vxv0965           ************************************************

*************************************  UTA ID- 1001670965        ************************************************

Instruction to Run the code:

1) Code was done in NetBeans IDE, with JDK 1.8.0.

2) Run the Server.java form.(using Shift-F6)

5) Check the TextArea in the Server Window,minimize the empty window.

6) Run the Client.java form.(using Shift-F6) 

7) A frame containing the Client operations is opened, enter the username on the TextField and select the "Add Client", to register the client on the server side. 

8) Run the Client.java form for another 2 times.(using the same steps as above and register the Client's username).

9) Check the Server's TextArea to see whether the clients have successfully registered or not. The Client's socket details are displayed.

10) Click the "Send Random Number to Server" button, to generate the random number to initialize the Clock present in the TextField.

11) Every 2 to 10 seconds, each client will randomly another client send a message consisting of its present local time along with its ID.

12) The Receiver's local time is compared with the sender's local time , if Receiver's local time is less, then it print "Adjustment Necessary" on the TextArea, adjust
the time in the clock present on the receiver, according to Lamport's logical clocks.

13) If there is no adjustment necessary, then "No Adjustment Necessary" is printed on the TextArea.

14) The Timer continues to run forever, until that particular client process is killed.

15) If the client wants to logout , then selecting logout will kill the process and disconnect the client from the server. 

16) Finally close the server form using the STOP Server button present in the Server Window. 

References :-

1.https://www.geeksforgeeks.org/multi-threaded-chat-application-set-1/

2.https://www.geeksforgeeks.org/multi-threaded-chat-application-set-2/

3.https://www.geeksforgeeks.org/java-util-timer-class-java/

4.Tanenbaum and van Steen, Chapter 6