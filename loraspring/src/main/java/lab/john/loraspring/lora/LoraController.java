package lab.john.loraspring.lora;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/iot/v1")
public class LoraController {
    @PostMapping("/receive")
    public String receiveLoraData(@RequestBody String loraPayload) {
        // Here you can process the received LoRa data as needed
        System.out.println("Received LoRa Data: " + loraPayload);
        return "LoRa data received successfully";
    }


    @PostMapping("/send")
    public String postMethodName(@RequestBody String entity) {
        
        return entity;
    }
    
}
