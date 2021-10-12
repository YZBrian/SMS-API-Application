package com.twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {

    public static final String ACCOUNT_SID = "AC91ca3cefb9fddd4c0d1f80391a91bc34"; // personal Twilio SID.
    public static final String AUTH_TOKEN = "7945bacbacfa4c52b95950c0de4aab86"; //Personal Twilio AUTH TOKEN.

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+31639554940"), //Receiving Number. (Needs to be verified on the website)
                new PhoneNumber("+15075415361"), //Twilio Trial Number. (Don't change)
                "Test the new number").create(); //Customise the content of the message here.
        System.out.println(message.getSid());
    }
}