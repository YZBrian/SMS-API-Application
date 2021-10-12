package q3project.smsapiapplication.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SMSController {
    @Autowired
    private SMSSender smsSender;

@PostMapping("/sms")
    public ResponseEntity<?>SendSMS(@RequestBody String text) {
    try{smsSender.SendMessage(text);
        return ResponseEntity.ok().build();
    }
    catch(Exception error){return new ResponseEntity<>(HttpStatus.BAD_REQUEST);}

}
}
