package sample;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/sample")
    public Map<String,String> sample(@RequestParam(value="name", defaultValue="World") String name) {
    Map<String,String> result = new HashMap<>();
    result.put("message", String.format("Hello, %s", name));
    return result;
    }
    
    @RequestMapping("/tabla")
    public String tabla(@RequestParam(value="numero", defaultValue="1") String numero) {
        String tabla = "";
        for (int i = 1; i <= 10; i++) {
            tabla += numero + " x " + i + " = " + (Integer.parseInt(numero) * i) + "<br>";
        }
        return tabla;
    }
}